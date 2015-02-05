package com.cs.jqchart;

import com.cs.jqchart.gwt.client.connect.JQChartServerRpc;
import com.cs.jqchart.gwt.client.shared.JQChartState;
import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractComponent;

/**
 * JQChart widget.
 */
@JavaScript({"gwt/public/js/jquery.min.js", "gwt/public/js/date.format.js", "gwt/public/js/jquery.jqplot.js", "gwt/public/js/plugins/jqplot.dateAxisRenderer.js", "gwt/public/js/plugins/jqplot.canvasTextRenderer.min.js", "gwt/public/js/plugins/jqplot.canvasAxisLabelRenderer.min.js",
    "gwt/public/js/plugins/jqplot.canvasAxisTickRenderer.js", "gwt/public/js/plugins/jqplot.barRenderer.js", "gwt/public/js/plugins/jqplot.categoryAxisRenderer.js", "gwt/public/js/plugins/jqplot.ohlcRenderer.min.js", "gwt/public/js/plugins/jqplot.enhancedLegendRenderer.min.js", "gwt/public/js/plugins/jqplot.meterGaugeRenderer.min.js", "gwt/public/js/plugins/jqplot.highlighter.js", "gwt/public/js/plugins/jqplot.cursor.min.js"})
@SuppressWarnings("serial")
public abstract class Chart extends AbstractComponent {

    public abstract void valueChange(String value);
    protected JQChartServerRpc serverRpc = new JQChartServerRpc() {
        @Override
        public void onValueChanged(String value) {
            valueChange(value);
        }
    };

    public Chart() {
        registerRpc(serverRpc);

        // Set size full
        setSizeFull();
    }

    public Chart(String initJS, String refreshJS, String clickJS, String dataClickJS) {
        registerRpc(serverRpc);

        // Store scripts with unique ids
        if (initJS != null) {
            getState().initJS = initJS.replaceAll("#id#", getState().uuid);
        }
        if (refreshJS != null) {
            getState().refreshJS = refreshJS.replaceAll("#id#", getState().uuid);
        }
        if (clickJS != null) {
            getState().clickJS = clickJS.replaceAll("#id#", getState().uuid);
        }
        if (dataClickJS != null) {
            getState().dataClickJS = dataClickJS.replaceAll("#id#", getState().uuid);
        }

        // Set size full
        setSizeFull();
    }

    public void init(String initJS, String refreshJS, String clickJS, String dataClickJS) {
        // Store scripts with unique ids
        if (initJS != null) {
            getState().initJS = initJS.replaceAll("#id#", getState().uuid);
        }
        if (refreshJS != null) {
            getState().refreshJS = refreshJS.replaceAll("#id#", getState().uuid);
        }
        if (clickJS != null) {
            getState().clickJS = clickJS.replaceAll("#id#", getState().uuid);
        }
        if (dataClickJS != null) {
            getState().dataClickJS = dataClickJS.replaceAll("#id#", getState().uuid);
        }

        // Notify of state change
        markAsDirty();
    }

    public void updateJS(String refreshJS, String clickJS, String dataClickJS) {
        // Store scripts with unique ids
        if (refreshJS != null) {
            getState().refreshJS = refreshJS.replaceAll("#id#", getState().uuid);
        }
        if (clickJS != null) {
            getState().clickJS = clickJS.replaceAll("#id#", getState().uuid);
        }
        if (dataClickJS != null) {
            getState().dataClickJS = dataClickJS.replaceAll("#id#", getState().uuid);
        }

        // Notify of state change
        markAsDirty();
    }

    public void updateRefreshJS(String refreshJS) {
        // Store scripts with unique ids
        if (refreshJS != null) {
            getState().refreshJS = refreshJS.replaceAll("#id#", getState().uuid);
        }

        // Notify of state change
        markAsDirty();
    }

    public void updateClickJS(String clickJS) {
        // Store scripts with unique ids
        if (clickJS != null) {
            getState().clickJS = clickJS.replaceAll("#id#", getState().uuid);
        }

        // Notify of state change
        markAsDirty();
    }

    public void updateDataClickJS(String dataClickJS) {
        // Store scripts with unique ids
        if (dataClickJS != null) {
            getState().dataClickJS = dataClickJS.replaceAll("#id#", getState().uuid);
        }

        // Notify of state change
        markAsDirty();
    }

    @Override
    public JQChartState getState() {
        return (JQChartState) super.getState();
    }

    public void drawChart() {
        // Update timestamp to force an update
        getState().lastUpdateTime = System.currentTimeMillis();

        // Notify of state change
        this.markAsDirty();
    }

    /**
     * Populate tokens in script and return populated script.
     * 
     * @param script String of token script
     * @return String of populated script
     */
    public String populateTokens(String script) {
        return script.replaceAll("#id#", getState().uuid);
    }
}