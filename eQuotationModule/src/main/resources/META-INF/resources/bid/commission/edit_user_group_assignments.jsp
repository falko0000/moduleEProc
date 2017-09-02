

<%@ include file="/init.jsp" %>

<%
  String redirect = ParamUtil.getString(request, "redirect");
  
long roleIds[] = { 0, 0, 0, 0};

roleIds[0] = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(),  EQuotationConstants.ROLE_CHAIRPERSON).getRoleId();
roleIds[1] = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(),  EQuotationConstants.ROLE_DEPUTY).getRoleId();
roleIds[2] = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(),  EQuotationConstants.ROLE_MEMBER).getRoleId();
roleIds[3] = RoleLocalServiceUtil.getRole(themeDisplay.getCompanyId(),  EQuotationConstants.ROLE_SECRETARY).getRoleId();


Izvewenija izvewenija = null;
long izvewenie_id = ParamUtil.getLong(request, "izvewenie_id");
izvewenija = IzvewenijaLocalServiceUtil.getIzvewenija(izvewenie_id);
  
  long userGroupId = izvewenija.getUserGroupId();
  
  

  UserGroup userGroup = null;
  
  try {
		userGroup =UserGroupLocalServiceUtil.getUserGroup(userGroupId);
	} catch (PortalException e) {
		
		 System.out.println("dosn't have pirmission to : "+userGroupId);
	}
  
  long ids[] = { 0, 0 };
   List<Organization> organizations = Collections.emptyList();
  
   List<Spisoklotov> spisoklotovs =  SpisoklotovLocalServiceUtil.getLotsByIzvewenijaID(izvewenija.getIzvewenija_id());
 
   ids[0] = izvewenija.getOrganizacija_id();
   ids[1] = izvewenija.getOrganizacija_id();
   if(!spisoklotovs.isEmpty())
   {
	   String spisoklotov = spisoklotovs.get(0).getKod_zakazchika();
	  
	  long vbk_id = Long.parseLong(spisoklotov);
	  Vbk vbk = VbkLocalServiceUtil.getVbk(vbk_id);
		 
		ids[1] = vbk.getOrganizationid();
   }
  
  
   organizations =  OrganizationLocalServiceUtil.getOrganizations(ids);
   
  
String displayStyle = ParamUtil.getString(request, "displayStyle");

if (Validator.isNull(displayStyle)) {
	displayStyle = portalPreferences.getValue(UserGroupsAdminPortletKeys.USER_GROUPS_ADMIN, "users-display-style", "list");
}
else {
	portalPreferences.setValue(UserGroupsAdminPortletKeys.USER_GROUPS_ADMIN, "users-display-style", displayStyle);

	request.setAttribute(WebKeys.SINGLE_PAGE_APPLICATION_CLEAR_CACHE, Boolean.TRUE);
}

PortletURL portletURL = renderResponse.createRenderURL();

portletURL.setParameter("mvcPath", "/bid/commission/edit_user_group_assignments.jsp");
portletURL.setParameter("redirect", redirect);
portletURL.setParameter("izvewenie_id", String.valueOf(izvewenie_id));
portletURL.setParameter("userGroupId", String.valueOf(userGroup.getUserGroupId()));

PortletURL searchURL = PortletURLUtil.clone(portletURL, renderResponse);

SearchContainer userSearchContainer = new UserSearch(renderRequest, searchURL);

UserSearchTerms searchTerms = (UserSearchTerms)userSearchContainer.getSearchTerms();

if (!searchTerms.isSearch()) {
	userSearchContainer.setEmptyResultsMessageCssClass("taglib-empty-result-message-header-has-plus-btn");
}

LinkedHashMap<String, Object> userParams = new LinkedHashMap<String, Object>();

if (filterManageableOrganizations) {
	userParams.put("usersOrgsTree", organizations);
}
  
   userParams.put("usersUserGroups", Long.valueOf(userGroup.getUserGroupId()));

RowChecker rowChecker = new UnsetUserUserGroupChecker(renderResponse, userGroup);

portletDisplay.setShowBackIcon(true);
portletDisplay.setURLBack(redirect);

renderResponse.setTitle(userGroup.getName());

PortletURL homeURL = renderResponse.createRenderURL();

homeURL.setParameter("mvcPath", "/bid/commission.jsp");



String currentURL = themeDisplay.getURLCurrent();

redirect = currentURL;

%>

<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
	<aui:nav cssClass="navbar-nav">
		<aui:nav-item label="users" selected="<%= true %>" />
	</aui:nav>

	<aui:nav-bar-search>
		<aui:form action="<%= portletURL.toString() %>" name="searchFm">
			<liferay-ui:input-search markupView="lexicon" />
		</aui:form>
	</aui:nav-bar-search>
</aui:nav-bar>

<liferay-frontend:management-bar
	includeCheckBox="<%= true %>"
	searchContainerId="users"
