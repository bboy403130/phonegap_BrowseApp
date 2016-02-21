/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.phonegap.helloworld;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.engine.SystemWebViewEngine;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends CordovaActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        // Set by <content src="index.html" /> in config.xml
        try{
        	SystemWebViewEngine systemWebViewEngine = (SystemWebViewEngine) appView.getEngine();
        	WebView webView = (WebView) systemWebViewEngine.getView();
            WebSettings settings = webView.getSettings();
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            
        }catch(Exception e){
        	//e.printStackTrace();
        	Log.e("tony",e.getMessage());
        }
        
        loadUrl(launchUrl);

        
    }
    public void changeActivity(String url){
    	loadUrl(url);
    	
    }
}
