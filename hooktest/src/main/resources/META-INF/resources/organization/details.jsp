<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>



<%@ include file="/init.jsp" %>

<%
long organizationId = ParamUtil.getLong(request, "organizationId");

Organization organization = OrganizationServiceUtil.fetchOrganization(organizationId);

long parentOrganizationId = ParamUtil.getLong(request, "parentOrganizationSearchContainerPrimaryKeys", (organization != null) ? organization.getParentOrganizationId() : OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID);

String parentOrganizationName = ParamUtil.getString(request, "parentOrganizationName");

OrgOtherInfo otherInfo = null; 
  
String orgtype = ParamUtil.getString(request,"type");

if (parentOrganizationId <= 0) {
	parentOrganizationId = OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID;

	if (organization != null) {
		parentOrganizationId = organization.getParentOrganizationId();
		otherInfo = OrgOtherInfoLocalServiceUtil.getOrgOtherInfoById(organizationId);
	}
}
List<IstochnikFinansirovanija> istochnikFinansirovanija = IstochnikFinansirovanijaLocalServiceUtil.
															getIstochnikFinansirovanijas(0, IstochnikFinansirovanijaLocalServiceUtil.getIstochnikFinansirovanijasCount());

String type = BeanParamUtil.getString(organization, request, "type", PropsValues.ORGANIZATIONS_TYPES[0]);
long regionId = BeanParamUtil.getLong(organization, request, "regionId");
long countryId = BeanParamUtil.getLong(organization, request, "countryId");

long groupId = 0;

if (organization != null) {
	groupId = organization.getGroupId();
}

User selUser = (User)request.getAttribute("user.selUser");
%>

   <portlet:resourceURL id="/users_admin/get_vbk" var="getVbk">
   		<portlet:param name="<%=Constants.CMD%>" value="getVbk" />
   </portlet:resourceURL>
   
   <portlet:resourceURL id="/users_admin/get_vbk" var="getFbk">
   		<portlet:param name="<%=Constants.CMD%>" value="getFbk" />
   </portlet:resourceURL>

<liferay-util:buffer var="removeOrganizationIcon">
	<liferay-ui:icon
		iconCssClass="icon-remove"
		label="<%= true %>"
		message="remove"
	/>
</liferay-util:buffer>

<liferay-ui:error-marker key="<%= WebKeys.ERROR_SECTION %>" value="details" />

<aui:model-context bean="<%= organization %>" model="<%= Organization.class %>" />

