package tj.schedulars;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;

import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;


import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;

import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;

import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.Validator;

import tj.bid.queue.model.Bidqueue;
import tj.bid.queue.service.BidqueueLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.commission.constants.CommissionConstants;
import tj.protocol.contracts.model.ProtocolContracts;
import tj.protocol.contracts.model.ProtocolOpening;
import tj.protocol.contracts.service.ProtocolContractsLocalServiceUtil;
import tj.protocol.contracts.service.ProtocolOpeningLocalServiceUtil;
import tj.system.config.service.SystemConfigLocalServiceUtil;



@Component(
		  immediate = true, property = {"cron.expression=0 0 0 * * ?"},
		  service = WinnerSchedulars.class
		)

public class WinnerSchedulars extends BaseMessageListener  {

	 @Override
	  protected void doReceive(Message message)  {

		 List<Bidqueue> bidqueues = BidqueueLocalServiceUtil.getBidqueue(CommissionConstants.STATE_BID_COMPLETED_TENDERS, 
				 															CommissionConstants.STATUS_BID_AT_DETERMINING_WINNER);
		 
		Date date = new Date();
		
		long minutes = date.getTime()/6000;

		
	  
		for( Bidqueue bidqueue : bidqueues)
		{
				long izvewenija_id = bidqueue.getIzvewenija_id();
				ProtocolOpening opening = ProtocolOpeningLocalServiceUtil.getProtocolOpeningByBid(izvewenija_id);
			
			if(date.after(bidqueue.getClosing_date()) || date.equals(bidqueue.getClosing_date()))
			{
				boolean isNullOpening = Validator.isNull(opening);
			
				try {
					 if(isNullOpening)
					 {
					
			        
					Winner winner = new Winner(izvewenija_id);
					
					   if(Validator.isNotNull(winner) )
					   {
						
							if(Validator.isNotNull(opening))
							{
								opening.setUpdated(new Date());
								
							}
							else
							{    
								 long protocol_opening_id =  CounterLocalServiceUtil.increment(ProtocolOpening.class.toString());
								 opening = ProtocolOpeningLocalServiceUtil.createProtocolOpening(protocol_opening_id);
								
								 opening.setIzvewenie_id(izvewenija_id);
								 opening.setCreated(new Date());
								 opening.setUpdated(new Date());
								
							}
							
							ProtocolOpeningLocalServiceUtil.updateProtocolOpening(opening);
							
							Calendar cal = CalendarFactoryUtil.getCalendar();
						    cal.setTime(bidqueue.getClosing_date());
							String value = SystemConfigLocalServiceUtil.getSystemConfig(CommissionConstants.COMPLAINTS_PERIOD).getValue();
							cal.set(Calendar.DATE, cal.get(Calendar.DATE) + Integer.valueOf(value));
							
							bidqueue.setClosing_date(cal.getTime());
							long minut = cal.getTimeInMillis()/6000;
							bidqueue.setClosing_by_minutes(minut);
							
							BidqueueLocalServiceUtil.updateBidqueue(bidqueue);
					   }
					
					 }
					 else
					 {
						ProtocolContracts contracts =  ProtocolContractsLocalServiceUtil.getProtocolContractsByBid(izvewenija_id); 
					    
						if(Validator.isNotNull(contracts))
						{
							contracts.setUpdated(new Date());
							
						}
						else
						{    
							 long protocol_contracts_id =  CounterLocalServiceUtil.increment(ProtocolContracts.class.toString());
							 contracts = ProtocolContractsLocalServiceUtil.createProtocolContracts(protocol_contracts_id);
							
							 contracts.setIzvewenie_id(izvewenija_id);
							 contracts.setCreated(new Date());
							 contracts.setUpdated(new Date());
							
						}
						
						ProtocolContractsLocalServiceUtil.updateProtocolContracts(contracts);
						BidqueueLocalServiceUtil.deleteBidqueue(bidqueue);
					 }
				} catch (PortalException e) {
					
				
				}
				
				
			}
			else
				break;
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

	  private static final Log _log = LogFactoryUtil.getLog(WinnerSchedulars.class);

	  private volatile boolean _initialized;
	  private TriggerFactory _triggerFactory;
	  private SchedulerEngineHelper _schedulerEngineHelper;
	  private SchedulerEntryImpl _schedulerEntryImpl = null;
	}

	
		
	


