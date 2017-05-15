<%@ include file="/init.jsp" %>

<%
Calendar cal = CalendarFactoryUtil.getCalendar(timeZone, locale);
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