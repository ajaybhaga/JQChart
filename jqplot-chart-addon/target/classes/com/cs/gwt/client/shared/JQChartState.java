package com.cs.gwt.client.shared;

import com.cs.gwt.client.util.StringUtility;
import com.vaadin.shared.AbstractComponentState;

@SuppressWarnings("serial")
public class JQChartState extends AbstractComponentState {
    
    public String uuid = "chart_" + Integer.toString(StringUtility.showRandomInteger(0, 999999));
    public String frameWidth;
    public String frameHeight;
    public String chartWidth;
    public String chartHeight;
    public String initJS;
    public String refreshJS;
    public String clickJS;
    public String dataClickJS;
}
