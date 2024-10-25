---
layout: documentation
title: Extension
---

[&laquo; Back to index](index.html)
# Extension

Table of Contents:

* [BimaAix](#BimaAix)
* [Extension](#Extension)
* [exam](#exam)

## BimaAix  {#BimaAix}

Component for BimaAix



### Properties  {#BimaAix-Properties}

{:.properties}

{:id="BimaAix.AdHosts" .text .wo .bo} *AdHosts*
: Property for AdHosts

{:id="BimaAix.AllowScreenshotsUser" .boolean .wo} *AllowScreenshotsUser*
: Property for AllowScreenshotsUser

{:id="BimaAix.AudioPathSource" .text .ro .bo} *AudioPathSource*
: Source of the audio path.

{:id="BimaAix.AutoLoadImages" .boolean .bo} *AutoLoadImages*
: Returnss whether the WebView should load image resources

{:id="BimaAix.AutoplayMedia" .boolean .bo} *AutoplayMedia*
: Returns whether the WebView requires a user gesture to play media

{:id="BimaAix.BackgoundColor" .color} *BackgoundColor*
: Property for BackgoundColor

{:id="BimaAix.BackgroundColor" .number .wo .bo} *BackgroundColor*
: Sets background color of webview

{:id="BimaAix.BlockAds" .boolean .wo} *BlockAds*
: Property for BlockAds

{:id="BimaAix.BlockNetworkLoads" .boolean .bo} *BlockNetworkLoads*
: Returns whether the WebView should not load resources from the network

{:id="BimaAix.Brightness" .number .ro .bo} *Brightness*
: brightness (a value between 0 and 255)

{:id="BimaAix.BrightnessMode" .text .ro .bo} *BrightnessMode*
: brightness mode (MANUAL or AUTO)

{:id="BimaAix.CacheMode" .number .bo} *CacheMode*
: Gets cache mode of active webview

{:id="BimaAix.CurrentPageTitle" .text .ro .bo} *CurrentPageTitle*
: Title of the page currently viewed

{:id="BimaAix.CurrentUrl" .text .ro .bo} *CurrentUrl*
: URL of the page currently viewed

{:id="BimaAix.DeepLinks" .boolean} *DeepLinks*
: Property for DeepLinks

{:id="BimaAix.DesktopMode" .boolean .bo} *DesktopMode*
: Returns whether to load content in desktop mode

{:id="BimaAix.DisplayZoom" .boolean .bo} *DisplayZoom*
: Gets whether the WebView should display on-screen zoom controls

{:id="BimaAix.EnableJS" .boolean .bo} *EnableJS*
: Returns whether webview supports JavaScript execution

{:id="BimaAix.FileAccess" .boolean .bo} *FileAccess*
: Returns whether webview can access local files

{:id="BimaAix.FollowLinks" .boolean} *FollowLinks*
: Determines whether to follow links when they are tapped in the WebViewer.If you follow links, you can use GoBack and GoForward to navigate the browser history

{:id="BimaAix.FontScale" .number .ro .bo} *FontScale*
: Property for FontScale

{:id="BimaAix.FontSize" .number .bo} *FontSize*
: Returns the font size of text

{:id="BimaAix.GetClickable" .boolean .ro .bo} *GetClickable*
: Checks whether the floating view is clickable.

{:id="BimaAix.GetFloatingViewVisible" .boolean .ro .bo} *GetFloatingViewVisible*
: Checks if the floating is present on the screen.

{:id="BimaAix.InitialScale" .number .wo .bo} *InitialScale*
: Sets the initial scale for active WebView. 0 means default. If initial scale is greater than 0, WebView starts with this value as initial scale.

{:id="BimaAix.LayerType" .number .bo} *LayerType*
: Gets layer type

{:id="BimaAix.LoadWithOverviewMode" .boolean .bo} *LoadWithOverviewMode*
: Returns whether the WebView loads pages in overview mode

{:id="BimaAix.LongClickable" .boolean .bo} *LongClickable*
: Returns whether text selection and context menu are enabled or not

{:id="BimaAix.OverScrollMode" .number .bo} *OverScrollMode*
: Gets over scroll mode

{:id="BimaAix.PromptForPermission" .boolean .bo} *PromptForPermission*
: Sets whether webview will prompt for permission and raise 'OnPermissionRequest' event or not else assume permission is granted.

{:id="BimaAix.RotationAngle" .number .bo} *RotationAngle*
: Gets rotation angle

{:id="BimaAix.ScrollBar" .boolean .wo .bo} *ScrollBar*
: Whether to display horizonatal and vertical scrollbars or not

{:id="BimaAix.ScrollBarStyle" .number .bo} *ScrollBarStyle*
: Gets scroll bar style

{:id="BimaAix.Scrollable" .boolean .wo .bo} *Scrollable*
: Property for Scrollable

{:id="BimaAix.SetAudioPathSource" .text .wo} *SetAudioPathSource*
: Property for SetAudioPathSource

{:id="BimaAix.SetClickable" .boolean .wo .bo} *SetClickable*
: Adjusts whether the floating view is clickable

{:id="BimaAix.ShowUI" .boolean} *ShowUI*
: whether User Interface shoud be showed while setting the volume.

{:id="BimaAix.SupportMultipleWindows" .boolean .bo} *SupportMultipleWindows*
: Returns whether the WebView supports multiple windows

{:id="BimaAix.SuppressToast" .boolean} *SuppressToast*
: Property for SuppressToast

{:id="BimaAix.SuppressWarnings" .boolean} *SuppressWarnings*
: Property for SuppressWarnings

{:id="BimaAix.UseWideViewPort" .boolean .bo} *UseWideViewPort*
: Returns whether the WebView should enable support for the 'viewport' HTML meta tag or should use a wide viewport.

{:id="BimaAix.UserAgent" .text .bo} *UserAgent*
: Sets the WebView's user-agent string. If the string is null or empty, the system default value will be used.

{:id="BimaAix.UsesLocation" .boolean .wo .bo} *UsesLocation*
: Whether or not to give the application permission to use the Javascript geolocation API

{:id="BimaAix.VibrationEnabled" .boolean .bo} *VibrationEnabled*
: Returns whether vibration feedback enabled on long click

{:id="BimaAix.Visible" .boolean .ro .bo} *Visible*
: Returns the visibility of current webview

{:id="BimaAix.VolumeAlarm" .number} *VolumeAlarm*
: notification volume in percent.

{:id="BimaAix.VolumeMusic" .number} *VolumeMusic*
: media volume in percent.

{:id="BimaAix.VolumeRing" .number} *VolumeRing*
: ringtone volume in percent.

{:id="BimaAix.WebViewString" .text .bo} *WebViewString*
: Get webview string

{:id="BimaAix.ZoomEnabled" .boolean .bo} *ZoomEnabled*
: Gets whether the WebView should support zooming using its on-screen zoom controls and gestures

{:id="BimaAix.ZoomPercent" .number .bo} *ZoomPercent*
: Gets the zoom of the page in percent

{:id="BimaAix.getSdkVersion" .number .ro .bo} *getSdkVersion*
: Property for getSdkVersion

### Events  {#BimaAix-Events}

{:.events}

{:id="BimaAix.AfterArchiveSaved"} AfterArchiveSaved(*success*{:.boolean},*filePath*{:.text})
: Event raised after 'SaveArchive' method.If 'success' is true then returns file path else empty string.

{:id="BimaAix.AfterDismiss"} AfterDismiss(*response*{:.text})
: Event for AfterDismiss

{:id="BimaAix.AfterJavaScriptEvaluated"} AfterJavaScriptEvaluated(*result*{:.text})
: Event raised after evaluating Js and returns result.

{:id="BimaAix.ClickView"} ClickView()
: Executes after clicking on the floating component.

{:id="BimaAix.Completed"} Completed()
: Event for Completed

{:id="BimaAix.CookiesRemoved"} CookiesRemoved(*successful*{:.boolean})
: Event raised after 'ClearCokies' method with result

{:id="BimaAix.Failed"} Failed(*message*{:.text})
: Event for Failed

{:id="BimaAix.FileUploadNeeded"} FileUploadNeeded(*id*{:.number},*mimeType*{:.text},*isCaptureEnabled*{:.boolean})
: Event raised when file uploading is needed

{:id="BimaAix.FindResultReceived"} FindResultReceived(*id*{:.number},*activeMatchOrdinal*{:.number},*numberOfMatches*{:.number},*isDoneCounting*{:.boolean})
: Event raised after 'Find' method with int 'activeMatchOrdinal','numberOfMatches' and 'isDoneCounting'

{:id="BimaAix.GotCertificate"} GotCertificate(*isSecure*{:.boolean},*issuedBy*{:.text},*issuedTo*{:.text},*validTill*{:.text})
: Event raised after getting SSL certificate of current displayed url/website with boolean 'isSecure' and Strings 'issuedBy','issuedTo' and 'validTill'.If 'isSecure' is false and other values are empty then assume that website is not secure

{:id="BimaAix.GotPrintResult"} GotPrintResult(*printId*{:.text},*isCompleted*{:.boolean},*isFailed*{:.boolean},*isBlocked*{:.boolean})
: Event raised after getting previus print's result.

{:id="BimaAix.LongClicked"} LongClicked(*id*{:.number},*item*{:.text},*secondaryUrl*{:.text},*type*{:.number})
: Event raised when something is long clicked in webview with item(image,string,empty,etc) and type(item type like 0,1,8,etc)

{:id="BimaAix.OnCloseWindowRequest"} OnCloseWindowRequest(*id*{:.number})
: Event triggered when a window needs to be closed

{:id="BimaAix.OnConsoleMessage"} OnConsoleMessage(*message*{:.text},*lineNumber*{:.number},*sourceID*{:.number},*level*{:.text})
: Event raised after getting console message.

{:id="BimaAix.OnDownloadNeeded"} OnDownloadNeeded(*id*{:.number},*url*{:.text},*contentDisposition*{:.text},*mimeType*{:.text},*size*{:.number})
: Event raised when downloading is needed.

{:id="BimaAix.OnErrorReceived"} OnErrorReceived(*id*{:.number},*message*{:.text},*errorCode*{:.number},*url*{:.text})
: Event raised when any error is received during loading url and returns message,error code and failing url

{:id="BimaAix.OnFormResubmission"} OnFormResubmission(*id*{:.number})
: Event raised when resubmission of form is needed

{:id="BimaAix.OnGeolocationRequested"} OnGeolocationRequested(*origin*{:.text})
: Event raised when page asks for location access. Developer must handle/show dialog from him/herself.

{:id="BimaAix.OnHideCustomView"} OnHideCustomView()
: Event raised when current page exits from full screen mode

{:id="BimaAix.OnJsAlert"} OnJsAlert(*id*{:.number},*url*{:.text},*message*{:.text})
: Event raised when Js have to show an alert to user

{:id="BimaAix.OnJsConfirm"} OnJsConfirm(*id*{:.number},*url*{:.text},*message*{:.text})
: Tells to display a confirm dialog to the user.

{:id="BimaAix.OnJsPrompt"} OnJsPrompt(*id*{:.number},*url*{:.text},*message*{:.text},*defaultValue*{:.text})
: Event raised when JavaScript needs input from user

{:id="BimaAix.OnNewWindowRequest"} OnNewWindowRequest(*id*{:.number},*isDialog*{:.boolean},*isPopup*{:.boolean})
: Event raised when new window is requested by webview with boolean 'isDialog' and 'isPopup'

{:id="BimaAix.OnPermissionRequest"} OnPermissionRequest(*permissionsList*{:.list})
: Event raised when a website asks for specific permission(s) in list format.

{:id="BimaAix.OnProgressChanged"} OnProgressChanged(*newProgress*{:.number})
: Fires when Progress changed.

{:id="BimaAix.OnReceivedHttpAuthRequest"} OnReceivedHttpAuthRequest(*id*{:.number},*host*{:.text},*realm*{:.text})
: Notifies that the WebView received an HTTP authentication request.

{:id="BimaAix.OnReceivedSslError"} OnReceivedSslError(*errorCode*{:.number})
: Event for OnReceivedSslError

{:id="BimaAix.OnScrollChanged"} OnScrollChanged(*id*{:.number},*scrollX*{:.number},*scrollY*{:.number},*oldScrollX*{:.number},*oldScrollY*{:.number},*canGoLeft*{:.boolean},*canGoRight*{:.boolean})
: Event raised when webview gets scrolled

{:id="BimaAix.OnShowCustomView"} OnShowCustomView()
: Event raised when current page enters in full screen mode

{:id="BimaAix.PageLoaded"} PageLoaded(*id*{:.number})
: Event raised when page loading has finished.

{:id="BimaAix.PageStarted"} PageStarted(*id*{:.number},*url*{:.text})
: Event indicating that page loading has started in web view.

{:id="BimaAix.PermissionDenied"} PermissionDenied(*permissionName*{:.text})
: Permission has been denied.

{:id="BimaAix.PositionMoved"} PositionMoved(*x*{:.number},*y*{:.number})
: View moved from position

{:id="BimaAix.Progress"} Progress(*percentage*{:.number})
: Event for Progress

{:id="BimaAix.Swiped"} Swiped(*id*{:.number},*direction*{:.number})
: Event raised when webview is swiped

{:id="BimaAix.WebViewStringChanged"} WebViewStringChanged(*value*{:.text})
: When the JavaScript calls AppInventor.setWebViewString this event is run.

{:id="BimaAix.onProgressChanged"} onProgressChanged(*progress*{:.number})
: Event raised when page loading progress has changed.

### Methods  {#BimaAix-Methods}

{:.methods}

{:id="BimaAix.AllowGeolocationAccess" class="method"} <i/> AllowGeolocationAccess(*allow*{:.boolean},*remember*{:.boolean})
: Method for AllowGeolocationAccess

{:id="BimaAix.CanGoBack" class="method returns boolean"} <i/> CanGoBack()
: Gets whether this WebView has a back history item

{:id="BimaAix.CanGoBackOrForward" class="method returns boolean"} <i/> CanGoBackOrForward(*steps*{:.number})
: Gets whether the page can go back or forward the given number of steps.

{:id="BimaAix.CanGoForward" class="method returns boolean"} <i/> CanGoForward()
: Gets whether this WebView has a forward history item.

{:id="BimaAix.CancelPrinting" class="method"} <i/> CancelPrinting()
: Cancels current print job. You can request cancellation of a queued, started, blocked, or failed print job.

{:id="BimaAix.CheckDrawOverlayPermission" class="method returns boolean"} <i/> CheckDrawOverlayPermission()
: Checks whether the overlay permission is active.

{:id="BimaAix.CheckMyAppSignature" class="method returns boolean"} <i/> CheckMyAppSignature()
: Check if the app's signature matches the expected signature.

{:id="BimaAix.ClearCache" class="method"} <i/> ClearCache()
: Clears the resource cache.

{:id="BimaAix.ClearCookies" class="method"} <i/> ClearCookies()
: Removes all cookies and raises 'CookiesRemoved' event

{:id="BimaAix.ClearFormData" class="method"} <i/> ClearFormData(*id*{:.number})
: Clears the form data of the webview <br> Added by Xoma

{:id="BimaAix.ClearInternalHistory" class="method"} <i/> ClearInternalHistory()
: Tells this WebView to clear its internal back/forward list.

{:id="BimaAix.ClearLocation" class="method"} <i/> ClearLocation()
: Clear all location preferences.

{:id="BimaAix.ClearMatches" class="method"} <i/> ClearMatches()
: Clears the highlighting surrounding text matches.

{:id="BimaAix.CloseAppOnRecentPressed" class="method"} <i/> CloseAppOnRecentPressed()
: Method for CloseAppOnRecentPressed

{:id="BimaAix.ConfirmJs" class="method"} <i/> ConfirmJs(*confirm*{:.boolean})
: Whether to proceed JavaScript originated request

{:id="BimaAix.ContentHeight" class="method returns number"} <i/> ContentHeight()
: Gets height of HTML content

{:id="BimaAix.ContinueJs" class="method"} <i/> ContinueJs(*input*{:.text})
: Inputs a confirmation response to Js

{:id="BimaAix.CreateShortcut" class="method"} <i/> CreateShortcut(*url*{:.text},*iconPath*{:.text},*title*{:.text})
: Creates a shortcut of given website on home screen

{:id="BimaAix.CreateWebView" class="method"} <i/> CreateWebView(*container*{:.component},*id*{:.number})
: Creates the webview in given arrangement with id

{:id="BimaAix.CurrentId" class="method returns number"} <i/> CurrentId()
: Returns current id

{:id="BimaAix.DismissJsAlert" class="method"} <i/> DismissJsAlert()
: Dismiss previously requested Js alert

{:id="BimaAix.DismissViewFloating" class="method"} <i/> DismissViewFloating()
: Hides the floating component.

{:id="BimaAix.Dissmiss" class="method"} <i/> Dissmiss()
: Dismiss latest dialog

{:id="BimaAix.EvaluateJavaScript" class="method"} <i/> EvaluateJavaScript(*script*{:.text})
: Asynchronously evaluates JavaScript in the context of the currently displayed page.

{:id="BimaAix.Find" class="method"} <i/> Find(*string*{:.text})
: Finds all instances of find on the page and highlights them, asynchronously. Successive calls to this will cancel any pending searches.

{:id="BimaAix.FindNext" class="method"} <i/> FindNext(*forward*{:.boolean})
: Highlights and scrolls to the next match if 'forward' is true else scrolls to previous match.

{:id="BimaAix.GetCookies" class="method returns text"} <i/> GetCookies(*url*{:.text})
: Get cookies for specific url

{:id="BimaAix.GetIds" class="method returns list"} <i/> GetIds()
: Returns a list of used ids

{:id="BimaAix.GetInternalHistory" class="method returns list"} <i/> GetInternalHistory(*id*{:.number})
: Get internal history of given webview.

{:id="BimaAix.GetPositionX" class="method returns number"} <i/> GetPositionX()
: Gets the X coordinate that the floating view is in.

{:id="BimaAix.GetPositionY" class="method returns number"} <i/> GetPositionY()
: Gets the Y coordinate that the floating view is in.

{:id="BimaAix.GetProgress" class="method returns number"} <i/> GetProgress(*id*{:.number})
: Gets the progress for the given webview

{:id="BimaAix.GetScrollX" class="method returns number"} <i/> GetScrollX()
: Return the scrolled left position of the webview

{:id="BimaAix.GetScrollY" class="method returns number"} <i/> GetScrollY()
: Return the scrolled top position of the webview

{:id="BimaAix.GetSslCertificate" class="method"} <i/> GetSslCertificate()
: Gets the SSL certificate for the main top-level page and raises 'GotCertificate' event

{:id="BimaAix.GetTotalRAMHumanized" class="method returns text"} <i/> GetTotalRAMHumanized()
: Get total RAM in a human-readable format

{:id="BimaAix.GetTotalRAMInBytes" class="method returns number"} <i/> GetTotalRAMInBytes()
: Get total RAM in bytes

{:id="BimaAix.GetTotalRAMValue" class="method returns number"} <i/> GetTotalRAMValue()
: Get total RAM value

{:id="BimaAix.GetWebView" class="method returns any"} <i/> GetWebView(*id*{:.number})
: Returns webview object from id

{:id="BimaAix.GetWindowBrightness" class="method returns number"} <i/> GetWindowBrightness()
: Method for GetWindowBrightness

{:id="BimaAix.GoBack" class="method"} <i/> GoBack()
: Goes back in the history of this WebView.

{:id="BimaAix.GoBackOrForward" class="method"} <i/> GoBackOrForward(*steps*{:.number})
: Goes to the history item that is the number of steps away from the current item. Steps is negative if backward and positive if forward.

{:id="BimaAix.GoForward" class="method"} <i/> GoForward()
: Goes forward in the history of this WebView.

{:id="BimaAix.GoToUrl" class="method"} <i/> GoToUrl(*url*{:.text})
: Loads the given URL.

{:id="BimaAix.GrantPermission" class="method"} <i/> GrantPermission(*permissions*{:.text})
: Grants given permissions to webview.Use empty list to deny the request.

{:id="BimaAix.HideCustomView" class="method"} <i/> HideCustomView()
: Hides previously shown custom view

{:id="BimaAix.HideNavigationBarHP" class="method"} <i/> HideNavigationBarHP()
: Hide the navigation bar (including recent apps, home, and back buttons).

{:id="BimaAix.HideStatusBarHP" class="method"} <i/> HideStatusBarHP()
: Hide the status bar at the top of the screen.

{:id="BimaAix.InvokeZoomPicker" class="method"} <i/> InvokeZoomPicker()
: Invokes the graphical zoom picker widget for this WebView. This will result in the zoom widget appearing on the screen to control the zoom level of this WebView.Note that it does not checks whether zoom is enabled or not.

{:id="BimaAix.IsConnectedNetwork" class="method returns boolean"} <i/> IsConnectedNetwork()
: Method for IsConnectedNetwork

{:id="BimaAix.IsDeveloperModeEnabled" class="method returns boolean"} <i/> IsDeveloperModeEnabled()
: Check if developer mode is enabled.

{:id="BimaAix.IsEmulator" class="method returns boolean"} <i/> IsEmulator()
: Method for IsEmulator

{:id="BimaAix.IsRooted" class="method returns boolean"} <i/> IsRooted()
: Method for IsRooted

{:id="BimaAix.LoadHtml" class="method"} <i/> LoadHtml(*html*{:.text})
: Loads the given data into this WebView using a 'data' scheme URL.

{:id="BimaAix.LoadInNewWindow" class="method"} <i/> LoadInNewWindow(*id*{:.number})
: Loads requested url in given webview

{:id="BimaAix.LoadWithHeaders" class="method"} <i/> LoadWithHeaders(*url*{:.text},*headers*{:.dictionary})
: Loads the given URL with the specified additional HTTP headers defined is list of lists.

{:id="BimaAix.LoseFocusFloatingView" class="method"} <i/> LoseFocusFloatingView()
: Loses focus on the floating window.

{:id="BimaAix.Mode" class="method returns text"} <i/> Mode()
: Method for Mode

{:id="BimaAix.OpenScreenName" class="method returns boolean"} <i/> OpenScreenName(*screen*{:.text})
: Method for OpenScreenName

{:id="BimaAix.OverlapView" class="method"} <i/> OverlapView(*mainComponent*{:.component},*childComponent*{:.component},*margins*{:.list},*gravity*{:.number})
: Through this block it is possible to overlap any visible component on another.
margins (list):
	index 1 -> margin left (number)
	index 2 -> margin top (number)
	index 3 -> margin right(number)
	index 4 -> margin bottom (number)
gravity (number):
	0  -> TOP-LEFT
	1  -> TOP-CENTER
	2  -> TOP-RIGHT
	3  -> CENTER-LEFT
	4  -> CENTER
	5  -> CENTER-RIGHT
	6  -> BOTTOM-LEFT
	7  -> BOTTOM-CENTER
	8  -> BOTTOM-RIGHT

{:id="BimaAix.PageDown" class="method"} <i/> PageDown(*bottom*{:.boolean})
: Scrolls the contents of the WebView down by half the page size

{:id="BimaAix.PageUp" class="method"} <i/> PageUp(*top*{:.boolean})
: Scrolls the contents of the WebView up by half the page size

{:id="BimaAix.PauseWebView" class="method"} <i/> PauseWebView(*id*{:.number})
: Does a best-effort attempt to pause any processing that can be paused safely, such as animations and geolocation. Note that this call does not pause JavaScript.

{:id="BimaAix.PlayAudioPath" class="method"} <i/> PlayAudioPath(*audioPath*{:.text})
: Play audio from a specified path.

{:id="BimaAix.PostData" class="method"} <i/> PostData(*url*{:.text},*data*{:.text})
: Loads the URL with postData using 'POST' method into active WebView.

{:id="BimaAix.PrintWebContent" class="method"} <i/> PrintWebContent(*documentName*{:.text})
: Prints the content of webview with given document name

{:id="BimaAix.ProceedHttpAuthRequest" class="method"} <i/> ProceedHttpAuthRequest(*username*{:.text},*password*{:.text})
: Instructs the WebView to proceed with the authentication with the given credentials.If both parameters are empty then it will cancel the request.

{:id="BimaAix.ProceedSslError" class="method"} <i/> ProceedSslError(*proceed*{:.boolean})
: Method for ProceedSslError

{:id="BimaAix.RegisterDeepLink" class="method"} <i/> RegisterDeepLink(*scheme*{:.text})
: Registers to open specified link in associated external app(s)

{:id="BimaAix.Reload" class="method"} <i/> Reload()
: Reloads the current URL.

{:id="BimaAix.RemoveWebView" class="method"} <i/> RemoveWebView(*id*{:.number})
: Destroys the webview and removes it completely from view system

{:id="BimaAix.RequestDrawOverlayPermission" class="method"} <i/> RequestDrawOverlayPermission()
: Redirects to application settings to allow overlay permission.

{:id="BimaAix.RequestFocusFloatingView" class="method"} <i/> RequestFocusFloatingView()
: Prompts to focus on the floating window.

{:id="BimaAix.RestartPrinting" class="method"} <i/> RestartPrinting()
: Restarts current/previous print job. You can request restart of a failed print job.

{:id="BimaAix.RestoreFloatingView" class="method"} <i/> RestoreFloatingView()
: Returns the floating window to the screen.

{:id="BimaAix.ResubmitForm" class="method"} <i/> ResubmitForm(*reSubmit*{:.boolean})
: Whether to resubmit form or not.

{:id="BimaAix.ResumeWebView" class="method"} <i/> ResumeWebView(*id*{:.number})
: Resumes the previously paused WebView.

{:id="BimaAix.RingtoneGet" class="method returns text"} <i/> RingtoneGet(*type*{:.text})
: Get current ringtone. Type can be RINGTONE, NOTIFICATION or ALARM.

{:id="BimaAix.RingtonePlay" class="method"} <i/> RingtonePlay(*type*{:.text})
: Play ringtone. Type can be RINGTONE, NOTIFICATION or ALARM.

{:id="BimaAix.RingtoneStop" class="method"} <i/> RingtoneStop()
: Stop currently playing ringtone.

{:id="BimaAix.SaveArchive" class="method"} <i/> SaveArchive(*dir*{:.text})
: Saves the current site as a web archive

{:id="BimaAix.ScrollTo" class="method"} <i/> ScrollTo(*x*{:.number},*y*{:.number})
: Scrolls the webview to given position

{:id="BimaAix.SetCookies" class="method"} <i/> SetCookies(*url*{:.text},*cookieString*{:.text})
: Sets cookies for given url

{:id="BimaAix.SetExpectedSignature" class="method"} <i/> SetExpectedSignature(*signature*{:.text})
: Set the expected app signature.

{:id="BimaAix.SetPosition" class="method"} <i/> SetPosition(*x*{:.number},*y*{:.number})
: Moves the floating view to the indicated coordinates.

{:id="BimaAix.SetVisibility" class="method"} <i/> SetVisibility(*id*{:.number},*visibility*{:.boolean})
: Sets the visibility of webview by id

{:id="BimaAix.SetWebView" class="method"} <i/> SetWebView(*id*{:.number})
: Set specific webview to current webview by id

{:id="BimaAix.SetWindowBrightness" class="method"} <i/> SetWindowBrightness(*f*{:.number})
: Method for SetWindowBrightness

{:id="BimaAix.SetupView" class="method"} <i/> SetupView(*viewComponent*{:.component},*clickable*{:.boolean},*positionX*{:.number},*positionY*{:.number})
: Initializes the component you want to float.

{:id="BimaAix.ShowAlert" class="method"} <i/> ShowAlert(*notice*{:.text},*longNotification*{:.boolean})
: Show a original toast of android

{:id="BimaAix.ShowAlertAtCenter" class="method"} <i/> ShowAlertAtCenter(*notice*{:.text},*longNotification*{:.boolean})
: Show a original toast of android at the center of the screen

{:id="BimaAix.ShowDialog" class="method"} <i/> ShowDialog(*component*{:.component},*titletxt*{:.text},*cancleable*{:.boolean},*canceltext*{:.text},*listbutton*{:.list})
: Show a View dialog

{:id="BimaAix.ShowFloatingView" class="method"} <i/> ShowFloatingView()
: Displays the floating component.

{:id="BimaAix.StartLockTask" class="method"} <i/> StartLockTask()
: Method for StartLockTask

{:id="BimaAix.StopLoading" class="method"} <i/> StopLoading()
: Stops the current load.

{:id="BimaAix.StopLockTask" class="method"} <i/> StopLockTask()
: Method for StopLockTask

{:id="BimaAix.UploadFile" class="method"} <i/> UploadFile(*contentUri*{:.text})
: Uploads the given file from content uri.Use empty string to cancel the upload request.

{:id="BimaAix.ZoomBy" class="method"} <i/> ZoomBy(*zoomP*{:.number})
: Performs a zoom operation in the WebView by given zoom percent

{:id="BimaAix.ZoomIn" class="method"} <i/> ZoomIn()
: Performs zoom in in the WebView

{:id="BimaAix.ZoomOut" class="method"} <i/> ZoomOut()
: Performs zoom out in the WebView

{:id="BimaAix.addAppToRecent" class="method"} <i/> addAppToRecent()
: Method for addAppToRecent

{:id="BimaAix.isKioskModeActive" class="method returns boolean"} <i/> isKioskModeActive()
: Method for isKioskModeActive

{:id="BimaAix.isLowRAMDevice" class="method returns boolean"} <i/> isLowRAMDevice()
: Method for isLowRAMDevice

{:id="BimaAix.onBackPressed" class="method"} <i/> onBackPressed()
: Method for onBackPressed

{:id="BimaAix.onWindowFocusChanged" class="method"} <i/> onWindowFocusChanged(*z*{:.boolean})
: Method for onWindowFocusChanged

{:id="BimaAix.removeAppFromRecent" class="method"} <i/> removeAppFromRecent()
: Method for removeAppFromRecent

{:id="BimaAix.setHideFromRecent" class="method"} <i/> setHideFromRecent(*hide*{:.boolean})
: Method for setHideFromRecent

## Extension  {#Extension}

Component for Extension



### Properties  {#Extension-Properties}

{:.properties}

{:id="Extension.ExampleProperty" .boolean .wo} *ExampleProperty*
: Property for ExampleProperty

### Events  {#Extension-Events}

{:.events}

{:id="Extension.ExampleEvent"} ExampleEvent()
: Event for ExampleEvent

### Methods  {#Extension-Methods}

{:.methods}

{:id="Extension.ExampleFunction" class="method"} <i/> ExampleFunction()
: Method for ExampleFunction

## exam  {#exam}

Component for exam



### Properties  {#exam-Properties}

{:.properties}

{:id="exam.AllowScreenshotsUser" .boolean .wo} *AllowScreenshotsUser*
: Property for AllowScreenshotsUser

{:id="exam.GetClickable" .boolean .ro .bo} *GetClickable*
: Checks whether the floating view is clickable.

{:id="exam.GetFloatingViewVisible" .boolean .ro .bo} *GetFloatingViewVisible*
: Checks if the floating is present on the screen.

{:id="exam.SetClickable" .boolean .wo .bo} *SetClickable*
: Adjusts whether the floating view is clickable

{:id="exam.SuppressToast" .boolean} *SuppressToast*
: Property for SuppressToast

{:id="exam.getSdkVersion" .number .ro .bo} *getSdkVersion*
: Property for getSdkVersion

### Events  {#exam-Events}

{:.events}

{:id="exam.ClickView"} ClickView()
: Executes after clicking on the floating component.

{:id="exam.OnProgressChanged"} OnProgressChanged(*newProgress*{:.number})
: Fires when Progress changed.

{:id="exam.PositionMoved"} PositionMoved(*x*{:.number},*y*{:.number})
: View moved from position

### Methods  {#exam-Methods}

{:.methods}

{:id="exam.CheckDrawOverlayPermission" class="method returns boolean"} <i/> CheckDrawOverlayPermission()
: Checks whether the overlay permission is active.

{:id="exam.DismissViewFloating" class="method"} <i/> DismissViewFloating()
: Hides the floating component.

{:id="exam.GetPositionX" class="method returns number"} <i/> GetPositionX()
: Gets the X coordinate that the floating view is in.

{:id="exam.GetPositionY" class="method returns number"} <i/> GetPositionY()
: Gets the Y coordinate that the floating view is in.

{:id="exam.HideNavigationBarHP" class="method"} <i/> HideNavigationBarHP()
: Hide the navigation bar (including recent apps, home, and back buttons).

{:id="exam.HideStatusBarHP" class="method"} <i/> HideStatusBarHP()
: Hide the status bar at the top of the screen.

{:id="exam.IsConnectedNetwork" class="method returns boolean"} <i/> IsConnectedNetwork()
: Method for IsConnectedNetwork

{:id="exam.IsDeveloperModeEnabled" class="method returns boolean"} <i/> IsDeveloperModeEnabled()
: Check if developer mode is enabled.

{:id="exam.IsEmulator" class="method returns boolean"} <i/> IsEmulator()
: Method for IsEmulator

{:id="exam.IsRooted" class="method returns boolean"} <i/> IsRooted()
: Method for IsRooted

{:id="exam.LoseFocusFloatingView" class="method"} <i/> LoseFocusFloatingView()
: Loses focus on the floating window.

{:id="exam.Mode" class="method returns text"} <i/> Mode()
: Uses String for mode Kiosk app None or Pinned

{:id="exam.OverlapView" class="method"} <i/> OverlapView(*mainComponent*{:.component},*childComponent*{:.component},*margins*{:.list},*gravity*{:.number})
: Through this block it is possible to overlap any visible component on another.
margins (list):
	index 1 -> margin left (number)
	index 2 -> margin top (number)
	index 3 -> margin right(number)
	index 4 -> margin bottom (number)
gravity (number):
	0  -> TOP-LEFT
	1  -> TOP-CENTER
	2  -> TOP-RIGHT
	3  -> CENTER-LEFT
	4  -> CENTER
	5  -> CENTER-RIGHT
	6  -> BOTTOM-LEFT
	7  -> BOTTOM-CENTER
	8  -> BOTTOM-RIGHT

{:id="exam.RequestDrawOverlayPermission" class="method"} <i/> RequestDrawOverlayPermission()
: Redirects to application settings to allow overlay permission.

{:id="exam.RequestFocusFloatingView" class="method"} <i/> RequestFocusFloatingView()
: Prompts to focus on the floating window.

{:id="exam.RestoreFloatingView" class="method"} <i/> RestoreFloatingView()
: Returns the floating window to the screen.

{:id="exam.SearchViaAOL" class="method returns any"} <i/> SearchViaAOL(*keyword*{:.text})
: Returns a URL for searching a keyword via AOL.

{:id="exam.SearchViaASK" class="method returns any"} <i/> SearchViaASK(*keyword*{:.text})
: Returns a URL for searching a keyword via ASK.COM.

{:id="exam.SearchViaAlibaba" class="method returns any"} <i/> SearchViaAlibaba(*keyword*{:.text})
: Returns a URL for searching a keyword via Alibaba.

{:id="exam.SearchViaAliexpress" class="method returns any"} <i/> SearchViaAliexpress(*keyword*{:.text})
: Returns a URL for searching a keyword via Aliexpress.

{:id="exam.SearchViaAmazon" class="method returns any"} <i/> SearchViaAmazon(*keyword*{:.text})
: Returns a URL for searching a keyword via Amazon.

{:id="exam.SearchViaBaidu" class="method returns any"} <i/> SearchViaBaidu(*keyword*{:.text})
: Returns a URL for searching a keyword via Baidu (chinese).

{:id="exam.SearchViaBing" class="method returns any"} <i/> SearchViaBing(*keyword*{:.text})
: Returns a URL for searching a keyword via Bing.

{:id="exam.SearchViaDDG" class="method returns any"} <i/> SearchViaDDG(*keyword*{:.text})
: Returns a URL for searching a keyword via DuckDuckGo.

{:id="exam.SearchViaEbay" class="method returns any"} <i/> SearchViaEbay(*keyword*{:.text})
: Returns a URL for searching a keyword via Ebay.

{:id="exam.SearchViaGoogle" class="method returns any"} <i/> SearchViaGoogle(*keyword*{:.text},*domain*{:.any})
: Returns a URL for searching a keyword via Google.

{:id="exam.SearchViaWikipedia" class="method returns any"} <i/> SearchViaWikipedia(*keyword*{:.text},*language*{:.text})
: Returns a URL for searching a keyword via Wikipedia.

{:id="exam.SearchViaYahoo" class="method returns any"} <i/> SearchViaYahoo(*keyword*{:.text})
: Returns a URL for searching a keyword via Yahoo.

{:id="exam.SetPosition" class="method"} <i/> SetPosition(*x*{:.number},*y*{:.number})
: Moves the floating view to the indicated coordinates.

{:id="exam.SetWindowBrightness" class="method"} <i/> SetWindowBrightness(*f*{:.number})
: Method for SetWindowBrightness

{:id="exam.SetupView" class="method"} <i/> SetupView(*viewComponent*{:.component},*clickable*{:.boolean},*positionX*{:.number},*positionY*{:.number})
: Initializes the component you want to float.

{:id="exam.ShowFloatingView" class="method"} <i/> ShowFloatingView()
: Displays the floating component.

{:id="exam.StartLockTask" class="method"} <i/> StartLockTask()
: Enable Pinning Screen.

{:id="exam.StopLockTask" class="method"} <i/> StopLockTask()
: disable Pinning Screen.

{:id="exam.addAppToRecent" class="method"} <i/> addAppToRecent()
: add screen to background.

{:id="exam.forceStopAndClearData" class="method"} <i/> forceStopAndClearData(*packageName*{:.text})
: Force stops the specified app and clears its data.

{:id="exam.removeAppFromRecent" class="method"} <i/> removeAppFromRecent()
: remove app from background

{:id="exam.setHideFromRecent" class="method"} <i/> setHideFromRecent(*hide*{:.boolean})
: remove app from background with boolean
