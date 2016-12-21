package com.ep.jyq.mytop.utils;


import com.ep.joy.library.utils.L;
import com.ep.joy.library.utils.SPUtil;
import com.ep.jyq.mytop.App;

import org.xutils.http.RequestParams;

import java.util.Map;


/**
 * author  Joy
 * Date:  2016/12/21 0021.
 * version:  V1.0
 * Description:
 */
public class NetParams extends RequestParams {


    public NetParams(String url, Map<String, Object> map, boolean isCooKie) {
        super(url);
        setConnectTimeout(30 * 1000);
        if (null != map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                addParameter(entry.getKey(), entry.getValue());
            }
        }
        //登陆接口 和不需要CooKie的接口
        if (isCooKie) {
            Constant.cookie = SPUtil.getString(App.getContext(), SPUtil.Cookie, "");
            addHeader("Cookie", "JSESSIONID=" + Constant.cookie);
            L.e(Constant.cookie);
            setUseCookie(false);
            addHeader("Content-Type", "application/json;charset=UTF-8");
        } else {
            setUseCookie(true);
        }

    }

    public NetParams(String url, Map<String, Object> map) {
        super(url);
        setCacheMaxAge(0);
        setConnectTimeout(30 * 1000);
        if (null != map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                addParameter(entry.getKey(), entry.getValue());
            }
        }
        addParameter("json", "1");
        addParameter("_jtype", "json");
        Constant.cookie = SPUtil.getString(App.getContext(), SPUtil.Cookie, "");
        addHeader("Cookie", "JSESSIONID=" + Constant.cookie);
        L.e(Constant.cookie);
        setUseCookie(false);
        addHeader("Content-Type", "application/json;charset=UTF-8");

    }
}