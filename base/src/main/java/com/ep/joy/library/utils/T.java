package com.ep.joy.library.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * author  Joy
 * Date:  2016/9/17 0017.
 * version:  V1.0
 * Description:
 */
public class T {
    private static Context sContext;
    private static Toast sToast;

    public static void init(Context context)
    {
        sContext = context.getApplicationContext();
        sToast = Toast.makeText(sContext, "", Toast.LENGTH_SHORT);
    }

    private static void check() {
        if (sContext == null) {
            throw new NullPointerException(
                    "Must initial call ToastUtils.register(Context context) in your " +
                            "<? " +
                            "extends Application class>");
        }
    }




    public static void s(String msg)
    {
        check();
        sToast.setText(msg);
        sToast.setDuration(Toast.LENGTH_SHORT);
        sToast.show();
    }


    public static void l(String msg)
    {
        check();
        sToast.setText(msg);
        sToast.setDuration(Toast.LENGTH_LONG);
        sToast.show();
    }
}
