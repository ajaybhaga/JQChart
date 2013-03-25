package com.cs.gwt.client;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.VConsole;

public class GwtJQChart extends Widget implements
        HasValueChangeHandlers<String> {

    /**
     * Set the CSS class name to allow styling.
     */
    public static final String CLASSNAME = "jqchart";
    private DivElement mainDivElement;
    private DivElement chartDivElement;
    private DivElement renderToElement;
    private String uuid;
    private boolean uuidSet = false;
    private boolean chartDivIdSet = false;
    private boolean initJSExecuted = false;
    private boolean clickJSBound = false;
    private boolean dataClickJSBound = false;
    public String initJS;
    public String refreshJS;
    public String clickJS;
    public String dataClickJS;

    public GwtJQChart() {
        mainDivElement = Document.get().createDivElement();
        // By default, render to the main div
        renderToElement = mainDivElement;
        setElement(mainDivElement);
        VConsole.log("Main div created.");

        DivElement frameDivElement = Document.get().createDivElement();
        frameDivElement.setAttribute("style", "width:100%; height:100%; overflow:auto;");
        chartDivElement = Document.get().createDivElement();
        chartDivElement.setAttribute("style", "width:100%; height:100%;");
        frameDivElement.appendChild(chartDivElement);
        mainDivElement.appendChild(frameDivElement);

        setWidth("100%");
        setHeight("100%");

        VConsole.log("Created chart div for plot.");
    }

    public void setChartDivId() {
        // Only set the chart div id once
        if (!chartDivIdSet) {

            // Render to the chart div
            renderToElement = chartDivElement;
            renderToElement.setId(uuid);

            VConsole.log("Set chart div for plot with id = " + uuid);
            chartDivIdSet = true;
        }
    }

    public void setUUID(String uuid) {
        if (!uuidSet) {
            this.uuid = uuid;

            // Initialize methods with unique id
            initializeMethods(uuid);

            VConsole.log("setUUID(): Initialized methods with uuid = " + uuid);

            // UUID has been set
            uuidSet = true;

            // Set chart div id
            setChartDivId();
        }
    }

    public void setInitJS(final String initJS) {
        // Execute the init JS if it has not been executed already
        if (!initJSExecuted) {
            VConsole.log("Attempting to execute initJS: " + initJS);
            this.initJS = initJS;

            if (initJS != null) {

                // Run the script on the widget after setup completes.
                Scheduler.get().scheduleDeferred(new Command() {
                    public void execute() {
                        runScript(initJS);
                    }
                });

                VConsole.log("initJS loaded: " + initJS);
            } else {
                VConsole.log("initJS is null!");
            }

            // Init JS has been executed
            initJSExecuted = true;
        }
    }

    public void setRefreshJS(final String refreshJS) {
        this.refreshJS = refreshJS;

        if (refreshJS != null) {

            // Run the script on the widget after setup completes.
            Scheduler.get().scheduleDeferred(new Command() {
                public void execute() {
                    runScript(refreshJS);
                }
            });

            VConsole.log("refreshJS loaded: " + refreshJS);
        } else {
            VConsole.log("refreshJS is null!");
        }
    }

    public void setClickJS(String clickJS) {
        this.clickJS = clickJS;
        if (!clickJSBound) {
            if (clickJS != null) {

                // Replace the token by the uidlId
                clickJS = clickJS.replaceAll("#id#", uuid);

                // Define click handler
                String js =
                        "$('#" + uuid + "').bind('jqplotClick', function(ev, gridpos, datapos, neighbor) {"
                        + clickJS
                        + "});";
                runScript(js);

                // Bound click JS
                clickJSBound = true;
            }
        }
    }

    public void setDataClickJS(String dataClickJS) {
        this.dataClickJS = dataClickJS;
        if (!dataClickJSBound) {
            if (dataClickJS != null) {

                // Replace the token by the uidlId
                dataClickJS = dataClickJS.replaceAll("#id#", uuid);

                // Define click handler
                String js =
                        "$('#" + uuid + "').bind('jqplotDataClick', function(ev, seriesIndex, pointIndex, data) {"
                        + dataClickJS
                        + "});";
                runScript(js);

                // Bound data click JS
                dataClickJSBound = true;
            }
        }
    }

    @Override
    public void onAttach() {
        super.onAttach();
    }

    /**
     * Push data to connector -> server
     *
     * @param String data
     *
     */
    public void sendData(String data) {
        ValueChangeEvent.fire(this, data);
    }

    @Override
    public HandlerRegistration addValueChangeHandler(
            ValueChangeHandler<String> handler) {
        HandlerRegistration registration = this.addHandler(handler,
                ValueChangeEvent.getType());
        return registration;
    }

    public native void runScript(String script) /*-{
     $wnd.eval(script);
     }-*/;

    /**
     * Initialize the native javascript functions needed for the javascript <->
     * GWT communication
     *
     * @param String id
     */
    public native void initializeMethods(String id) /*-{
     var app = this;

     if($wnd.vaadin.chart == null)
     var chart = [];
     else
     var chart = $wnd.vaadin.chart;

     chart['sendData_' + id] = function(url) {
     app.@com.cs.gwt.client.GwtJQChart::sendData(Ljava/lang/String;)(url);
     };

     $wnd.vaadin.chart = chart;

     }-*/;
}