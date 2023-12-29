# sd-aix-maker

[![Stars](https://img.shields.io/github/stars/SecretDiscorder/sd-aix-maker.svg)](https://github.com/SecretDiscorder/sd-aix-maker/stargazers)
[![Watchers](https://img.shields.io/github/watchers/SecretDiscorder/sd-aix-maker.svg)](https://github.com/SecretDiscorder/sd-aix-maker/watchers)
[![License](https://img.shields.io/github/license/SecretDiscorder/sd-aix-maker.svg)](https://github.com/SecretDiscorder/sd-aix-maker/blob/main/LICENSE)

## Remakeable Java Appinventor Extensions Creator
Sure, let me summarize the provided information:

An App Inventor Remakeable extension creator using Ant.

## Overview

- `sd-aix-maker` allows you to create extensions with Java source code, similar to Appinventor-Source, but without Kotlin support, enable java8 --source 8 , no-desugarding libraries, support Lambda expression

- It supports platforms such as Android (Termux or userland), Windows, Linux, and potentially macOS.


## Installation

https://youtu.be/tJo38el1PcE?si=9pAbpQdQZ836aOQx

**Requirements:**

- Ensure you have Git, Java JDK 8-11, and Apache Ant installed.

- Clone the repository: `git clone https://github.com/SecretDiscorder/sd-aix-maker`

## Usage

**Structure:**

- Source files: `components/src/...`

- External Libraries: `lib/...`

- To build: `ant aix`

- To use Proguard: `ant aix -Dproguard=1`

- Custom build: `./build.xml ./build-common.xml ./components/build.xml`


**Adding Source Code and External Libraries:**

- Source code goes to `components/src/com/...`

- External libraries go to `lib/{your library folder}/{your library}.jar`

- Modify `components/build.xml` accordingly.

## Build and Development


**GitHub Link:**

- [GitHub Repository](https://github.com/SecretDiscorder/sd-aix-maker)


**Example Code Structure:**

- Source code in `com.example`

- Uses Appinventor components

- Includes library references in `@UsesLibraries`

- Defines permissions in `@UsesPermissions`



## Contributing

We welcome contributions from the community! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

I Can coding but in bold quote "**UNDERSTAND**". 

Thanks

I build it by my self. Just only my knowledge about this.

If any question or bugs maybe i can update if i Can.

Links github

### https://github.com/SecretDiscorder/sd-aix-maker

 I'm from Indonesian

**Can i rename default git clone folder**

You don't rename default foldersd-aix-maker

You Can see overflow git at https://github.com/SecretDiscorder/sd-aix-maker/actions/runs/7353248508/job/20018981469


**How to put source code and write or add External libraries?**

You Can write or put source code to `components/src/com/.....`

If you add External library put to `lib/{folder your libraries}/{your libraries}.jar`

Then go to `components/build.xml`

![Screenshot_20231229-123625](https://github.com/SecretDiscorder/sd-aix-maker/assets/139457966/caec0523-d7f5-4420-9359-a4eae912e286)

This

>`<copy toFile="${public.deps.dir}/{your libraries name}.jar" `
>`file="${lib.dir}/{your libraries folder}/{your libraries name}.jar" />`

`@UsesLibraries(libraries = "runtime-sources.jar, runtime.jar, yourlibraries.jar") // don't remove runtime or source.jar
`
Then you Can add to your code .Java 

Example:

>      package com.example; 
>      import com.google.appinventor.components.runtime.*; 
>      import com.google.appinventor.components.runtime.util.*;
>      import com.google.appinventor.components.annotations.*;
>      import com.google.appinventor.components.common.*;
>      import com.google.appinventor.components.scripts.*;
>      import com.google.appinventor.components.annotations.androidmanifest.*;
>      import android.*;
>      import android.app.*;
>     @DesignerComponent(
>         version = 1,
>         description = "Simple Extension",
>         category = ComponentCategory.EXTENSION,
>         nonVisible = true,
>         iconName = "https://i.ibb.co/wJr2ymf/BimaAix.jpg",
> 		androidMinSdk = 26
>     )
>     @SimpleObject(external = true)
>     //Libraries
>     @UsesLibraries(libraries = "runtime-sources.jar, runtime.jar") //add libraries and don't remove default
>     @UsesPermissions(permissionNames = "android.permission.WRITE_EXTERNAL_STORAGE,android.permission.ACCESS_DOWNLOAD_MANAGER,android.permission.ACCESS_FINE_LOCATION,android.permission.RECORD_AUDIO, android.permission.MODIFY_AUDIO_SETTINGS, android.permission.CAMERA,android.permission.VIBRATE,android.webkit.resource.VIDEO_CAPTURE,android.webkit.resource.AUDIO_CAPTURE,android.launcher.permission.INSTALL_SHORTCUT,android.permission.ACTION_MANAGE_OVERLAY_PERMISSION,android.permission.CLEAR_APP_CACHE,android.permission.SYSTEM_ALERT_WINDOW,android.permission.HIDE_OVERLAY_WINDOWS,android.permission.QUERY_ALL_PACKAGES,android.permission.INTERNET,android.permission.MANAGE_EXTERNAL_STORAGE,android.permission.REQUEST_DELETE_PACKAGES,android.permission.REQUEST_INSTALL_PACKAGES,com.android.launcher.permission.INSTALL_SHORTCUT")
>     public class Extension extends AndroidNonvisibleComponent implements Component{
>         private ComponentContainer container;
>         private Activity activity;
> 
>         public Extension(ComponentContainer container) {
>             super(container.$form());
>             this.activity = container.$context();
>             this.container = container;
>         }
> 	      @SimpleFunction
>         public void ExampleFunction() {
>         }
>       	@SimpleEvent
>         public void ExampleEvent() {
>         }
>     
>          @SimpleProperty( category = PropertyCategory.BEHAVIOR)
>          @DesignerProperty(defaultValue = "true", editorType = "boolean")
>          public void ExampleProperty(boolean property) {
>          }
>          public boolean property(){
>               return true;
>          }
>     }
This should give you a cleaner and more organized narrative of the provided information. If you have specific questions or need further clarification, feel free to ask!
