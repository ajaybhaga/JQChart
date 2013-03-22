package com.cs.gwt.client.connect;

import com.vaadin.shared.communication.ServerRpc;

/**
 * Server RPC interface for jqChart
 */
public interface JQChartServerRpc extends ServerRpc {	        
        public void onValueChanged(String value);
}
