package com.bima.bimaaix;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.appinventor.components.common.ScreenOrientation;

import java.lang.reflect.Field;
import java.util.Map;

public  class fixer  {

    static boolean check = false;

    public static void OriFix(Context context) {
        if (check) {
            return;
        }
        check = true;
        try {
            Field[] fields = ScreenOrientation.class.getDeclaredFields();
            int i = 0;
            while (i < fields.length) {
                Field field = fields[i];
                if (field.getType().equals(Map.class)) {
                    field.setAccessible(true);
                    Map map = (Map) field.get(ScreenOrientation.class);
                    map.replace("unspecified", ScreenOrientation.User);
                    field.set(ScreenOrientation.class, map);
                    break;
                }
                i++;
            }
            if (i < fields.length) {
                Application application = (Application) context.getApplicationContext();
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    @Override
                    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
                    }

                    @Override
                    public void onActivityStarted(@NonNull Activity activity) {

                    }

                    @Override
                    public void onActivityResumed(@NonNull Activity activity) {

                    }

                    @Override
                    public void onActivityPaused(@NonNull Activity activity) {

                    }

                    @Override
                    public void onActivityStopped(@NonNull Activity activity) {

                    }

                    @Override
                    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

                    }

                    @Override
                    public void onActivityDestroyed(@NonNull Activity activity) {

                    }
                });
            }
        } catch (Exception e) {
            Log.e("ORI", "", e);
        }
    }


}
