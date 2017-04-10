
<%@ include file="/init.jsp" %>

<%


Calendar cal = CalendarFactoryUtil.getCalendar(timeZone, locale);

Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");

PorjadokRabotyKomissii porjadok_raboty_komissii = null;

try {
	porjadok_raboty_komissii =PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(IzvewenijaID);
} catch (NoSuchPorjadokRabotyKomissiiException e) {
	// TODO Auto-generated catch block
	
} catch (SystemException e) {
	// TODO Auto-generated catch block

}
	
if(porjadok_raboty_komissii != null)
   cal.setTime(porjadok_raboty_komissii.getData_podvedenija_itogov());

int endAmPm = ParamUtil.get(request, "schedulerEndDateAmPm", cal.get(Calendar.AM_PM));
int endDay = ParamUtil.get(request, "schedulerEndDateDay", cal.get(Calendar.DATE));

int endHour = ParamUtil.get(request, "schedulerEndDateHour", cal.get(Calendar.HOUR_OF_DAY));

if (DateUtil.isFormatAmPm(locale)) {
	endHour = ParamUtil.get(request, "schedulerEndDateHour", cal.get(Calendar.HOUR));
}

int endMinute = ParamUtil.get(request, "schedulerEndDateMinute", cal.get(Calendar.MINUTE));
int endMonth = ParamUtil.get(request, "schedulerEndDateMonth", cal.get(Calendar.MONTH));
int endYear = ParamUtil.get(request, "schedulerEndDateYear", cal.get(Calendar.YEAR));

String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>

	<aui:field-wrapper label="bid_date_submission">
		
		<div class="flex-container" id="<portlet:namespace />schedulerEndDateType">
			<liferay-ui:input-date
				cssClass="form-group form-group-inline"
				dayParam="schedulerEndDateDay"
				dayValue="<%= endDay %>"
				firstDayOfWeek="<%= cal.getFirstDayOfWeek() - 1 %>"
				monthParam="schedulerEndDateMonth"
				monthValue="<%= endMonth %>"
				name="endDate"
				yearParam="schedulerEndDateYear"
				yearValue="<%= endYear %>"
				disabled="<%=disabled %>"
			/>

			<liferay-ui:icon icon="calendar" markupView="lexicon" />

			<liferay-ui:input-time
				amPmParam="schedulerEndDateAmPm"
				amPmValue="<%= endAmPm %>"
				cssClass="form-group form-group-inline"
				hourParam="schedulerEndDateHour"
				hourValue="<%= endHour %>"
				minuteParam="schedulerEndDateMinute"
				minuteValue="<%= endMinute %>"
				name="endTime"
				timeFormat="24-hour"
				disabled="<%=disabled %>"
			/>
		</div>
	</aui:field-wrapper>
	
	<aui:input name=" " type="numebr" suffix="" prefix=""/>
