package com.ep.jyq.mytop;

import com.ep.joy.library.base.BaseApplication;
import com.ep.joy.library.utils.L;

import org.xutils.x;

/**
 * author   Joy
 * Date:  2016/7/1.
 * version:  V1.0
 * Description:
 */
public class App extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.setDebug(true); // 是否输出debug日志
        L.logInit(BuildConfig.DEBUG);
    }
}
