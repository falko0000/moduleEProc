package tj.schedulars;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelperUtil;
import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;

import tj.bid.queue.model.Bidqueue;
import tj.bid.queue.service.BidqueueLocalServiceUtil;
import tj.izvewenija.model.Izvewenija;
import tj.izvewenija.service.IzvewenijaLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;

@Component(
		  immediate = true, property = {"cron.expression=0 0 0 * * ?"},
		  service = IzvewenijaSchedulars.class
		)

public class IzvewenijaSchedulars extends BaseMessageListener  {

	 @Override
	  protected void doReceive(Message message)  {

		 List<Bidqueue> bidqueues = BidqueueLocalServiceUtil.getBidqueue();
		 
		Date date = new Date();
		
		//long minutes = date.getTime()/6000;
		
	  // SchedulerEngineHelperUtil.getNextFireTime(jobName, groupName, storageType)
		
		for( Bidqueue bidqueue : bidqueues)
		{
			if(minutes >= bidqueue.getClosing_by_minutes())
			{
				long izvewenija_id = bidqueue.getIzvewenija_id();
				
				try {
					Izvewenija izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenija_id);
			        
					izvewenija.setSostojanie_id(EQuotationConstants.STATE_BID_COMPLETED_TENDERS);
					izvewenija.setStatus_id(EQuotationConstants.STATUS_BID_AT_DETERMINING_WINNER);
					
					IzvewenijaLocalServiceUtil.updateIzvewenija(izvewenija);
					
					BidqueueLocalServiceUtil.deleteBidqueue(bidqueue);
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

	  private static final Log _log = LogFactoryUtil.getLog(IzvewenijaSchedulars.class);

	  private volatile boolean _initialized;
	  private TriggerFactory _triggerFactory;
	  private SchedulerEngineHelper _schedulerEngineHelper;
	  private SchedulerEntryImpl _schedulerEntryImpl = null;
	}

	
		
	