<div class="row">
	<aui:fieldset cssClass="col-md-6">
		<liferay-ui:error exception="<%= DuplicateOrganizationException.class %>" message="the-organization-name-is-already-taken" />

		<liferay-ui:error exception="<%= OrganizationNameException.class %>">
			<liferay-ui:message arguments="<%= new String[] {OrganizationConstants.NAME_LABEL, OrganizationConstants.NAME_GENERAL_RESTRICTIONS, OrganizationConstants.NAME_RESERVED_WORDS} %>" key="the-x-cannot-be-x-or-a-reserved-word-such-as-x" />
		</liferay-ui:error>

		<aui:input autoFocus="<%= windowState.equals(WindowState.MAXIMIZED) %>" name="name" />

		<c:choose>
			<c:when test="<%= PropsValues.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_ORGANIZATION_STATUS %>">
				<liferay-ui:error key="<%= NoSuchListTypeException.class.getName() + Organization.class.getName() + ListTypeConstants.ORGANIZATION_STATUS %>" message="please-select-a-type" />

				<aui:select label="status" listType="<%= ListTypeConstants.ORGANIZATION_STATUS %>" listTypeFieldName="statusId" name="statusId" showEmptyOption="<%= true %>" />
			</c:when>
			<c:otherwise>
				<aui:input name="statusId" type="hidden" value="<%= (organization != null) ? organization.getStatusId() : ListTypeConstants.ORGANIZATION_STATUS_DEFAULT %>" />
			</c:otherwise>
		</c:choose>

		<c:choose>
			<c:when test="<%= organization == null && PropsValues.ORGANIZATIONS_TYPES.length > 1 %>">
				<aui:select name="type">

					<%
					for (String curType : PropsValues.ORGANIZATIONS_TYPES) {
					%>

						<aui:option label="<%= curType %>" selected="<%= type.equals(curType) %>" />

					<%
					}
					%>

				</aui:select>
			</c:when>
			<c:when test="<%= organization == null %>">
				<aui:input name="type" type="hidden" value="<%= PropsValues.ORGANIZATIONS_TYPES[0] %>" />
			</c:when>
			<c:otherwise>
				<aui:input name="typeLabel" type="resource" value="<%= LanguageUtil.get(request, organization.getType()) %>" />

				<aui:input name="type" type="hidden" value="<%= organization.getType() %>" />
			</c:otherwise>
		</c:choose>

		<liferay-ui:error exception="<%= NoSuchCountryException.class %>" message="please-select-a-country" />
		
		 <div class="<%= orgtype.equals("economic_operator")? StringPool.BLANK:"hide" %>" id="<portlet:namespace />operatorDiv">
		 	
		 	<aui:input name="short-name" type="text" value="<%=orgtype.equals("economic_operator")? StringPool.BLANK:"0" %>" >
		 		<aui:validator name="required" ></aui:validator>
			</aui:input>
		 
		 <aui:input name="place-registration" type="text" value="<%=orgtype.equals("economic_operator")? StringPool.BLANK:"0" %>" >
		 		<aui:validator name="required" ></aui:validator>
			</aui:input>
		 <aui:fieldset>
			<aui:field-wrapper label="date-state-registration">
		</aui:field-wrapper></aui:fieldset>
		 	<liferay-ui:input-date
				cssClass="form-group form-group-inline"
				dayParam="publication_day"
		
				monthParam="publication_month"
				
				name="date-state-registration"
				yearParam="publication_year"
				required="true"
			/>
		  <aui:input name="cin" type="text"  />
		 </div>
		
        <div class="<%= orgtype.equals("contracting_authority")? StringPool.BLANK:"hide" %>" id="<portlet:namespace />authorityDiv">
			  
			  <aui:input name="vbk" type="text" value="<%=orgtype.equals("contracting_authority")? StringPool.BLANK:"0" %>" >
				<aui:validator name="required" ></aui:validator>
				</aui:input>
				    <aui:input name="vbk_kod" type="text" disabled="true" />
			  <aui:input name="vbk_id" type="hidden"  />
			
			  <aui:input name="fbk" type="text" value="<%=orgtype.equals("contracting_authority")? StringPool.BLANK:"0" %>" >
				<aui:validator name="required" ></aui:validator>
				</aui:input>
				    <aui:input name="fbk_kod" type="text" disabled="true" />
			  <aui:input name="fbk_id" type="hidden"  />
			  	 
			  	 <aui:select name="source_financing">
			  	 
			  	 <% for(IstochnikFinansirovanija finansirovanija : istochnikFinansirovanija) {%>
			  			
			  			<aui:option label="<%= finansirovanija.getNaimenovanie() %>"  value="<%=finansirovanija.getIstochnik_finansirovanija_id() %>" />		 
			  	<%} %>
			  			
			  	 </aui:select>
	</div>
           <div>
           		<aui:input name="ein" type="text"  />
           		<aui:input name="inn" type="text"  >
           		<aui:validator name="required" ></aui:validator>
           		</aui:input>
           </div>
		<div class="<%= GetterUtil.getBoolean(PropsUtil.get(PropsKeys.ORGANIZATIONS_COUNTRY_ENABLED, new Filter(String.valueOf(type)))) ? StringPool.BLANK : "hide" %>" id="<portlet:namespace />countryDiv">
			<aui:select label="country" name="countryId" />

			<aui:select label="region" name="regionId" />
		</div>
	</aui:fieldset>

	<aui:fieldset cssClass="col-md-6">
		<div>
			<c:if test="<%= organization != null %>">

				<%
				long logoId = organization.getLogoId();
				%>

				<liferay-ui:logo-selector
					currentLogoURL='<%= themeDisplay.getPathImage() + "/organization_logo?img_id=" + logoId + "&t=" + WebServerServletTokenUtil.getToken(logoId) %>'
					defaultLogo="<%= logoId == 0 %>"
					defaultLogoURL='<%= themeDisplay.getPathImage() + "/organization_logo?img_id=0" %>'
					logoDisplaySelector=".organization-logo"
					maxFileSize="<%= PrefsPropsUtil.getLong(PropsKeys.USERS_IMAGE_MAX_SIZE) %>"
					tempImageFileName="<%= String.valueOf(groupId) %>"
				/>
			</c:if>
		</div>
	</aui:fieldset>
</div>

<%
Organization parentOrganization = null;

