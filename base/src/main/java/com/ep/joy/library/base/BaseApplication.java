package com.ep.joy.library.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.support.multidex.MultiDex;

import com.ep.joy.library.utils.BaseDbHelper;
import com.ep.joy.library.utils.T;

import org.xutils.x;

import io.realm.Realm;

/**
 * APPLICATION
 */
public class BaseApplication extends Application {

    private static BaseApplication baseApplication;
    private BaseDbHelper dbHelper;

    @Override
    public void onCreate() {

        super.onCreate();
        baseApplication = this;
        x.Ext.init(this);
        T.init(this);
        Realm.init(this);
        dbHelper = new BaseDbHelper("Joy.realm", 1, null);
    }

    public static Context getContext() {
        return baseApplication;
    }

    public static Resources getAppResources() {
        return baseApplication.getResources();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    /**
     * 分包
     *
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}
