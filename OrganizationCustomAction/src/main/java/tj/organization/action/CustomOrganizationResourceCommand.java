package tj.organization.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import tj.fbk.model.Fbk;
import tj.fbk.service.FbkLocalServiceUtil;
import tj.vbk.model.Vbk;
import tj.vbk.service.VbkLocalServiceUtil;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=com_liferay_users_admin_web_portlet_UsersAdminPortlet",
				"mvc.command.name=/users_admin/get_vbk"
		},
		service = MVCResourceCommand.class
	)

public class CustomOrganizationResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
		
		if (cmd.equals("getVbk")) 
			getVbk(resourceRequest, resourceResponse);
		
		if (cmd.equals("getFbk")) 
			getFbk(resourceRequest, resourceResponse);
		
		return false;
	}

private void getVbk(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		
		JSONArray vbksJSONArray = JSONFactoryUtil.createJSONArray();
		 ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		 JSONObject vbkJSON=null;
		 try {
		 List<Vbk> vbkList=VbkLocalServiceUtil.getVbks(0,
				 VbkLocalServiceUtil.getVbksCount());
		                         
		 for(Vbk vbk : vbkList){
			 vbkJSON=JSONFactoryUtil.createJSONObject();
			 vbkJSON.put("vbk_id", vbk.getVbk_id());
			 vbkJSON.put("kod",vbk.getKod());
			 vbkJSON.put("nazvanie",vbk.getKod()+" "+vbk.getNazvanie_ru());
			 
			
			 vbksJSONArray.put(vbkJSON);
		 }
		 } catch (Exception e) {
		 }
		 PrintWriter out = null;
		try {
			out = resourceResponse.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		 out.println(vbksJSONArray.toString());
		
	}
private void getFbk(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
	
	JSONArray fbksJSONArray = JSONFactoryUtil.createJSONArray();
	 ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
	 JSONObject fbkJSON=null;
	 try {
	 List<Fbk> fbkList= FbkLocalServiceUtil.getFbks(0, FbkLocalServiceUtil.getFbksCount());
	                         
	 for(Fbk fbk : fbkList){
		 fbkJSON=JSONFactoryUtil.createJSONObject();
		 fbkJSON.put("fbk_id", fbk.getFbk_id());
		 fbkJSON.put("kod",fbk.getKod());
		 fbkJSON.put("nazvanie",fbk.getNazvanie_ru());
		 
		
		 fbksJSONArray.put(fbkJSON);
	 }
	 } catch (Exception e) {
	 }
	 PrintWriter out = null;
	try {
		out = resourceResponse.getWriter();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}			
	 out.println(fbksJSONArray.toString());
	
}

}
