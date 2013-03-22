package com.cs.gwt.client;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.VConsole;

public class GwtJQChart extends Widget implements
        HasValueChangeHandlers<String> {

    /**
     * Set the CSS class name to allow styling.
     */
    public static final String CLASSNAME = "jqchart";
    private DivElement mainDivElement;
    private DivElement renderToElement;
    private String uuid;
    private String frameWidth;
    private String frameHeight;
    private String chartWidth;
    private String chartHeight;
    public String initJS;
    public String refreshJS;
    public String clickJS;
    public String dataClickJS;

    public GwtJQChart() {
        mainDivElement = Document.get().createDivElement();
        // By default, render to the main div
        renderToElement = mainDivElement;
        setElement(mainDivElement);
    }

    public void setDimensions(String frameWidth, String frameHeight) {
        DivElement frameDivElement = Document.get().createDivElement();
        frameDivElement.setAttribute("style", "width:" + frameWidth + "; height:" + frameHeight + "; overflow:auto;");
        DivElement chartDivElement = Document.get().createDivElement();
        chartDivElement.setAttribute("style", "width:" + chartWidth + "; height:" + chartHeight + ";");
        frameDivElement.appendChild(chartDivElement);
        mainDivElement.appendChild(frameDivElement);

        // Render to the chart div
        renderToElement = chartDivElement;
        renderToElement.setId(uuid);

        setWidth(frameWidth);
        setHeight(frameHeight);
    }

    public void setUUID(String uuid) {
        this.uuid = uuid;

        VConsole.log("setUUID(): GwtJQChart uuid = " + uuid);               

        // Initialize methods with unique id
        initializeMethods(uuid);
    }

    public void setChartWidth(String chartWidth) {
        this.chartWidth = chartWidth;
    }

    public void setChartHeight(String chartHeight) {
        this.chartHeight = chartHeight;
    }

    public void setFrameWidth(String frameWidth) {
        this.frameWidth = frameWidth;

        // Update dimensions
        setDimensions(frameWidth, frameHeight);
    }

    public void setFrameHeight(String frameHeight) {
        this.frameHeight = frameHeight;

        // Update dimensions
        setDimensions(frameWidth, frameHeight);
    }

    public void setInitJS(String initJS) {
        this.initJS = initJS;

        if (initJS != null) {
            runScript(initJS);
        } else {
            VConsole.log("initJS loaded: " + initJS);
        }
    }

    public void setRefreshJS(String refreshJS) {
        this.refreshJS = refreshJS;
    }

    public void setClickJS(String clickJS) {
        this.clickJS = clickJS;
        if (clickJS != null) {

            // Replace the token by the uidlId
            clickJS = clickJS.replaceAll("#id#", uuid);

            // Define click handler
            String js =
                    "$('#" + uuid + "').bind('jqplotClick', function(ev, gridpos, datapos, neighbor) {"
                    + clickJS
                    + "});";
            runScript(js);
        }
    }

    public void setDataClickJS(String dataClickJS) {
        this.dataClickJS = dataClickJS;
        if (dataClickJS != null) {

            // Replace the token by the uidlId
            dataClickJS = dataClickJS.replaceAll("#id#", uuid);

            // Define click handler
            String js =
                    "$('#" + uuid + "').bind('jqplotDataClick', function(ev, seriesIndex, pointIndex, data) {"
                    + dataClickJS
                    + "});";
            runScript(js);
        }
    }

    @Override
    public void onAttach() {
        super.onAttach();
    }

    public void update() {

        VConsole.log("GwtJQChart.update()");
        // Set the dimensions
        setDimensions(frameWidth, frameHeight);

        if (refreshJS != null) {
            runScript(refreshJS);
        }
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