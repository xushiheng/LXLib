package net.bingyan.lxlib.util;

import android.os.Handler;
import android.widget.Toast;

import net.bingyan.lxlib.AppContext;


/**
 * 封装Toast
 * Created by XiaoXu on 2015/5/9.
 */
public class Toaster {

    private static android.os.Handler handler;

    public static void ShortMsg(String msg) {
        Toast.makeText(AppContext.getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public static void LongMsg(String msg) {
        Toast.makeText(AppContext.getContext(), msg, Toast.LENGTH_LONG).show();
    }

    public static void ShortMsgInThread(final String msg) {
        if(handler==null){
            handler = new Handler();
        }
        handler.post(new Runnable() {
            @Override
            public void run() {
                ShortMsg(msg);
            }
        });
    }

    public static void LongMsgInThread(final String msg) {
        if(handler==null){
            handler = new Handler();
        }
        handler.post(new Runnable() {
            @Override
            public void run() {
                LongMsg(msg);
            }
        });
    }
}
