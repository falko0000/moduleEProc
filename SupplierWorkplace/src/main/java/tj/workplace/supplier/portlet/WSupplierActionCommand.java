package tj.workplace.supplier.portlet;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import tj.balans.postavwika.model.BalansPostavwika;
import tj.balans.postavwika.service.BalansPostavwikaLocalServiceUtil;
import tj.module.suppworkplace.constant.SupplierWorkplaceConstant;
import tj.oplachennye.zakazy.model.OplachennyeZakazy;
import tj.oplachennye.zakazy.service.OplachennyeZakazyLocalServiceUtil;
import tj.tariff.model.Tariff;
import tj.tariff.service.TariffLocalServiceUtil;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + SupplierWorkplaceConstant.PORTLET_NAME,
				"mvc.command.name=" + SupplierWorkplaceConstant.ACTION_COMMAND_NAME_EDIT
				
		},
		service = MVCActionCommand.class
	
	
		)

public class WSupplierActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String formname = ParamUtil.getString(actionRequest, "FormName");
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_ABOUT_INFO_BALANS))
			withdrawmoney(actionRequest, actionResponse);
		
	}

	private void withdrawmoney(ActionRequest actionRequest, ActionResponse actionResponse)  {
		
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		String redirect = ParamUtil.getString(actionRequest, "redirect");
		
		long postavwik_id;
		try {
			
			postavwik_id = user.getOrganizationIds()[0];
			 
			 Tariff tariff = TariffLocalServiceUtil.getTariff(1, 1);

	         BalansPostavwika balansPostavwika = BalansPostavwikaLocalServiceUtil.getBalansPostavwik(postavwik_id);
			  
	         long oplachennye_zakazy_id = CounterLocalServiceUtil.increment(OplachennyeZakazy.class.toString());
	    
	         OplachennyeZakazy oplachennyeZakazy = OplachennyeZakazyLocalServiceUtil.createOplachennyeZakazy(oplachennye_zakazy_id);
		     
	         byte buuid[] = longToByteArray(oplachennye_zakazy_id, 8);
	         
	         String uuid = PortalUUIDUtil.generate(buuid);
	         
	         oplachennyeZakazy.setTranzakcija(uuid);
	         oplachennyeZakazy.setIzvewenie_id(izvewenie_id);
	         oplachennyeZakazy.setPostavwik_id(postavwik_id);
	         oplachennyeZakazy.setSumma(tariff.getTariff_value());
	         oplachennyeZakazy.setOplatil(user.getUserId());
	         oplachennyeZakazy.setData_oplaty(new Date());
	         
	         OplachennyeZakazyLocalServiceUtil.addOplachennyeZakazy(oplachennyeZakazy);
	         
	         double balance = balansPostavwika.getBalans() - tariff.getTariff_value();
	         
	         balansPostavwika.setBalans(balance);
	         
	         BalansPostavwikaLocalServiceUtil.updateBalansPostavwika(balansPostavwika);
	         
	         actionResponse.sendRedirect(redirect);  
	         
		} catch (PortalException | IOException e) {
			
			e.printStackTrace();
		}
		
	 
	
	    
	}
	
	   private  byte[] longToByteArray(long oplachennye_zakazy_id, int length) 
	   
	   {
		    byte buuid[] = new byte[length];
		  
		    for(int i = length -1 ; i >= 0; i--)
		    {
		   buuid[i] = (byte) (oplachennye_zakazy_id);
		   oplachennye_zakazy_id >>>= 8;
	       
	        }
		    return buuid;
  }
}