package net.bingyan.lxlib;

import android.app.Application;
import android.content.Context;
import android.os.Build;

/**
 * Created by XiaoXu on 2015/12/20.
 */
public class AppContext extends Application {

    private static Context context;
    private static String deviceInfo;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        deviceInfo = Build.MODEL;
    }

    public static Context getContext(){
        return context;
    }

    public static String getDeviceInfo(){
        return deviceInfo;
    }
}
