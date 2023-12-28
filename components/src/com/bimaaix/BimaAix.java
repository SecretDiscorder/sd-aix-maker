package com.bima.bimaaix;
import android.content.IntentFilter;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import java.util.List;
import java.lang.reflect.Method;
import android.content.Context;
import android.net.http.SslError;
import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.content.IntentFilter;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.List;
import java.lang.reflect.Method;
import android.content.Context;
import android.net.http.SslError;
import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.AudioAttributes.Builder;
import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.util.Log;
import android.widget.Toast;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import android.util.Log;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;

import android.view.View;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.os.Message;
import com.google.appinventor.components.runtime.ReplForm;
import android.webkit.ValueCallback;
import android.os.Build;
import android.util.Log;
import android.app.Activity;
import android.widget.Toast;
import android.view.WindowManager;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.widget.Button;
import java.io.File;
import android.media.MediaPlayer;
import java.io.IOException;
import android.util.Log;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import java.io.IOException;

import android.os.Build;
import android.widget.EditText;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import java.io.File;

import java.io.FileOutputStream;

import androidx.core.content.FileProvider;

import android.content.pm.PackageInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import android.util.Base64;
import android.util.Log;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import android.content.pm.PackageManager;
import android.app.Activity;
import android.view.View;
import android.view.WindowManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.app.Activity;
import android.view.WindowManager;
import android.provider.Settings.Secure;
import android.webkit.WebSettings;
import android.provider.Settings;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import static android.content.Context.WINDOW_SERVICE;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import com.google.appinventor.components.common.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;
import com.google.appinventor.components.annotations.*;
import java.io.IOException;
import java.net.URL;
import java.math.BigDecimal;
import com.google.appinventor.components.annotations.androidmanifest.*;
import java.math.BigInteger;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Spannable;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
@DesignerComponent(
        version = 1,
        description = "Simple BimaAix",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "https://i.ibb.co/wJr2ymf/BimaAix.jpg",
		androidMinSdk = 26
)

@UsesContentProviders(providers = @ProviderElement(name = "com.bima.bimaaix.Ori", exported = "false", authorities = "%packageName%"))
@UsesActivities(activities = {@ActivityElement(intentFilters = {@IntentFilterElement(actionElements = {@ActionElement(name = "android.intent.action.VIEW")}, categoryElements = {@CategoryElement(name = "android.intent.category.DEFAULT"), @CategoryElement(name = "android.intent.category.BROWSABLE")}, dataElements = {@DataElement(scheme = "http"), @DataElement(scheme = "https")}), @IntentFilterElement(actionElements = {@ActionElement(name = "android.intent.action.VIEW")}, categoryElements = {@CategoryElement(name = "android.intent.category.DEFAULT"), @CategoryElement(name = "android.intent.category.BROWSABLE")}, dataElements = {@DataElement(scheme = "http"), @DataElement(scheme = "https"), @DataElement(mimeType = "text/html"), @DataElement(mimeType = "text/plain"), @DataElement(mimeType = "application/xhtml+xml")})},name=".Screen1",launchMode = "singleTask")})

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "runtime.jar, zip4j.jar, runtime-sources.jar")
@UsesPermissions(permissionNames = "android.permission.WRITE_EXTERNAL_STORAGE,android.permission.ACCESS_DOWNLOAD_MANAGER,android.permission.ACCESS_FINE_LOCATION,android.permission.RECORD_AUDIO, android.permission.MODIFY_AUDIO_SETTINGS, android.permission.CAMERA,android.permission.VIBRATE,android.webkit.resource.VIDEO_CAPTURE,android.webkit.resource.AUDIO_CAPTURE,android.launcher.permission.INSTALL_SHORTCUT,android.permission.ACTION_MANAGE_OVERLAY_PERMISSION,android.permission.CLEAR_APP_CACHE,android.permission.SYSTEM_ALERT_WINDOW,android.permission.HIDE_OVERLAY_WINDOWS,android.permission.QUERY_ALL_PACKAGES,android.permission.INTERNET,android.permission.MANAGE_EXTERNAL_STORAGE,android.permission.REQUEST_DELETE_PACKAGES,android.permission.REQUEST_INSTALL_PACKAGES,com.android.launcher.permission.INSTALL_SHORTCUT")
@SuppressWarnings("deprecation")



public class BimaAix extends AndroidNonvisibleComponent implements OnNewIntentListener, Component, ActivityResultListener, OnDestroyListener, WView.SwipeCallback, OnResumeListener, OnStopListener {

    private BroadcastReceiver broadcastReceiver;
    private static final String LOG_TAG = "BimaAix";
    public static final int VERSION = 1;
    private boolean suppressToast;
    private AudioManager audioManager;
    private ContentResolver contentResolver;
    private boolean isAlarm = false;
    private boolean isNotification = false;
    private BigDecimal decimalResult;
    private BigInteger integerResult;
    private boolean isRingtone = false;
    private Ringtone ringtone;
    private boolean showUI;
    private String audioPathSource = ""; // Default value, change accordingly
    private String a = "";
    private final Context context;
    private final Activity activity;
    private boolean hideFromRecent = false;
    private ComponentContainer container;
    private WView webView;
    private boolean followLinks = true;
    private boolean prompt = true;
    private String UserAgent = "";
    private final WebViewInterface wvInterface;
    private JsPromptResult jsPromptResult;
    private String MOBILE_USER_AGENT = "";
    private ValueCallback < Uri[] > mFilePathCallback;
    private Message dontSend;
    private Message reSend;
    private PermissionRequest permissionRequest;
    private PrintJob printJob;
    private final CookieManager cookieManager;
    private JsResult jsResult;
    private JsResult jsAlert;
    private HttpAuthHandler httpAuthHandler;
    private boolean deepLinks = true;
    private String jobName = "";
    private boolean isLoading = false;
    private final HashMap < Integer, WView > wv = new HashMap < > ();
    private boolean blockAds = false;
    private String AD_HOSTS = "";
    private int iD = 0;
    private boolean desktopMode = false;
    private int zoomPercent = 100;
    private boolean zoomEnabled = true;
    private boolean displayZoom = true;
    private Message resultObj;
    private final float deviceDensity;
    private GeolocationPermissions.Callback theCallback;
    private String theOrigin;
    private SslErrorHandler sslHandler;
    private final List < String > customDeepLink = new ArrayList < > ();
    private boolean isScrollEnabled = true;
    public boolean isRepl = false;
    private static final int REQUEST_CODE_DRAW_OVERLAY_PERMISSION = 5;
    private boolean listening;

    private String status = EnvironmentCompat.MEDIA_UNKNOWN;
    private String plugged = EnvironmentCompat.MEDIA_UNKNOWN;
    private int level = 0;
    private String health = EnvironmentCompat.MEDIA_UNKNOWN;
    private float temperature = 0.0f;
    private int voltage = 0;
    private String technology = EnvironmentCompat.MEDIA_UNKNOWN;
    private boolean clickable = false;
	private static final String TAG = "BimaAix"; // Sesuaikan dengan kebutuhan Anda

    private boolean suppressWarnings;

    private final DownloadManager downloadManager;
    private long lastRequestId;
    private int nVisibility = DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED;
    private boolean isCancelled = false;
    private static boolean mIsFloatViewShowing = false;
    private boolean mFloatViewTouchConsumedByMove = false;

    private int mFloatViewLastX;
    private int mFloatViewLastY;
    private int mFloatViewFirstX;
    private int mFloatViewFirstY;

    private WindowManager mWindowManager;
    private WindowManager.LayoutParams params;
    private RelativeLayout rl;
    private ViewGroup viewParent;
    private int indexChild;
    private View viewHV;
    private final File externalFilesDir;

    private int requestCode = 0;
    private PackageManager packageManager; // Add this line

    private static Camera camera = null;

    private AlertDialog builder;
    private Toast mToast;
    private boolean hasFlash = false;
    /* access modifiers changed from: private */
    public boolean isFlashOn = false;
    private String binaryName = "su";
    private String expectedSignature;
    private class DownloadCompletedTask extends AsyncTask < Void, Void, Void > {
        @Override
        protected Void doInBackground(Void...params) {
            // Perform background tasks related to download completion
            DownloadCompleted();
            return null;
        }
    }

