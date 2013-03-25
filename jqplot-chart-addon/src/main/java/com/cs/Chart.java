package com.cs;

import com.cs.gwt.client.connect.JQChartServerRpc;
import com.cs.gwt.client.shared.JQChartState;
import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractComponent;
import java.util.Timer;

/**
 * JQChart widget.
 */
@JavaScript({"gwt/public/js/jquery.min.js", "gwt/public/js/date.format.js", "gwt/public/js/jquery.jqplot.js", "gwt/public/js/plugins/jqplot.dateAxisRenderer.js", "gwt/public/js/plugins/jqplot.canvasTextRenderer.min.js", "gwt/public/js/plugins/jqplot.canvasAxisLabelRenderer.min.js",
    "gwt/public/js/plugins/jqplot.canvasAxisTickRenderer.js", "gwt/public/js/plugins/jqplot.barRenderer.js", "gwt/public/js/plugins/jqplot.categoryAxisRenderer.js", "gwt/public/js/plugins/jqplot.ohlcRenderer.min.js", "gwt/public/js/plugins/jqplot.enhancedLegendRenderer.min.js", "gwt/public/js/plugins/jqplot.highlighter.js", "gwt/public/js/plugins/jqplot.cursor.min.js"})
@SuppressWarnings("serial")
public class Chart extends AbstractComponent {

    private Timer timer = null;
    protected JQChartServerRpc serverRpc = new JQChartServerRpc() {
        @Override
        public void onValueChanged(String value) {
            if (value.equals("loaded")) {
            } else {
                // Data
            }
        }
    };

    public Chart() {
        registerRpc(serverRpc);
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

        markAsDirty();
    }

    @Override
    public JQChartState getState() {
        return (JQChartState) super.getState();
    }

    public void drawChart() {
        // Update timestamp to force an update
        getState().lastUpdateTime = System.currentTimeMillis();
        this.markAsDirty();
    }
}