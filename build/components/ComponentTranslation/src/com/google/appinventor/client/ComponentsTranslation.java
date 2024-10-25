package com.google.appinventor.client;

import java.util.HashMap;
import java.util.Map;

import static com.google.appinventor.client.Ode.MESSAGES;

public class ComponentsTranslation {
  public static Map<String, String> myMap = map();

  private static String getName(String key) {
    String value = myMap.get(key);
    if (key == null) {
      return "**Missing key in ComponentsTranslations**";
    } else {
      return value;
    }
  }

  public static String getPropertyName(String key) {
    String value = getName("PROPERTY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getPropertyDescription(String key) {
    String value = getName("PROPDESC-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getMethodName(String key) {
    String value = getName("METHOD-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getEventName(String key) {
    String value = getName("EVENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentName(String key) {
    String value = getName("COMPONENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getCategoryName(String key) {
    String value = getName("CATEGORY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentHelpString(String key) {
    String value = getName(key + "-helpString");
    if(value == null) return key;
    return value;
  }
  public static HashMap<String, String> map() {
    HashMap<String, String> map = new HashMap<String, String>();


    /* Descriptions */

    map.put("PROPDESC-AdHostsPropertyDescriptions", MESSAGES.AdHostsPropertyDescriptions());
    map.put("EVENTDESC-AfterArchiveSavedEventDescriptions", MESSAGES.AfterArchiveSavedEventDescriptions());
    map.put("EVENTDESC-AfterDismissEventDescriptions", MESSAGES.AfterDismissEventDescriptions());
    map.put("EVENTDESC-AfterJavaScriptEvaluatedEventDescriptions", MESSAGES.AfterJavaScriptEvaluatedEventDescriptions());
    map.put("METHODDESC-AllowGeolocationAccessMethodDescriptions", MESSAGES.AllowGeolocationAccessMethodDescriptions());
    map.put("PROPDESC-AllowScreenshotsUserPropertyDescriptions", MESSAGES.AllowScreenshotsUserPropertyDescriptions());
    map.put("PROPDESC-AudioPathSourcePropertyDescriptions", MESSAGES.AudioPathSourcePropertyDescriptions());
    map.put("PROPDESC-AutoLoadImagesPropertyDescriptions", MESSAGES.AutoLoadImagesPropertyDescriptions());
    map.put("PROPDESC-AutoplayMediaPropertyDescriptions", MESSAGES.AutoplayMediaPropertyDescriptions());
    map.put("PROPDESC-BackgoundColorPropertyDescriptions", MESSAGES.BackgoundColorPropertyDescriptions());
    map.put("PROPDESC-BackgroundColorPropertyDescriptions", MESSAGES.BackgroundColorPropertyDescriptions());
    map.put("METHODDESC-BimaAix.ModeMethodDescriptions", MESSAGES.BimaAix__ModeMethodDescriptions());
    map.put("METHODDESC-BimaAix.StartLockTaskMethodDescriptions", MESSAGES.BimaAix__StartLockTaskMethodDescriptions());
    map.put("METHODDESC-BimaAix.StopLockTaskMethodDescriptions", MESSAGES.BimaAix__StopLockTaskMethodDescriptions());
    map.put("METHODDESC-BimaAix.addAppToRecentMethodDescriptions", MESSAGES.BimaAix__addAppToRecentMethodDescriptions());
    map.put("METHODDESC-BimaAix.removeAppFromRecentMethodDescriptions", MESSAGES.BimaAix__removeAppFromRecentMethodDescriptions());
    map.put("METHODDESC-BimaAix.setHideFromRecentMethodDescriptions", MESSAGES.BimaAix__setHideFromRecentMethodDescriptions());
    map.put("PROPDESC-BlockAdsPropertyDescriptions", MESSAGES.BlockAdsPropertyDescriptions());
    map.put("PROPDESC-BlockNetworkLoadsPropertyDescriptions", MESSAGES.BlockNetworkLoadsPropertyDescriptions());
    map.put("PROPDESC-BrightnessModePropertyDescriptions", MESSAGES.BrightnessModePropertyDescriptions());
    map.put("PROPDESC-BrightnessPropertyDescriptions", MESSAGES.BrightnessPropertyDescriptions());
    map.put("PROPDESC-CacheModePropertyDescriptions", MESSAGES.CacheModePropertyDescriptions());
    map.put("METHODDESC-CanGoBackMethodDescriptions", MESSAGES.CanGoBackMethodDescriptions());
    map.put("METHODDESC-CanGoBackOrForwardMethodDescriptions", MESSAGES.CanGoBackOrForwardMethodDescriptions());
    map.put("METHODDESC-CanGoForwardMethodDescriptions", MESSAGES.CanGoForwardMethodDescriptions());
    map.put("METHODDESC-CancelPrintingMethodDescriptions", MESSAGES.CancelPrintingMethodDescriptions());
    map.put("METHODDESC-CheckDrawOverlayPermissionMethodDescriptions", MESSAGES.CheckDrawOverlayPermissionMethodDescriptions());
    map.put("METHODDESC-CheckMyAppSignatureMethodDescriptions", MESSAGES.CheckMyAppSignatureMethodDescriptions());
    map.put("METHODDESC-ClearCacheMethodDescriptions", MESSAGES.ClearCacheMethodDescriptions());
    map.put("METHODDESC-ClearCookiesMethodDescriptions", MESSAGES.ClearCookiesMethodDescriptions());
    map.put("METHODDESC-ClearFormDataMethodDescriptions", MESSAGES.ClearFormDataMethodDescriptions());
    map.put("METHODDESC-ClearInternalHistoryMethodDescriptions", MESSAGES.ClearInternalHistoryMethodDescriptions());
    map.put("METHODDESC-ClearLocationMethodDescriptions", MESSAGES.ClearLocationMethodDescriptions());
    map.put("METHODDESC-ClearMatchesMethodDescriptions", MESSAGES.ClearMatchesMethodDescriptions());
    map.put("EVENTDESC-ClickViewEventDescriptions", MESSAGES.ClickViewEventDescriptions());
    map.put("METHODDESC-CloseAppOnRecentPressedMethodDescriptions", MESSAGES.CloseAppOnRecentPressedMethodDescriptions());
    map.put("EVENTDESC-CompletedEventDescriptions", MESSAGES.CompletedEventDescriptions());
    map.put("METHODDESC-ConfirmJsMethodDescriptions", MESSAGES.ConfirmJsMethodDescriptions());
    map.put("METHODDESC-ContentHeightMethodDescriptions", MESSAGES.ContentHeightMethodDescriptions());
    map.put("METHODDESC-ContinueJsMethodDescriptions", MESSAGES.ContinueJsMethodDescriptions());
    map.put("EVENTDESC-CookiesRemovedEventDescriptions", MESSAGES.CookiesRemovedEventDescriptions());
    map.put("METHODDESC-CreateShortcutMethodDescriptions", MESSAGES.CreateShortcutMethodDescriptions());
    map.put("METHODDESC-CreateWebViewMethodDescriptions", MESSAGES.CreateWebViewMethodDescriptions());
    map.put("METHODDESC-CurrentIdMethodDescriptions", MESSAGES.CurrentIdMethodDescriptions());
    map.put("PROPDESC-CurrentPageTitlePropertyDescriptions", MESSAGES.CurrentPageTitlePropertyDescriptions());
    map.put("PROPDESC-CurrentUrlPropertyDescriptions", MESSAGES.CurrentUrlPropertyDescriptions());
    map.put("PROPDESC-DeepLinksPropertyDescriptions", MESSAGES.DeepLinksPropertyDescriptions());
    map.put("PROPDESC-DesktopModePropertyDescriptions", MESSAGES.DesktopModePropertyDescriptions());
    map.put("METHODDESC-DismissJsAlertMethodDescriptions", MESSAGES.DismissJsAlertMethodDescriptions());
    map.put("METHODDESC-DismissViewFloatingMethodDescriptions", MESSAGES.DismissViewFloatingMethodDescriptions());
    map.put("PROPDESC-DisplayZoomPropertyDescriptions", MESSAGES.DisplayZoomPropertyDescriptions());
    map.put("METHODDESC-DissmissMethodDescriptions", MESSAGES.DissmissMethodDescriptions());
    map.put("PROPDESC-EnableJSPropertyDescriptions", MESSAGES.EnableJSPropertyDescriptions());
    map.put("METHODDESC-EvaluateJavaScriptMethodDescriptions", MESSAGES.EvaluateJavaScriptMethodDescriptions());
    map.put("EVENTDESC-ExampleEventEventDescriptions", MESSAGES.ExampleEventEventDescriptions());
    map.put("METHODDESC-ExampleFunctionMethodDescriptions", MESSAGES.ExampleFunctionMethodDescriptions());
    map.put("PROPDESC-ExamplePropertyPropertyDescriptions", MESSAGES.ExamplePropertyPropertyDescriptions());
    map.put("EVENTDESC-FailedEventDescriptions", MESSAGES.FailedEventDescriptions());
    map.put("PROPDESC-FileAccessPropertyDescriptions", MESSAGES.FileAccessPropertyDescriptions());
    map.put("EVENTDESC-FileUploadNeededEventDescriptions", MESSAGES.FileUploadNeededEventDescriptions());
    map.put("METHODDESC-FindMethodDescriptions", MESSAGES.FindMethodDescriptions());
    map.put("METHODDESC-FindNextMethodDescriptions", MESSAGES.FindNextMethodDescriptions());
    map.put("EVENTDESC-FindResultReceivedEventDescriptions", MESSAGES.FindResultReceivedEventDescriptions());
    map.put("PROPDESC-FollowLinksPropertyDescriptions", MESSAGES.FollowLinksPropertyDescriptions());
    map.put("PROPDESC-FontScalePropertyDescriptions", MESSAGES.FontScalePropertyDescriptions());
    map.put("PROPDESC-FontSizePropertyDescriptions", MESSAGES.FontSizePropertyDescriptions());
    map.put("PROPDESC-GetClickablePropertyDescriptions", MESSAGES.GetClickablePropertyDescriptions());
    map.put("METHODDESC-GetCookiesMethodDescriptions", MESSAGES.GetCookiesMethodDescriptions());
    map.put("PROPDESC-GetFloatingViewVisiblePropertyDescriptions", MESSAGES.GetFloatingViewVisiblePropertyDescriptions());
    map.put("METHODDESC-GetIdsMethodDescriptions", MESSAGES.GetIdsMethodDescriptions());
    map.put("METHODDESC-GetInternalHistoryMethodDescriptions", MESSAGES.GetInternalHistoryMethodDescriptions());
    map.put("METHODDESC-GetPositionXMethodDescriptions", MESSAGES.GetPositionXMethodDescriptions());
    map.put("METHODDESC-GetPositionYMethodDescriptions", MESSAGES.GetPositionYMethodDescriptions());
    map.put("METHODDESC-GetProgressMethodDescriptions", MESSAGES.GetProgressMethodDescriptions());
    map.put("METHODDESC-GetScrollXMethodDescriptions", MESSAGES.GetScrollXMethodDescriptions());
    map.put("METHODDESC-GetScrollYMethodDescriptions", MESSAGES.GetScrollYMethodDescriptions());
    map.put("METHODDESC-GetSslCertificateMethodDescriptions", MESSAGES.GetSslCertificateMethodDescriptions());
    map.put("METHODDESC-GetTotalRAMHumanizedMethodDescriptions", MESSAGES.GetTotalRAMHumanizedMethodDescriptions());
    map.put("METHODDESC-GetTotalRAMInBytesMethodDescriptions", MESSAGES.GetTotalRAMInBytesMethodDescriptions());
    map.put("METHODDESC-GetTotalRAMValueMethodDescriptions", MESSAGES.GetTotalRAMValueMethodDescriptions());
    map.put("METHODDESC-GetWebViewMethodDescriptions", MESSAGES.GetWebViewMethodDescriptions());
    map.put("METHODDESC-GetWindowBrightnessMethodDescriptions", MESSAGES.GetWindowBrightnessMethodDescriptions());
    map.put("METHODDESC-GoBackMethodDescriptions", MESSAGES.GoBackMethodDescriptions());
    map.put("METHODDESC-GoBackOrForwardMethodDescriptions", MESSAGES.GoBackOrForwardMethodDescriptions());
    map.put("METHODDESC-GoForwardMethodDescriptions", MESSAGES.GoForwardMethodDescriptions());
    map.put("METHODDESC-GoToUrlMethodDescriptions", MESSAGES.GoToUrlMethodDescriptions());
    map.put("EVENTDESC-GotCertificateEventDescriptions", MESSAGES.GotCertificateEventDescriptions());
    map.put("EVENTDESC-GotPrintResultEventDescriptions", MESSAGES.GotPrintResultEventDescriptions());
    map.put("METHODDESC-GrantPermissionMethodDescriptions", MESSAGES.GrantPermissionMethodDescriptions());
    map.put("METHODDESC-HideCustomViewMethodDescriptions", MESSAGES.HideCustomViewMethodDescriptions());
    map.put("METHODDESC-HideNavigationBarHPMethodDescriptions", MESSAGES.HideNavigationBarHPMethodDescriptions());
    map.put("METHODDESC-HideStatusBarHPMethodDescriptions", MESSAGES.HideStatusBarHPMethodDescriptions());
    map.put("PROPDESC-InitialScalePropertyDescriptions", MESSAGES.InitialScalePropertyDescriptions());
    map.put("METHODDESC-InvokeZoomPickerMethodDescriptions", MESSAGES.InvokeZoomPickerMethodDescriptions());
    map.put("METHODDESC-IsConnectedNetworkMethodDescriptions", MESSAGES.IsConnectedNetworkMethodDescriptions());
    map.put("METHODDESC-IsDeveloperModeEnabledMethodDescriptions", MESSAGES.IsDeveloperModeEnabledMethodDescriptions());
    map.put("METHODDESC-IsEmulatorMethodDescriptions", MESSAGES.IsEmulatorMethodDescriptions());
    map.put("METHODDESC-IsRootedMethodDescriptions", MESSAGES.IsRootedMethodDescriptions());
    map.put("PROPDESC-LayerTypePropertyDescriptions", MESSAGES.LayerTypePropertyDescriptions());
    map.put("METHODDESC-LoadHtmlMethodDescriptions", MESSAGES.LoadHtmlMethodDescriptions());
    map.put("METHODDESC-LoadInNewWindowMethodDescriptions", MESSAGES.LoadInNewWindowMethodDescriptions());
    map.put("METHODDESC-LoadWithHeadersMethodDescriptions", MESSAGES.LoadWithHeadersMethodDescriptions());
    map.put("PROPDESC-LoadWithOverviewModePropertyDescriptions", MESSAGES.LoadWithOverviewModePropertyDescriptions());
    map.put("PROPDESC-LongClickablePropertyDescriptions", MESSAGES.LongClickablePropertyDescriptions());
    map.put("EVENTDESC-LongClickedEventDescriptions", MESSAGES.LongClickedEventDescriptions());
    map.put("METHODDESC-LoseFocusFloatingViewMethodDescriptions", MESSAGES.LoseFocusFloatingViewMethodDescriptions());
    map.put("EVENTDESC-OnCloseWindowRequestEventDescriptions", MESSAGES.OnCloseWindowRequestEventDescriptions());
    map.put("EVENTDESC-OnConsoleMessageEventDescriptions", MESSAGES.OnConsoleMessageEventDescriptions());
    map.put("EVENTDESC-OnDownloadNeededEventDescriptions", MESSAGES.OnDownloadNeededEventDescriptions());
    map.put("EVENTDESC-OnErrorReceivedEventDescriptions", MESSAGES.OnErrorReceivedEventDescriptions());
    map.put("EVENTDESC-OnFormResubmissionEventDescriptions", MESSAGES.OnFormResubmissionEventDescriptions());
    map.put("EVENTDESC-OnGeolocationRequestedEventDescriptions", MESSAGES.OnGeolocationRequestedEventDescriptions());
    map.put("EVENTDESC-OnHideCustomViewEventDescriptions", MESSAGES.OnHideCustomViewEventDescriptions());
    map.put("EVENTDESC-OnJsAlertEventDescriptions", MESSAGES.OnJsAlertEventDescriptions());
    map.put("EVENTDESC-OnJsConfirmEventDescriptions", MESSAGES.OnJsConfirmEventDescriptions());
    map.put("EVENTDESC-OnJsPromptEventDescriptions", MESSAGES.OnJsPromptEventDescriptions());
    map.put("EVENTDESC-OnNewWindowRequestEventDescriptions", MESSAGES.OnNewWindowRequestEventDescriptions());
    map.put("EVENTDESC-OnPermissionRequestEventDescriptions", MESSAGES.OnPermissionRequestEventDescriptions());
    map.put("EVENTDESC-OnProgressChangedEventDescriptions", MESSAGES.OnProgressChangedEventDescriptions());
    map.put("EVENTDESC-OnReceivedHttpAuthRequestEventDescriptions", MESSAGES.OnReceivedHttpAuthRequestEventDescriptions());
    map.put("EVENTDESC-OnReceivedSslErrorEventDescriptions", MESSAGES.OnReceivedSslErrorEventDescriptions());
    map.put("EVENTDESC-OnScrollChangedEventDescriptions", MESSAGES.OnScrollChangedEventDescriptions());
    map.put("EVENTDESC-OnShowCustomViewEventDescriptions", MESSAGES.OnShowCustomViewEventDescriptions());
    map.put("METHODDESC-OpenScreenNameMethodDescriptions", MESSAGES.OpenScreenNameMethodDescriptions());
    map.put("PROPDESC-OverScrollModePropertyDescriptions", MESSAGES.OverScrollModePropertyDescriptions());
    map.put("METHODDESC-OverlapViewMethodDescriptions", MESSAGES.OverlapViewMethodDescriptions());
    map.put("METHODDESC-PageDownMethodDescriptions", MESSAGES.PageDownMethodDescriptions());
    map.put("EVENTDESC-PageLoadedEventDescriptions", MESSAGES.PageLoadedEventDescriptions());
    map.put("EVENTDESC-PageStartedEventDescriptions", MESSAGES.PageStartedEventDescriptions());
    map.put("METHODDESC-PageUpMethodDescriptions", MESSAGES.PageUpMethodDescriptions());
    map.put("METHODDESC-PauseWebViewMethodDescriptions", MESSAGES.PauseWebViewMethodDescriptions());
    map.put("EVENTDESC-PermissionDeniedEventDescriptions", MESSAGES.PermissionDeniedEventDescriptions());
    map.put("METHODDESC-PlayAudioPathMethodDescriptions", MESSAGES.PlayAudioPathMethodDescriptions());
    map.put("EVENTDESC-PositionMovedEventDescriptions", MESSAGES.PositionMovedEventDescriptions());
    map.put("METHODDESC-PostDataMethodDescriptions", MESSAGES.PostDataMethodDescriptions());
    map.put("METHODDESC-PrintWebContentMethodDescriptions", MESSAGES.PrintWebContentMethodDescriptions());
    map.put("METHODDESC-ProceedHttpAuthRequestMethodDescriptions", MESSAGES.ProceedHttpAuthRequestMethodDescriptions());
    map.put("METHODDESC-ProceedSslErrorMethodDescriptions", MESSAGES.ProceedSslErrorMethodDescriptions());
    map.put("EVENTDESC-ProgressEventDescriptions", MESSAGES.ProgressEventDescriptions());
    map.put("PROPDESC-PromptForPermissionPropertyDescriptions", MESSAGES.PromptForPermissionPropertyDescriptions());
    map.put("METHODDESC-RegisterDeepLinkMethodDescriptions", MESSAGES.RegisterDeepLinkMethodDescriptions());
    map.put("METHODDESC-ReloadMethodDescriptions", MESSAGES.ReloadMethodDescriptions());
    map.put("METHODDESC-RemoveWebViewMethodDescriptions", MESSAGES.RemoveWebViewMethodDescriptions());
    map.put("METHODDESC-RequestDrawOverlayPermissionMethodDescriptions", MESSAGES.RequestDrawOverlayPermissionMethodDescriptions());
    map.put("METHODDESC-RequestFocusFloatingViewMethodDescriptions", MESSAGES.RequestFocusFloatingViewMethodDescriptions());
    map.put("METHODDESC-RestartPrintingMethodDescriptions", MESSAGES.RestartPrintingMethodDescriptions());
    map.put("METHODDESC-RestoreFloatingViewMethodDescriptions", MESSAGES.RestoreFloatingViewMethodDescriptions());
    map.put("METHODDESC-ResubmitFormMethodDescriptions", MESSAGES.ResubmitFormMethodDescriptions());
    map.put("METHODDESC-ResumeWebViewMethodDescriptions", MESSAGES.ResumeWebViewMethodDescriptions());
    map.put("METHODDESC-RingtoneGetMethodDescriptions", MESSAGES.RingtoneGetMethodDescriptions());
    map.put("METHODDESC-RingtonePlayMethodDescriptions", MESSAGES.RingtonePlayMethodDescriptions());
    map.put("METHODDESC-RingtoneStopMethodDescriptions", MESSAGES.RingtoneStopMethodDescriptions());
    map.put("PROPDESC-RotationAnglePropertyDescriptions", MESSAGES.RotationAnglePropertyDescriptions());
    map.put("METHODDESC-SaveArchiveMethodDescriptions", MESSAGES.SaveArchiveMethodDescriptions());
    map.put("PROPDESC-ScrollBarPropertyDescriptions", MESSAGES.ScrollBarPropertyDescriptions());
    map.put("PROPDESC-ScrollBarStylePropertyDescriptions", MESSAGES.ScrollBarStylePropertyDescriptions());
    map.put("METHODDESC-ScrollToMethodDescriptions", MESSAGES.ScrollToMethodDescriptions());
    map.put("PROPDESC-ScrollablePropertyDescriptions", MESSAGES.ScrollablePropertyDescriptions());
    map.put("METHODDESC-SearchViaAOLMethodDescriptions", MESSAGES.SearchViaAOLMethodDescriptions());
    map.put("METHODDESC-SearchViaASKMethodDescriptions", MESSAGES.SearchViaASKMethodDescriptions());
    map.put("METHODDESC-SearchViaAlibabaMethodDescriptions", MESSAGES.SearchViaAlibabaMethodDescriptions());
    map.put("METHODDESC-SearchViaAliexpressMethodDescriptions", MESSAGES.SearchViaAliexpressMethodDescriptions());
    map.put("METHODDESC-SearchViaAmazonMethodDescriptions", MESSAGES.SearchViaAmazonMethodDescriptions());
    map.put("METHODDESC-SearchViaBaiduMethodDescriptions", MESSAGES.SearchViaBaiduMethodDescriptions());
    map.put("METHODDESC-SearchViaBingMethodDescriptions", MESSAGES.SearchViaBingMethodDescriptions());
    map.put("METHODDESC-SearchViaDDGMethodDescriptions", MESSAGES.SearchViaDDGMethodDescriptions());
    map.put("METHODDESC-SearchViaEbayMethodDescriptions", MESSAGES.SearchViaEbayMethodDescriptions());
    map.put("METHODDESC-SearchViaGoogleMethodDescriptions", MESSAGES.SearchViaGoogleMethodDescriptions());
    map.put("METHODDESC-SearchViaWikipediaMethodDescriptions", MESSAGES.SearchViaWikipediaMethodDescriptions());
    map.put("METHODDESC-SearchViaYahooMethodDescriptions", MESSAGES.SearchViaYahooMethodDescriptions());
    map.put("PROPDESC-SetAudioPathSourcePropertyDescriptions", MESSAGES.SetAudioPathSourcePropertyDescriptions());
    map.put("PROPDESC-SetClickablePropertyDescriptions", MESSAGES.SetClickablePropertyDescriptions());
    map.put("METHODDESC-SetCookiesMethodDescriptions", MESSAGES.SetCookiesMethodDescriptions());
    map.put("METHODDESC-SetExpectedSignatureMethodDescriptions", MESSAGES.SetExpectedSignatureMethodDescriptions());
    map.put("METHODDESC-SetPositionMethodDescriptions", MESSAGES.SetPositionMethodDescriptions());
    map.put("METHODDESC-SetVisibilityMethodDescriptions", MESSAGES.SetVisibilityMethodDescriptions());
    map.put("METHODDESC-SetWebViewMethodDescriptions", MESSAGES.SetWebViewMethodDescriptions());
    map.put("METHODDESC-SetWindowBrightnessMethodDescriptions", MESSAGES.SetWindowBrightnessMethodDescriptions());
    map.put("METHODDESC-SetupViewMethodDescriptions", MESSAGES.SetupViewMethodDescriptions());
    map.put("METHODDESC-ShowAlertAtCenterMethodDescriptions", MESSAGES.ShowAlertAtCenterMethodDescriptions());
    map.put("METHODDESC-ShowAlertMethodDescriptions", MESSAGES.ShowAlertMethodDescriptions());
    map.put("METHODDESC-ShowDialogMethodDescriptions", MESSAGES.ShowDialogMethodDescriptions());
    map.put("METHODDESC-ShowFloatingViewMethodDescriptions", MESSAGES.ShowFloatingViewMethodDescriptions());
    map.put("PROPDESC-ShowUIPropertyDescriptions", MESSAGES.ShowUIPropertyDescriptions());
    map.put("METHODDESC-StopLoadingMethodDescriptions", MESSAGES.StopLoadingMethodDescriptions());
    map.put("PROPDESC-SupportMultipleWindowsPropertyDescriptions", MESSAGES.SupportMultipleWindowsPropertyDescriptions());
    map.put("PROPDESC-SuppressToastPropertyDescriptions", MESSAGES.SuppressToastPropertyDescriptions());
    map.put("PROPDESC-SuppressWarningsPropertyDescriptions", MESSAGES.SuppressWarningsPropertyDescriptions());
    map.put("EVENTDESC-SwipedEventDescriptions", MESSAGES.SwipedEventDescriptions());
    map.put("METHODDESC-UploadFileMethodDescriptions", MESSAGES.UploadFileMethodDescriptions());
    map.put("PROPDESC-UseWideViewPortPropertyDescriptions", MESSAGES.UseWideViewPortPropertyDescriptions());
    map.put("PROPDESC-UserAgentPropertyDescriptions", MESSAGES.UserAgentPropertyDescriptions());
    map.put("PROPDESC-UsesLocationPropertyDescriptions", MESSAGES.UsesLocationPropertyDescriptions());
    map.put("PROPDESC-VibrationEnabledPropertyDescriptions", MESSAGES.VibrationEnabledPropertyDescriptions());
    map.put("PROPDESC-VisiblePropertyDescriptions", MESSAGES.VisiblePropertyDescriptions());
    map.put("PROPDESC-VolumeAlarmPropertyDescriptions", MESSAGES.VolumeAlarmPropertyDescriptions());
    map.put("PROPDESC-VolumeMusicPropertyDescriptions", MESSAGES.VolumeMusicPropertyDescriptions());
    map.put("PROPDESC-VolumeRingPropertyDescriptions", MESSAGES.VolumeRingPropertyDescriptions());
    map.put("EVENTDESC-WebViewStringChangedEventDescriptions", MESSAGES.WebViewStringChangedEventDescriptions());
    map.put("PROPDESC-WebViewStringPropertyDescriptions", MESSAGES.WebViewStringPropertyDescriptions());
    map.put("METHODDESC-ZoomByMethodDescriptions", MESSAGES.ZoomByMethodDescriptions());
    map.put("PROPDESC-ZoomEnabledPropertyDescriptions", MESSAGES.ZoomEnabledPropertyDescriptions());
    map.put("METHODDESC-ZoomInMethodDescriptions", MESSAGES.ZoomInMethodDescriptions());
    map.put("METHODDESC-ZoomOutMethodDescriptions", MESSAGES.ZoomOutMethodDescriptions());
    map.put("PROPDESC-ZoomPercentPropertyDescriptions", MESSAGES.ZoomPercentPropertyDescriptions());
    map.put("METHODDESC-exam.ModeMethodDescriptions", MESSAGES.exam__ModeMethodDescriptions());
    map.put("METHODDESC-exam.StartLockTaskMethodDescriptions", MESSAGES.exam__StartLockTaskMethodDescriptions());
    map.put("METHODDESC-exam.StopLockTaskMethodDescriptions", MESSAGES.exam__StopLockTaskMethodDescriptions());
    map.put("METHODDESC-exam.addAppToRecentMethodDescriptions", MESSAGES.exam__addAppToRecentMethodDescriptions());
    map.put("METHODDESC-exam.removeAppFromRecentMethodDescriptions", MESSAGES.exam__removeAppFromRecentMethodDescriptions());
    map.put("METHODDESC-exam.setHideFromRecentMethodDescriptions", MESSAGES.exam__setHideFromRecentMethodDescriptions());
    map.put("METHODDESC-forceStopAndClearDataMethodDescriptions", MESSAGES.forceStopAndClearDataMethodDescriptions());
    map.put("PROPDESC-getSdkVersionPropertyDescriptions", MESSAGES.getSdkVersionPropertyDescriptions());
    map.put("METHODDESC-isKioskModeActiveMethodDescriptions", MESSAGES.isKioskModeActiveMethodDescriptions());
    map.put("METHODDESC-isLowRAMDeviceMethodDescriptions", MESSAGES.isLowRAMDeviceMethodDescriptions());
    map.put("METHODDESC-onBackPressedMethodDescriptions", MESSAGES.onBackPressedMethodDescriptions());
    map.put("EVENTDESC-onProgressChangedEventDescriptions", MESSAGES.onProgressChangedEventDescriptions());
    map.put("METHODDESC-onWindowFocusChangedMethodDescriptions", MESSAGES.onWindowFocusChangedMethodDescriptions());


    /* Categories */

    map.put("CATEGORY-Extension", MESSAGES.extensionComponentPallette());
    map.put("CATEGORY-Appearance", MESSAGES.AppearancePropertyCategory());
    map.put("CATEGORY-Behavior", MESSAGES.BehaviorPropertyCategory());
    map.put("CATEGORY-Unspecified", MESSAGES.UnspecifiedPropertyCategory());
  return map;
  }
}
