<%@ include file="/init.jsp" %>

<%
	Calendar cal = CalendarFactoryUtil.getCalendar(timeZone, locale);

	Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
	
	PorjadokRabotyKomissii porjadok_raboty_komissii = null;
	
	if(izvewenija != null)
		porjadok_raboty_komissii =PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(izvewenija.getIzvewenija_id());
	
	if(porjadok_raboty_komissii != null)
       cal.setTime(porjadok_raboty_komissii.getData_publikacii());
    
	int startAmPm = ParamUtil.get(request, "schedulerStartDateAmPm", cal.get(Calendar.AM_PM));
	int startDay = ParamUtil.get(request, "schedulerStartDateDay", cal.get(Calendar.DATE));

	int startHour = ParamUtil.get(request, "schedulerStartDateHour", cal.get(Calendar.HOUR_OF_DAY));

	if (DateUtil.isFormatAmPm(locale)) {
		startHour = ParamUtil.get(request, "schedulerStartDateHour", cal.get(Calendar.HOUR));
	}	

	int startMinute = ParamUtil.get(request, "schedulerStartDateMinute", cal.get(Calendar.MINUTE));
	int startMonth = ParamUtil.get(request, "schedulerStartDateMonth", cal.get(Calendar.MONTH));
	int startYear = ParamUtil.get(request, "schedulerStartDateYear", cal.get(Calendar.YEAR));
	
	String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>

<aui:field-wrapper label="bid_date_publication">
		<div class="flex-container">
			<liferay-ui:input-date
				cssClass="form-group form-group-inline"
				dayParam="schedulerStartDateDay"
				dayValue="<%= startDay %>"
				firstDayOfWeek="<%= cal.getFirstDayOfWeek() - 1 %>"
				monthParam="schedulerStartDateMonth"
				monthValue="<%= startMonth %>"
				name="startDate"
				yearParam="schedulerStartDateYear"
				yearValue="<%= startYear %>"
			    disabled="<%=disabled %>"
			/>

			<liferay-ui:icon icon="calendar" markupView="lexicon" />

			<liferay-ui:input-time
				amPmParam="schedulerStartDateAmPm"
				amPmValue="<%= startAmPm %>"
				cssClass="form-group form-group-inline"
				hourParam="schedulerStartDateHour"
				hourValue="<%= startHour %>"
				minuteParam="schedulerStartDateMinute"
				minuteValue="<%= startMinute %>"
				name="startTime"
				timeFormat="24-hour"
			    disabled="<%=disabled %>"
			/>
		</div>
	</aui:field-wrapper>
