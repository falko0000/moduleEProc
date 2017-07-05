<%@ include file="/init.jsp" %>
<%
System.out.println("Bid state info");
	Calendar cal = CalendarFactoryUtil.getCalendar(timeZone, locale);
    Izvewenija izvewenija = (Izvewenija) request.getAttribute("izvewenija");
    Organization bidorg = (Organization) request.getAttribute("bidorg");
    User biduser = (User) request.getAttribute("biduser");

	
	String state = "Формирование извещения";
	
	String orgName = "";
	
	if(bidorg != null)
		orgName = bidorg.getName();
	if(biduser == null)
		biduser = UserServiceUtil.getCurrentUser();
	
	if(izvewenija!= null)
	       cal.setTime(izvewenija.getModifiedDate());
	    
		int startAmPm = ParamUtil.get(request, "schedulerStartDateAmPm", cal.get(Calendar.AM_PM));
		int startDay = ParamUtil.get(request, "schedulerStartDateDay", cal.get(Calendar.DATE));

		int startHour = ParamUtil.get(request, "schedulerStartDateHour", cal.get(Calendar.HOUR_OF_DAY));

		if (DateUtil.isFormatAmPm(locale)) {
			startHour = ParamUtil.get(request, "schedulerStartDateHour", cal.get(Calendar.HOUR));
		}	

		int startMinute = ParamUtil.get(request, "schedulerStartDateMinute", cal.get(Calendar.MINUTE));
		int startMonth = ParamUtil.get(request, "schedulerStartDateMonth", cal.get(Calendar.MONTH));
		int startYear = ParamUtil.get(request, "schedulerStartDateYear", cal.get(Calendar.YEAR));

	
%>


      
      <aui:input id="bid_state"   type="text"      name = "bid_state"   value= "<%=LanguageUtil.get(request,"bid_state_value")%>" disabled="true"/>

      <aui:input id="bid_organizer" type="text"  name="bid_organizer" value="<%=orgName%>" disabled="true"/>
     
   
      <aui:input id="bid_created" type="text"  name="bid_created" value="<%=biduser.getFullName()%>" disabled="true"/>
      
      <c:if test="<%= izvewenija!= null  %>">
      <liferay-ui:input-date
				cssClass="form-group form-group-inline"
				dayParam="schedulerStartDateDay"
				dayValue="<%= startDay %>"
				firstDayOfWeek="<%= cal.getFirstDayOfWeek() - 1 %>"
				monthParam="schedulerStartDateMonth"
				monthValue="<%= startMonth %>"
				name="bid_last_modified"
				yearParam="schedulerStartDateYear"
				yearValue="<%= startYear %>"
			    disabled="<%=true %>"
			/>
      
      
      </c:if>
      