    public BroadcastReceiver completed = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1) == lastRequestId) {
                DownloadCompleted();
            }
        }
    };

    public BimaAix(ComponentContainer container) {
        super(container.$form());
        this.activity = container.$context();
        this.container = container;
        form.registerForOnNewIntent(this);
        context = activity;
		suppressWarnings = true;
        downloadManager = (DownloadManager) this.context.getSystemService(Context.DOWNLOAD_SERVICE);
        context.registerReceiver(completed, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
        if (this.form instanceof ReplForm) {
            this.isRepl = true;
        }
		this.externalFilesDir = this.form.getExternalFilesDir((String) null);
		initCalculator();
        this.hasFlash = this.context.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        this.contentResolver = this.context.getContentResolver();
        this.audioManager = (AudioManager) this.context.getApplicationContext().getSystemService("audio");
        this.form.registerForOnStop(this);
        this.form.registerForOnResume(this);
        this.form.registerForOnDestroy(this);
        Log.d(LOG_TAG, "BimaAix Created");
        startListeningBattery();
        broadcastReceiver = new MyBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        expectedSignature = expectedSignature;
        wvInterface = new WebViewInterface();
        cookieManager = CookieManager.getInstance();
        deviceDensity = this.container.$form().deviceDensity();
        webView = new WView(-1, context, this);
        resetWebView(webView);
        this.context.registerReceiver(broadcastReceiver, intentFilter);
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public boolean SuppressWarnings() {
        return this.suppressWarnings;
    }

    @SimpleProperty
    @DesignerProperty(defaultValue = "true", editorType = "boolean")
    public void SuppressWarnings(boolean suppressWarnings) {
        this.suppressWarnings = suppressWarnings;
    }

    @SimpleFunction(description = "Creates an AppSpecificDirectory - ASD")
    public void CreateAppSpecificDirectory() {
        if (this.externalFilesDir.exists()) {
            return;
        }
        Log.d(TAG, "Create External Dir = " + this.externalFilesDir.mkdirs());
    }

    @SimpleFunction(description = "Checks whether it is a file or directory.Prefix the filename with / (i.e. relative path) to look for the file  on the SD card. For instance /myFile.txt will look for the file /mnt/sdcard/myFile.txt. If fileOrDirectoryName starts with file:/// you can specify a complete path to the file or directory.")
    public boolean IsDirectory(String fileOrDirectoryName) {
        if (fileOrDirectoryName.startsWith("//")) {
            Log.d(LOG_TAG, "IsDirectory: did not check the assets");
            return false;
        }
        String completeFileName = completeFileName(fileOrDirectoryName);
        File file = new File(completeFileName);
        if (file.isDirectory()) {
            Log.d(LOG_TAG, "it is a directory");
            return true;
        }
        Log.d(LOG_TAG, "it is not a directory");
        return false;
    }

    @SimpleFunction(description = "Checks whether a file or directory exists.Prefix the filename with / (i.e. relative path) to look for the file  on the SD card. For instance /myFile.txt will look for the file /mnt/sdcard/myFile.txt. To read assets packaged with an application (also works for the Companion) start the filename with // (two slashes). If a fileOrDirectoryName starts with file:/// you can specify a complete path to the file of directory.")
    public boolean Exists(String fileOrDirectoryName) {
        boolean z = true;
        if (fileOrDirectoryName.startsWith("//") && !this.isRepl) {
            try {
                AssetManager am = this.context.getAssets();
                InputStream is = am.open(fileOrDirectoryName.substring(2));
                if (is.available() > 0) {
                    Log.d(LOG_TAG, "Exists: file or directory exists");
                } else {
                    Log.d(LOG_TAG, "Exists: file or directory does not exist");
                    z = false;
                }
                return z;
            } catch (IOException e) {
                Log.e(LOG_TAG, e.getMessage(), e);
                e.printStackTrace();
                return false;
            }
        }
        String completeFileName = completeFileName(fileOrDirectoryName);
        File file = new File(completeFileName);
        if (file.exists()) {
            Log.d(LOG_TAG, "Exists: file or directory exists");
            return true;
        }
        Log.d(LOG_TAG, "Exists: file or directory does not exist");
        return false;
    }

	@SimpleFunction(description = "Return file length of a file. Prefix the filename with / (i.e. relative path) to look for the file on the SD card. For instance /myFile.txt will look for the file /mnt/sdcard/myFile.txt. To read assets packaged with an application (also works for the Companion) start the filename with // (two slashes). If a fileName starts with file:/// you can specify a complete path to the file.")
	public String Length(String fileName) {
		if (fileName.startsWith("//") && !this.isRepl) {
			try {
				AssetFileDescriptor afd = this.context.getAssets().openFd(fileName.substring(2));
				if (afd != null) {
					Long fileLength = Long.valueOf(afd.getLength());
					Log.d(LOG_TAG, "file length= " + fileLength);
					return fileLength.toString();
				} else {
					Log.d(LOG_TAG, "AssetFileDescriptor is null");
					return "0";
            }
			} catch (IOException e) {
				Log.e(LOG_TAG, e.getMessage(), e);
				e.printStackTrace();
				return "0";
			}
		}
        String completeFileName = completeFileName(fileName);
        File file = new File(completeFileName);
        if (file.exists() && !file.isDirectory()) {
            Long fileLength2 = Long.valueOf(file.length());
            Log.d(LOG_TAG, "file length= " + fileLength2);
            return fileLength2.toString();
        }
        Log.d(LOG_TAG, "Sorry, file does not exist or is a directory.");
        if (!this.suppressWarnings) {
            Toast.makeText(this.context, "Sorry, file does not exist or is a directory.", 0).show();
        }
        return "0";
    }

    @SimpleFunction(description = "Return a list of filenames of a given directory. Use this method for specific directories to get back a result immediately. To get a list for a complete device or sdcard, which may take a few seconds, use the FileListAsync method instead. The complete path to these files is provided. You can filter by extension. To get a list of all files, use * as extension.If a directory starts with file:/// you can specify a complete path to the directory. To include files of all subdirectories, set includeSubdirectories to true, else to false.")
    public Object FileList(String directoryName, String extension, boolean includeSubdirectories) {
        String completePath = completeFileName(directoryName);
        Log.d(LOG_TAG, "FileList: " + completePath + ", extension: " + extension + ", sub: " + includeSubdirectories);
        List<String> fileNames = new ArrayList<>();
        if (!directoryName.startsWith("//")) {
            File dirPath = new File(completePath);
            if (dirPath.isDirectory()) {
                return getList(dirPath, extension, includeSubdirectories);
            }
            fileNames.add(completePath);
            return fileNames;
        }
        return fileNames;
    }
	@SimpleFunction(description = "Return a list of filenames from the assets (also works for the Companion). Note: during development, you will get all files stored in directory /AppInventor/assets.")
	public Object FileListFromAssets() {
		List<String> fileNames;
		List<String> fileNames2 = new ArrayList<>();
		IOException e = null;  // Declare 'e' before the try-catch block

		if (!this.isRepl) {
			AssetManager am = this.context.getAssets();
        
			try {
				String[] files = am.list("");
				fileNames = new ArrayList<>(Arrays.asList(files));
            
				Log.d(LOG_TAG, "listAssetFiles: " + fileNames);
            
				String[] dir = {"webkit", "external_comps", "images"};
            
				for (int j = dir.length - 1; j >= 0; j--) {
					fileNames.remove(dir[j]);
				}
            
				fileNames2 = fileNames;
			} catch (IOException e1) {
				e = e1;
				Log.e(LOG_TAG, e.getMessage(), e);
				e.printStackTrace();
				Log.d(LOG_TAG, "listAssetFiles2: " + fileNames2);
				return fileNames2;
			}

			Log.d(LOG_TAG, "listAssetFiles2: " + fileNames2);
			return fileNames2;
		}

		String completePath = completeFileName("//");
		File dirPath = new File(completePath);
		List<String> fileNames3 = getList(dirPath, "*", false);
		return fileNames3;
	}

	@SimpleFunction(description = "Create a list of filenames of a given directory.")
	public void FileListAsync(final String directoryName, final String extension, final boolean includeSubdirectories) {
		AsynchUtil.runAsynchronously(new Runnable() {
			@Override
			public void run() {
				BimaAix.this.AsyncFileList(directoryName, extension, includeSubdirectories);
			}
		});
	}

    private void AsyncFileList(String directoryName, String extension, boolean includeSubdirectories) {
        String completePath = completeFileName(directoryName);
        Log.d(LOG_TAG, "FileList: " + completePath + ", extension: " + extension + ", sub: " + includeSubdirectories);
        List < String > fileNames = new ArrayList < > ();
        if (!directoryName.startsWith("//")) {
            File dirPath = new File(completePath);
            if (dirPath.isDirectory()) {
                fileNames = getList(dirPath, extension, includeSubdirectories);
            } else {
                fileNames.add(completePath);
            }
        }
        final List < String > result = fileNames;
        this.activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                BimaAix.this.AfterFileListAsync(result);
            }
        });
    }

    @SimpleEvent(description = "Event indicating that creating a list of files of a given directory has finished.")
    public void AfterFileListAsync(Object fileList) {
        Log.d(LOG_TAG, "AfterFileListAsync: " + fileList);
        EventDispatcher.dispatchEvent(this, "AfterFileListAsync", new Object[] {
            fileList
        });
    }

    private List < String > getList(File dir, String ext, boolean includeSubdirectories) {
        List < String > fileList = new ArrayList < > ();
        File[] listFiles = dir.listFiles();
        if (listFiles != null) {
            for (File file: listFiles) {
                if (file.isDirectory()) {
                    if (includeSubdirectories) {
                        fileList.addAll(getList(file, ext, true));
                    }
                } else {
                    if (ext.equals("*") || file.getPath().endsWith(ext)) {
                        fileList.add(file.getPath());
                    }
                }
            }
        }
        return fileList;
    }

    /* Tambahkan metode ini untuk mendapatkan completeFileName */
    private String completeFileName(String fileName) {
        if (fileName.startsWith("file:///")) {
            return fileName.substring(7);
        } else {
            return fileName;
        }
    }

    @SimpleFunction(description = "Delete file. Prefix the filename with / (i.e. relative path) to delete a file on the SD card. For instance /myFile.txt will delete the file /mnt/sdcard/myFile.txt. You can't delete files stored in the assets! If a fileName starts with file:/// you can specify a complete path to the file.")
    public void Delete(String fileName) {
        if (fileName.startsWith("//")) {
            Log.d(LOG_TAG, "Delete: Sorry, can't delete a file in the assets.");
            if (!this.suppressWarnings) {
                Toast.makeText(this.context, "Sorry, can't delete a file in the assets.", 0).show();
            }
        } else if (IsDirectory(fileName)) {
            Log.d(LOG_TAG, "Delete: Sorry, can't delete a directory.");
            if (!this.suppressWarnings) {
                Toast.makeText(this.context, "Sorry, can't delete a directory.", 0).show();
            }
        } else if (!Exists(fileName)) {
            if (!this.suppressWarnings) {
                Toast.makeText(this.context, "Sorry, file to delete does not exist.", 0).show();
            }
        } else {
            String completeFileName = completeFileName(fileName);
            Log.d(LOG_TAG, "Delete, completeFileName: " + completeFileName);
            new File(completeFileName).delete();
        }
    }

    @SimpleFunction(description = "Copy file. Use this method to copy small files, for large files use the CopyAsync method instead. Prefix the filename with / (i.e. relative path) to copy a file on the SD card. For instance /myFile.txt will copy the file /mnt/sdcard/myFile.txt. To copy assets packaged with an application (also works for the Companion) start the fromFilename with // (two slashes). However you can't copy files to the assets. If a fileName starts with file:/// you can specify a complete path to the file.")
    public void Copy(String fromFileName, String toFileName) {
        copyOrMove1(fromFileName, toFileName, "copy", false);
    }

    @SimpleFunction(description = "Copy file (async). Use this method to copy large files. The copy process is finished after the Copied event fires.Prefix the filename with / (i.e. relative path) to copy a file on the SD card. For instance /myFile.txt will copy the file /mnt/sdcard/myFile.txt. To copy assets packaged with an application (also works for the Companion) start the fromFilename with // (two slashes). However you can't copy files to the assets. If a fileName starts with file:/// you can specify a complete path to the file.")
    public void CopyAsync(String fromFileName, String toFileName) {
        copyOrMove1(fromFileName, toFileName, "copy", true);
    }

    @SimpleFunction(description = "Move file. Use this method to move small files, for large files use the MoveAsync method instead.Prefix the filename with / (i.e. relative path) to move a file on the SD card. For instance /myFile.txt will move the file /mnt/sdcard/myFile.txt. You can't move files from or to the assets If a fileName starts with file:/// you can specify a complete path to the file.")
    public void Move(String fromFileName, String toFileName) {
        copyOrMove1(fromFileName, toFileName, "move", false);
    }

    @SimpleFunction(description = "Move file. Use this method to move large files. The move process is finished after the Moved event fires.Prefix the filename with / (i.e. relative path) to move a file on the SD card. For instance /myFile.txt will move the file /mnt/sdcard/myFile.txt. You can't move files from or to the assets If a fileName starts with file:/// you can specify a complete path to the file.")
    public void MoveAsync(String fromFileName, String toFileName) {
        copyOrMove1(fromFileName, toFileName, "move", true);
    }

    private void copyOrMove1(String fromFileName, String toFileName, final String action, boolean async) {
        String message = "";
        boolean error = false;
        if (toFileName.startsWith("//")) {
            message = "Sorry, can't " + action + " a file to the assets.";
            error = true;
        } else if (IsDirectory(fromFileName)) {
            message = "Sorry, can't " + action + " a directory.";
            error = true;
        } else if (!Exists(fromFileName)) {
            message = "Sorry, file to " + action + " does not exist.";
            error = true;
        } else if (action.equals("move") && fromFileName.startsWith("//")) {
            message = "Sorry, can't move a file from the assets.";
            error = true;
        }
        if (error) {
            Log.d(LOG_TAG, "copyOrMove1: " + message);
            if (async) {
                if (action.equals("move")) {
                    Moved(false, message);
                    return;
                } else {
                    Copied(false, message);
                    return;
                }
            } else if (!this.suppressWarnings) {
                Toast.makeText(this.context, message, 0).show();
                return;
            } else {
                return;
            }
        }
        final String completeFromFileName = completeFileName(fromFileName);
        final String completeToFileName = completeFileName(toFileName);
        Log.d(LOG_TAG, "copyOrMove1, completeFromFileName: " + completeFromFileName + ", completeToFileName: " + completeToFileName);
        Integer endIndex = Integer.valueOf(completeToFileName.lastIndexOf("/"));
        String outputPath = completeToFileName.substring(0, endIndex.intValue());
        File dir = new File(outputPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        boolean copyFileFromAssets = false;
        if (fromFileName.startsWith("//") && !this.isRepl) {
            copyFileFromAssets = true;
        }
        final Boolean copyFileFromAssetsResult = copyFileFromAssets;
        if (async) {
            AsynchUtil.runAsynchronously(new Runnable() { // from class: com.puravidaapps.BimaAix.3
                @Override // java.lang.Runnable
                public void run() {
                    BimaAix.this.AsyncCopyOrMove(completeFromFileName, completeToFileName, copyFileFromAssetsResult, action);
                }
            });
            return;
        }
        try {
            copyOrMove2(completeFromFileName, completeToFileName, copyFileFromAssets, action);
        } catch (FileNotFoundException fnfe1) {
            String errorMessage = fnfe1.getMessage();
            Log.e(LOG_TAG, errorMessage, fnfe1);
            fnfe1.printStackTrace();
            if (!this.suppressWarnings) {
                Toast.makeText(this.context, errorMessage, 0).show();
            }
        } catch (Exception e) {
            String errorMessage2 = e.getMessage();
            Log.e(LOG_TAG, errorMessage2, e);
            e.printStackTrace();
            if (!this.suppressWarnings) {
                Toast.makeText(this.context, errorMessage2, 0).show();
            }
        }
    }

    private void copyOrMove2(String completeFromFileName, String completeToFileName, Boolean copyFileFromAssets, String action) throws Exception {
        InputStream in;
        Log.d(LOG_TAG, "copyOrMove2");
        if (copyFileFromAssets.booleanValue()) {
            in = this.form.getAssets().open(completeFromFileName);
        } else {
            in = new FileInputStream(completeFromFileName);
        }
        OutputStream out = new FileOutputStream(completeToFileName);
        byte[] buffer = new byte[1024];
        while (true) {
            int read = in.read(buffer);
            if (read == -1) {
                break;
            }
            out.write(buffer, 0, read);
        }
        in.close();
        out.flush();
        out.close();
        if (action == "move") {
            Log.d(LOG_TAG, "delete");
            new File(completeFromFileName).delete();
        }
    }

    public void AsyncCopyOrMove(String completeFromFileName, String completeToFileName, Boolean copyFileFromAssets, String action) {
        Log.d(LOG_TAG, "AsyncCopyOrMove");
        try {
            copyOrMove2(completeFromFileName, completeToFileName, copyFileFromAssets, action);
            BackToUiThread(true, action + " successful", action);
        } catch (FileNotFoundException fnfe1) {
            String errorMessage = fnfe1.getMessage();
            Log.e(LOG_TAG, errorMessage, fnfe1);
            fnfe1.printStackTrace();
            BackToUiThread(false, errorMessage, action);
        } catch (Exception e) {
            String errorMessage2 = e.getMessage();
            Log.e(LOG_TAG, errorMessage2, e);
            e.printStackTrace();
            BackToUiThread(false, errorMessage2, action);
        }
    }

    private void BackToUiThread(final boolean successful, final String response, String action) {
        if (action == "move") {
            this.activity.runOnUiThread(new Runnable() { // from class: com.puravidaapps.BimaAix.4
                @Override // java.lang.Runnable
                public void run() {
                    BimaAix.this.Moved(successful, response);
                }
            });
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.puravidaapps.BimaAix.5
                @Override // java.lang.Runnable
                public void run() {
                    BimaAix.this.Copied(successful, response);
                }
            });
        }
    }

    @SimpleEvent(description = "Event indicating that copying a file has finished.")
    public void Copied(boolean successful, String response) {
        Log.d(LOG_TAG, "Copied");
        EventDispatcher.dispatchEvent(this, "Copied", new Object[]{successful, response});
    }

    @SimpleEvent(description = "Event indicating that moving a file has finished.")
    public void Moved(boolean successful, String response) {
        Log.d(LOG_TAG, "Moved");
        EventDispatcher.dispatchEvent(this, "Moved", new Object[]{successful, response});
    }

    @SimpleFunction(description = "Get free Memory Size in bytes of the external storage. Note: this does not have to be SD card, it can also be mount of internal memory.To get the size in KB: divide by 1024, to get the size im MB: divide again by 1024.")
    public long FreeMemorySize() {
        long bytesAvailable;
        if (Build.VERSION.SDK_INT <= 8) {
            StatFs stat = new StatFs(Environment.getExternalStorageDirectory().getPath());
            bytesAvailable = stat.getBlockSize() * stat.getAvailableBlocks();
        } else {
            File sd = Environment.getExternalStorageDirectory();
            bytesAvailable = sd.getUsableSpace();
        }
        Log.d(LOG_TAG, "Available Bytes: " + bytesAvailable);
        return bytesAvailable;
    }

    @SimpleFunction(description = "Get path and filename from media content uri")
    public String GetFileName(String contentUri) {
        Log.d(LOG_TAG, "GetFileName");
        String filename = getPath(context, Uri.parse(contentUri));
        return filename;
    }

    private static String getPath(Context context, Uri uri) {
        Log.d("FileUtil -", "Authority: " + uri.getAuthority() + ", Fragment: " + uri.getFragment() + ", Port: " + uri.getPort() + ", Query: " + uri.getQuery() + ", Scheme: " + uri.getScheme() + ", Host: " + uri.getHost() + ", Segments: " + uri.getPathSegments().toString());
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (isGooglePhotosUri(uri)) {
                return uri.getLastPathSegment();
            }
            return getDataColumn(context, uri, null, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        } else {
            return "";
        }
    }

    private static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }


    private static String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) {
        Cursor cursor = null;
        String[] projection = {"_data"};
        try {
            cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs, null);
            if (cursor != null && cursor.moveToFirst()) {
                DatabaseUtils.dumpCursor(cursor);
                int column_index = cursor.getColumnIndexOrThrow("_data");
                String string = cursor.getString(column_index);
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @SimpleFunction(description = "Return a list of subdirectories of a given directory. The complete path to these subdirectories is provided. If a directory starts with file:/// you can specify a complete path to the directory. The result list does NOT include subdirectories of subdirectories.")
    public Object DirectoryList(String directoryName) {
        String completePath = completeFileName(directoryName);
        Log.d(LOG_TAG, "DirectoryList: " + completePath);
        List<String> dirNames = new ArrayList<>();
        if (!directoryName.startsWith("//")) {
            File dirPath = new File(completePath);
            if (dirPath.isDirectory()) {
                String[] fileNames = dirPath.list();
                for (String fileName : fileNames) {
                    File dir = new File(dirPath.getPath() + File.separator + fileName);
                    if (dir.isDirectory()) {
                        dirNames.add(dir.getPath());
                    }
                }
            }
        } else {
            dirNames.add("");
        }
        return dirNames;
    }

    @SimpleFunction(description = "Get content uri from filename")
    public String GetUri(String filename) {
        Log.d(LOG_TAG, "getUri" + filename);
        Uri uri = Uri.fromFile(new File(filename));
        return uri.toString();
    }

    @SimpleFunction(description = "Return available size of given storage directory in Bytes. To get the value in KB, divide by 1024. To get the value in MB, divide by another 1024. To get the value in GB, divide by another 1024.")
    public String AvailableSize(String storageDirectory) {
        Log.d(LOG_TAG, "AvailableSize");
        File file = new File(storageDirectory);
        long availableSizeInBytes = file.getFreeSpace();
        return String.valueOf(availableSizeInBytes);
    }

    @SimpleFunction(description = "Return a list of available storage directories.")
    public Object AvailableStorageDirectories() {
        Log.d(LOG_TAG, "AvailableStorageDirectories");
        StorageUtil storageUtil = new StorageUtil();
        String[] strings = storageUtil.getStorageDirectories(this.context);
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
        return stringList;
    }

    public class StorageUtil {
        private final Pattern DIR_SEPERATOR = Pattern.compile("/");

        public StorageUtil() {
        }

        public String[] getStorageDirectories(Context context) {
            String rawUserId;
            Set<String> rv = new HashSet<>();
            String rawExternalStorage = System.getenv("EXTERNAL_STORAGE");
            String rawSecondaryStoragesStr = System.getenv("SECONDARY_STORAGE");
            String rawEmulatedStorageTarget = System.getenv("EMULATED_STORAGE_TARGET");
            if (TextUtils.isEmpty(rawEmulatedStorageTarget)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    File[] files = context.getExternalFilesDirs(null);
                    for (File file : files) {
                        String applicationSpecificAbsolutePath = file.getAbsolutePath();
                        String emulatedRootPath = applicationSpecificAbsolutePath.substring(0, applicationSpecificAbsolutePath.indexOf("Android/data"));
                        rv.add(emulatedRootPath);
                    }
                } else if (TextUtils.isEmpty(rawExternalStorage)) {
                    rv.addAll(Arrays.asList(getPhysicalPaths()));
                } else {
                    rv.add(rawExternalStorage);
                }
            } else {
                if (Build.VERSION.SDK_INT < 17) {
                    rawUserId = "";
                } else {
                    String path = Environment.getExternalStorageDirectory().getAbsolutePath();
                    String[] folders = this.DIR_SEPERATOR.split(path);
                    String lastFolder = folders[folders.length - 1];
                    boolean isDigit = false;
                    try {
                        Integer.valueOf(lastFolder);
                        isDigit = true;
                    } catch (NumberFormatException e) {
                    }
                    rawUserId = isDigit ? lastFolder : "";
                }
                if (TextUtils.isEmpty(rawUserId)) {
                    rv.add(rawEmulatedStorageTarget);
                } else {
                    rv.add(rawEmulatedStorageTarget + File.separator + rawUserId);
                }
            }
            if (!TextUtils.isEmpty(rawSecondaryStoragesStr)) {
                String[] rawSecondaryStorages = rawSecondaryStoragesStr.split(File.pathSeparator);
                Collections.addAll(rv, rawSecondaryStorages);
            }
            return (String[]) rv.toArray(new String[rv.size()]);
        }

        private String[] getPhysicalPaths() {
            return new String[]{"/storage/sdcard0", "/storage/sdcard1", "/storage/extsdcard", "/storage/sdcard0/external_sdcard", "/mnt/extsdcard", "/mnt/sdcard/external_sd", "/mnt/external_sd", "/mnt/media_rw/sdcard1", "/removable/microsd", "/mnt/emmc", "/storage/external_SD", "/storage/ext_sd", "/storage/removable/sdcard1", "/data/sdext", "/data/sdext2", "/data/sdext3", "/data/sdext4", "/sdcard1", "/sdcard2", "/storage/microsd"};
        }
    }

    private void initCalculator() {
        decimalResult = BigDecimal.ZERO;
        integerResult = BigInteger.ZERO;
    }

    @SimpleFunction(description = "Tambahkan dua angka")
    public void Add(double operand) {
        performArithmeticOperation("Add", BigDecimal.valueOf(operand));
    }

    @SimpleFunction(description = "Kurangkan dua angka")
    public void Subtract(double operand) {
        performArithmeticOperation("Subtract", BigDecimal.valueOf(operand));
    }

    @SimpleFunction(description = "Kalikan dua angka")
    public void Multiply(double operand) {
        performArithmeticOperation("Multiply", BigDecimal.valueOf(operand));
    }

    @SimpleFunction(description = "Bagikan dua angka")
    public void Divide(double operand) {
        performArithmeticOperation("Divide", BigDecimal.valueOf(operand));
    }

    // Metode untuk operasi lainnya

    private void performArithmeticOperation(String operation, BigDecimal operand) {
        switch (operation) {
        case "Add":
        case "Subtract":
        case "Multiply":
            decimalResult = operand;
            break;
        case "Divide":
            if (!operand.equals(BigDecimal.ZERO)) {
                decimalResult = decimalResult.divide(operand, BigDecimal.ROUND_HALF_UP);
            } else {
                Log.e(TAG, "Error: Decimal division by zero");
            }
            break;
            // Implementasikan operasi lainnya sesuai kebutuhan

        default:
            Log.e(TAG, "Error: Unknown decimal operation");
        }
        dispatchResult(operation);
    }

    // Metode untuk mendispatch hasil
    private void dispatchResult(String operationName) {
        // Convert the BigDecimal result to a string
        String resultAsString = decimalResult.toPlainString();

        // Dispatch an event with the result
        EventDispatcher.dispatchEvent(this, operationName, "Result", resultAsString);
    }

    // Metode untuk mendapatkan hasil perhitungan
    @SimpleFunction(description = "Get the result of decimal calculation")
    public String GetDecimalResult() {
        return decimalResult.toPlainString();
    }

    @SimpleFunction(description = "Get the result of integer calculation")
    public long GetIntegerResult() {
        return integerResult.longValue();
    }

    @SimpleFunction(description = "Pangkat dua angka")
    public void Power(double exponent) {
        performArithmeticOperation("Power", decimalResult.pow((int) exponent));
    }

    @SimpleFunction(description = "Faktorial dari angka")
    public void Factorial() {
        try {
            int intValue = decimalResult.intValueExact();
            BigInteger result = calculateFactorial(intValue);
            decimalResult = new BigDecimal(result);
        } catch (ArithmeticException e) {
            Log.e(TAG, "Error: Cannot calculate factorial for non-integer value");
        }
        dispatchResult("Factorial");
    }

    private BigInteger calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calculateFactorial(n - 1));
    }
    // ...

    @SimpleFunction(description = "Akar kuadrat dari angka")
    public void SquareRoot() {
        if (decimalResult.compareTo(BigDecimal.ZERO) >= 0) {
            decimalResult = BigDecimal.valueOf(Math.sqrt(decimalResult.doubleValue()));
            dispatchResult("SquareRoot");
        } else {
            Log.e(TAG, "Error: Cannot calculate square root for negative numbers");
        }
    }

    @SimpleFunction(description = "Operasi biner (Contoh: 110 + 101)")
    public void BinaryOperation(String binaryExpression) {
        try {
            // Konversi bilangan biner ke desimal, lakukan operasi, dan simpan hasilnya
            BigDecimal binaryResult = new BigDecimal(new BigInteger(binaryExpression, 2));
            performArithmeticOperation("BinaryOperation", binaryResult);
        } catch (NumberFormatException e) {
            Log.e(TAG, "Error: Invalid binary expression");
        }
    }

    @SimpleFunction(description = "Konversi angka ke bilangan Romawi")
    public String ToRoman(int number) {
        if (number < 1 || number > 3999) {
            Log.e(TAG, "Error: Roman numerals are only defined for numbers between 1 and 3999");
            return "";
        }
        return convertToRoman(number);
    }

    private String convertToRoman(int num) {
        String[] romanSymbols = {
            "I",
            "IV",
            "V",
            "IX",
            "X",
            "XL",
            "L",
            "XC",
            "C",
            "CD",
            "D",
            "CM",
            "M"
        };
        int[] values = {
            1,
            4,
            5,
            9,
            10,
            40,
            50,
            90,
            100,
            400,
            500,
            900,
            1000
        };

        StringBuilder roman = new StringBuilder();
        int i = 12;
        while (num > 0) {
            int div = num / values[i];
            num %= values[i];
            while (div--> 0) {
                roman.append(romanSymbols[i]);
            }
            i--;
        }
        return roman.toString();
    }

    // Metode untuk membersihkan kalkulator
    @SimpleFunction(description = "Clear the calculator values")
    public void ClearCalculator() {
        initCalculator();
    }
    @SimpleFunction(description = "Set quality as int from 1-5. Set very small text size to view the full ascii image.")
    public void Create(String path, int quality, boolean isColor, AndroidViewComponent textView) {
        TextView view = (TextView) textView.getView();
        if (path.startsWith("http://") || path.startsWith("https://")) {
            new Thread(() -> {
                try {
                    Bitmap bitmap = BitmapFactory.decodeStream(new URL(path).openStream());
                    form.$context().runOnUiThread(() -> {
                        ConvertView(view, quality, isColor, bitmap);
                    });
                } catch (IOException e) {
                    Failed(e.getMessage());
                }
            }).start();
        } else {
            Bitmap bitmap = BitmapFactory.decodeFile(path);
            ConvertView(view, quality, isColor, bitmap);
        }
    }

    private void ConvertView(TextView textView, int quality, boolean isColor, Bitmap bitmap) {
        new Img2Ascii()
            .bitmap(bitmap)
            .quality(quality)
            .color(isColor)
            .convert(new Img2Ascii.Listener() {
                @Override
                public void onProgress(int percentage) {
                    Progress(percentage);
                }

                @Override
                public void onResponse(Spannable text) {
                    textView.setText(text);
                    Completed();
                }
            });
    }

    @SimpleFunction(description = "Show a original toast of android")
    public void ShowAlert(String notice, boolean longNotification) {
        if (longNotification) {
            Toast.makeText(this.context, notice, 1).show();
        } else {
            Toast.makeText(this.context, notice, 0).show();
        }
    }

    @SimpleFunction(description = "Show a original toast of android at the center of the screen")
    public void ShowAlertAtCenter(String notice, boolean longNotification) {
        Toast toast;
        if (longNotification) {
            toast = Toast.makeText(this.context, notice, 1);
        } else {
            toast = Toast.makeText(this.context, notice, 0);
        }
        toast.setGravity(17, 0, 0);
        toast.show();
    }
    @SimpleEvent(description = "")
    public void Progress(int percentage) {
        EventDispatcher.dispatchEvent(this, "Progress", percentage);
    }

    @SimpleEvent(description = "")
    public void Completed() {
        EventDispatcher.dispatchEvent(this, "Completed");
    }

    @SimpleEvent(description = "")
    public void Failed(String message) {
        EventDispatcher.dispatchEvent(this, "Failed", message);
    }

    @SimpleProperty(description = "whether the device has flash")
    public boolean HasFlash() {
        return this.hasFlash;
    }

    @SimpleFunction(description = "turn on the flashlight.")
    public void On() {
        Log.d(LOG_TAG, "On, hasFlash: " + this.hasFlash + ", isFlashOn: " + this.isFlashOn);
        if (this.hasFlash && !this.isFlashOn) {
            this.form.askPermission("android.permission.CAMERA", new PermissionResultHandler() {
                public void HandlePermissionResponse(String permission, boolean granted) {
                    Log.d(BimaAix.LOG_TAG, "HandlePermissionResponse: " + granted);
                    if (granted) {
                        AsynchUtil.runAsynchronously(new Runnable() {
                            public void run() {
                                BimaAix.this.AsyncOn();
                            }
                        });
                    } else {
                        BimaAix.this.PermissionDenied("CAMERA");
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void AsyncOn() {
        Log.d(LOG_TAG, "AsyncOn: " + Build.VERSION.SDK_INT);
        try {
            if (Build.VERSION.SDK_INT < 23) {
                camera = Camera.open();
                Camera.Parameters p = camera.getParameters();
                p.setFlashMode("torch");
                camera.setParameters(p);
                camera.setPreviewTexture(new SurfaceTexture(0));
                camera.startPreview();
            } else {
                CameraManager camManager = (CameraManager) this.context.getSystemService("camera");
                camManager.setTorchMode(camManager.getCameraIdList()[0], true);
            }
        } catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage(), e);
            e.printStackTrace();
        }
        this.isFlashOn = true;
        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                BimaAix.this.Success(BimaAix.this.isFlashOn);
            }
        });
    }

    @SimpleFunction(description = "turn off the flashlight.")
    public void Off() {
        Log.d(LOG_TAG, "Off, hasFlash: " + this.hasFlash);
        if (this.isFlashOn) {
            this.form.askPermission("android.permission.CAMERA", new PermissionResultHandler() {
                public void HandlePermissionResponse(String permission, boolean granted) {
                    Log.d(BimaAix.LOG_TAG, "HandlePermissionResponse: " + granted);
                    if (granted) {
                        AsynchUtil.runAsynchronously(new Runnable() {
                            public void run() {
                                BimaAix.this.AsyncOff();
                            }
                        });
                    } else {
                        BimaAix.this.PermissionDenied("CAMERA");
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void AsyncOff() {
        Log.d(LOG_TAG, "AsyncOff: " + Build.VERSION.SDK_INT);
        try {
            if (Build.VERSION.SDK_INT < 23) {
                camera.stopPreview();
                camera.release();
                camera = null;
            } else {
                CameraManager camManager = (CameraManager) this.context.getSystemService("camera");
                if (camManager != null) {
                    camManager.setTorchMode(camManager.getCameraIdList()[0], false);
                }
            }
        } catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage(), e);
            e.printStackTrace();
        }
        this.isFlashOn = false;
        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                BimaAix.this.Success(BimaAix.this.isFlashOn);
            }
        });
    }

    @SimpleEvent(description = "Permission has been denied.")
    public void PermissionDenied(String permissionName) {
        Log.d(LOG_TAG, "PermissionDenied");
        EventDispatcher.dispatchEvent(this, "PermissionDenied", permissionName);
    }

    @SimpleEvent(description = "Flashlight has been successfully turned on/off.")
    public void Success(boolean isFlashOn2) {
        Log.d(LOG_TAG, "Success: " + isFlashOn2);
        EventDispatcher.dispatchEvent(this, "Success", Boolean.valueOf(isFlashOn2));
    }
    @SimpleFunction(description = "Disables the system keyboard for the specified textbox, disallows the keyboard to show up when the textbox it clicked.")
    public void DisableSystemKeyboard(TextBoxBase textBoxBase) {
        EditText editText = (EditText) textBoxBase.getView();
        if (Build.VERSION.SDK_INT >= 21) {
            editText.setShowSoftInputOnFocus(false);
        } else {
            editText.setInputType(0);
        }
    }

    @SimpleFunction(description = "Re-enables the system keyboard for the specified textbox, allows the keyboard to show up again when the textbox it clicked.")
    public void EnableSystemKeyboard(TextBoxBase textBoxBase) {
        EditText editText = (EditText) textBoxBase.getView();
        if (Build.VERSION.SDK_INT >= 21) {
            editText.setShowSoftInputOnFocus(true);
        } else {
            editText.setInputType(1);
        }
    }
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public boolean SuppressToast() {
        return this.suppressToast;
    }

    @DesignerProperty(defaultValue = "false", editorType = "boolean")
    @SimpleProperty
    public void SuppressToast(boolean suppressToast2) {
        this.suppressToast = suppressToast2;
    }

    @SimpleFunction(description = "Copy text to clipboard. In case SuppressToast is true, the toast message 'Text copied' will be suppressed after copying a text to the clipboard.")
    public void Copy(String text) {
        try {
            if (Build.VERSION.SDK_INT < 11) {
                ((ClipboardManager) this.context.getSystemService("clipboard")).setText(text);
            } else {
                ((android.content.ClipboardManager) this.context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied text", text));
            }
            Log.d(LOG_TAG, "Text copied: " + text);
            if (!this.suppressToast) {
                Toast.makeText(this.context, "Text copied.", 0).show();
            }
        } catch (Exception e) {
            Log.e(LOG_TAG, e.getMessage(), e);
        }
    }

    @SimpleFunction(description = "Paste text from clipboard. In case SuppressToast is true, the toast message 'Text pasted' will be suppressed after pasting a text from the clipboard.")
    public String Paste() {
        if (Build.VERSION.SDK_INT < 11) {
            return ((ClipboardManager) this.context.getSystemService("clipboard")).getText().toString();
        }
        ClipData clip = ((android.content.ClipboardManager) this.context.getSystemService("clipboard")).getPrimaryClip();
        if (clip == null) {
            return "";
        }
        String text = null;
        ClipData.Item item = clip.getItemAt(0);
        if (0 == 0) {
            text = CoerceToText(item).toString();
        }
        Log.d(LOG_TAG, "Text pasted: " + text);
        if (this.suppressToast) {
            return text;
        }
        Toast.makeText(this.context, "Text pasted.", 0).show();
        return text;
    }

    private CharSequence CoerceToText(ClipData.Item item) {
        CharSequence text = item.getText();
        if (text != null) {
            return text;
        }
        Uri uri = item.getUri();
        if (uri != null) {
            FileInputStream stream = null;
            try {
                stream = this.context.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", (Bundle) null).createInputStream();
                InputStreamReader reader = new InputStreamReader(stream, "UTF-8");
                StringBuilder builder = new StringBuilder(128);
                char[] buffer = new char[8192];
                while (true) {
                    int len = reader.read(buffer);
                    if (len <= 0) {
                        break;
                    }
                    builder.append(buffer, 0, len);
                }
                CharSequence text2 = builder.toString();
                if (stream == null) {
                    return text2;
                }
                try {
                    stream.close();
                    return text2;
                } catch (IOException e) {
                    Log.e(LOG_TAG, e.getMessage(), e);
                    return text2;
                }
            } catch (FileNotFoundException e2) {
                Log.d(LOG_TAG, "Unable to open content URI as text, ignoring... " + e2.getMessage(), e2);
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (IOException e3) {
                        Log.e(LOG_TAG, e3.getMessage(), e3);
                    }
                }
                Log.d(LOG_TAG, "Couldn't open the URI as a stream, then the URI itself probably serves fairly well as a textual representation");
                return uri.toString();
            } catch (IOException e4) {
                Log.w(LOG_TAG, "Failure loading text", e4);
                CharSequence text3 = e4.toString();
                if (stream == null) {
                    return text3;
                }
                try {
                    stream.close();
                    return text3;
                } catch (IOException e5) {
                    Log.e(LOG_TAG, e5.getMessage(), e5);
                    return text3;
                }
            } catch (Throwable th) {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (IOException e6) {
                        Log.e(LOG_TAG, e6.getMessage(), e6);
                    }
                }
                throw th;
            }
        } else {
            Intent intent = item.getIntent();
            if (intent == null) {
                return "";
            }
            Log.d(LOG_TAG, "all we have is an Intent, then we can just turn that into text");
            return intent.toUri(1);
        }
    }

    @SimpleFunction
    public void DecryptText(String str) {
        try {
            if (this.a.isEmpty()) {
                DecryptionError("Decryption key not set");
                return;
            }

            SecretKeySpec secretKeySpec = new SecretKeySpec(this.a.getBytes(StandardCharsets.UTF_8), "AES");
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] decode = Base64.decode(str, Base64.DEFAULT);
            byte[] bArr = new byte[12];
            byte[] bArr2 = new byte[(decode.length - 12)];
            System.arraycopy(decode, 0, bArr, 0, 12);
            System.arraycopy(decode, 12, bArr2, 0, bArr2.length);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(Cipher.DECRYPT_MODE, secretKeySpec, new GCMParameterSpec(128, bArr));
            DecryptionSuccess(new String(instance.doFinal(bArr2), StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
            DecryptionError("Decryption error: " + e.getMessage());
        }
    }

    @SimpleFunction
    public void DecryptionError(String str) {
        EventDispatcher.dispatchEvent(this, "DecryptionError", new Object[] {
            str
        });
    }
    @SimpleFunction
    public void DecryptionSuccess(String str) {
        EventDispatcher.dispatchEvent(this, "DecryptionSuccess", new Object[] {
            str
        });
    }
	@SimpleFunction(description = "Encrypt a text using AES algorithm.")
	public void EncryptText(String str) {
		try {
			if (this.a.isEmpty()) {
				EncryptionError("Encryption key not set");
				return;
			}

			byte[] keyBytes = this.a.getBytes(StandardCharsets.UTF_8);
			if (keyBytes == null || keyBytes.length == 0) {
				EncryptionError("Invalid key");
				return;
			}

			SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");
			Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
			byte[] bArr = new byte[12];
			new SecureRandom().nextBytes(bArr);
			instance.init(Cipher.ENCRYPT_MODE, secretKeySpec, new GCMParameterSpec(128, bArr));
			byte[] doFinal = instance.doFinal(str.getBytes(StandardCharsets.UTF_8));
			byte[] bArr2 = new byte[doFinal.length + 12];
			System.arraycopy(bArr, 0, bArr2, 0, 12);
			System.arraycopy(doFinal, 0, bArr2, 12, doFinal.length);
			EncryptionSuccess(Base64.encodeToString(bArr2, Base64.DEFAULT));
		} catch (Exception e) {
			e.printStackTrace();
			EncryptionError("Encryption error: " + e.getMessage());
		}
	}

    @SimpleFunction
    public void EncryptionError(String str) {
        EventDispatcher.dispatchEvent(this, "EncryptionError", new Object[] {
            str
        });
    }
    @SimpleFunction
    public void EncryptionKey(String str) {
        if (str.length() == 32) {
            this.a = str;
            return;
        }
        this.a = "";
        EncryptionError("Invalid encryption key length");
    }
    @SimpleFunction
    public void EncryptionSuccess(String str) {
        EventDispatcher.dispatchEvent(this, "EncryptionSuccess", new Object[] {
            str
        });
    }

    @SimpleProperty(description = "Sets download notification visibility")
    public void NotificationVisibility(int i) {
        nVisibility = i;
    }
    @SimpleFunction(description = "Returns guessed file name")
    public String GuessFileName(String url, String mimeType, String contentDisposition) {
        return URLUtil.guessFileName(url, contentDisposition, mimeType);
    }
    @SimpleFunction()
    public String GetUriString(long id) {
        try {
            return downloadManager.getUriForDownloadedFile(id).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    @SimpleFunction()
    public String GetMimeType(long id) {
        return downloadManager.getMimeTypeForDownloadedFile(id);
    }
    @SimpleFunction(description = "Tries to get file size")
    public void GetFileSize(final String url) {
        AsynchUtil.runAsynchronously(new Runnable() {
            @Override
            public void run() {
                final long[] size = new long[1];
                try {
                    HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
                    con.setRequestProperty("Accept-Encoding", "identity");
                    int statusCode = con.getResponseCode();
                    size[0] = con.getContentLengthLong();
                } catch (IOException e) {
                    e.printStackTrace();
                    size[0] = -1;
                }
                form.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        GotFileSize(size[0]);
                    }
                });
            }
        });
    }

    private void startListeningBattery() {
        if (!listening) {
            activity.registerReceiver(broadcastReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
            listening = true;
        }
    }

    private void stopListeningBattery() {
        if (listening) {
            activity.unregisterReceiver(broadcastReceiver);
            listening = false;
        }
    }
    /* access modifiers changed from: private */
    public String getStatus(int status2) {
        switch (status2) {
        case 2:
            return "charging";
        case 3:
            return "discharging";
        case 4:
            return "not charging";
        case 5:
            return "full";
        default:
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* access modifiers changed from: private */
    public String getPlugged(int plugged2) {
        switch (plugged2) {
        case 1:
            return "ac";
        case 2:
            return "usb";
        case 4:
            return "wireless";
        default:
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* access modifiers changed from: private */
    public String getHealth(int health2) {
        switch (health2) {
        case 1:
            return EnvironmentCompat.MEDIA_UNKNOWN;
        case 2:
            return "good";
        case 3:
            return "overheat";
        case 4:
            return "dead";
        case 5:
            return "over voltage";
        case 6:
            return "unspecified failure";
        case 7:
            return "cold";
        default:
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    @SimpleProperty(description = "Returns the battery status. Possible values are: charging, full, discharging, not charging or unknown.")
    public String Status() {
        return status;
    }

    @SimpleProperty(description = "Returns the battery plugged status. Possible values are: usb, ac, wireless or unknown.")
    public String Plugged() {
        return plugged;
    }

    @SimpleProperty(description = "Returns the battery level. Possible values are between 0 and 100.")
    public int Level() {
        return level;
    }

    @SimpleProperty(description = "Returns the current health constant. Possible values are: cold, dead, good, overheat, over voltage, unknown, unspecified failure.")
    public String Health() {
        return health;
    }

    @SimpleProperty(description = "Returns the battery temperature in Celsius.")
    public float Temperature() {
        return temperature;
    }

    @SimpleProperty(description = "Returns the battery voltage level in millivolts.")
    public int Voltage() {
        return voltage;
    }

    @SimpleProperty(description = "Returns the battery technology.")
    public String Technology() {
        return technology;
    }

    @SimpleEvent(description = "Event indicating that battery changed.")
    public void BatteryChanged(String status, String plugged, int level, String health, float temperature, int voltage, String technology) {
        Log.d(LOG_TAG, "BatteryChanged: " + status + ", " + plugged + ", " + level + ", " + health + ", " + temperature + ", " + voltage + ", technology: " + technology);
        EventDispatcher.dispatchEvent(this, "BatteryChanged", status, plugged, level, health, temperature, voltage, technology);
    }

    private void updateBatteryInfo(Intent intent) {
        status = getStatus(intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1));
        plugged = getPlugged(intent.getIntExtra("plugged", -1));
        int rawlevel = intent.getIntExtra("level", -1);
        int scale = intent.getIntExtra("scale", -1);
        level = (rawlevel < 0 || scale <= 0) ? 0 : (rawlevel * 100) / scale;
        health = getHealth(intent.getIntExtra("health", 0));
        temperature = (float)(intent.getIntExtra("temperature", 0) / 10);
        voltage = intent.getIntExtra("voltage", 0);
        technology = intent.getExtras().getString("technology");

        BatteryChanged(status, plugged, level, health, temperature, voltage, technology);
    }

    @SimpleFunction(description = "Downloads the given file")
    public void Download(String url, String mimeType, String fileName, String downloadDir) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setMimeType(mimeType);
        String cookies = CookieManager.getInstance().getCookie(url);
        request.addRequestHeader("cookie", cookies);
        request.setDescription("Downloading file...");
        request.setTitle(fileName);
        request.setNotificationVisibility(nVisibility);
        request.setTitle(fileName);
        if (downloadDir.startsWith("~")) {
            request.setDestinationInExternalFilesDir(context, downloadDir.substring(1), fileName);
        } else {
            request.setDestinationInExternalPublicDir(downloadDir, fileName);
        }
        lastRequestId = downloadManager.enqueue(request);
        DownloadStarted(lastRequestId);
        isCancelled = false;
        AsynchUtil.runAsynchronously(new Runnable() {
            @Override
            public void run() {
                boolean run = true;
                while (run) {
                    DownloadManager.Query downloadQuery = new DownloadManager.Query();
                    downloadQuery.setFilterById(lastRequestId);
                    Cursor cursor = downloadManager.query(downloadQuery);
                    if (cursor.moveToFirst()) {
                        final int status = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_STATUS));
                        if (status != DownloadManager.STATUS_FAILED && !isCancelled) {
                            int downloadedSize = cursor.getInt(cursor.getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
                            final int totalSize = cursor.getInt(cursor
                                .getColumnIndex(DownloadManager.COLUMN_TOTAL_SIZE_BYTES));
                            cursor.close();
                            if (status == DownloadManager.STATUS_SUCCESSFUL) {
                                run = false;
                            }
                            final int progress = (int)((((long) downloadedSize) * 100) / ((long) totalSize));
                            form.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    DownloadProgressChanged(progress);
                                }
                            });
                        } else {
                            run = false;
                            isCancelled = true;
                            form.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    DownloadFailed();
                                }
                            });
                        }
                    }
                }
            }
        });
    }
    public String getUrl(Intent intent) {
        Uri uri = intent.getData();
        if (uri != null && uri.toString() != null) {
            return uri.toString();
        }
        return "";
    }
    @SimpleFunction(description = "Returns the url which started the current activity")
    public String GetStartUrl() {
        return getUrl(activity.getIntent());
    }

    @SimpleEvent(description = "Event raised when app gets resumed and gives the url which started this activity/screen if there is any else empty string")
    public void OnResume(String url) {

        EventDispatcher.dispatchEvent(this, "OnResume", url);
    }
    public void onResume() {
        startListeningBattery();

    }
    public void onStop() {
        stopListeningBattery();
    }

    @Override
    public void onNewIntent(Intent intent) {
        OnResume(getUrl(intent));
    }
    @SimpleEvent(description = "Event invoked when downloading starts")
    public void DownloadStarted(long id) {
        EventDispatcher.dispatchEvent(this, "DownloadStarted", id);
    }
    @SimpleEvent(description = "Event invoked after getting file size")
    public void GotFileSize(long fileSize) {
        EventDispatcher.dispatchEvent(this, "GotFileSize", fileSize);
    }
    @SimpleEvent(description = "Event invoked when downloading gets completed")
    public void DownloadCompleted() {
        EventDispatcher.dispatchEvent(this, "DownloadCompleted");
    }
    @SimpleEvent(description = "Event invoked when downloading gets failed")
    public void DownloadFailed() {
        lastRequestId = 0L;
        EventDispatcher.dispatchEvent(this, "DownloadFailed");
    }
    @SimpleEvent(description = "Event invoked when downloading progress changes")
    public void DownloadProgressChanged(int progress) {
        EventDispatcher.dispatchEvent(this, "DownloadProgressChanged", progress);
    }

    @SimpleFunction(description = "Tries to open the last downloaded file")
    public void OpenFile(int id) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            Uri uri = downloadManager.getUriForDownloadedFile(id);
            String mimeType = downloadManager.getMimeTypeForDownloadedFile(id);
            intent.setDataAndType(uri, mimeType);
            form.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SimpleFunction(description = "Cancels the current download request")
    public void Cancel() {
        downloadManager.remove(lastRequestId);
        isCancelled = true;
        DownloadFailed();
    }

    @Override
    public void onDestroy() {
        Log.i(LOG_TAG, "onDestroy");
        stopListeningBattery();
        context.unregisterReceiver(completed);
        if (mWindowManager != null) {
            mWindowManager.removeViewImmediate(rl);
        }
    }

    private String expectedPackageName;
    private int d2p(int d) {
        return Math.round(d / deviceDensity);
    }

    private int p2d(int p) {
        return Math.round(p * deviceDensity);
    }

    @SimpleFunction(description = "Creates the webview in given arrangement with id")
    public void CreateWebView(HVArrangement container, final int id) {
        if (!(wv.containsKey(id) && container == null)) {
            final View v = container.getView();
            if (!wv.containsKey(id)) {
                WView w = new WView(id, context, this);
                resetWebView(w);
                FrameLayout frameLayout = (FrameLayout) v;
                frameLayout.addView(w, new FrameLayout.LayoutParams(-1, -1));
                wv.put(id, w);
            }
        }
    }

    @SimpleFunction(description = "Returns webview object from id")
    public Object GetWebView(int id) {
        if (wv.containsKey(id)) {
            return wv.get(id);
        }
        return null;
    }

    @SimpleFunction(description = "Set specific webview to current webview by id")
    public void SetWebView(final int id) {
        if (wv.containsKey(id)) {
            webView = wv.get(id);
            webView.setVisibility(View.VISIBLE);
            iD = id;
        }
    }

    private void resetWebView(final WebView web) {
        web.addJavascriptInterface(wvInterface, "AppInventor");
        MOBILE_USER_AGENT = web.getSettings().getUserAgentString();
        web.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        web.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        web.setFocusable(true);
        web.setWebViewClient(new WebClient());
        web.setWebChromeClient(new ChromeClient());
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDisplayZoomControls(displayZoom);
        web.getSettings().setAllowFileAccess(false);
        web.getSettings().setAllowFileAccessFromFileURLs(false);
        web.getSettings().setAllowUniversalAccessFromFileURLs(false);
        web.getSettings().setAllowContentAccess(false);
        web.getSettings().setSupportZoom(zoomEnabled);
        web.getSettings().setBuiltInZoomControls(zoomEnabled);
        web.setLongClickable(false);
        web.getSettings().setTextZoom(zoomPercent);
        cookieManager.setAcceptThirdPartyCookies(web, true);
        web.getSettings().setDomStorageEnabled(true);
        web.setVerticalScrollBarEnabled(true);
        web.setHorizontalScrollBarEnabled(true);
        web.getSettings().setDefaultFontSize(16);
        web.getSettings().setBlockNetworkImage(false);
        web.getSettings().setLoadsImagesAutomatically(true);
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.getSettings().setBlockNetworkLoads(false);
        web.getSettings().setMediaPlaybackRequiresUserGesture(false);
        web.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web.getSettings().setSupportMultipleWindows(true);
        web.getSettings().setGeolocationDatabasePath(null);
        web.getSettings().setDatabaseEnabled(true);
        web.getSettings().setGeolocationEnabled(false);
        if (UserAgent.isEmpty()) {
            UserAgent = MOBILE_USER_AGENT;
        }
        web.getSettings().setUserAgentString(UserAgent);
        web.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String s, String s1, String s2, String s3, long l) {
                OnDownloadNeeded(getIndex(web), s, s2, s3, l);
            }
        });
        web.setFindListener(new WebView.FindListener() {
            @Override
            public void onFindResultReceived(int i, int i1, boolean b) {
                FindResultReceived(getIndex((web)), i, i1, b);
            }
        });
        web.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (isScrollEnabled) {
                    switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                    case MotionEvent.ACTION_UP:
                        if (!v.hasFocus()) {
                            v.requestFocus();
                        }
                        break;
                    }
                    return false;
                } else {
                    return (event.getAction() == MotionEvent.ACTION_MOVE);
                }
            }
        });
        web.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (!webView.isLongClickable()) {
                    return true;
                } else {
                    final WebView.HitTestResult hitTestResult = webView.getHitTestResult();
                    String item = hitTestResult.getExtra();
                    int type = hitTestResult.getType();
                    if (type != WebView.HitTestResult.UNKNOWN_TYPE) {
                        if (item == null) {
                            item = "";
                        }
                        String str = "";
                        if (type == 8) {
                            Message message = new Handler().obtainMessage();
                            web.requestFocusNodeHref(message);
                            str = (String) message.getData().get("url");
                        }
                        LongClicked(getIndex(web), item, str, type);
                        return !webView.isLongClickable();
                    }
                    return false;
                }
            }
        });
        web.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
                OnScrollChanged(getIndex(web), i, i1, i2, i3, web.canScrollHorizontally(-1), web.canScrollHorizontally(1));
            }
        });
        /* added in v11
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O){
            web.getSettings().setSaveFormData(true);
        }else{
            AutofillManager autofillManager = context.getSystemService(AutofillManager.class);
            autofillManager.requestAutofill(webView);
        }
        */
    }

    @SimpleFunction(description = "Returns a list of used ids")
    public List < Integer > GetIds() {
        return new ArrayList < > (wv.keySet());
    }

    @SimpleProperty(description = "Set webview string")
    public void WebViewString(String newString) {
        wvInterface.setWebViewStringFromBlocks(newString);
    }

    @SimpleProperty(description = "Returns the visibility of current webview")
    public boolean Visible() {
        return webView.getVisibility() == View.VISIBLE;
    }

    @SimpleFunction(description = "Sets the visibility of webview by id")
    public void SetVisibility(int id, boolean visibility) {
        if (wv.containsKey(id)) {
            if (visibility) {
                wv.get(id).setVisibility(View.VISIBLE);
            } else {
                wv.get(id).setVisibility(View.GONE);
            }
        }
    }

    @SimpleProperty(description = "Get webview string")
    public String WebViewString() {
        return wvInterface.webViewString;
    }

    @SimpleProperty(description = "Sets scroll bar style")
    public void ScrollBarStyle(int style) {
        webView.setScrollBarStyle(style);
    }

    @SimpleProperty(description = "Gets scroll bar style")
    public int ScrollBarStyle() {
        return webView.getScrollBarStyle();
    }

    @SimpleProperty(description = "Sets over scroll mode")
    public void OverScrollMode(int mode) {
        webView.setOverScrollMode(mode);
    }

    @SimpleProperty(description = "Gets over scroll mode")
    public int OverScrollMode() {
        return webView.getOverScrollMode();
    }

    @SimpleProperty(description = "Sets layer type")
    public void LayerType(int type) {
        webView.setLayerType(type, null);
    }

    @SimpleProperty(description = "Gets layer type")
    public int LayerType() {
        return webView.getLayerType();
    }

    @SimpleProperty(description = "Sets rotation angle")
    public void RotationAngle(float rotation) {
        webView.setRotation(rotation);
    }

    @SimpleProperty(description = "Gets rotation angle")
    public float RotationAngle() {
        return webView.getRotation();
    }

    @SimpleProperty(description = "Get webview user agent")
    public String UserAgent() {
        return UserAgent;
    }

    @SimpleProperty(description = "Sets the WebView's user-agent string. If the string is null or empty, the system default value will be used. ")
    public void UserAgent(String userAgent) {
        if (!userAgent.isEmpty()) {
            UserAgent = userAgent;
        } else {
            UserAgent = MOBILE_USER_AGENT;
        }
        webView.getSettings().setUserAgentString(UserAgent);
    }

    @SimpleProperty(description = "URL of the page currently viewed")
    public String CurrentUrl() {
        return (webView.getUrl() == null) ? "" : webView.getUrl();
    }

    @SimpleProperty(description = "Title of the page currently viewed")
    public String CurrentPageTitle() {
        return (webView.getTitle() == null) ? "" : webView.getTitle();
    }
	

    @SimpleProperty(description = "Determines whether to follow links when they are tapped in the WebViewer." + "If you follow links, you can use GoBack and GoForward to navigate the browser history")
    public boolean FollowLinks() {
        return followLinks;
    }

    @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void DeepLinks(boolean d) {
        deepLinks = d;
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public boolean DeepLinks() {
        return deepLinks;
    }
	
    @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void FollowLinks(boolean follow) {
        followLinks = follow;
    }
    @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void BlockAds(boolean block) {
        blockAds = block;
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void AdHosts(String hosts) {
        AD_HOSTS = hosts;
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void AutoplayMedia(boolean bool) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(bool);
    }

    @SimpleProperty(description = "Returns whether the WebView requires a user gesture to play media")
    public boolean AutoplayMedia() {
        return webView.getSettings().getMediaPlaybackRequiresUserGesture();
    }

    @SimpleProperty(description = "Sets cache mode for active webview")
    public void CacheMode(int mode) {
        webView.getSettings().setCacheMode(mode);
    }

    @SimpleProperty(description = "Gets cache mode of active webview")
    public int CacheMode() {
        return webView.getSettings().getCacheMode();
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void ZoomEnabled(boolean bool) {
        zoomEnabled = bool;
    }

    @SimpleProperty(description = "Gets whether the WebView should support zooming using its on-screen zoom controls and gestures")
    public boolean ZoomEnabled() {
        return zoomEnabled;
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void AutoLoadImages(boolean bool) {
        webView.getSettings().setBlockNetworkImage(!bool);
        webView.getSettings().setLoadsImagesAutomatically(bool);
    }

    @SimpleProperty(description = "Returnss whether the WebView should load image resources")
    public boolean AutoLoadImages() {
        return webView.getSettings().getLoadsImagesAutomatically();
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void DisplayZoom(boolean bool) {
        displayZoom = bool;
    }

    @SimpleProperty(description = "Gets whether the WebView should display on-screen zoom controls")
    public boolean DisplayZoom() {
        return displayZoom;
    }

    @SimpleProperty(description = "Sets the zoom of the page in percent. The default is 100")
    public void ZoomPercent(int zoom) {
        zoomPercent = zoom;
    }

    @SimpleProperty(description = "Gets the zoom of the page in percent")
    public int ZoomPercent() {
        return zoomPercent;
    }

    @SimpleProperty(description = "Sets the default font size of text. The default is 16.")
    public void FontSize(int size) {
        webView.getSettings().setDefaultFontSize(size);
    }

    @SimpleProperty(description = "Returns the font size of text")
    public int FontSize() {
        return webView.getSettings().getDefaultFontSize();
    }

        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void DesktopMode(boolean mode) {
        if (mode) {
            UserAgent = UserAgent.replace("Android", "diordnA").replace("Mobile", "eliboM");
        } else {
            UserAgent = UserAgent.replace("diordnA", "Android").replace("eliboM", "Mobile");
        }
        webView.getSettings().setUserAgentString(UserAgent);
        desktopMode = mode;
    }

    @SimpleProperty(description = "Returns whether to load content in desktop mode")
    public boolean DesktopMode() {
        return desktopMode;
    }

    //@DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN, defaultValue = "True")
        @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void LongClickable(boolean bool) {
        webView.setLongClickable(bool);
    }

    @SimpleProperty(description = "Returns whether text selection and context menu are enabled or not")
    public boolean LongClickable() {
        return webView.isLongClickable();
    }

    @SimpleProperty(description = "Sets the initial scale for active WebView. 0 means default. If initial scale is greater than 0, WebView starts with this value as initial scale.")
    public void InitialScale(int scale) {
        webView.setInitialScale(scale);
    }

    @SimpleProperty(description = "Sets whether webview can access local files.Use this to enable file uploading and loading files using HTML")
    public void FileAccess(boolean allow) {
        webView.getSettings().setAllowFileAccess(allow);
        webView.getSettings().setAllowFileAccessFromFileURLs(allow);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(allow);
        webView.getSettings().setAllowContentAccess(allow);
    }

    @SimpleProperty(description = "Returns whether webview can access local files")
    public boolean FileAccess() {
        return webView.getSettings().getAllowFileAccess();
    }

    @SimpleProperty(description = "Sets whether the WebView supports multiple windows")
    public void SupportMultipleWindows(boolean support) {
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(support);
        webView.getSettings().setSupportMultipleWindows(support);
    }

    @SimpleProperty(description = "Sets whether the WebView should not load resources from the network.Use this to save data.")
    public void BlockNetworkLoads(boolean block) {
        webView.getSettings().setBlockNetworkLoads(block);
    }

    @SimpleProperty(description = "Returns whether the WebView should not load resources from the network")
    public boolean BlockNetworkLoads() {
        return webView.getSettings().getBlockNetworkLoads();
    }

    @SimpleProperty(description = "Returns whether the WebView supports multiple windows")
    public boolean SupportMultipleWindows() {
        return webView.getSettings().getJavaScriptCanOpenWindowsAutomatically();
    }

    @SimpleProperty(description = "Sets whether the WebView loads pages in overview mode, that is, zooms out the content to fit on screen by width. This setting is taken into account when the content width is greater than the width of the WebView control.")
    public void LoadWithOverviewMode(boolean bool) {
        webView.getSettings().setLoadWithOverviewMode(bool);
    }

    @SimpleProperty(description = "Sets whether the WebView should enable support for the 'viewport' HTML meta tag or should use a wide viewport.")
    public void UseWideViewPort(boolean bool) {
        webView.getSettings().setUseWideViewPort(bool);
    }

    @SimpleProperty(description = "Returns whether the WebView loads pages in overview mode")
    public boolean LoadWithOverviewMode() {
        return webView.getSettings().getLoadWithOverviewMode();
    }

    @SimpleProperty(description = "Returns whether the WebView should enable support for the 'viewport' HTML meta tag or should use a wide viewport.")
    public boolean UseWideViewPort() {
        return webView.getSettings().getUseWideViewPort();
    }

    @SimpleProperty(description = "Tells the WebView to enable JavaScript execution.")
    public void EnableJS(boolean js) {
        webView.getSettings().setJavaScriptEnabled(js);
    }

    @SimpleProperty(description = "Returns whether webview supports JavaScript execution")
    public boolean EnableJS() {
        return webView.getSettings().getJavaScriptEnabled();
    }

    @SimpleProperty(description = "Whether or not to give the application permission to use the Javascript geolocation API")
    public void UsesLocation(boolean uses) {
        webView.getSettings().setGeolocationEnabled(uses);
    }

    @SimpleProperty(description = "Returns whether webview will prompt for permission and raise 'OnPermissionRequest' event or not")
    public boolean PromptForPermission() {
        return prompt;
    }

    @SimpleProperty(description = "Whether to display horizonatal and vertical scrollbars or not")
    public void ScrollBar(boolean bool) {
        webView.setVerticalScrollBarEnabled(bool);
        webView.setHorizontalScrollBarEnabled(bool);
    }

    @SimpleProperty(description = "Sets whether webview will prompt for permission and raise 'OnPermissionRequest' event or not else assume permission is granted.")
    public void PromptForPermission(boolean pr) {
        prompt = pr;
    }

    @SimpleProperty(description = "Sets background color of webview")
    public void BackgroundColor(int bgColor) {
        webView.setBackgroundColor(bgColor);
    }

    /* added in v11
    @SimpleProperty(description = "Specifies whether webview should autofill saved credentials or not")
    public void Autofill(boolean enable){
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.O){
            webView.getSettings().setSaveFormData(enable);
        }else{
            if (enable) {
                AutofillManager autofillManager = context.getSystemService(AutofillManager.class);
                autofillManager.requestAutofill(webView);
            }else {
                webView.setImportantForAutofill(View.IMPORTANT_FOR_AUTOFILL_NO);
            }
        }
    }
    */
    @SimpleEvent(description = "When the JavaScript calls AppInventor.setWebViewString this event is run.")
    public void WebViewStringChanged(String value) {
        EventDispatcher.dispatchEvent(this, "WebViewStringChanged", value);
    }

    @SimpleFunction(description = "Stops the current load.")
    public void StopLoading() {
        webView.stopLoading();
    }

    @SimpleFunction(description = "Reloads the current URL.")
    public void Reload() {
        CancelJsRequests();
        webView.reload();
    }

    @SimpleFunction(description = "Loads the given data into this WebView using a 'data' scheme URL.")
    public void LoadHtml(String html) {
        CancelJsRequests();
        webView.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
    }

    @SimpleFunction(description = "Gets whether this WebView has a back history item")
    public boolean CanGoBack() {
        return webView.canGoBack();
    }

    @SimpleFunction(description = "Gets whether this WebView has a forward history item.")
    public boolean CanGoForward() {
        return webView.canGoForward();
    }

    @SimpleFunction(description = "Removes all cookies and raises 'CookiesRemoved' event")
    public void ClearCookies() {
        cookieManager.removeAllCookies(new ValueCallback < Boolean > () {
            @Override
            public void onReceiveValue(Boolean aBoolean) {
                CookiesRemoved(aBoolean);
            }
        });
        cookieManager.flush();
    }

    @SimpleFunction(description = "Creates a shortcut of given website on home screen")
    public void CreateShortcut(String url, String iconPath, String title) {
        try {
            Bitmap img = BitmapFactory.decodeFile(iconPath);
            if (img != null) {
                String screen = context.getSharedPreferences("TinyDB1", Context.MODE_PRIVATE).getString("ssn", "");
                String pkg = context.getPackageName();
                Intent intent = new Intent();
                String clsName = Objects.requireNonNull(context.getPackageManager().resolveActivity(context.getPackageManager().getLaunchIntentForPackage(pkg), 0)).activityInfo.name.replaceAll("Screen1", screen.length() == 0 ? "Screen1" : JsonUtil.getObjectFromJson(screen, true).toString());
                intent.setClassName(context, clsName);
                List < String > startValue = new ArrayList < > ();
                startValue.add(url);
                startValue.add("2");
                intent.putExtra("APP_INVENTOR_START", JsonUtil.getJsonRepresentation(startValue));
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
                    Intent installer = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    installer.putExtra(Intent.EXTRA_SHORTCUT_INTENT, intent);
                    installer.putExtra(Intent.EXTRA_SHORTCUT_NAME, title);
                    installer.putExtra(Intent.EXTRA_SHORTCUT_ICON, img);
                    installer.putExtra("duplicate", false);
                    context.sendBroadcast(installer);
                } else {
                    ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(Context.SHORTCUT_SERVICE);
                    if (shortcutManager.isRequestPinShortcutSupported()) {
                        ShortcutInfo shortcutInfo = new ShortcutInfo.Builder(context, title)
                            .setShortLabel(title)
                            .setIcon(Icon.createWithBitmap(img))
                            .setIntent(intent)
                            .build();
                        Intent pinnedShortcutCallbackIntent =
                            shortcutManager.createShortcutResultIntent(shortcutInfo);
                        PendingIntent successCallback = PendingIntent.getBroadcast(context, 0,
                            pinnedShortcutCallbackIntent, 0);
                        shortcutManager.requestPinShortcut(shortcutInfo, successCallback.getIntentSender());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SimpleEvent(description = "Event raised after 'ClearCokies' method with result")
    public void CookiesRemoved(boolean successful) {
        EventDispatcher.dispatchEvent(this, "CookiesRemoved", successful);
    }

    @SimpleFunction(description = "Clears the resource cache.")
    public void ClearCache() {
        webView.clearCache(true);
    }

    @SimpleFunction(description = "Tells this WebView to clear its internal back/forward list.")
    public void ClearInternalHistory() {
        webView.clearHistory();
    }

    @SimpleFunction(description = "Loads requested url in given webview")
    public void LoadInNewWindow(int id) {
        if (wv.containsKey(id) && resultObj != null) {
            WebView w = wv.get(id);
            WebView.WebViewTransport transport = (WebView.WebViewTransport) resultObj.obj;
            transport.setWebView(w);
            resultObj.sendToTarget();
            resultObj = null;
        }
    }

    @SimpleFunction(description = "Performs zoom in in the WebView")
    public void ZoomIn() {
        webView.zoomIn();
    }

    @SimpleFunction(description = "Performs zoom out in the WebView")
    public void ZoomOut() {
        webView.zoomOut();
    }

    @SimpleFunction(description = "Scrolls the contents of the WebView down by half the page size")
    public void PageDown(boolean bottom) {
        webView.pageDown(bottom);
    }

    @SimpleFunction(description = "Scrolls the contents of the WebView up by half the page size")
    public void PageUp(boolean top) {
        webView.pageUp(top);
    }

    @SimpleFunction(description = "Performs a zoom operation in the WebView by given zoom percent")
    public void ZoomBy(int zoomP) {
        webView.zoomBy(zoomP);
    }

    @SimpleFunction(description = "Returns current id")
    public int CurrentId() {
        return iD;
    }

    @SimpleFunction(description = "Goes back in the history of this WebView.")
    public void GoBack() {
        if (CanGoBack()) {
            webView.goBack();
        }
    }

    @SimpleFunction(description = "Goes forward in the history of this WebView.")
    public void GoForward() {
        if (CanGoForward()) {
            webView.goForward();
        }
    }

    @SimpleFunction(description = "Destroys the webview and removes it completely from view system")
    public void RemoveWebView(final int id) {
        if (wv.containsKey(id)) {
            WebView w = wv.get(id);
            ((FrameLayout) w.getParent()).removeView(w);
            w.destroy();
            wv.remove(id);
            iD = 0;
        }
    }

    @SimpleFunction(description = "Gets whether the page can go back or forward the given number of steps.")
    public boolean CanGoBackOrForward(int steps) {
        return webView.canGoBackOrForward(steps);
    }

    @SimpleFunction(description = "Goes to the history item that is the number of steps away from the current item. Steps is negative if backward and positive if forward.")
    public void GoBackOrForward(int steps) {
        if (CanGoBackOrForward(steps)) {
            webView.goBackOrForward(steps);
        }
    }

    @SimpleFunction(description = "Loads the given URL.")
    public void GoToUrl(String url) {
        CancelJsRequests();
		WebSettings settings = webView.getSettings();
		webView.getSettings().setUserAgentString("Desktop");
		settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");
		CookieManager.getInstance().setAcceptCookie(true);
        webView.loadUrl(url);
    }

    @SimpleFunction(description = "Loads the URL with postData using 'POST' method into active WebView.")
    public void PostData(String url, String data) throws UnsupportedEncodingException {
        webView.postUrl(url, data.getBytes("UTF-8"));
    }

    @SimpleFunction(description = "Does a best-effort attempt to pause any processing that can be paused safely, such as animations and geolocation. Note that this call does not pause JavaScript.")
    public void PauseWebView(int id) {
        wv.get(id).onPause();
    }

    @SimpleFunction(description = "Resumes the previously paused WebView.")
    public void ResumeWebView(int id) {
        wv.get(id).onResume();
    }

    @SimpleFunction(description = "Gets the progress for the given webview")
    public int GetProgress(int id) {
        return wv.get(id).getProgress();
    }

    @SimpleEvent(description = "Event triggered when a window needs to be closed")
    public void OnCloseWindowRequest(int id) {
        EventDispatcher.dispatchEvent(this, "OnCloseWindowRequest", id);
    }

    @SimpleEvent(description = "Event raised when page loading has finished.")
    public void PageLoaded(int id) {
        EventDispatcher.dispatchEvent(this, "PageLoaded", id);
    }

    @SimpleEvent(description = "Event raised when downloading is needed.")
    public void OnDownloadNeeded(int id, String url, String contentDisposition, String mimeType, long size) {
        EventDispatcher.dispatchEvent(this, "OnDownloadNeeded", id, url, contentDisposition, mimeType, size);
    }

    @SimpleEvent(description = "Event raised when page loading progress has changed.")
    public void OnProgressChanged(int id, int progress) {
        EventDispatcher.dispatchEvent(this, "OnProgressChanged", id, progress);
    }

    @SimpleEvent(description = "Event raised after getting console message.")
    public void OnConsoleMessage(String message, int lineNumber, int sourceID, String level) {
        EventDispatcher.dispatchEvent(this, "OnConsoleMessage", message, lineNumber, sourceID, level);
    }

    @SimpleFunction(description = "Asynchronously evaluates JavaScript in the context of the currently displayed page.")
    public void EvaluateJavaScript(String script) {
        webView.evaluateJavascript(script, new ValueCallback < String > () {
            @Override
            public void onReceiveValue(String s) {
                AfterJavaScriptEvaluated(s);
            }
        });
    }

    @SimpleFunction(description = "Get internal history of given webview.")
    public List < String > GetInternalHistory(int id) {
        List < String > history = new ArrayList < > ();
        if (wv.containsKey(id)) {
            WebBackForwardList webBackForwardList = wv.get(id).copyBackForwardList();
            for (int i = 0; i < webBackForwardList.getSize(); ++i) {
                WebHistoryItem webHistoryItem = webBackForwardList.getItemAtIndex(i);
                history.add(webHistoryItem.getUrl());
            }
        }
        return history;
    }

    @SimpleFunction(description = "Loads the given URL with the specified additional HTTP headers defined is list of lists.")
    public void LoadWithHeaders(String url, YailDictionary headers) {
        if (!headers.isEmpty()) {
            Map optionsMap = new HashMap < > ();
            for (Object key: headers.keySet()) {
                optionsMap.put(key, headers.get(key));
            }
            webView.loadUrl(url, optionsMap);
        } else {
            GoToUrl(url);
        }
    }

    @SimpleFunction(description = "Saves the current site as a web archive")
    public void SaveArchive(String dir) {
        webView.saveWebArchive(dir, true, new ValueCallback < String > () {
            @Override
            public void onReceiveValue(String s) {
                if (s == null) {
                    AfterArchiveSaved(false, "");
                } else {
                    AfterArchiveSaved(true, s);
                }
            }
        });
    }

    @SimpleEvent(description = "Event raised after 'SaveArchive' method.If 'success' is true then returns file path else empty string.")
    public void AfterArchiveSaved(boolean success, String filePath) {
        EventDispatcher.dispatchEvent(this, "AfterArchiveSaved", success, filePath);
    }

    @SimpleEvent(description = "Event raised after evaluating Js and returns result.")
    public void AfterJavaScriptEvaluated(String result) {
        EventDispatcher.dispatchEvent(this, "AfterJavaScriptEvaluated", result);
    }

    @SimpleEvent(description = "Event raised when webview gets scrolled")
    public void OnScrollChanged(int id, int scrollX, int scrollY, int oldScrollX, int oldScrollY, boolean canGoLeft, boolean canGoRight) {
        EventDispatcher.dispatchEvent(this, "OnScrollChanged", id, scrollX, scrollY, oldScrollX, oldScrollY, canGoLeft, canGoRight);
    }

    @SimpleFunction(description = "Clears the highlighting surrounding text matches.")
    public void ClearMatches() {
        webView.clearMatches();
    }

    @SimpleEvent(description = "Event raised when something is long clicked in webview with item(image,string,empty,etc) and type(item type like 0,1,8,etc)")
    public void LongClicked(int id, String item, String secondaryUrl, int type) {
        EventDispatcher.dispatchEvent(this, "LongClicked", id, item, secondaryUrl, type);
    }

    @SimpleFunction(description = "Scrolls the webview to given position")
    public void ScrollTo(final int x, final int y) {
        webView.postDelayed(new Runnable() {
            @Override
            public void run() {
                webView.scrollTo(p2d(x), p2d(y));
            }
        }, 300);
    }

    @SimpleFunction(description = "Return the scrolled left position of the webview")
    public int GetScrollX() {
        return d2p(webView.getScrollX());
    }

    @SimpleFunction(description = "Return the scrolled top position of the webview")
    public int GetScrollY() {
        return d2p(webView.getScrollY());
    }

    @SimpleEvent(description = "Event raised when any error is received during loading url and returns message,error code and failing url")
    public void OnErrorReceived(int id, String message, int errorCode, String url) {
        EventDispatcher.dispatchEvent(this, "OnErrorReceived", id, message, errorCode, url);
    }

    private class WebClient extends WebViewClient {
        private static final String ASSET_PREFIX = "file:///appinventor_asset/";

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.startsWith("http")) {
                return !followLinks;
            } else {
                if (deepLinks) {
                    return DeepLinkParser(url);
                }
            }
            return false;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            String url1 = request.getUrl().toString();
            if (url1.startsWith("http")) {
                return !followLinks;
            } else {
                if (deepLinks) {
                    return DeepLinkParser(url1);
                }
            }
            return false;
        }

        @Override
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            //RequestIntercepted(url, YailDictionary.makeDictionary());
            if (url.startsWith("http://localhost/") || url.startsWith(ASSET_PREFIX)) {
                if (blockAds) {
                    AdBlocker ab = new AdBlocker();
                    boolean ad = ab.isAd(url);
                    return ad ? ab.createEmptyResource() :
                        super.shouldInterceptRequest(view, url);
                }
                return handleAppRequest(url);
            }
            return super.shouldInterceptRequest(view, url);
        }

        @Override
        public WebResourceResponse shouldInterceptRequest(WebView view, final WebResourceRequest request) {
            /*
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    RequestIntercepted(url, YailDictionary.makeDictionary((Map<Object, Object>) (Map) request.getRequestHeaders()));
                }
            });
             */
            if ("localhost".equals(request.getUrl().getAuthority()) ||
                request.getUrl().toString().startsWith(ASSET_PREFIX)) {
                if (blockAds) {
                    AdBlocker ab = new AdBlocker();
                    boolean ad = ab.isAdHost(request.getUrl().getHost());
                    return ad ? ab.createEmptyResource() :
                        super.shouldInterceptRequest(view, request);
                }
                return handleAppRequest(request.getUrl().toString());
            }
            return super.shouldInterceptRequest(view, request);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            if (wv.get(CurrentId()) == view) {
                if (isLoading) {
                    isLoading = false;
                    PageLoaded(getIndex(view));
                }
            }
        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            sslHandler = handler;
            OnReceivedSslError(error.getPrimaryError());
            /*if (ignoreSslErrors) {
                handler.proceed();
            } else {
                handler.cancel();
            }*/
        }

        @Override
        public void onFormResubmission(WebView view, Message dontResend, Message resend) {
            dontSend = dontResend;
            reSend = resend;
            OnFormResubmission(getIndex(view));
        }

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            OnErrorReceived(getIndex(view), description, errorCode, failingUrl);
        }

        @Override
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            OnErrorReceived(getIndex(view), errorResponse.getReasonPhrase(), errorResponse.getStatusCode(), request.getUrl().toString());
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            OnErrorReceived(getIndex(view), error.getDescription().toString(), error.getErrorCode(), request.getUrl().toString());
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            if (!isLoading) {
                PageStarted(getIndex(view), url);
                isLoading = true;
            }
        }

        @Override
        public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
            httpAuthHandler = handler;
            OnReceivedHttpAuthRequest(getIndex(view), host, realm);
        }

        private WebResourceResponse handleAppRequest(String url) {
            String path;
            if (url.startsWith(ASSET_PREFIX)) {
                path = url.substring(ASSET_PREFIX.length());
            } else {
                path = url.substring(url.indexOf("//localhost/") + 12);
            }
            InputStream stream;
            try {
                stream = form.openAsset(path);
                Map < String, String > headers = new HashMap < > ();
                headers.put("Access-Control-Allow-Origin", "localhost");
                String mimeType = URLConnection.getFileNameMap().getContentTypeFor(path);
                String encoding = "utf-8";
                if (mimeType == null ||
                    (!mimeType.startsWith("text/") && !mimeType.equals("application/javascript"))) {
                    encoding = null;
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    return new WebResourceResponse(mimeType, encoding, 200, "OK", headers, stream);
                } else {
                    return new WebResourceResponse(mimeType, encoding, stream);
                }
            } catch (Exception e) {
                ByteArrayInputStream error = new ByteArrayInputStream("404 Not Found".getBytes());
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, error);
                } else {
                    return new WebResourceResponse("text/plain", "utf-8", error);
                }
            }
        }

    }

    @SimpleEvent(description = "Event raised when file uploading is needed")
    public void FileUploadNeeded(int id, String mimeType, boolean isCaptureEnabled) {
        EventDispatcher.dispatchEvent(this, "FileUploadNeeded", id, mimeType, isCaptureEnabled);
    }

    @SimpleFunction(description = "Uploads the given file from content uri.Use empty string to cancel the upload request.")
    public void UploadFile(String contentUri) {
        if (mFilePathCallback != null) {
            if (contentUri.isEmpty()) {
                mFilePathCallback.onReceiveValue(null);
                mFilePathCallback = null;
            } else {
                mFilePathCallback.onReceiveValue(new Uri[] {
                    Uri.parse(contentUri)
                });
                mFilePathCallback = null;
            }
        }
    }

    private class ChromeClient extends WebChromeClient {
        private View mCustomView;
        private WebChromeClient.CustomViewCallback mCustomViewCallback;
        private int mOriginalOrientation;
        private int mOriginalSystemUiVisibility;
        private final int FULL_SCREEN_SETTING = View.SYSTEM_UI_FLAG_FULLSCREEN |
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
            View.SYSTEM_UI_FLAG_IMMERSIVE;

        @Override
        public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
            if (!prompt) {
                callback.invoke(origin, true, true);
            } else {
                theCallback = callback;
                theOrigin = origin;
                OnGeolocationRequested(origin);
                /*
                AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
                alertDialog.setCancelable(false);
                alertDialog.setTitle("Permission Request");
                if (origin.equals("file://")) {
                    origin = "This Application";
                }
                alertDialog.setMessage(origin + " would like to access your location.");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Allow",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                theCallback.invoke(theOrigin, true, true);
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Refuse",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                theCallback.invoke(theOrigin, false, true);
                            }
                        });
                alertDialog.show();
                */
            }
        }

        @Override
        public void onShowCustomView(View paramView, CustomViewCallback paramCustomViewCallback) {
            OnShowCustomView();
            if (mCustomView != null) {
                onHideCustomView();
                return;
            }
            mCustomView = paramView;
            mOriginalSystemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            mOriginalOrientation = activity.getRequestedOrientation();
            mCustomViewCallback = paramCustomViewCallback;
            ((FrameLayout) activity.getWindow()
                .getDecorView())
            .addView(mCustomView, new FrameLayout.LayoutParams(-1, -1));
            activity.getWindow().getDecorView().setSystemUiVisibility(FULL_SCREEN_SETTING);
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
            mCustomView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                @Override
                public void onSystemUiVisibilityChange(int i) {
                    updateControls();
                }
            });
        }

        void updateControls() {
            FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) mCustomView.getLayoutParams();
            params.bottomMargin = 0;
            params.topMargin = 0;
            params.leftMargin = 0;
            params.rightMargin = 0;
            params.height = -1;
            params.width = -1;
            mCustomView.setLayoutParams(params);
            activity.getWindow().getDecorView().setSystemUiVisibility(FULL_SCREEN_SETTING);
        }

        @Override
        public void onHideCustomView() {
            OnHideCustomView();
            ((FrameLayout) activity.getWindow().getDecorView()).removeView(mCustomView);
            mCustomView = null;
            activity.getWindow().getDecorView().setSystemUiVisibility(mOriginalSystemUiVisibility);
            activity.setRequestedOrientation(mOriginalOrientation);
            mCustomViewCallback.onCustomViewHidden();
            mCustomViewCallback = null;
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
        }

        @Override
        public boolean onShowFileChooser(WebView view, ValueCallback < Uri[] > filePathCallback, FileChooserParams fileChooserParams) {
            mFilePathCallback = filePathCallback;
            FileUploadNeeded(getIndex(view), fileChooserParams.getAcceptTypes()[0], fileChooserParams.isCaptureEnabled());
            return FileAccess();
        }

        @Override
        public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
            if (SupportMultipleWindows()) {
                resultObj = resultMsg;
                OnNewWindowRequest(getIndex(view), isDialog, isUserGesture);
            }
            return SupportMultipleWindows();
        }

        @Override
        public void onCloseWindow(WebView window) {
            OnCloseWindowRequest(getIndex(window));
        }

        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            OnProgressChanged(getIndex(view), newProgress);
        }

        @Override
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            OnConsoleMessage(consoleMessage.message(), consoleMessage.lineNumber(), consoleMessage.lineNumber(), consoleMessage.messageLevel().toString());
            return true;
        }

        @Override
        public void onPermissionRequest(PermissionRequest request) {
            if (!prompt) {
                request.grant(request.getResources());
            } else {
                permissionRequest = request;
                String[] strings = request.getResources();
                List < String > permissions = Arrays.asList(strings);
                OnPermissionRequest(permissions);
            }
        }

        @Override
        public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
            jsPromptResult = result;
            OnJsPrompt(getIndex(view), url, message, defaultValue);
            return EnableJS();
        }

        @Override
        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            OnJsAlert(getIndex(view), url, message);
            jsAlert = result;
            return EnableJS();
        }

        @Override
        public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
            jsResult = result;
            OnJsConfirm(getIndex(view), url, message);
            return EnableJS();
        }
    }

    private int getIndex(WebView view) {
        List < WView > w = new ArrayList < > (wv.values());
        return new ArrayList < > (wv.keySet()).get(w.indexOf(view));
    }

    @SimpleEvent(description = "Event raised when resubmission of form is needed")
    public void OnFormResubmission(int id) {
        EventDispatcher.dispatchEvent(this, "OnFormResubmission", id);
    }

    @SimpleFunction(description = "Whether to resubmit form or not.")
    public void ResubmitForm(boolean reSubmit) {
        if (reSend != null && dontSend != null) {
            if (reSubmit) {
                reSend.sendToTarget();
            } else {
                dontSend.sendToTarget();
            }
            reSend = null;
            dontSend = null;
        }
    }

    @SimpleEvent(description = "Event raised when new window is requested by webview with boolean 'isDialog' and 'isPopup'")
    public void OnNewWindowRequest(int id, /*String url,*/ boolean isDialog, boolean isPopup) {
        EventDispatcher.dispatchEvent(this, "OnNewWindowRequest", id, /*url,*/ isDialog, isPopup);
    }

    @SimpleEvent(description = "Event raised when current page enters in full screen mode")
    public void OnShowCustomView() {
        EventDispatcher.dispatchEvent(this, "OnShowCustomView");
    }

    @SimpleEvent(description = "Event raised when current page exits from full screen mode")
    public void OnHideCustomView() {
        EventDispatcher.dispatchEvent(this, "OnHideCustomView");
    }

    @SimpleFunction(description = "Gets height of HTML content")
    public int ContentHeight() {
        return d2p(webView.getContentHeight());
    }

    @SimpleFunction(description = "Grants given permissions to webview.Use empty list to deny the request.")
    public void GrantPermission(final String permissions) {
        if (permissionRequest != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (permissions.isEmpty()) {
                        permissionRequest.deny();
                    } else {
                        // lets just skip this part :)
                        /*String[] str = permissions.split(",");
                        if (str == permissionRequest.getResources()) {
                            permissionRequest.grant(str);
                        }*/
                        permissionRequest.grant(permissionRequest.getResources());
                    }
                    permissionRequest = null;
                }
            });
        }
    }

    @SimpleEvent(description = "Event raised after getting SSL certificate of current displayed url/website with boolean 'isSecure' and Strings 'issuedBy','issuedTo' and 'validTill'.If 'isSecure' is false and other values are empty then assume that website is not secure")
    public void GotCertificate(boolean isSecure, String issuedBy, String issuedTo, String validTill) {
        EventDispatcher.dispatchEvent(this, "GotCertificate", isSecure, issuedBy, issuedTo, validTill);
    }

    @SimpleFunction(description = "Gets the SSL certificate for the main top-level page and raises 'GotCertificate' event")
    public void GetSslCertificate() {
        SslCertificate certificate = webView.getCertificate();
        if (certificate != null) {
            GotCertificate(true, certificate.getIssuedBy().getDName(), certificate.getIssuedTo().getDName(), certificate.getValidNotAfterDate().toString());
        } else {
            GotCertificate(false, "", "", "");
        }
    }

    @SimpleFunction(description = "Sets cookies for given url")
    public void SetCookies(String url, String cookieString) {
        try {
            CookieManager.getInstance().setCookie(url, cookieString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SimpleEvent(description = "Event raised when Js have to show an alert to user")
    public void OnJsAlert(int id, String url, String message) {
        EventDispatcher.dispatchEvent(this, "OnJsAlert", id, url, message);
    }

    @SimpleEvent(description = "Tells to display a confirm dialog to the user.")
    public void OnJsConfirm(int id, String url, String message) {
        EventDispatcher.dispatchEvent(this, "OnJsConfirm", id, url, message);
    }

    @SimpleEvent(description = "Event raised when JavaScript needs input from user")
    public void OnJsPrompt(int id, String url, String message, String defaultValue) {
        EventDispatcher.dispatchEvent(this, "OnJsPrompt", id, url, message, defaultValue);
    }

    @SimpleFunction(description = "Dismiss previously requested Js alert")
    public void DismissJsAlert() {
        if (jsAlert != null) {
            jsAlert.cancel();
            jsAlert = null;
        }
    }

    @SimpleFunction(description = "Inputs a confirmation response to Js")
    public void ContinueJs(String input) {
        if (jsPromptResult != null) {
            jsPromptResult.confirm(input);
            jsPromptResult = null;
        }
    }

    @SimpleFunction(description = "Whether to proceed JavaScript originated request")
    public void ConfirmJs(boolean confirm) {
        if (jsResult != null) {
            if (confirm) {
                jsResult.confirm();
            } else {
                jsResult.cancel();
            }
            jsResult = null;
        }
    }

    @SimpleEvent(description = "Notifies that the WebView received an HTTP authentication request.")
    public void OnReceivedHttpAuthRequest(int id, String host, String realm) {
        EventDispatcher.dispatchEvent(this, "OnReceivedHttpAuthRequest", id, host, realm);
    }

    @SimpleEvent(description = "Event indicating that page loading has started in web view.")
    public void PageStarted(int id, String url) {
        EventDispatcher.dispatchEvent(this, "PageStarted", id, url);
    }

    @SimpleFunction(description = "Instructs the WebView to proceed with the authentication with the given credentials.If both parameters are empty then it will cancel the request.")
    public void ProceedHttpAuthRequest(String username, String password) {
        if (httpAuthHandler != null) {
            if (username.isEmpty() && password.isEmpty()) {
                httpAuthHandler.cancel();
            } else {
                httpAuthHandler.proceed(username, password);
            }
            httpAuthHandler = null;
        }
    }

    @SimpleEvent(description = "Event raised after 'Find' method with int 'activeMatchOrdinal','numberOfMatches' and 'isDoneCounting'")
    public void FindResultReceived(int id, int activeMatchOrdinal, int numberOfMatches, boolean isDoneCounting) {
        EventDispatcher.dispatchEvent(this, "FindResultReceived", id, activeMatchOrdinal, numberOfMatches, isDoneCounting);
    }

    @SimpleFunction(description = "Clear all location preferences.")
    public void ClearLocation() {
        GeolocationPermissions.getInstance().clearAll();
    }

    @SimpleFunction(description = "Finds all instances of find on the page and highlights them, asynchronously. Successive calls to this will cancel any pending searches.")
    public void Find(String string) {
        webView.findAllAsync(string);
    }

    @SimpleFunction(description = "Get cookies for specific url")
    public String GetCookies(String url) {
        String cookies = CookieManager.getInstance().getCookie(url);
        return cookies != null ? cookies : "";
    }

    @SimpleFunction(description = "Invokes the graphical zoom picker widget for this WebView. This will result in the zoom widget appearing on the screen to control the zoom level of this WebView.Note that it does not checks whether zoom is enabled or not.")
    public void InvokeZoomPicker() {
        webView.invokeZoomPicker();
    }

    @SimpleFunction(description = "Highlights and scrolls to the next match if 'forward' is true else scrolls to previous match.")
    public void FindNext(boolean forward) {
        webView.findNext(forward);
    }

    public class WebViewInterface {
        String webViewString;

        WebViewInterface() {
            webViewString = "";
        }

        @JavascriptInterface
        public String getWebViewString() {
            return webViewString;
        }

        @JavascriptInterface
        public void setWebViewString(final String newString) {
            webViewString = newString;
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    WebViewStringChanged(newString);
                }
            });
        }

        public void setWebViewStringFromBlocks(final String newString) {
            webViewString = newString;
        }
    }

    @SimpleEvent(description = "Event raised when a website asks for specific permission(s) in list format.")
    public void OnPermissionRequest(List < String > permissionsList) {
        EventDispatcher.dispatchEvent(this, "OnPermissionRequest", permissionsList);
    }

    @SimpleEvent(description = "Event raised after getting previus print's result.")
    public void GotPrintResult(String printId, boolean isCompleted, boolean isFailed, boolean isBlocked) {
        EventDispatcher.dispatchEvent(this, "GotPrintResult", printId, isCompleted, isFailed, isBlocked);
    }

    @SimpleEvent(description = "Event raised when page asks for location access. Developer must handle/show dialog from him/herself.")
    public void OnGeolocationRequested(String origin) {
        EventDispatcher.dispatchEvent(this, "OnGeolocationRequested", origin);
    }

    @SimpleFunction()
    public void AllowGeolocationAccess(boolean allow, boolean remember) {
        if (theCallback != null) {
            theCallback.invoke(theOrigin, allow, remember);
            theCallback = null;
            theOrigin = "";
        }
    }

    @SimpleEvent()
    public void OnReceivedSslError(int errorCode) {
        EventDispatcher.dispatchEvent(this, "OnReceivedSslError", errorCode);
    }

    @SimpleFunction()
    public void ProceedSslError(boolean proceed) {
        if (sslHandler != null) {
            if (proceed) {
                sslHandler.proceed();
            } else {
                sslHandler.cancel();
            }
            sslHandler = null;
        }
    }

    @SimpleFunction(description = "Prints the content of webview with given document name")
    public void PrintWebContent(String documentName) throws Exception {
        PrintManager printManager = (PrintManager) context.getSystemService(Context.PRINT_SERVICE);
        if (documentName.isEmpty()) {
            jobName = webView.getTitle() + "_Document";
        } else {
            jobName = documentName;
        }
        PrintDocumentAdapter printAdapter = new PrintDocumentAdapterWrapper(webView.createPrintDocumentAdapter(jobName));
        if (printManager != null) {
            printJob = printManager.print(jobName, printAdapter,
                new PrintAttributes.Builder().build());
        }
    }

    @SimpleFunction(description = "Hides previously shown custom view")
    public void HideCustomView() {
        webView.getWebChromeClient().onHideCustomView();
    }

    @SimpleFunction(description = "Restarts current/previous print job. You can request restart of a failed print job.")
    public void RestartPrinting() throws Exception {
        printJob.restart();
    }

    @SimpleFunction(description = "Cancels current print job. You can request cancellation of a queued, started, blocked, or failed print job.")
    public void CancelPrinting() throws Exception {
        printJob.cancel();
    }

    private void CancelJsRequests() {
        if (jsAlert != null) {
            jsAlert.cancel();
            jsAlert = null;
        } else if (jsResult != null) {
            jsResult.cancel();
            jsResult = null;
        } else if (jsPromptResult != null) {
            jsPromptResult.cancel();
            jsPromptResult = null;
        } else if (mFilePathCallback != null) {
            mFilePathCallback.onReceiveValue(null);
            mFilePathCallback = null;
        }
    }

    private boolean DeepLinkParser(String url) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent;
        if (url.startsWith("tel:")) {
            intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
            activity.startActivity(intent);
            return true;
        } else if (url.startsWith("mailto:") || url.startsWith("sms:")) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            activity.startActivity(intent);
            return true;
        } else if (url.startsWith("whatsapp:")) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setPackage("com.whatsapp");
            activity.startActivity(intent);
            return true;
        } else if (url.startsWith("geo:")) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            intent.setPackage("com.google.android.apps.maps");
            if (intent.resolveActivity(packageManager) != null) {
                activity.startActivity(intent);
                return true;
            } else {
                return false;
            }
        } else if (url.startsWith("intent:")) {
            try {
                intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME);
                if (intent.resolveActivity(packageManager) != null) {
                    activity.startActivity(intent);
                    return true;
                }
                String fallbackUrl = intent.getStringExtra("browser_fallback_url");
                if (fallbackUrl != null) {
                    webView.loadUrl(fallbackUrl);
                }
                intent = new Intent(Intent.ACTION_VIEW).setData(
                    Uri.parse("market://details?id=" + intent.getPackage()));
                if (intent.resolveActivity(packageManager) != null) {
                    activity.startActivity(intent);
                    return true;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else if (!customDeepLink.isEmpty() && customDeepLink.contains(url.split(":")[0])) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            activity.startActivity(intent);
            return true;
        }
        return false;
    }

    public class PrintDocumentAdapterWrapper extends PrintDocumentAdapter {

        private final PrintDocumentAdapter delegate;

        public PrintDocumentAdapterWrapper(PrintDocumentAdapter adapter) {
            super();
            delegate = adapter;
        }

        @Override
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes1, CancellationSignal cancellationSignal, LayoutResultCallback layoutResultCallback, Bundle bundle) {
            delegate.onLayout(printAttributes, printAttributes1, cancellationSignal, layoutResultCallback, bundle);
        }

        @Override
        public void onWrite(PageRange[] pageRanges, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, WriteResultCallback writeResultCallback) {
            delegate.onWrite(pageRanges, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }

        public void onFinish() {
            delegate.onFinish();
            GotPrintResult(jobName, printJob.isCompleted(), printJob.isFailed(), printJob.isBlocked());

        }
    }

    private class AdBlocker {
        private String getHost(String url) {
            try {
                return new URL(url).getHost() != null ? new URL(url).getHost() : "";
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        }
        private boolean isAd(String url) {
            try {
                return isAdHost(getHost(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }

        private boolean isAdHost(String host) {
            if (webView.getUrl().contains(host)) {
                return false;
            } else {
                return AD_HOSTS.contains(host);
            }
        }

        private WebResourceResponse createEmptyResource() {
            return new WebResourceResponse("text/plain", "utf-8", new ByteArrayInputStream("".getBytes()));
        }
    }

    // v12beta
    /*
    @SimpleEvent(description = "A new request is intercepted or recorded <br> Added by Xoma")
    public void RequestIntercepted(String url, YailDictionary requestHeaders) {
        EventDispatcher.dispatchEvent(this, "RequestIntercepted", url, requestHeaders);
    }
	*/

    @SimpleFunction(description = "Clears the form data of the webview <br> Added by Xoma")
    public void ClearFormData(final int id) {
        final WebView view = wv.get(id);
        if (view != null) {
            view.clearFormData();
        }
    }

    @SimpleFunction(description = "Registers to open specified link in associated external app(s)")
    public void RegisterDeepLink(String scheme) {
        customDeepLink.add(scheme);
    }

    @SimpleProperty(description = "Sets whether vibration feedback enabled on long click ")
    public void VibrationEnabled(boolean v) {
        webView.setHapticFeedbackEnabled(v);
    }
    @SimpleProperty(description = "Returns whether vibration feedback enabled on long click ")
    public boolean VibrationEnabled() {
        return webView.isHapticFeedbackEnabled();
    }
    @SimpleProperty()
    public void Scrollable(boolean b) {
        isScrollEnabled = b;
    }

    @SimpleEvent(description = "Event raised when webview is swiped")
    public void Swiped(int id, int direction) {
        EventDispatcher.dispatchEvent(this, "Swiped", id, direction);
    }

    @Override
    public void onSwipe(int i, int i1) {
        Swiped(i, i1);
    }
    @SimpleFunction(description = "Set the expected app package name.")
    public void setExpectedPackageName(String packageName) {
        expectedPackageName = packageName;
    }

    @SimpleFunction(description = "Check if the app's package name matches the expected package name.")
    public boolean checkPackageMod() {
        String packageName = form.getPackageName();
        return packageName.equals(expectedPackageName);
    }

    @SimpleFunction(description = "Check if the app is a clone (package name does not match the expected package name).")
    public boolean isCloneMod() {
        return !checkPackageMod();
    }
    @SimpleFunction(description = "Returns true if an app package is installed and enabled.")
    public boolean IsAppInstalledAndEnabledPM(String packageName) {
        PackageManager packageManager = container.$form().getPackageManager();
        try {
            ApplicationInfo appInfo = packageManager.getApplicationInfo(packageName, 0);
            return appInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            return false; // Package is not installed
        }
    }

    @SimpleFunction
    public boolean IsEmulator() {
        return (Build.BOARD.toLowerCase().contains("nox") ||
            Build.BOOTLOADER.toLowerCase().contains("nox") ||
            Build.BRAND.equalsIgnoreCase("generic") ||
            Build.BRAND.equalsIgnoreCase("generic_x86") ||
            Build.BRAND.equalsIgnoreCase("TTVM") ||
            Build.BRAND.toLowerCase().contains("Andy") ||
            Build.DEVICE.toLowerCase().contains("generic") ||
            Build.DEVICE.toLowerCase().contains("generic_x86") ||
            Build.DEVICE.toLowerCase().contains("Andy") ||
            Build.DEVICE.toLowerCase().contains("ttVM_Hdragon") ||
            Build.DEVICE.toLowerCase().contains("Droid4X") ||
            Build.DEVICE.toLowerCase().contains("nox") ||
            Build.DEVICE.toLowerCase().contains("generic_x86_64") ||
            Build.DEVICE.toLowerCase().contains("vbox86p") ||
            Build.FINGERPRINT.toLowerCase().contains("generic") ||
            Build.FINGERPRINT.toLowerCase().contains("generic/sdk/generic") ||
            Build.FINGERPRINT.toLowerCase().contains("generic_x86/sdk_x86/generic_x86") ||
            Build.FINGERPRINT.toLowerCase().contains("Andy") ||
            Build.FINGERPRINT.toLowerCase().contains("ttVM_Hdragon") ||
            Build.FINGERPRINT.toLowerCase().contains("generic_x86_64") ||
            Build.FINGERPRINT.toLowerCase().contains("generic/google_sdk/generic") ||
            Build.FINGERPRINT.toLowerCase().contains("vbox86p") ||
            Build.FINGERPRINT.toLowerCase().contains("generic/vbox86p/vbox86p") ||
            Build.FINGERPRINT.startsWith("unknown") ||
            Build.HARDWARE.equalsIgnoreCase("goldfish") ||
            Build.HARDWARE.equalsIgnoreCase("vbox86") ||
            Build.HARDWARE.toLowerCase().contains("nox") ||
            Build.HARDWARE.toLowerCase().contains("ttVM_x86") ||
            Build.MANUFACTURER.equalsIgnoreCase("unknown") ||
            Build.MANUFACTURER.equalsIgnoreCase("Genymotion") ||
            Build.MANUFACTURER.toLowerCase().contains("Andy") ||
            Build.MANUFACTURER.toLowerCase().contains("MIT") ||
            Build.MANUFACTURER.toLowerCase().contains("nox") ||
            Build.MANUFACTURER.toLowerCase().contains("TiantianVM") ||
            Build.MODEL.equalsIgnoreCase("sdk") ||
            Build.MODEL.equalsIgnoreCase("google_sdk") ||
            Build.MODEL.toLowerCase().contains("Droid4X") ||
            Build.MODEL.toLowerCase().contains("TiantianVM") ||
            Build.MODEL.toLowerCase().contains("Andy") ||
            Build.MODEL.equalsIgnoreCase("Android SDK built for x86_64") ||
            Build.MODEL.equalsIgnoreCase("Android SDK built for x86") ||
            Build.MODEL.contains("Emulator") ||
            Build.PRODUCT.toLowerCase().contains("sdk") ||
            Build.PRODUCT.toLowerCase().contains("Andy") ||
            Build.PRODUCT.toLowerCase().contains("ttVM_Hdragon") ||
            Build.PRODUCT.toLowerCase().contains("google_sdk") ||
            Build.PRODUCT.toLowerCase().contains("Droid4X") ||
            Build.PRODUCT.toLowerCase().contains("nox") ||
            Build.PRODUCT.toLowerCase().contains("sdk_x86") ||
            Build.PRODUCT.toLowerCase().contains("sdk_google") ||
            Build.PRODUCT.toLowerCase().contains("vbox86p") ||
            Build.SERIAL.toLowerCase().contains("nox") ||
            Build.SERIAL.toLowerCase().contains("vmos") ||
            Build.SERIAL.toLowerCase().contains("x8sandbox") ||
            Build.SERIAL.toLowerCase().contains("x8sb") ||
            isRunningInEmulator());
    }
    private boolean isRunningInEmulator() {
        return Build.FINGERPRINT.contains("generic") ||
            Build.FINGERPRINT.contains("unknown") ||
            Build.FINGERPRINT.contains("emulator") ||
            Build.MODEL.contains("google_sdk") ||
            Build.MODEL.contains("Emulator") ||
            Build.MODEL.contains("Android SDK build for x86");
    }

    @SimpleFunction(description = "Initializes the component you want to float.")
    public void SetupView(AndroidViewComponent viewComponent, boolean clickable, int positionX, int positionY) {
        viewHV = viewComponent.getView();
        clickable = clickable;
        floatViewHV(positionX, positionY);
    }

    @SimpleFunction(description = "Displays the floating component.")
    public void ShowFloatingView() {
        if (checkDrawOverlayPermission(true)) {
            showFloatView();
        }
    }

    @SimpleFunction(description = "Through this block it is possible to overlap any visible component on another.\nmargins (list):\n\tindex 1 -> margin left (number)\n\tindex 2 -> margin top (number)\n\tindex 3 -> margin right(number)\n\tindex 4 -> margin bottom (number)\ngravity (number):\n\t0  -> TOP-LEFT\n\t1  -> TOP-CENTER\n\t2  -> TOP-RIGHT\n\t3  -> CENTER-LEFT\n\t4  -> CENTER\n\t5  -> CENTER-RIGHT\n\t6  -> BOTTOM-LEFT\n\t7  -> BOTTOM-CENTER\n\t8  -> BOTTOM-RIGHT\n")
    public void OverlapView(AndroidViewComponent mainComponent, AndroidViewComponent childComponent, YailList margins,
        int gravity) {
        overlapView(mainComponent, childComponent, margins, gravity);
    }

    @SimpleFunction(description = "Hides the floating component.")
    public void DismissViewFloating() {
        dismissFloatView();
    }

    @SimpleFunction(description = "Checks whether the overlay permission is active.")
    public boolean CheckDrawOverlayPermission() {
        return checkDrawOverlayPermission(false);
    }

    @SimpleFunction(description = "Redirects to application settings to allow overlay permission.")
    public void RequestDrawOverlayPermission() {
        checkDrawOverlayPermission(true);
    }

    @SimpleFunction(description = "Gets the X coordinate that the floating view is in.")
    public int GetPositionX() {
        return params.x;
    }

    @SimpleFunction(description = "Gets the Y coordinate that the floating view is in.")
    public int GetPositionY() {
        return params.y;
    }

    @SimpleFunction(description = "Moves the floating view to the indicated coordinates.")
    public void SetPosition(int x, int y) {
        params.x = x;
        params.y = y;
        if (mWindowManager != null) {
            PositionMoved(params.x, params.y);
            mWindowManager.updateViewLayout(rl, params);
        }
    }

    @SimpleProperty(description = "Adjusts whether the floating view is clickable")
    public void SetClickable(boolean clickable) {
        clickable = clickable;
    }

    @SimpleProperty(description = "Checks whether the floating view is clickable.")
    public boolean GetClickable() {
        return clickable;
    }

    @SimpleProperty(description = "Checks if the floating is present on the screen.")
    public boolean GetFloatingViewVisible() {
        return mIsFloatViewShowing;
    }

    @SimpleEvent(description = "View moved from position")
    public void PositionMoved(int x, int y) {
        EventDispatcher.dispatchEvent(this, "PositionMoved", x, y);
    }

    @SimpleEvent(description = "Executes after clicking on the floating component.")
    public void ClickView() {
        EventDispatcher.dispatchEvent(this, "ClickView");
    }

    @SimpleFunction(description = "Returns the floating window to the screen.")
    public void RestoreFloatingView() {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (rl != null) {
                    if (mIsFloatViewShowing && mWindowManager != null)
                        mWindowManager.removeView(rl);
                    mIsFloatViewShowing = false;
                    rl.removeView(viewHV);
                    View view = viewHV instanceof ViewGroup ? ((ViewGroup) viewHV).getChildAt(0) : (View) viewHV;
                    view.setOnClickListener(null);
                    view.setOnTouchListener(null);
                    viewParent.addView(viewHV, indexChild);
                    rl = null;
                }
            }
        });
    }

    @SimpleFunction(description = "Prompts to focus on the floating window.")
    public void RequestFocusFloatingView() {
        if (mIsFloatViewShowing) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (mWindowManager != null) {
                        params.flags = WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;
                        mWindowManager.updateViewLayout(rl, params);
                    }
                }
            });
        }
    }

    @SimpleFunction(description = "Loses focus on the floating window.")
    public void LoseFocusFloatingView() {
        if (mIsFloatViewShowing) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (mWindowManager != null) {
                        rl.clearFocus();
                        params.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH;
                        mWindowManager.updateViewLayout(rl, params);
                    }
                }
            });
        }
    }

    @Override
    public void resultReturned(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE_DRAW_OVERLAY_PERMISSION) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && Settings.canDrawOverlays(context)) {
                showFloatView();
            }
        }
    }

    private boolean checkDrawOverlayPermission(boolean request) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(context)) {
            if (request) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + context.getPackageName()));
                if (requestCode == 0)
                    requestCode = form.registerForActivityResult(this);
                container.$context().startActivityForResult(intent, REQUEST_CODE_DRAW_OVERLAY_PERMISSION);
            }
            return false;
        } else {
            return true;
        }
    }

    private void showFloatView() {
        if (!mIsFloatViewShowing) {
            mIsFloatViewShowing = true;
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (!activity.isFinishing()) {
                        mWindowManager = (WindowManager) activity.getSystemService(WINDOW_SERVICE);
                        if (mWindowManager != null) {
                            rl.clearFocus();
                            mWindowManager.addView(rl, params);
                        }
                    }
                }
            });
        }

    }

    private void dismissFloatView() {
        if (mIsFloatViewShowing) {
            mIsFloatViewShowing = false;
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (mWindowManager != null) {
                        mWindowManager.removeViewImmediate(rl);
                    }
                }
            });
        }
    }

    private void floatViewHV(int positionX, int positionY) {
        dismissFloatView();
        rl = new RelativeLayout(context);
        params = new WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.O ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY :
            WindowManager.LayoutParams.TYPE_PHONE,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
            PixelFormat.TRANSLUCENT);

        params.gravity = Gravity.TOP | Gravity.LEFT;
        params.x = positionX;
        params.y = positionY;

        View view = viewHV instanceof ViewGroup ? ((ViewGroup) viewHV).getChildAt(0) : (View) viewHV;
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickView();
            }
        });
        view.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int totalDeltaX = mFloatViewLastX - mFloatViewFirstX;
                int totalDeltaY = mFloatViewLastY - mFloatViewFirstY;

                switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    mFloatViewLastX = (int) event.getRawX();
                    mFloatViewLastY = (int) event.getRawY();
                    mFloatViewFirstX = mFloatViewLastX;
                    mFloatViewFirstY = mFloatViewLastY;
                    mFloatViewTouchConsumedByMove = !clickable;
                    break;
                case MotionEvent.ACTION_UP:
                    mFloatViewTouchConsumedByMove = !clickable;
                    break;
                case MotionEvent.ACTION_MOVE:
                    int deltaX = (int) event.getRawX() - mFloatViewLastX;
                    int deltaY = (int) event.getRawY() - mFloatViewLastY;
                    mFloatViewLastX = (int) event.getRawX();
                    mFloatViewLastY = (int) event.getRawY();
                    if (Math.abs(totalDeltaX) >= 5 || Math.abs(totalDeltaY) >= 5) {
                        if (event.getPointerCount() == 1) {
                            params.x += deltaX;
                            params.y += deltaY;
                            mFloatViewTouchConsumedByMove = true;
                            if (mWindowManager != null) {
                                PositionMoved(params.x, params.y);
                                mWindowManager.updateViewLayout(rl, params);
                            }
                        } else {
                            mFloatViewTouchConsumedByMove = false;
                        }
                    } else {
                        mFloatViewTouchConsumedByMove = false;
                    }
                    break;
                default:
                    break;
                }
                return mFloatViewTouchConsumedByMove;
            }
        });
        if (viewHV.getParent() != null) {
            viewParent = (ViewGroup) viewHV.getParent();
            indexChild = viewParent.indexOfChild(viewHV);
            ((ViewGroup) viewHV.getParent()).removeView(viewHV);
        }
        rl.addView(viewHV);

    }

    private void overlapView(AndroidViewComponent mainComponent, AndroidViewComponent childComponent, YailList margins,
        int gravity) {
        if (gravity == 0)
            gravity = Gravity.TOP | Gravity.LEFT;
        else if (gravity == 1)
            gravity = Gravity.TOP | Gravity.CENTER;
        else if (gravity == 2)
            gravity = Gravity.TOP | Gravity.RIGHT;
        else if (gravity == 3)
            gravity = Gravity.CENTER | Gravity.LEFT;
        else if (gravity == 4)
            gravity = Gravity.CENTER;
        else if (gravity == 5)
            gravity = Gravity.CENTER | Gravity.RIGHT;
        else if (gravity == 6)
            gravity = Gravity.BOTTOM | Gravity.LEFT;
        else if (gravity == 7)
            gravity = Gravity.BOTTOM | Gravity.CENTER;
        else if (gravity == 8)
            gravity = Gravity.BOTTOM | Gravity.RIGHT;
        View viewChild = childComponent.getView();
        if (viewChild.getParent() != null)
            ((ViewGroup) viewChild.getParent()).removeView(viewChild);
        FrameLayout child = new FrameLayout(context);
        child.addView(viewChild);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT);
        params.gravity = gravity;
        String[] m = margins.toStringArray();
        params.setMargins(m.length > 0 ? Integer.parseInt(m[0]) : 0, m.length > 1 ? Integer.parseInt(m[1]) : 0,
            m.length > 2 ? Integer.parseInt(m[2]) : 0, m.length > 3 ? Integer.parseInt(m[3]) : 0);
        child.setLayoutParams(params);
        ((FrameLayout) mainComponent.getView()).addView(child);
    }

    @SimpleFunction
    public boolean IsRooted() {
        if (null != null) {
            return false;
        }
        String[] strArr = new String[10];
        String[] strArr2 = strArr;
        strArr[0] = "/data/local/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[1] = "/data/local/bin/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[2] = "/data/local/xbin/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[3] = "/sbin/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[4] = "/system/bin/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[5] = "/system/bin/.ext/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[6] = "/system/bin/failsafe/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[7] = "/system/sd/xbin/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[8] = "/system/usr/we-need-root/";
        strArr = strArr2;
        strArr2 = strArr;
        strArr[9] = "/system/xbin/";
        for (String append: strArr2) {

            StringBuilder stringBuilder = new StringBuilder();
            File file = new File(stringBuilder.append(append).append(binaryName).toString());
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }
    /* Tambahan fungsi yang diminta */
    @SimpleFunction(description = "Check if developer mode is enabled.")
    public boolean IsDeveloperModeEnabled() {
        return Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }
    @SimpleFunction(description = "Check if the app's signature matches the expected signature.")
    public boolean CheckMyAppSignature() {
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(
                activity.getPackageName(),
                PackageManager.GET_SIGNATURES
            );
            // ...
            for (Signature signature: packageInfo.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA-1");
                md.update(signature.toByteArray());
                String apkSignature = bytesToHex(md.digest()); // Konversi ke string heksadesimal
                Log.e("DEBUG", "SIGNATURE: " + apkSignature);

                if (apkSignature.equalsIgnoreCase(expectedSignature)) {
                    return true; // Signature matches
                }
            }
        } catch (Exception e) {
            Log.e("DEBUG", "Error checking signature", e);
        }
        return false; // No matching signature found
    }
    @SimpleFunction(description = "Hide the navigation bar (including recent apps, home, and back buttons).")
    public void HideNavigationBarHP() {
        if (activity != null) {
            // Hide the navigation bar by setting the visibility of the decor view
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
            activity.getWindow().getDecorView().setSystemUiVisibility(uiOptions);
        }
    }

    @SimpleFunction(description = "Hide the status bar at the top of the screen.")
    public void HideStatusBarHP() {
        if (activity != null) {
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            activity.getWindow().getDecorView().setSystemUiVisibility(uiOptions);
        }
    }

    @SimpleFunction(description = "Set the expected app signature.")
    public void SetExpectedSignature(String signature) {
        expectedSignature = signature; // Set nilai tanda tangan yang diharapkan
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b: bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }

    @SimpleFunction(description = "Returns true if a package (app) is installed and enabled.")
    public boolean IsPackageInstalledPM(String packageName) {
        PackageManager packageManager = container.$form().getPackageManager();
        try {
            ApplicationInfo appInfo = packageManager.getApplicationInfo(packageName, 0);
            return appInfo.enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    @SimpleFunction(description = "Check if an app is installed based on its package name.")
    public boolean IsAppInstalledPM(String packageName) {
        PackageManager packageManager = container.$form().getPackageManager();
        try {
            packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            return true; // App is installed
        } catch (NameNotFoundException e) {
            return false; // App is not installed
        }
    }

    @SimpleFunction(description = "Get the signature of the APK.")
    public String GetAPKSignature() {
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(
                activity.getPackageName(),
                PackageManager.GET_SIGNATURES
            );
            for (Signature signature: packageInfo.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                return Base64.encodeToString(md.digest(), Base64.DEFAULT);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    @DesignerProperty(defaultValue = "True", editorType = "boolean")
    public void AllowScreenshotsUser(boolean allow) {
        if (allow) {
            // Clear the flag to allow screenshots
            activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
        } else {
            // Set the flag to disallow screenshots
            activity.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_SECURE,
                WindowManager.LayoutParams.FLAG_SECURE
            );
        }
    }

    @SimpleFunction(description = "Run an app based on its package name.")
    public void RunApp(String packageName) {
        PackageManager packageManager = activity.getPackageManager();
        Intent intent = packageManager.getLaunchIntentForPackage(packageName);

        if (intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(intent);
        } else {
            // Handle case where the app is not found
        }
    }

    @SimpleFunction
    public void CloseAppOnRecentPressed() {
        unregisterRecentNavbarReceiver();
        if (activity != null) {
            activity.finishAffinity();
        }
    }
    @SimpleFunction
    public float GetWindowBrightness() {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (attributes.screenBrightness == -1.0f) {
            return -1.0f;
        }
        return attributes.screenBrightness * 100.0f;
    }
    @SimpleFunction
    public boolean IsConnectedNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities != null && (networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_VPN));
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
    @SimpleFunction
    public String Mode() {

        ActivityManager am = (ActivityManager) activity.getSystemService("activity");
        int state = -1;

        if (Build.VERSION.SDK_INT >= 23) {
            state = am.getLockTaskModeState();
        }

        switch (state) {
        case ActivityManager.LOCK_TASK_MODE_NONE:
            return "None";
        case ActivityManager.LOCK_TASK_MODE_LOCKED:
            return "Locked";
        case ActivityManager.LOCK_TASK_MODE_PINNED:
            return "Pinned";
        default:
            return "Unknown";
        }
    }
    @SimpleFunction
    public void SetWindowBrightness(float f) {
        float brightness = f;
        if (brightness >= 1.0f && brightness <= 100.0f) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.screenBrightness = brightness / 100.0f;
            activity.getWindow().setAttributes(attributes);
        }
    }
    @SimpleFunction
    public void StartLockTask() {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startLockTask();
        }

    }

    @SimpleEvent(description = "Fires when Progress changed.")
    public void OnProgressChanged(int newProgress) {
        EventDispatcher.dispatchEvent(this, "OnProgressChanged", newProgress);
    }

    @SimpleProperty
    public int getSdkVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @SimpleFunction
    public void StopLockTask() {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.stopLockTask();
        }
    }
    @SimpleFunction
    public void addAppToRecent() {
        ActivityManager activityManager = (ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager != null) {
            List < ActivityManager.AppTask > appTasks = activityManager.getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                appTasks.get(0).setExcludeFromRecents(false);
            }
        }
    }

    @SimpleFunction
    public boolean isKioskModeActive() {
        return false;
    }

    @SimpleFunction
    public void onBackPressed() {}
    @SimpleFunction
    public void onWindowFocusChanged(boolean z) {
        if (!z) {
            Intent closeSystemDialogsIntent = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
            if (Build.VERSION.SDK_INT >= 21) {
                closeSystemDialogsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            }
            activity.sendBroadcast(closeSystemDialogsIntent);
        }
    }
    @SimpleFunction
    public void removeAppFromRecent() {
        ActivityManager activityManager = (ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager != null) {
            List < ActivityManager.AppTask > appTasks = activityManager.getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                appTasks.get(0).setExcludeFromRecents(true);
            }
        }
    }
    @SimpleFunction
    public void setHideFromRecent(boolean hide) {
        hideFromRecent = hide;
    }
    public void unregisterRecentNavbarReceiver() {
        if (context != null && broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    @SimpleProperty(description = "brightness (a value between 0 and 255)")
    public int Brightness() {
        int brightness = Settings.System.getInt(this.contentResolver, "screen_brightness", 0);
        Log.d(LOG_TAG, "Brightness (get): " + brightness);
        return brightness;
    }
    @SimpleFunction(description = "Play audio from a specified path.")
    public void PlayAudioPath(String audioPath) {
        try {
            boolean isAsset;

            try {
                this.context.getAssets().open(audioPath).close();
                isAsset = true;
            } catch (IOException e) {
                isAsset = false;
            }

            if (isAsset) {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioAttributes(
                    new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build());

                try {
                    AssetFileDescriptor assetFileDescriptor = this.context.getAssets().openFd(audioPath);
                    mediaPlayer.setDataSource(
                        assetFileDescriptor.getFileDescriptor(),
                        assetFileDescriptor.getStartOffset(),
                        assetFileDescriptor.getLength());
                    mediaPlayer.prepare();
                    mediaPlayer.start(); // Start audio playback
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            // Perform any action when audio playback is completed
                        }
                    });
                }
            } else {
                if (audioPath.startsWith("/")) {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setAudioAttributes(
                        new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build());

                    try {
                        mediaPlayer.setDataSource(audioPath);
                        mediaPlayer.prepare();
                        mediaPlayer.start(); // Start audio playback
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                // Perform any action when audio playback is completed
                            }
                        });
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SimpleProperty(description = "Source of the audio path.")
    public String AudioPathSource() {
        return audioPathSource;
    }
    @DesignerProperty(editorType = PropertyTypeConstants.PROPERTY_TYPE_ASSET, defaultValue = "")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void SetAudioPathSource(String source) {
        // You may want to add validation or additional logic here
        audioPathSource = source;
    }
    @SimpleProperty(description = "whether User Interface shoud be showed while setting the volume.")
    public boolean ShowUI() {
        return this.showUI;
    }

    @DesignerProperty(defaultValue = "True", editorType = "boolean")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void ShowUI(boolean showUI2) {
        this.showUI = showUI2;
    }

    @SimpleProperty(description = "media volume in percent.")
    public int VolumeMusic() {
        return getVolume(3);
    }

    @SimpleProperty(description = "ringtone volume in percent.")
    public int VolumeRing() {
        return getVolume(2);
    }

    @SimpleProperty(description = "notification volume in percent.")
    public int VolumeAlarm() {
        return getVolume(4);
    }

    private int getVolume(int type) {
        int maxVolume = this.audioManager.getStreamMaxVolume(type);
        int currentVolume = this.audioManager.getStreamVolume(type);
        int percent = (currentVolume * 100) / maxVolume;
        Log.d(LOG_TAG, "getVolume,  percent= " + currentVolume + " * 100 / " + maxVolume + " = " + percent);
        return percent;
    }

    @DesignerProperty(defaultValue = "82", editorType = "non_negative_integer")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void VolumeMusic(int percent) {
        setVolume(percent, 3);
    }

    @DesignerProperty(defaultValue = "82", editorType = "non_negative_integer")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void VolumeRing(int percent) {
        if (Build.VERSION.SDK_INT < 28) {
            setVolume(percent, 2);
        }
    }

    @DesignerProperty(defaultValue = "82", editorType = "non_negative_integer")
    @SimpleProperty(category = PropertyCategory.BEHAVIOR)
    public void VolumeAlarm(int percent) {
        setVolume(percent, 4);
    }

    private void setVolume(int percent, int type) {
        if (percent < 0) {
            percent = 0;
        } else if (percent > 255) {
            percent = 100;
        }
        int flagShowUi = this.showUI ? 1 : 0;
        int maxVolume = this.audioManager.getStreamMaxVolume(type);
        int newVolume = (maxVolume * percent) / 100;
        Log.d(LOG_TAG, "setVolume, newVolume: " + maxVolume + " * " + percent + " / 100 = " + newVolume);
        this.audioManager.setStreamVolume(type, newVolume, flagShowUi);
    }

    @SimpleFunction(description = "Get current ringtone. Type can be RINGTONE, NOTIFICATION or ALARM.")
    public String RingtoneGet(String type) {
        Log.d(LOG_TAG, "RingtoneGet, type: " + type);
        setRingtone(type);
        return this.ringtone.getTitle(this.context);
    }

    @SimpleFunction(description = "Play ringtone. Type can be RINGTONE, NOTIFICATION or ALARM.")
    public void RingtonePlay(String type) {
        Log.d(LOG_TAG, "RingtonePlay, type: " + type);
        if (this.ringtone != null) {
            this.ringtone.stop();
        }
        setRingtone(type);
        this.ringtone.play();
    }

    @SimpleFunction(description = "Stop currently playing ringtone.")
    public void RingtoneStop() {
        Log.d(LOG_TAG, "RingtoneStop");
        if (this.ringtone != null) {
            this.ringtone.stop();
        }
    }

    private void setRingtone(String type) {
        Uri uri;
        if (type.equals("NOTIFICATION")) {
            Log.d(LOG_TAG, "setRingtone, NOTIFICATION");
            uri = RingtoneManager.getActualDefaultRingtoneUri(this.context, 2);
        } else if (type.equals("ALARM")) {
            Log.d(LOG_TAG, "setRingtone, ALARM");
            uri = RingtoneManager.getActualDefaultRingtoneUri(this.context, 4);
        } else {
            Log.d(LOG_TAG, "setRingtone, RINGTONE");
            uri = RingtoneManager.getActualDefaultRingtoneUri(this.context, 1);
        }
        this.ringtone = RingtoneManager.getRingtone(this.context, uri);
    }


    private static String fileExtension(String name) {
        int idx = name.lastIndexOf(46);
        if (idx == -1 || idx == name.length() - 1) {
            return "";
        }
        return name.substring(idx + 1, name.length());
    }

    @SimpleProperty(description = "brightness mode (MANUAL or AUTO)")
    public String BrightnessMode() {
        int brightnessMode = Settings.System.getInt(this.contentResolver, "screen_brightness_mode", 0);
        Log.d(LOG_TAG, "BrightnessMode (get): " + brightnessMode);
        return brightnessMode == 1 ? "AUTO" : "MANUAL";
    }

    @SimpleProperty
    public float FontScale() {
        Log.d(LOG_TAG, "FontScale");
        return Settings.System.getFloat(this.activity.getContentResolver(), "font_scale", 1.0f);
    }
    private class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {

            if (Build.VERSION.SDK_INT >= 21) {
                Intent closeDialogsIntent = new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS");
                closeDialogsIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.sendBroadcast(closeDialogsIntent);
            }
        }
    }
    private final BroadcastReceiver batteryReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            updateBatteryInfo(intent);
        }
    };

 }
