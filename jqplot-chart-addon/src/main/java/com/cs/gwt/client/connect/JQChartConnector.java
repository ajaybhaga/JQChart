package com.cs.gwt.client.connect;

import com.cs.Chart;
import com.cs.gwt.client.GwtJQChart;
import com.cs.gwt.client.shared.JQChartState;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;
import java.util.Set;

@SuppressWarnings("serial")
@Connect(Chart.class)
public class JQChartConnector extends AbstractComponentConnector
        implements ValueChangeHandler<String> {

    protected final JQChartServerRpc serverRpc = RpcProxy.create(
            JQChartServerRpc.class, this);

    @Override
    public void init() {
        super.init();

        getWidget().addValueChangeHandler(this);
    }

    @Override
    public GwtJQChart getWidget() {
        return (GwtJQChart) super.getWidget();
    }

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);

        Set<String> changeSet = stateChangeEvent.getChangedProperties();

        for (String prop : changeSet) {

            if (prop.equals("uuid")) {
                getWidget().setUUID(getState().uuid);
            }

            if (prop.equals("chartWidth")) {
                getWidget().setChartWidth(getState().chartWidth);
            }

            if (prop.equals("chartHeight")) {
                getWidget().setChartHeight(getState().chartHeight);
            }

            if (prop.equals("frameWidth")) {
                getWidget().setFrameWidth(getState().frameWidth);
            }

            if (prop.equals("frameHeight")) {
                getWidget().setFrameHeight(getState().frameHeight);
            }

            if (prop.equals("initJS")) {
                getWidget().setInitJS(getState().initJS);
            }

            if (prop.equals("refreshJS")) {
                getWidget().setRefreshJS(getState().refreshJS);
            }

            if (prop.equals("clickJS")) {
                getWidget().setClickJS(getState().clickJS);
            }

            if (prop.equals("dataClickJS")) {
                getWidget().setDataClickJS(getState().dataClickJS);
            }
        }

        // TODO: Call on rpc send data?
        getWidget().update();
    }

    @Override
    public JQChartState getState() {
        return (JQChartState) super.getState();
    }

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {
        serverRpc.onValueChanged(event.getValue());
    }
}