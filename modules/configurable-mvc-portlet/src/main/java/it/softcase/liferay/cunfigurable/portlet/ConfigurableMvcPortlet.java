package it.softcase.liferay.cunfigurable.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import static it.softcase.liferay.cunfigurable.ConfigurableConstants.*;

@Component(
	immediate = true,
	property = {
            "com.liferay.portlet.display-category=" + MAIN_CATEGORY, 			// My category for application menu
            "com.liferay.portlet.instanceable=true", 							// Can exist more than one instance of same portlet
            "javax.portlet.display-name=" + CONFIGURABLE_PORTLET_DISPLAY_NAME, 	// Displayed name of my portlet
            "javax.portlet.name=" + CONFIGURABLE_PORTLET_NAME, 					// Unique portlet name
            "javax.portlet.init-param.template-path=/",							// Standard path, META-INF/resources/
            "javax.portlet.init-param.view-template=/view.jsp",					// Main JSP page
    		"javax.portlet.init-param.config-template=/config.jsp", 			// Specify JSP used to set configuration
            "javax.portlet.resource-bundle=content.Language",					// Translation file
            "javax.portlet.security-role-ref=power-user,user"					// Security
	},
	service = Portlet.class
)
public class ConfigurableMvcPortlet extends MVCPortlet {
	// NOP
}