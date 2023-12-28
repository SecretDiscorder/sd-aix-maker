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
    map.put("METHODDESC-AddMethodDescriptions", MESSAGES.AddMethodDescriptions());
    map.put("EVENTDESC-AfterArchiveSavedEventDescriptions", MESSAGES.AfterArchiveSavedEventDescriptions());
    map.put("EVENTDESC-AfterFileListAsyncEventDescriptions", MESSAGES.AfterFileListAsyncEventDescriptions());
    map.put("EVENTDESC-AfterJavaScriptEvaluatedEventDescriptions", MESSAGES.AfterJavaScriptEvaluatedEventDescriptions());
    map.put("METHODDESC-AllowGeolocationAccessMethodDescriptions", MESSAGES.AllowGeolocationAccessMethodDescriptions());
    map.put("PROPDESC-AllowScreenshotsUserPropertyDescriptions", MESSAGES.AllowScreenshotsUserPropertyDescriptions());
    map.put("PROPDESC-AudioPathSourcePropertyDescriptions", MESSAGES.AudioPathSourcePropertyDescriptions());
    map.put("PROPDESC-AutoLoadImagesPropertyDescriptions", MESSAGES.AutoLoadImagesPropertyDescriptions());
    map.put("PROPDESC-AutoplayMediaPropertyDescriptions", MESSAGES.AutoplayMediaPropertyDescriptions());
    map.put("METHODDESC-AvailableSizeMethodDescriptions", MESSAGES.AvailableSizeMethodDescriptions());
    map.put("METHODDESC-AvailableStorageDirectoriesMethodDescriptions", MESSAGES.AvailableStorageDirectoriesMethodDescriptions());
    map.put("PROPDESC-BackgroundColorPropertyDescriptions", MESSAGES.BackgroundColorPropertyDescriptions());
    map.put("EVENTDESC-BatteryChangedEventDescriptions", MESSAGES.BatteryChangedEventDescriptions());
    map.put("METHODDESC-BinaryOperationMethodDescriptions", MESSAGES.BinaryOperationMethodDescriptions());
    map.put("PROPDESC-BlockAdsPropertyDescriptions", MESSAGES.BlockAdsPropertyDescriptions());
    map.put("PROPDESC-BlockNetworkLoadsPropertyDescriptions", MESSAGES.BlockNetworkLoadsPropertyDescriptions());
    map.put("PROPDESC-BrightnessModePropertyDescriptions", MESSAGES.BrightnessModePropertyDescriptions());
    map.put("PROPDESC-BrightnessPropertyDescriptions", MESSAGES.BrightnessPropertyDescriptions());
    map.put("PROPDESC-CacheModePropertyDescriptions", MESSAGES.CacheModePropertyDescriptions());
    map.put("METHODDESC-CanGoBackMethodDescriptions", MESSAGES.CanGoBackMethodDescriptions());
    map.put("METHODDESC-CanGoBackOrForwardMethodDescriptions", MESSAGES.CanGoBackOrForwardMethodDescriptions());
    map.put("METHODDESC-CanGoForwardMethodDescriptions", MESSAGES.CanGoForwardMethodDescriptions());
    map.put("METHODDESC-CancelMethodDescriptions", MESSAGES.CancelMethodDescriptions());
    map.put("METHODDESC-CancelPrintingMethodDescriptions", MESSAGES.CancelPrintingMethodDescriptions());
    map.put("METHODDESC-CheckDrawOverlayPermissionMethodDescriptions", MESSAGES.CheckDrawOverlayPermissionMethodDescriptions());
    map.put("METHODDESC-CheckMyAppSignatureMethodDescriptions", MESSAGES.CheckMyAppSignatureMethodDescriptions());
    map.put("METHODDESC-ClearCacheMethodDescriptions", MESSAGES.ClearCacheMethodDescriptions());
    map.put("METHODDESC-ClearCalculatorMethodDescriptions", MESSAGES.ClearCalculatorMethodDescriptions());
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
    map.put("EVENTDESC-CopiedEventDescriptions", MESSAGES.CopiedEventDescriptions());
    map.put("METHODDESC-CopyAsyncMethodDescriptions", MESSAGES.CopyAsyncMethodDescriptions());
    map.put("METHODDESC-CopyMethodDescriptions", MESSAGES.CopyMethodDescriptions());
    map.put("METHODDESC-CreateAppSpecificDirectoryMethodDescriptions", MESSAGES.CreateAppSpecificDirectoryMethodDescriptions());
    map.put("METHODDESC-CreateMethodDescriptions", MESSAGES.CreateMethodDescriptions());
    map.put("METHODDESC-CreateShortcutMethodDescriptions", MESSAGES.CreateShortcutMethodDescriptions());
    map.put("METHODDESC-CreateWebViewMethodDescriptions", MESSAGES.CreateWebViewMethodDescriptions());
    map.put("METHODDESC-CurrentIdMethodDescriptions", MESSAGES.CurrentIdMethodDescriptions());
    map.put("PROPDESC-CurrentPageTitlePropertyDescriptions", MESSAGES.CurrentPageTitlePropertyDescriptions());
    map.put("PROPDESC-CurrentUrlPropertyDescriptions", MESSAGES.CurrentUrlPropertyDescriptions());
    map.put("METHODDESC-DecryptTextMethodDescriptions", MESSAGES.DecryptTextMethodDescriptions());
    map.put("METHODDESC-DecryptionErrorMethodDescriptions", MESSAGES.DecryptionErrorMethodDescriptions());
    map.put("METHODDESC-DecryptionSuccessMethodDescriptions", MESSAGES.DecryptionSuccessMethodDescriptions());
    map.put("PROPDESC-DeepLinksPropertyDescriptions", MESSAGES.DeepLinksPropertyDescriptions());
    map.put("METHODDESC-DeleteMethodDescriptions", MESSAGES.DeleteMethodDescriptions());
    map.put("PROPDESC-DesktopModePropertyDescriptions", MESSAGES.DesktopModePropertyDescriptions());
    map.put("METHODDESC-DirectoryListMethodDescriptions", MESSAGES.DirectoryListMethodDescriptions());
    map.put("METHODDESC-DisableSystemKeyboardMethodDescriptions", MESSAGES.DisableSystemKeyboardMethodDescriptions());
    map.put("METHODDESC-DismissJsAlertMethodDescriptions", MESSAGES.DismissJsAlertMethodDescriptions());
    map.put("METHODDESC-DismissViewFloatingMethodDescriptions", MESSAGES.DismissViewFloatingMethodDescriptions());
    map.put("PROPDESC-DisplayZoomPropertyDescriptions", MESSAGES.DisplayZoomPropertyDescriptions());
    map.put("METHODDESC-DivideMethodDescriptions", MESSAGES.DivideMethodDescriptions());
    map.put("EVENTDESC-DownloadCompletedEventDescriptions", MESSAGES.DownloadCompletedEventDescriptions());
    map.put("EVENTDESC-DownloadFailedEventDescriptions", MESSAGES.DownloadFailedEventDescriptions());
    map.put("METHODDESC-DownloadMethodDescriptions", MESSAGES.DownloadMethodDescriptions());
    map.put("EVENTDESC-DownloadProgressChangedEventDescriptions", MESSAGES.DownloadProgressChangedEventDescriptions());
    map.put("EVENTDESC-DownloadStartedEventDescriptions", MESSAGES.DownloadStartedEventDescriptions());
    map.put("PROPDESC-EnableJSPropertyDescriptions", MESSAGES.EnableJSPropertyDescriptions());
    map.put("METHODDESC-EnableSystemKeyboardMethodDescriptions", MESSAGES.EnableSystemKeyboardMethodDescriptions());
    map.put("METHODDESC-EncryptTextMethodDescriptions", MESSAGES.EncryptTextMethodDescriptions());
    map.put("METHODDESC-EncryptionErrorMethodDescriptions", MESSAGES.EncryptionErrorMethodDescriptions());
    map.put("METHODDESC-EncryptionKeyMethodDescriptions", MESSAGES.EncryptionKeyMethodDescriptions());
    map.put("METHODDESC-EncryptionSuccessMethodDescriptions", MESSAGES.EncryptionSuccessMethodDescriptions());
    map.put("METHODDESC-EvaluateJavaScriptMethodDescriptions", MESSAGES.EvaluateJavaScriptMethodDescriptions());
    map.put("METHODDESC-ExistsMethodDescriptions", MESSAGES.ExistsMethodDescriptions());
    map.put("METHODDESC-FactorialMethodDescriptions", MESSAGES.FactorialMethodDescriptions());
    map.put("EVENTDESC-FailedEventDescriptions", MESSAGES.FailedEventDescriptions());
    map.put("PROPDESC-FileAccessPropertyDescriptions", MESSAGES.FileAccessPropertyDescriptions());
    map.put("METHODDESC-FileListAsyncMethodDescriptions", MESSAGES.FileListAsyncMethodDescriptions());
    map.put("METHODDESC-FileListFromAssetsMethodDescriptions", MESSAGES.FileListFromAssetsMethodDescriptions());
    map.put("METHODDESC-FileListMethodDescriptions", MESSAGES.FileListMethodDescriptions());
    map.put("EVENTDESC-FileUploadNeededEventDescriptions", MESSAGES.FileUploadNeededEventDescriptions());
    map.put("METHODDESC-FindMethodDescriptions", MESSAGES.FindMethodDescriptions());
    map.put("METHODDESC-FindNextMethodDescriptions", MESSAGES.FindNextMethodDescriptions());
    map.put("EVENTDESC-FindResultReceivedEventDescriptions", MESSAGES.FindResultReceivedEventDescriptions());
    map.put("PROPDESC-FollowLinksPropertyDescriptions", MESSAGES.FollowLinksPropertyDescriptions());
    map.put("PROPDESC-FontScalePropertyDescriptions", MESSAGES.FontScalePropertyDescriptions());
    map.put("PROPDESC-FontSizePropertyDescriptions", MESSAGES.FontSizePropertyDescriptions());
    map.put("METHODDESC-FreeMemorySizeMethodDescriptions", MESSAGES.FreeMemorySizeMethodDescriptions());
    map.put("METHODDESC-GetAPKSignatureMethodDescriptions", MESSAGES.GetAPKSignatureMethodDescriptions());
    map.put("PROPDESC-GetClickablePropertyDescriptions", MESSAGES.GetClickablePropertyDescriptions());
    map.put("METHODDESC-GetCookiesMethodDescriptions", MESSAGES.GetCookiesMethodDescriptions());
    map.put("METHODDESC-GetDecimalResultMethodDescriptions", MESSAGES.GetDecimalResultMethodDescriptions());
    map.put("METHODDESC-GetFileNameMethodDescriptions", MESSAGES.GetFileNameMethodDescriptions());
    map.put("METHODDESC-GetFileSizeMethodDescriptions", MESSAGES.GetFileSizeMethodDescriptions());
    map.put("PROPDESC-GetFloatingViewVisiblePropertyDescriptions", MESSAGES.GetFloatingViewVisiblePropertyDescriptions());
    map.put("METHODDESC-GetIdsMethodDescriptions", MESSAGES.GetIdsMethodDescriptions());
    map.put("METHODDESC-GetIntegerResultMethodDescriptions", MESSAGES.GetIntegerResultMethodDescriptions());
    map.put("METHODDESC-GetInternalHistoryMethodDescriptions", MESSAGES.GetInternalHistoryMethodDescriptions());
    map.put("METHODDESC-GetMimeTypeMethodDescriptions", MESSAGES.GetMimeTypeMethodDescriptions());
    map.put("METHODDESC-GetPositionXMethodDescriptions", MESSAGES.GetPositionXMethodDescriptions());
    map.put("METHODDESC-GetPositionYMethodDescriptions", MESSAGES.GetPositionYMethodDescriptions());
    map.put("METHODDESC-GetProgressMethodDescriptions", MESSAGES.GetProgressMethodDescriptions());
    map.put("METHODDESC-GetScrollXMethodDescriptions", MESSAGES.GetScrollXMethodDescriptions());
    map.put("METHODDESC-GetScrollYMethodDescriptions", MESSAGES.GetScrollYMethodDescriptions());
    map.put("METHODDESC-GetSslCertificateMethodDescriptions", MESSAGES.GetSslCertificateMethodDescriptions());
    map.put("METHODDESC-GetStartUrlMethodDescriptions", MESSAGES.GetStartUrlMethodDescriptions());
    map.put("METHODDESC-GetUriMethodDescriptions", MESSAGES.GetUriMethodDescriptions());
    map.put("METHODDESC-GetUriStringMethodDescriptions", MESSAGES.GetUriStringMethodDescriptions());
    map.put("METHODDESC-GetWebViewMethodDescriptions", MESSAGES.GetWebViewMethodDescriptions());
    map.put("METHODDESC-GetWindowBrightnessMethodDescriptions", MESSAGES.GetWindowBrightnessMethodDescriptions());
    map.put("METHODDESC-GoBackMethodDescriptions", MESSAGES.GoBackMethodDescriptions());
    map.put("METHODDESC-GoBackOrForwardMethodDescriptions", MESSAGES.GoBackOrForwardMethodDescriptions());
    map.put("METHODDESC-GoForwardMethodDescriptions", MESSAGES.GoForwardMethodDescriptions());
    map.put("METHODDESC-GoToUrlMethodDescriptions", MESSAGES.GoToUrlMethodDescriptions());
    map.put("EVENTDESC-GotCertificateEventDescriptions", MESSAGES.GotCertificateEventDescriptions());
    map.put("EVENTDESC-GotFileSizeEventDescriptions", MESSAGES.GotFileSizeEventDescriptions());
    map.put("EVENTDESC-GotPrintResultEventDescriptions", MESSAGES.GotPrintResultEventDescriptions());
    map.put("METHODDESC-GrantPermissionMethodDescriptions", MESSAGES.GrantPermissionMethodDescriptions());
    map.put("METHODDESC-GuessFileNameMethodDescriptions", MESSAGES.GuessFileNameMethodDescriptions());
    map.put("PROPDESC-HasFlashPropertyDescriptions", MESSAGES.HasFlashPropertyDescriptions());
    map.put("PROPDESC-HealthPropertyDescriptions", MESSAGES.HealthPropertyDescriptions());
    map.put("METHODDESC-HideCustomViewMethodDescriptions", MESSAGES.HideCustomViewMethodDescriptions());
    map.put("METHODDESC-HideNavigationBarHPMethodDescriptions", MESSAGES.HideNavigationBarHPMethodDescriptions());
    map.put("METHODDESC-HideStatusBarHPMethodDescriptions", MESSAGES.HideStatusBarHPMethodDescriptions());
    map.put("PROPDESC-InitialScalePropertyDescriptions", MESSAGES.InitialScalePropertyDescriptions());
    map.put("METHODDESC-InvokeZoomPickerMethodDescriptions", MESSAGES.InvokeZoomPickerMethodDescriptions());
    map.put("METHODDESC-IsAppInstalledAndEnabledPMMethodDescriptions", MESSAGES.IsAppInstalledAndEnabledPMMethodDescriptions());
    map.put("METHODDESC-IsAppInstalledPMMethodDescriptions", MESSAGES.IsAppInstalledPMMethodDescriptions());
    map.put("METHODDESC-IsConnectedNetworkMethodDescriptions", MESSAGES.IsConnectedNetworkMethodDescriptions());
    map.put("METHODDESC-IsDeveloperModeEnabledMethodDescriptions", MESSAGES.IsDeveloperModeEnabledMethodDescriptions());
    map.put("METHODDESC-IsDirectoryMethodDescriptions", MESSAGES.IsDirectoryMethodDescriptions());
    map.put("METHODDESC-IsEmulatorMethodDescriptions", MESSAGES.IsEmulatorMethodDescriptions());
    map.put("METHODDESC-IsPackageInstalledPMMethodDescriptions", MESSAGES.IsPackageInstalledPMMethodDescriptions());
    map.put("METHODDESC-IsRootedMethodDescriptions", MESSAGES.IsRootedMethodDescriptions());
    map.put("PROPDESC-LayerTypePropertyDescriptions", MESSAGES.LayerTypePropertyDescriptions());
    map.put("METHODDESC-LengthMethodDescriptions", MESSAGES.LengthMethodDescriptions());
    map.put("PROPDESC-LevelPropertyDescriptions", MESSAGES.LevelPropertyDescriptions());
    map.put("METHODDESC-LoadHtmlMethodDescriptions", MESSAGES.LoadHtmlMethodDescriptions());
    map.put("METHODDESC-LoadInNewWindowMethodDescriptions", MESSAGES.LoadInNewWindowMethodDescriptions());
    map.put("METHODDESC-LoadWithHeadersMethodDescriptions", MESSAGES.LoadWithHeadersMethodDescriptions());
    map.put("PROPDESC-LoadWithOverviewModePropertyDescriptions", MESSAGES.LoadWithOverviewModePropertyDescriptions());
    map.put("PROPDESC-LongClickablePropertyDescriptions", MESSAGES.LongClickablePropertyDescriptions());
    map.put("EVENTDESC-LongClickedEventDescriptions", MESSAGES.LongClickedEventDescriptions());
    map.put("METHODDESC-LoseFocusFloatingViewMethodDescriptions", MESSAGES.LoseFocusFloatingViewMethodDescriptions());
    map.put("METHODDESC-ModeMethodDescriptions", MESSAGES.ModeMethodDescriptions());
    map.put("METHODDESC-MoveAsyncMethodDescriptions", MESSAGES.MoveAsyncMethodDescriptions());
    map.put("METHODDESC-MoveMethodDescriptions", MESSAGES.MoveMethodDescriptions());
    map.put("EVENTDESC-MovedEventDescriptions", MESSAGES.MovedEventDescriptions());
    map.put("METHODDESC-MultiplyMethodDescriptions", MESSAGES.MultiplyMethodDescriptions());
    map.put("PROPDESC-NotificationVisibilityPropertyDescriptions", MESSAGES.NotificationVisibilityPropertyDescriptions());
    map.put("METHODDESC-OffMethodDescriptions", MESSAGES.OffMethodDescriptions());
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
    map.put("METHODDESC-OnMethodDescriptions", MESSAGES.OnMethodDescriptions());
    map.put("EVENTDESC-OnNewWindowRequestEventDescriptions", MESSAGES.OnNewWindowRequestEventDescriptions());
    map.put("EVENTDESC-OnPermissionRequestEventDescriptions", MESSAGES.OnPermissionRequestEventDescriptions());
    map.put("EVENTDESC-OnProgressChangedEventDescriptions", MESSAGES.OnProgressChangedEventDescriptions());
    map.put("EVENTDESC-OnReceivedHttpAuthRequestEventDescriptions", MESSAGES.OnReceivedHttpAuthRequestEventDescriptions());
    map.put("EVENTDESC-OnReceivedSslErrorEventDescriptions", MESSAGES.OnReceivedSslErrorEventDescriptions());
    map.put("EVENTDESC-OnResumeEventDescriptions", MESSAGES.OnResumeEventDescriptions());
    map.put("EVENTDESC-OnScrollChangedEventDescriptions", MESSAGES.OnScrollChangedEventDescriptions());
    map.put("EVENTDESC-OnShowCustomViewEventDescriptions", MESSAGES.OnShowCustomViewEventDescriptions());
    map.put("METHODDESC-OpenFileMethodDescriptions", MESSAGES.OpenFileMethodDescriptions());
    map.put("PROPDESC-OverScrollModePropertyDescriptions", MESSAGES.OverScrollModePropertyDescriptions());
    map.put("METHODDESC-OverlapViewMethodDescriptions", MESSAGES.OverlapViewMethodDescriptions());
    map.put("METHODDESC-PageDownMethodDescriptions", MESSAGES.PageDownMethodDescriptions());
    map.put("EVENTDESC-PageLoadedEventDescriptions", MESSAGES.PageLoadedEventDescriptions());
    map.put("EVENTDESC-PageStartedEventDescriptions", MESSAGES.PageStartedEventDescriptions());
    map.put("METHODDESC-PageUpMethodDescriptions", MESSAGES.PageUpMethodDescriptions());
    map.put("METHODDESC-PasteMethodDescriptions", MESSAGES.PasteMethodDescriptions());
    map.put("METHODDESC-PauseWebViewMethodDescriptions", MESSAGES.PauseWebViewMethodDescriptions());
    map.put("EVENTDESC-PermissionDeniedEventDescriptions", MESSAGES.PermissionDeniedEventDescriptions());
    map.put("METHODDESC-PlayAudioPathMethodDescriptions", MESSAGES.PlayAudioPathMethodDescriptions());
    map.put("PROPDESC-PluggedPropertyDescriptions", MESSAGES.PluggedPropertyDescriptions());
    map.put("EVENTDESC-PositionMovedEventDescriptions", MESSAGES.PositionMovedEventDescriptions());
    map.put("METHODDESC-PostDataMethodDescriptions", MESSAGES.PostDataMethodDescriptions());
    map.put("METHODDESC-PowerMethodDescriptions", MESSAGES.PowerMethodDescriptions());
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
    map.put("METHODDESC-RunAppMethodDescriptions", MESSAGES.RunAppMethodDescriptions());
    map.put("METHODDESC-SaveArchiveMethodDescriptions", MESSAGES.SaveArchiveMethodDescriptions());
    map.put("PROPDESC-ScrollBarPropertyDescriptions", MESSAGES.ScrollBarPropertyDescriptions());
    map.put("PROPDESC-ScrollBarStylePropertyDescriptions", MESSAGES.ScrollBarStylePropertyDescriptions());
    map.put("METHODDESC-ScrollToMethodDescriptions", MESSAGES.ScrollToMethodDescriptions());
    map.put("PROPDESC-ScrollablePropertyDescriptions", MESSAGES.ScrollablePropertyDescriptions());
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
    map.put("METHODDESC-ShowFloatingViewMethodDescriptions", MESSAGES.ShowFloatingViewMethodDescriptions());
    map.put("PROPDESC-ShowUIPropertyDescriptions", MESSAGES.ShowUIPropertyDescriptions());
    map.put("METHODDESC-SquareRootMethodDescriptions", MESSAGES.SquareRootMethodDescriptions());
    map.put("METHODDESC-StartLockTaskMethodDescriptions", MESSAGES.StartLockTaskMethodDescriptions());
    map.put("PROPDESC-StatusPropertyDescriptions", MESSAGES.StatusPropertyDescriptions());
    map.put("METHODDESC-StopLoadingMethodDescriptions", MESSAGES.StopLoadingMethodDescriptions());
    map.put("METHODDESC-StopLockTaskMethodDescriptions", MESSAGES.StopLockTaskMethodDescriptions());
    map.put("METHODDESC-SubtractMethodDescriptions", MESSAGES.SubtractMethodDescriptions());
    map.put("EVENTDESC-SuccessEventDescriptions", MESSAGES.SuccessEventDescriptions());
    map.put("PROPDESC-SupportMultipleWindowsPropertyDescriptions", MESSAGES.SupportMultipleWindowsPropertyDescriptions());
    map.put("PROPDESC-SuppressToastPropertyDescriptions", MESSAGES.SuppressToastPropertyDescriptions());
    map.put("PROPDESC-SuppressWarningsPropertyDescriptions", MESSAGES.SuppressWarningsPropertyDescriptions());
    map.put("EVENTDESC-SwipedEventDescriptions", MESSAGES.SwipedEventDescriptions());
    map.put("PROPDESC-TechnologyPropertyDescriptions", MESSAGES.TechnologyPropertyDescriptions());
    map.put("PROPDESC-TemperaturePropertyDescriptions", MESSAGES.TemperaturePropertyDescriptions());
    map.put("METHODDESC-ToRomanMethodDescriptions", MESSAGES.ToRomanMethodDescriptions());
    map.put("METHODDESC-UploadFileMethodDescriptions", MESSAGES.UploadFileMethodDescriptions());
    map.put("PROPDESC-UseWideViewPortPropertyDescriptions", MESSAGES.UseWideViewPortPropertyDescriptions());
    map.put("PROPDESC-UserAgentPropertyDescriptions", MESSAGES.UserAgentPropertyDescriptions());
    map.put("PROPDESC-UsesLocationPropertyDescriptions", MESSAGES.UsesLocationPropertyDescriptions());
    map.put("PROPDESC-VibrationEnabledPropertyDescriptions", MESSAGES.VibrationEnabledPropertyDescriptions());
    map.put("PROPDESC-VisiblePropertyDescriptions", MESSAGES.VisiblePropertyDescriptions());
    map.put("PROPDESC-VoltagePropertyDescriptions", MESSAGES.VoltagePropertyDescriptions());
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
    map.put("METHODDESC-addAppToRecentMethodDescriptions", MESSAGES.addAppToRecentMethodDescriptions());
    map.put("METHODDESC-checkPackageModMethodDescriptions", MESSAGES.checkPackageModMethodDescriptions());
    map.put("PROPDESC-getSdkVersionPropertyDescriptions", MESSAGES.getSdkVersionPropertyDescriptions());
    map.put("METHODDESC-isCloneModMethodDescriptions", MESSAGES.isCloneModMethodDescriptions());
    map.put("METHODDESC-isKioskModeActiveMethodDescriptions", MESSAGES.isKioskModeActiveMethodDescriptions());
    map.put("METHODDESC-onBackPressedMethodDescriptions", MESSAGES.onBackPressedMethodDescriptions());
    map.put("METHODDESC-onWindowFocusChangedMethodDescriptions", MESSAGES.onWindowFocusChangedMethodDescriptions());
    map.put("METHODDESC-removeAppFromRecentMethodDescriptions", MESSAGES.removeAppFromRecentMethodDescriptions());
    map.put("METHODDESC-setExpectedPackageNameMethodDescriptions", MESSAGES.setExpectedPackageNameMethodDescriptions());
    map.put("METHODDESC-setHideFromRecentMethodDescriptions", MESSAGES.setHideFromRecentMethodDescriptions());


    /* Categories */

    map.put("CATEGORY-Extension", MESSAGES.extensionComponentPallette());
  return map;
  }
}
