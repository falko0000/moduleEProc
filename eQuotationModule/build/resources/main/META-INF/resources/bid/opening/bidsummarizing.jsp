<%@ include file="/init.jsp" %>

<%
Calendar cal = CalendarFactoryUtil.getCalendar();
Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
PorjadokRabotyKomissii porjadok_raboty_komissii = null;
porjadok_raboty_komissii =PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(IzvewenijaID);
if(!porjadok_raboty_komissii.isNew())
   cal.setTime(porjadok_raboty_komissii.getData_podvedenija_itogov());
int endAmPm = ParamUtil.get(request, "schedulerEndDateAmPm", cal.get(Calendar.AM_PM));
int endDay = ParamUtil.get(request, "summarizing_day", cal.get(Calendar.DATE));
int endHour = ParamUtil.get(request, "summarizing_hour", cal.get(Calendar.HOUR_OF_DAY));
if (DateUtil.isFormatAmPm(locale)) {
	endHour = ParamUtil.get(request, "summarizing_hour", cal.get(Calendar.HOUR));
}
int endMinute = ParamUtil.get(request, "summarizing_minute", cal.get(Calendar.MINUTE));
int endMonth = ParamUtil.get(request, "summarizing_month", cal.get(Calendar.MONTH));
int endYear = ParamUtil.get(request, "summarizing_year", cal.get(Calendar.YEAR));
String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");
Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>

	<aui:field-wrapper label="bid_date_submission">
		
		<div class="flex-container" id="<portlet:namespace />schedulerEndDateType">
			<liferay-ui:input-date
				cssClass="form-group form-group-inline"
				dayParam="summarizing_day"
				dayValue="<%= endDay %>"
				firstDayOfWeek="<%= cal.getFirstDayOfWeek() - 1 %>"
				monthParam="summarizing_month"
				monthValue="<%= endMonth %>"
				name="endDate"
				yearParam="summarizing_year"
				yearValue="<%= endYear %>"
				disabled="<%=disabled %>"
			/>

			<liferay-ui:icon icon="calendar" markupView="lexicon" />

			<liferay-ui:input-time
				amPmParam="schedulerEndDateAmPm"
				amPmValue="<%= endAmPm %>"
				cssClass="form-group form-group-inline"
				hourParam="summarizing_hour"
				hourValue="<%= endHour %>"
				minuteParam="summarizing_minute"
				minuteValue="<%= endMinute %>"
				name="endTime"
				timeFormat="24-hour"
				disabled="<%=disabled %>"
			/>
		</div>
	</aui:field-wrapper>
	<aui:input  name="bid_days" 
				type="number" 
				value="<%=(!porjadok_raboty_komissii.isNew())?porjadok_raboty_komissii.getPo_istecheniju_dnej():1 %>" 
				suffix="bid_working_days" 
				prefix="bid_across"
				min="0"
	>
	   <aui:validator name="required" errorMessage="this-field-is-mandatory"></aui:validator>
	</aui:input>
	
	
	
	<aui:script use="aui-base">


	
	AUI().use('event', 'node', function(A) {
		
		A.one('#<portlet:namespace />bid_days').on('keyup',function(event){
		
			
			
			var startDate = A.one('#<portlet:namespace />startDate').get('value');
			var startDate = startDate.replace(".","/");
			
			var bid_days = A.one('#<portlet:namespace />bid_days').get('value');
		
			 if(bid_days == '')
				 bid_days = 0;
			
			var parts = startDate.split('/');
			
			var d = new Date(parts[2],parts[1],parts[0]);
			
			d.setMonth(d.getMonth()-1);
			
			
			d.setDate(d.getDate()+parseInt(bid_days));
			var day = d.getDate();
			
			if( day < 10)
				day = '0' + day;
			
			var month = d.getMonth()+1;
			
			if( month < 10)
				month ='0'+month;
			
			
			
			var dat = day+ "/" +month  + "/"+ d.getFullYear();  
			
			A.one('#<portlet:namespace />endDate').set('value',dat);
		
			
	});
	});
	
	</aui:script>