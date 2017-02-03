package it.softcase.liferay.cunfigurable.portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import static it.softcase.liferay.cunfigurable.ConfigurableConstants.*;

@Component(
    property = {
            "javax.portlet.name=" + CONFIGURABLE_PORTLET_NAME	// Reference to my portlet 
    },
    service = ConfigurationAction.class							// Behavior of this component 
)
public class ConfigurableConfigurationAction extends DefaultConfigurationAction {
	
	/**
	 * If you don't need to validate configuration omit this override, otherwise
	 * do some business logic with your configurations
	 * @param portletConfig
	 * @param actionRequest
	 * @param actionResponse
	 * @throws Exception
	 */
	@Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// Do some validation here
    	super.processAction(portletConfig, actionRequest, actionResponse);
    }
}
