package tj.workplace.supplier.portlet;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.transaction.TransactionInvokerUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

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
		// TODO Auto-generated method stub
	
		String formname = ParamUtil.getString(actionRequest, "FormName","-");
		
		if(formname.equals(SupplierWorkplaceConstant.FORM_ABOUT_INFO_BALANS))
			withdrawn(actionRequest,actionResponse);
		
	}

	private void withdrawn(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		
		User user=(User) actionRequest.getAttribute(WebKeys.USER);
		long izvewenie_id = ParamUtil.getLong(actionRequest, "izvewenie_id");
		try {
			Organization organization = user.getOrganizations().get(0);
			BalansPostavwika balansPostavwika = BalansPostavwikaLocalServiceUtil.getBalansPostavwik(organization.getOrganizationId());
			  Tariff tariff = TariffLocalServiceUtil.getTariff(1, 1);
		double balance = balansPostavwika.getBalans() - tariff.getTariff_value();
		balansPostavwika.setBalans(balance);
		
		BalansPostavwikaLocalServiceUtil.updateBalansPostavwika(balansPostavwika);
		
			  long oplachennye_zakazy_id = CounterLocalServiceUtil.increment(OplachennyeZakazy.class.toString());
			  
			  
			  OplachennyeZakazy  oplachennyeZakazy = OplachennyeZakazyLocalServiceUtil.createOplachennyeZakazy(oplachennye_zakazy_id);
			  oplachennyeZakazy.setTranzakcija(String.valueOf(oplachennye_zakazy_id));
			  oplachennyeZakazy.setIzvewenie_id(izvewenie_id);
			  oplachennyeZakazy.setPostavwik_id(organization.getOrganizationId());
			  oplachennyeZakazy.setSumma(tariff.getTariff_value());
			  oplachennyeZakazy.setOplatil(user.getUserId());
			  oplachennyeZakazy.setData_oplaty(new Date());
			  
			  OplachennyeZakazyLocalServiceUtil.updateOplachennyeZakazy(oplachennyeZakazy);
			  
			  
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
}
