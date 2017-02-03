<%@ include file="init.jsp" %>
<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<aui:form action="<%= configurationURL %>" method="post" name="fm">
	<!-- THIS CODE ENABLE THE ACTION COMMANT TO SAVE CONFIOGURATION -->
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
    
    <!-- 
    	YOUR PREFERENCES
    	You must use this prefix preferences--NAME_OF_PROPERTY-- to save the name of a configuration
    --> 
    <aui:input name="preferences--portletTitle--" type="text" value="<%= portletTitle %>" />

    <aui:button-row>
        <aui:button type="submit" />
    </aui:button-row>
</aui:form>