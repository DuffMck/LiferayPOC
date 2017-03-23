# LiferayPOC

This project contains a workspace of Liferay 7.x with several modules. All of them are PoC projects that shows how you can do stuff with Liferay 7 and OSGi.

## Usage 
* Clone master brench 
* Import the project in your IDE (Eclipse/IntelliJ)
* Compile with gradle 
* Copy the jar inside the folder ``LIFERAY_HOME/deploy/``

That's it!

## Contents
### 1 - Module configurable-mvc-portlet
This module shows how to create a MVCPortlet with configuration capabilities.
This code allows you to setup a dynamic title for the Portlet and the most significant files are:
* [config.jsp](https://github.com/DuffMck/LiferayPOC/blob/master/modules/configurable-mvc-portlet/src/main/resources/META-INF/resources/config.jsp "config.jsp") : here you can create the HTML page with the form of configuration. Remember to use the ``preferences--portletTitle--`` syntax
* [ConfigurableMvcPortlet.java](https://github.com/DuffMck/LiferayPOC/blob/master/modules/configurable-mvc-portlet/src/main/java/it/softcase/liferay/cunfigurable/portlet/ConfigurableMvcPortlet.java "ConfigurableMvcPortlet.java")  : the class that exposes the MVCPortlet
* [ConfigurableConfigurationAction.java](https://github.com/DuffMck/LiferayPOC/blob/master/modules/configurable-mvc-portlet/src/main/java/it/softcase/liferay/cunfigurable/portlet/ConfigurableConfigurationAction.java "ConfigurableConfigurationAction.java") : the class that provides the action command's business logic to the MVCPortlet


It's quite simple, and you can find some comments inside the code, if you have any questions or doubts please write me and I will add more docs!
