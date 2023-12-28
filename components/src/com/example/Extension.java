package com.example;

import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.annotations.androidmanifest.*;

@DesignerComponent(
        version = 1,
        description = "Simple Extension",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://i.ibb.co/wJr2ymf/BimaAix.jpg",
		androidMinSdk = 26
)
@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "runtime.jar, runtime-sources.jar") //important libraries
@UsesPermissions(permissionNames = "android.permission.WRITE_EXTERNAL_STORAGE,android.permission.ACCESS_DOWNLOAD_MANAGER,android.permission.ACCESS_FINE_LOCATION,android.permission.RECORD_AUDIO, android.permission.MODIFY_AUDIO_SETTINGS, android.permission.CAMERA,android.permission.VIBRATE,android.webkit.resource.VIDEO_CAPTURE,android.webkit.resource.AUDIO_CAPTURE,android.launcher.permission.INSTALL_SHORTCUT,android.permission.ACTION_MANAGE_OVERLAY_PERMISSION,android.permission.CLEAR_APP_CACHE,android.permission.SYSTEM_ALERT_WINDOW,android.permission.HIDE_OVERLAY_WINDOWS,android.permission.QUERY_ALL_PACKAGES,android.permission.INTERNET,android.permission.MANAGE_EXTERNAL_STORAGE,android.permission.REQUEST_DELETE_PACKAGES,android.permission.REQUEST_INSTALL_PACKAGES,com.android.launcher.permission.INSTALL_SHORTCUT")

public class Extension extends AndroidNonvisibleComponent implements Component{
    public Extension(ComponentContainer container) {
        super(container.$form());
        this.activity = container.$context();
        this.container = container;
        context = activity;
    }
	@SimpleFunction
    public void ExampleFunction() {
        return null;
    }
	@SimpleEvent
    public void ExampleEvent() {
        return null;
    }
    
    @SimpleProperty( category = PropertyCategory.BEHAVIOR)
    @DesignerProperty(defaultValue = "true", editorType = "boolean")
    public void ExampleProperty(boolean property) {
        return null;
    }
    public boolean property(){
        return true;
    }
}
