package com.cs.jqchart.demo;

import com.cs.jqchart.Chart;
import com.vaadin.annotations.Theme;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class JQChartDemoUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setWidth("100%");
        setContent(layout);

        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.setWidth("100%");
        layout.addComponent(buttonLayout);

        CheckBox cbox = new CheckBox("Show buttons");
        cbox.addValueChangeListener(new ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
                boolean value = (Boolean) event.getProperty().getValue();
            }
        });
        buttonLayout.addComponent(cbox);

        Button jump = new Button("Select random value");
        jump.setDescription("Select random value from each Picker");
        buttonLayout.addComponent(jump);
        jump.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            }
        });

        Button remove = new Button("Remove current value");
        remove.setDescription("Remove current value from Pickers A and B");
        buttonLayout.addComponent(remove);
        remove.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            }
        });

        Button add = new Button("Add value");
        add.setDescription("Add value to Picker A and B");
        buttonLayout.addComponent(add);
        add.addClickListener(new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            }
        });
        
        String initJS =  
                "var #id#_plot;"
                + "var #id#_s1 = [10, 20, 4, 27, 5];"
                + "var #id#_ticks = ['Fastest Run','Last Run','Current Run','Average Run','Slowest Run'];"
                + "var #id#_plot_options = {"
                + "seriesColors: ['#66FF66','#CD7DD1','#FFFF4D','#3366FF','#FF4D4D'],"
                + "series: [{renderer: $.jqplot.BarRenderer,pointLabels: { show: false },rendererOptions: {barDirection: 'vertical',barPadding: 1,barWidth: 80,varyBarColor: true}}],"
                + "title: 'Flowchart Runtime Comparison',"
                + "axes: {xaxis: {label: 'Runs',labelRenderer: $.jqplot.CanvasAxisLabelRenderer,labelOptions: {fontSize: '9pt',fontFamily: 'Tahoma',angle: 0,fontWeight: 'normal',fontStretch: 1},renderer: $.jqplot.CategoryAxisRenderer,ticks: #id#_ticks, tickOptions: {fontSize: '8pt', fontFamily: 'Tahoma', angle: -60, fontWeight: 'normal', fontStretch: 1}}, yaxis: {label: 'Runtime (minutes)',labelRenderer: $.jqplot.CanvasAxisLabelRenderer,labelOptions: {fontSize: '9pt',fontFamily: 'Tahoma',angle: -90,fontWeight: 'normal',fontStretch: 1},min: 0, tickOptions: { show: true, fontSize: '8pt', fontFamily: 'Tahoma', angle: 0, fontWeight: 'normal', fontStretch: 1 } } },"
                + "highlighter: {showMarker: false, showTooltip: false},"
                + "cursor: { show: false } };"
                + "$.jqplot.config.enablePlugins = true;"
                + "try{ #id#_plot.target.empty(); #id#_plot.destroy(); }catch(e){}"
                + "try{ #id#_plot = $.jqplot('#id#', [#id#_s1], #id#_plot_options); }catch(e){}";
        String refreshJS = initJS;
        
        Chart chart = new Chart(initJS, refreshJS, null, null, "100%", "100%", "100%", "100%");        
        layout.addComponent(chart);
        chart.drawChart();
        
    }
}