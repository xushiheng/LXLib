package net.bingyan.lxlib.util;

import android.util.Log;

/**
 * LogCat工具类
 * Created by XiaoXu on 2015/7/10.
 */
public class Loger {

    private static final boolean DEBUG = true;

    public static boolean isDebug(){
        return DEBUG;
    }

    public static void e(String s) {
        if(DEBUG){
            Log.e("Loger", s);
        }
    }

    public static void e(int a) {
        if(DEBUG){
            Log.e("Loger", String.valueOf(a));
        }
    }

    public static void e(boolean b) {
        if(DEBUG){
            Log.e("Loger", String.valueOf(b));
        }
    }

    public static void e(String tag, String s) {
        if(DEBUG){
            Log.e(tag, s);
        }
    }

    public static void e(String tag, int a) {
        if(DEBUG){
            Log.e(tag, String.valueOf(a));
        }
    }

    public static void e(String tag, boolean b) {
        if(DEBUG){
            Log.e(tag, String.valueOf(b));
        }
    }

    public static void e(int a,int b){
        if(DEBUG){
            Log.e(String.valueOf(a), String.valueOf(b));
        }
    }
}