if ((organization == null) && (parentOrganizationId == OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID) && !permissionChecker.isCompanyAdmin()) {
	List<Organization> manageableOrganizations = new ArrayList<Organization>();

	for (Organization curOrganization : user.getOrganizations()) {
		if (OrganizationPermissionUtil.contains(permissionChecker, curOrganization, ActionKeys.MANAGE_SUBORGANIZATIONS)) {
			manageableOrganizations.add(curOrganization);
		}
	}

	if (manageableOrganizations.size() == 1) {
		parentOrganizationId = manageableOrganizations.get(0).getOrganizationId();
	}
}

if (parentOrganizationId != OrganizationConstants.DEFAULT_PARENT_ORGANIZATION_ID) {
	try {
		parentOrganization = OrganizationLocalServiceUtil.getOrganization(parentOrganizationId);

		parentOrganizationName = parentOrganization.getName();
	}
	catch (NoSuchOrganizationException nsoe) {
	}
}

List<Organization> parentOrganizations = new ArrayList<Organization>();

if (parentOrganization != null) {
	parentOrganizations.add(parentOrganization);
}
%>

<h3><liferay-ui:message key="parent-organization" /></h3>

<liferay-ui:error exception="<%= OrganizationParentException.class %>" message="please-enter-a-valid-parent-organization" />

<liferay-ui:search-container
	headerNames="name,type,null"
	id="parentOrganizationSearchContainer"
	total="<%= parentOrganizations.size() %>"
>
	<liferay-ui:search-container-results
		results="<%= parentOrganizations %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.portal.kernel.model.Organization"
		escapedModel="<%= true %>"
		keyProperty="organizationId"
		modelVar="curOrganization"
	>
		<portlet:renderURL var="rowURL">
			<portlet:param name="mvcRenderCommandName" value="/users_admin/edit_organization" />
			<portlet:param name="redirect" value="<%= currentURL %>" />
			<portlet:param name="organizationId" value="<%= String.valueOf(curOrganization.getOrganizationId()) %>" />
		</portlet:renderURL>

		<liferay-ui:search-container-column-text
			cssClass="table-cell-content"
			href="<%= rowURL %>"
			name="name"
			property="name"
		/>

		<liferay-ui:search-container-column-text
			cssClass="table-cell-content"
			href="<%= rowURL %>"
			name="type"
			value="<%= LanguageUtil.get(request, curOrganization.getType()) %>"
		/>

		<liferay-ui:search-container-column-text>
			<a class="modify-link" data-rowId="<%= curOrganization.getOrganizationId() %>" href="javascript:;"><%= removeOrganizationIcon %></a>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator markupView="lexicon" paginate="<%= false %>" />
</liferay-ui:search-container>

<liferay-ui:icon
	cssClass="modify-link"
	id="selectOrganizationLink"
	label="<%= true %>"
	linkCssClass="btn btn-default btn-lg"
	message="select"
	method="get"
	url="javascript:;"
/>

<aui:script use="liferay-address,liferay-dynamic-select,liferay-search-container">
	new Liferay.DynamicSelect(
		[
			{
				select: '<portlet:namespace />countryId',
				selectData: Liferay.Address.getCountries,
				selectDesc: 'nameCurrentValue',
				selectId: 'countryId',
				selectSort: '<%= true %>',
				selectVal: '<%= countryId %>'
			},
			{
				select: '<portlet:namespace />regionId',
				selectData: Liferay.Address.getRegions,
				selectDesc: 'name',
				selectId: 'regionId',
				selectVal: '<%= regionId %>'
			}
		]
	);

	var searchContainer = Liferay.SearchContainer.get('<portlet:namespace />parentOrganizationSearchContainer');

	searchContainer.get('contentBox').delegate(
		'click',
		function(event) {
			var link = event.currentTarget;
			var tr = link.ancestor('tr');

			searchContainer.deleteRow(tr, link.getAttribute('data-rowId'));
		},
		'.modify-link'
	);

	var selectOrganizationLink = A.one('#<portlet:namespace />selectOrganizationLink');

	if (selectOrganizationLink) {
		selectOrganizationLink.on(
			'click',
			function(event) {
				Liferay.Util.selectEntity(
					{
						dialog: {
							constrain: true,
							modal: true
						},
						id: '<portlet:namespace />selectOrganization',
						title: '<liferay-ui:message arguments="organization" key="select-x" />',
						uri: '<portlet:renderURL windowState="<%= LiferayWindowState.POP_UP.toString() %>"><portlet:param name="mvcPath" value="/select_organization.jsp" /><portlet:param name="p_u_i_d" value='<%= (selUser == null) ? "0" : String.valueOf(selUser.getUserId()) %>' /></portlet:renderURL>'
					},
					function(event) {
						var rowColumns = [];

						var href = '<portlet:renderURL><portlet:param name="mvcRenderCommandName" value="/users_admin/edit_organization" /><portlet:param name="redirect" value="<%= currentURL %>" /></portlet:renderURL>&<portlet:namespace />organizationId=' + event.organizationid;

						rowColumns.push(<portlet:namespace />createURL(href, event.name));
						rowColumns.push(<portlet:namespace />createURL(href, event.type));
						rowColumns.push('<a class="modify-link" data-rowId="' + event.organizationid + '" href="javascript:;"><%= UnicodeFormatter.toString(removeOrganizationIcon) %></a>');

						searchContainer.deleteRow(1, searchContainer.getData());
						searchContainer.addRow(rowColumns, event.organizationid);
						searchContainer.updateDataStore(event.organizationid);
					}
				);
			}
		);
	}