>
	<liferay-frontend:management-bar-buttons>
		<liferay-frontend:management-bar-display-buttons
			displayViews='<%= new String[] {"icon", "descriptive", "list"} %>'
			portletURL="<%= portletURL %>"
			selectedDisplayStyle="<%= displayStyle %>"
		/>
	</liferay-frontend:management-bar-buttons>

	<liferay-frontend:management-bar-filters>
		<liferay-frontend:management-bar-navigation
			navigationKeys='<%= new String[] {"all"} %>'
			portletURL="<%= PortletURLUtil.clone(portletURL, renderResponse) %>"
		/>

		<liferay-frontend:management-bar-sort
			orderByCol="<%= userSearchContainer.getOrderByCol() %>"
			orderByType="<%= userSearchContainer.getOrderByType() %>"
			orderColumns='<%= new String[] {"first-name", "screen-name"} %>'
			portletURL="<%= portletURL %>"
		/>
	</liferay-frontend:management-bar-filters>

	<liferay-frontend:management-bar-action-buttons>
		<liferay-frontend:management-bar-button href="javascript:;" icon="trash" id="removeUsers" label="remove" />
	</liferay-frontend:management-bar-action-buttons>
</liferay-frontend:management-bar>

<aui:form action="<%= portletURL.toString() %>" cssClass="container-fluid-1280" method="post" name="AddUser">
	<aui:input name="redirect" type="hidden" value="<%= currentURL %>" />
	<aui:input name="userGroupId" type="hidden" value="<%= userGroup.getUserGroupId() %>" />
	<aui:input name="deleteUserGroupIds" type="hidden" />
	<aui:input name="addUserIds" type="hidden" />
	<aui:input name="removeUserIds" type="hidden" />

	<div id="breadcrumb">
		<liferay-ui:breadcrumb showCurrentGroup="<%= false %>" showGuestGroup="<%= false %>" showLayout="<%= false %>" showPortletBreadcrumb="<%= true %>" />
	</div>

	<liferay-ui:search-container
		id="users"
		rowChecker="<%= rowChecker %>"
		searchContainer="<%= userSearchContainer %>"
	>
		<liferay-ui:user-search-container-results userParams="<%= userParams %>" />

		<liferay-ui:search-container-row
			className="com.liferay.portal.kernel.model.User"
			escapedModel="<%= true %>"
			keyProperty="userId"
			modelVar="user2"
			rowIdProperty="screenName"
		>

			<%
			boolean showActions = true;
			%>

			<%@ include file="/bid/commission/user_search_columns.jspf" %>
		</liferay-ui:search-container-row>

		<liferay-ui:search-iterator displayStyle="<%= displayStyle %>" markupView="lexicon" />
	</liferay-ui:search-container>

<aui:button name="savePost" value="save" primary="true"   />

</aui:form>

<liferay-frontend:add-menu>
	<liferay-frontend:add-menu-item id="addUsers" title='<%= LanguageUtil.get(request, "add-users") %>' url="javascript:;" />
</liferay-frontend:add-menu>

<aui:script use="liferay-item-selector-dialog">
	var form = AUI.$(document.<portlet:namespace />AddUser);

	<portlet:renderURL var="selectUsersURL" windowState="<%= LiferayWindowState.POP_UP.toString() %>">
		<portlet:param name="mvcPath" value="/bid/commission/select_user_group_users.jsp" />
		<portlet:param name="userGroupId" value="<%= String.valueOf(userGroupId) %>" />
			<portlet:param name="izvewenie_id" value="<%= String.valueOf(izvewenija.getIzvewenija_id()) %>" />
	</portlet:renderURL>

	$('#<portlet:namespace />addUsers').on(
		'click',
		function(event) {
			
			var itemSelectorDialog = new A.LiferayItemSelectorDialog(
				{
					eventName: '<portlet:namespace />selectUsers',
					on: {
						selectedItemChange: function(event) {
							var selectedItem = event.newVal;

							if (selectedItem) {
								form.fm('addUserIds').val(selectedItem);

								submitForm(form, '<portlet:actionURL name="editUserGroupAssignments" />');
							}
						}
					},
					title: '<liferay-ui:message arguments="<%= HtmlUtil.escape(userGroup.getName()) %>" key="add-users-to-x" />',
					url: '<%= selectUsersURL %>'
				}
			);

			itemSelectorDialog.open();
		}
	);

	$('#<portlet:namespace />removeUsers').on(
		'click',
		function() {
			form.fm('redirect').val('<%= portletURL.toString() %>');
			form.fm('removeUserIds').val(Liferay.Util.listCheckedExcept(form, '<portlet:namespace />allRowIds'));

			submitForm(form, '<portlet:actionURL name="editUserGroupAssignments" />');
		}
	);
	
	$('#<portlet:namespace />savePost').on(
	  	'click',
	  	function() {
	  		
	  		submitForm(form, '<portlet:actionURL name="addPost" />');
	  	}
	);
</aui:script>