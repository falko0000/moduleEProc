package tj.module.equotation.portlet;

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

import tj.jekb.model.Jekb;
import tj.jekb.service.JekbLocalServiceUtil;
import tj.module.equotation.constants.EQuotationConstants;
import tj.okgz.model.Okgz;
import tj.okgz.service.OkgzLocalServiceUtil;
import tj.vbk.model.Vbk;
import tj.vbk.service.VbkLocalServiceUtil;

@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name=" + EQuotationConstants.PORTLET_NAME,
	        "mvc.command.name=" + EQuotationConstants.RESOURCE_COMMAND_NAME_LIST
	    },
	    service = MVCResourceCommand.class
	)
public class EQuotationResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		
		
		String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);
		
		if (cmd.equals("getJekb")) 
			   getJekb(resourceRequest, resourceResponse);
		
		if (cmd.equals("getVbk")) 
			getVbk(resourceRequest, resourceResponse);
		
		if (cmd.equals("getOkgz")) 
			getOkgz(resourceRequest, resourceResponse);
		
		
		return false;
	}




	private void getJekb(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		

		
		JSONArray jekbsJSONArray = JSONFactoryUtil.createJSONArray();
		 ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		 JSONObject jekbJSON=null;
		 try {
		 List<Jekb> jekbList=JekbLocalServiceUtil.getJekbs(0,
				 JekbLocalServiceUtil.getJekbsCount());
		                         
		 for(Jekb jekb : jekbList){
			 jekbJSON=JSONFactoryUtil.createJSONObject();
			 jekbJSON.put("jekb_id", jekb.getJekb_id());
			 jekbJSON.put("kod",jekb.getKod());
			 jekbJSON.put("nazvanie",jekb.getKod()+" "+jekb.getNazvanie_ru());
			 
		
			 jekbsJSONArray.put(jekbJSON);
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
		 out.println(jekbsJSONArray.toString());
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
	

	private void getOkgz(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		
		JSONArray okgzsJSONArray = JSONFactoryUtil.createJSONArray();
		 ThemeDisplay themeDisplay = (ThemeDisplay)resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		 JSONObject okgzJSON=null;
		 try {
		 List<Okgz> okgzList=OkgzLocalServiceUtil.getOkgzs(0,
				 OkgzLocalServiceUtil.getOkgzsCount());
		                         
		 for(Okgz okgz : okgzList){
			 okgzJSON=JSONFactoryUtil.createJSONObject();
			 okgzJSON.put("okgz_id", okgz.getOkgz_id());
			 okgzJSON.put("kod",okgz.getKod());
			 okgzJSON.put("nazvanie",okgz.getNaimenovanie());
			
			 
			 okgzsJSONArray.put(okgzJSON);
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
		 out.println(okgzsJSONArray.toString());
	
		
	}


	}


