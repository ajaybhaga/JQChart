package com.cs.jqchart.gwt.client.shared;

import com.cs.jqchart.gwt.client.util.StringUtility;
import com.vaadin.shared.AbstractComponentState;

@SuppressWarnings("serial")
public class JQChartState extends AbstractComponentState {
    
    public String uuid = "chart_" + Integer.toString(StringUtility.showRandomInteger(0, 999999));
    public String initJS;
    public String refreshJS;
    public String clickJS;
    public String dataClickJS;
    public long lastUpdateTime;
}
