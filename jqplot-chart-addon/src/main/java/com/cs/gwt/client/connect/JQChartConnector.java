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

        // Invoke updates in the widget
        getWidget().setUUID(getState().uuid);
        getWidget().setInitJS(getState().initJS);
        getWidget().setRefreshJS(getState().refreshJS);
        getWidget().setClickJS(getState().clickJS);
        getWidget().setDataClickJS(getState().dataClickJS);
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