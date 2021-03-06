package tj.schedulars;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;

import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;


import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;

import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;

import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import tj.bid.queue.model.Bidqueue;
import tj.bid.queue.service.BidqueueLocalServiceUtil;
import tj.commission.positions.model.CommissionPosition;
import tj.commission.positions.service.CommissionPositionLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.porjadok.raboty.komissii.model.PorjadokRabotyKomissii;
import tj.porjadok.raboty.komissii.service.PorjadokRabotyKomissiiLocalServiceUtil;
import tj.protocol.contracts.model.ProtocolOpening;
import tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil;
import tj.system.config.exception.NoSuchSystemConfigException;
import tj.system.config.model.SystemConfig;
import tj.system.config.service.SystemConfigLocalServiceUtil;

@Component(
		  immediate = true, property = {"cron.expression=0 0 0 * * ?"},
		  service = IzvewenijaSchedulars.class
		)

public class IzvewenijaSchedulars extends BaseMessageListener  {

	 @Override
	  protected void doReceive(Message message)  {

		 List<Bidqueue> bidqueues = BidqueueLocalServiceUtil.getBidqueue(EQuotationConstants.STATE_BID_SUBMISSION_OF_PROPOSALS, 
				 														EQuotationConstants.STATUS_BID_SUBMISSION_OF_PROPOSALS);
		 
		Date date = new Date();
		
		long minutes = date.getTime()/6000;
	String value = "3";
		try {
			SystemConfig config = SystemConfigLocalServiceUtil.getSystemConfig(EQuotationConstants.EVALUATION_PERIOD);
		    value = config.getValue();
		} catch (NoSuchSystemConfigException e1) {
			
		}
		
		Calendar cal = CalendarFactoryUtil.getCalendar();
		
		 
	  // SchedulerEngineHelperUtil.getNextFireTime(jobName, groupName, storageType)
		
		for( Bidqueue bidqueue : bidqueues)
		{
			
			if(date.after(bidqueue.getClosing_date()) || date.equals(bidqueue.getClosing_date()))
			{
			
				long izvewenija_id = bidqueue.getIzvewenija_id();
				
				try {
					Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);
			        
					izvewenija.setSostojanie_id(EQuotationConstants.STATE_BID_COMPLETED_TENDERS);
					izvewenija.setStatus_id(EQuotationConstants.STATUS_BID_AT_DETERMINING_WINNER);
					
					IzvewenijaLocalServiceUtil.updateIzvewenija(izvewenija);
					
					PorjadokRabotyKomissii porjadokRabotyKomissii = PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenija_id);		
					
					cal.setTime(porjadokRabotyKomissii.getData_podvedenija_itogov());
					
					cal.set(Calendar.DATE, cal.get(Calendar.DATE) + Integer.valueOf(value));
					
					bidqueue.setClosing_date(cal.getTime());
					long minut = cal.getTimeInMillis()/6000;
					bidqueue.setClosing_by_minutes(minut);
					bidqueue.setState(EQuotationConstants.STATE_BID_COMPLETED_TENDERS);
					bidqueue.setStatus(EQuotationConstants.STATUS_BID_AT_DETERMINING_WINNER);
					
					BidqueueLocalServiceUtil.updateBidqueue(bidqueue);
			     
					  long usergroupId = izvewenija.getUserGroupId();	
			          
					  List<User> users = UserLocalServiceUtil.getUserGroupUsers(usergroupId);
			          
					   ProtocolOpening opening = ProtocolOpeningLocalServiceUtil.getProtocolOpeningByBid(izvewenija_id);
					   boolean isNullOpening = Validator.isNull(opening);
					   
					   CreateProtocolOpening createOpening = null;
					   
					   if( isNullOpening)
					   {
						  createOpening = new CreateProtocolOpening(izvewenija_id);  
						  opening = createOpening.create();   
					   }
					  
					   
			              for(User user : users)
			              {
			            	if(user.isEmailAddressVerified())
			            	{
			            		String email = user.getEmailAddress();
			            		StringBuilder builder = new StringBuilder();
			            		
			            		CommissionPosition commissionPosition = CommissionPositionLocalServiceUtil.getCommissionPosition(usergroupId, user.getUserId()); 
			            	
			            	if(Validator.isNotNull(commissionPosition))
			            	{
			            		Role role = RoleLocalServiceUtil.getRole(commissionPosition.getRoleId());  
			            		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");

			            		String email_key = "EMAIL_AFTER_OPENING";
			            		String body = SystemConfigLocalServiceUtil.getSystemConfig(email_key).getValue();
			            		
			            	    String[] param = new String[]{"[$FULLNAME$]", "[$POSITION$]", "[$BIDNUMBER$]", "[$CLOSED$]"};
			            		String[] paramValue = new String[param.length];
			            		
			            		paramValue[0] = user.getFullName();
			            		paramValue[1] = LanguageUtil.get(user.getLocale(), "role."+role.getName().toLowerCase()).toLowerCase();
			            		paramValue[2] = String.valueOf(izvewenija_id);
			            		paramValue[3] = dateFormat.format(bidqueue.getClosing_date());
			            		
			            		 String  subject = "����������� ������� ���������� �����������";
			            		 
			            		 body = StringUtil.replace(body, param, paramValue);
			            		
			            		  
			            		
			            		 
			            		  boolean sendM = IzvewenijaLocalServiceUtil.sendEmailMessage("admin@zakupki.gov.tj", email, subject, body, true);	
			            	
			            		  if(sendM)
			            			  System.out.println("messages to the address "+ email+ " sent successfully!");
			            		  else
			            			  System.out.println("messages to the address "+ email+ " sent failed!");
			            	}	
			            	}
			              }	
					
				} catch (PortalException e) {
					
				
				}
				
				
			}
			
		}
	   
	  }

	
	  @Activate
	  @Modified
	  protected void activate(Map<String,Object> properties) throws SchedulerException {

	
	 
		  String  cronExpression = _DEFAULT_CRON_EXPRESSION;
	    String listenerClass = getClass().getName();
	    Trigger jobTrigger = _triggerFactory.createTrigger(listenerClass, listenerClass, new Date(), null, cronExpression);

	   
	    _schedulerEntryImpl = new SchedulerEntryImpl();
	  
	    _schedulerEntryImpl.setEventListenerClass(getClass().getName());
	    _schedulerEntryImpl.setTrigger(jobTrigger);
	    
	    _schedulerEntryImpl = new StorageTypeAwareSchedulerEntryImpl(_schedulerEntryImpl, StorageType.PERSISTED);

	
	    _schedulerEntryImpl.setTrigger(jobTrigger);

	
	    if (_initialized) {
	    
	      deactivate();
	    }

	    _schedulerEngineHelper.register(this, _schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);

	 
	    _initialized = true;
	  }

	
	  @Deactivate
	  protected void deactivate() {
	  
	    if (_initialized) {
	      
	      try {
	        _schedulerEngineHelper.unschedule(_schedulerEntryImpl, getStorageType());
	      } catch (SchedulerException se) {
	        if (_log.isWarnEnabled()) {
	          _log.warn("Unable to unschedule trigger", se);
	        }
	      }

	 
	      _schedulerEngineHelper.unregister(this);
	    }
	    
	
	    _initialized = false;
	  }

	 
	  protected StorageType getStorageType() {
	    if (_schedulerEntryImpl instanceof StorageTypeAware) {
	      return ((StorageTypeAware) _schedulerEntryImpl).getStorageType();
	    }
	    
	    return StorageType.MEMORY_CLUSTERED;
	  }
	  

	  @Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	  protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	  }

	  @Reference(unbind = "-")
	  protected void setTriggerFactory(TriggerFactory triggerFactory) {
	    _triggerFactory = triggerFactory;
	  }

	  @Reference(unbind = "-")
	  protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {
	    _schedulerEngineHelper = schedulerEngineHelper;
	  }

	 
	  private static final String _DEFAULT_CRON_EXPRESSION = "0 0/1 * * * ?";

	  private static final Log _log = LogFactoryUtil.getLog(IzvewenijaSchedulars.class);

	  private volatile boolean _initialized;
	  private TriggerFactory _triggerFactory;
	  private SchedulerEngineHelper _schedulerEngineHelper;
	  private SchedulerEntryImpl _schedulerEntryImpl = null;
	}

	
		
	


