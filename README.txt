Picker Vaadin UI Component Add On

Picker is scrollable value picker. It's similar to presentation of select
HTML element on iOS devices.

Demo application: http://siika.fi:8080/PickerDemo/
Source code: https://github.com/alump/Picker
Vaadin Directory: TBA
License: Apache License 2.0

This project can be imported to Eclipse with m2e.

Simple Maven tutorials:


***** How to compile add on jar package for your project *****

> cd picker-addon
> mvn package

add on can be found at: picker-addon/target/Picker-<version>.jar
zip package used at Vaadin directory can be found at:
picker-addon/target/Picker-<version>.zip

***** How to install fancylayouts to your Maven repository *****

To install addon to your local repository, run:

> cd picker-addon
> mvn install


***** How to run test application *****

First compile and install addon (if not already installed)
> cd picker-addon
> mvn install

Then compile demo widgetset and start HTTP server
> cd ../picker-demo
> mvn vaadin:compile
> mvn jetty:run

Demo application is running at http://localhost:8080/picker



***** How to compile test application WAR *****

First compile and install addon (if not already installed)
> cd picker-addon
> mvn install

Then construct demo package (this should automatically compile widgetset)
> cd ../picker-demo
> mvn package

War package can be now found at picker-demo/target/PickerDemo.war
