<%@ include file="/init.jsp" %>

<%

	Calendar cal = CalendarFactoryUtil.getCalendar(timeZone, locale);

	Long IzvewenijaID = (Long) ParamUtil.getLong(request,"izvewenie_id");
	
	PorjadokRabotyKomissii porjadok_raboty_komissii = null;
	
	
		porjadok_raboty_komissii =PorjadokRabotyKomissiiLocalServiceUtil.getPRKbyIzvewenieId(IzvewenijaID);
 
	
	if(!porjadok_raboty_komissii.isNew())
       cal.setTime(porjadok_raboty_komissii.getData_publikacii());
    
	int startAmPm = ParamUtil.get(request, "schedulerStartDateAmPm", cal.get(Calendar.AM_PM));
	int startDay = ParamUtil.get(request, "publication_day", cal.get(Calendar.DATE));

	int startHour = ParamUtil.get(request, "publication_hour", cal.get(Calendar.HOUR_OF_DAY));

	if (DateUtil.isFormatAmPm(locale)) {
		startHour = ParamUtil.get(request, "publication_hour", cal.get(Calendar.HOUR));
	}	

	int startMinute = ParamUtil.get(request, "publication_minute", cal.get(Calendar.MINUTE));
	int startMonth = ParamUtil.get(request, "publication_month", cal.get(Calendar.MONTH));
	int startYear = ParamUtil.get(request, "publication_year", cal.get(Calendar.YEAR));
	
	String cmd = (String) ParamUtil.get(request, Constants.CMD, " ");

	Boolean disabled = (cmd.equals(Constants.VIEW))? true : false;
%>

<aui:field-wrapper label="bid_date_publication">
		<div class="flex-container">
			<liferay-ui:input-date
				cssClass="form-group form-group-inline"
				dayParam="publication_day"
				dayValue="<%= startDay %>"
				firstDayOfWeek="<%= cal.getFirstDayOfWeek() - 1 %>"
				monthParam="publication_month"
				monthValue="<%= startMonth %>"
				name="startDate"
				yearParam="publication_year"
				yearValue="<%= startYear %>"
			    disabled="<%=disabled %>"
			/>

			<liferay-ui:icon icon="calendar" markupView="lexicon" />

			<liferay-ui:input-time
				amPmParam="schedulerStartDateAmPm"
				amPmValue="<%= startAmPm %>"
				cssClass="form-group form-group-inline"
				hourParam="publication_hour"
				hourValue="<%= startHour %>"
				minuteParam="publication_minute"
				minuteValue="<%= startMinute %>"
				name="startTime"
				timeFormat="24-hour"
				dateParam="public_dateTime"
			    disabled="<%=disabled %>"
			/>
		</div>
	</aui:field-wrapper>
