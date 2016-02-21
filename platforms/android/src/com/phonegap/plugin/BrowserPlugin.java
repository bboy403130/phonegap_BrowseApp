
package com.phonegap.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import com.phonegap.helloworld.MainActivity;

public class BrowserPlugin extends CordovaPlugin {

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        // your init code here
    }
    @Override
    public boolean execute(String action, final JSONArray args, CallbackContext callbackContext) throws JSONException {
    	
        if ("browse".equals(action)) {
        	 callbackContext.success();
        	 cordova.getActivity().runOnUiThread(new Runnable() {
        		 	String url = args.getString(0);
        	        @Override
        	        public void run() {
        	            MainActivity act = (MainActivity) cordova.getActivity();
        	            act.changeActivity(url);
        	        }
        	    });
        	 
            
            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }
    

}
