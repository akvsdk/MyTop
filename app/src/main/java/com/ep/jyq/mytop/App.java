package com.ep.jyq.mytop;

import android.app.Application;
import android.content.Context;

import org.xutils.x;

/**
 * author   Joy
 * Date:  2016/7/1.
 * version:  V1.0
 * Description:
 */
public class App extends Application {
    private static Context mContext;

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        x.Ext.init(this);
        x.Ext.setDebug(true); // 是否输出debug日志
    }
}
