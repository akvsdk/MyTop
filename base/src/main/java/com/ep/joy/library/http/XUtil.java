package com.ep.joy.library.http;

import org.xutils.common.Callback;
import org.xutils.common.Callback.Cancelable;
import org.xutils.common.Callback.CommonCallback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Map;

public class XUtil {
    /**
     * 发送get请求
     *
     * @param <T>
     */
    public static <T> Cancelable Get(String url, Map<String, String> map, Callback.CacheCallback<T> callback) {
        RequestParams params = new RequestParams(url);
        // params.setCacheMaxAge(Api.CACHETIME); //缓存时间
        params.addHeader("apikey","6813976cf7dce7d2404e456cd56d418f");
        if (null != map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                params.addQueryStringParameter(entry.getKey(), entry.getValue());
            }
        }
        Cancelable cancelable = x.http().get(params, callback);
        return cancelable;
    }

    /**
     * 发送post请求
     *
     * @param <T>
     */
    public static <T> Cancelable Post(String url, Map<String, Object> map, Callback.CacheCallback<T> callback) {
        RequestParams params = new RequestParams(url);
        params.addHeader("apikey","6813976cf7dce7d2404e456cd56d418f");
        // params.setCacheMaxAge(Api.CACHETIME); //缓存时间
        if (null != map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                params.addParameter(entry.getKey(), entry.getValue());
            }
        }
        Cancelable cancelable = x.http().post(params, callback);
        return cancelable;
    }



    /**
     * 发送post请求
     *
     * @param <T>
     */
    public static <T> Cancelable Post(NetParams params, Callback.CacheCallback<T> callback) {

        Cancelable cancelable = x.http().post(params, callback);
        return cancelable;
    }


    /**
     * 上传文件
     *
     * @param <T>
     */
    public static <T> Cancelable UpLoadFile(String url, Map<String, Object> map, CommonCallback<T> callback) {
        RequestParams params = new RequestParams(url);
        if (null != map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                params.addParameter(entry.getKey(), entry.getValue());
            }
        }
        params.setMultipart(true);
        Cancelable cancelable = x.http().get(params, callback);
        return cancelable;
    }

    /**
     * 下载文件
     *
     * @param <T>
     */
    public static <T> Cancelable DownLoadFile(String url, String filepath, CommonCallback<T> callback) {
        RequestParams params = new RequestParams(url);
        //设置断点续传
        params.setAutoResume(true);
        params.setSaveFilePath(filepath);
        Cancelable cancelable = x.http().get(params, callback);
        return cancelable;
    }

}