</aui:script>

<aui:script>

AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',function (A) {
 

  
		A.io.request('<%=getVbk%>',{
		dataType: 'json',
		method: 'GET',
		on: {
			success: function() {

	 new A.AutoCompleteList(
				{
					allowBrowserAutocomplete: 'true',
					activateFirstItem: 'true',
					inputNode: '#<portlet:namespace/>vbk',
					resultTextLocator: 'nazvanie',
					resultHighlighter:['phraseMatch'],
					resultFilters:['phraseMatch'],
					render: 'true',
					source:this.get('responseData'),
					on: {
						select: function(event) {
						var result = event.result.raw;
						
						A.one('#<portlet:namespace/>vbk_kod').set('value',result.kod);
						A.one('#<portlet:namespace/>vbk_id').set('value',result.vbk_id);
						}
						},
				});
					}}
							});
		
		A.io.request('<%=getFbk%>',{
			dataType: 'json',
			method: 'GET',
			on: {
				success: function() {

		 new A.AutoCompleteList(
					{
						allowBrowserAutocomplete: 'true',
						activateFirstItem: 'true',
						inputNode: '#<portlet:namespace/>fbk',
						resultTextLocator: 'nazvanie',
						resultHighlighter:['phraseMatch'],
						resultFilters:['phraseMatch'],
						render: 'true',
						source:this.get('responseData'),
						on: {
							select: function(event) {
							var result = event.result.raw;
							
							A.one('#<portlet:namespace/>fbk_kod').set('value',result.kod);
							A.one('#<portlet:namespace/>fbk_id').set('value',result.fbk_id);
							}
							},
					});
						}}
								});
							
					
				
		});
		 
		 
	
</aui:script>

<c:if test="<%= organization == null %>">
	<aui:script sandbox="<%= true %>">
		$('#<portlet:namespace />type').on(
			'change',
			function(event) {
					
				var contracting_authority = $(event.currentTarget).val();
				if(contracting_authority == 'contracting_authority')
					{
				$('#<portlet:namespace />authorityDiv').toggleClass('hide',false);
				$('#<portlet:namespace />vbk').val('<%=StringPool.BLANK%>');
				$('#<portlet:namespace />fbk').val('<%=StringPool.BLANK%>');
					}
				else
					{
					$('#<portlet:namespace />authorityDiv').toggleClass('hide',true);
					$('#<portlet:namespace />vbk').val('0');
					$('#<portlet:namespace />fbk').val('0');
					}
				
				if(contracting_authority == 'economic_operator')
				{
					$('#<portlet:namespace />operatorDiv').toggleClass('hide',false);
					$('#<portlet:namespace />short-name').val('<%=StringPool.BLANK%>');
					$('#<portlet:namespace />place-registration').val('<%=StringPool.BLANK%>');
				}
			else
				{
					$('#<portlet:namespace />operatorDiv').toggleClass('hide',true);
					$('#<portlet:namespace />short-name').val('0');
					$('#<portlet:namespace />place-registration').val('0');
				}
				
				<%
				for (String curType : PropsValues.ORGANIZATIONS_TYPES) {
				%>

					if ($(event.currentTarget).val() == '<%= curType %>') {
						$('#<portlet:namespace />countryDiv').toggleClass('hide', !<%= GetterUtil.getBoolean(PropsUtil.get(PropsKeys.ORGANIZATIONS_COUNTRY_ENABLED, new Filter(String.valueOf(curType)))) %>);
					}

				<%
				}
				%>

			}
		);
	</aui:script>
</c:if>