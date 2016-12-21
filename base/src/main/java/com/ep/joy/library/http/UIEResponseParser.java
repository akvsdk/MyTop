package com.ep.joy.library.http;

import com.ep.joy.library.utils.ClassUtils;
import com.google.gson.Gson;

import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

import java.lang.reflect.Type;
import java.util.List;


/**
 * @author Joy
 */
public class UIEResponseParser implements ResponseParser {
    //检查服务器返回的响应头信息
    @Override
    public void checkResponse(UriRequest request) throws Throwable {
    }

    /**
     * 转换result为resultType类型的对象
     *
     * @param resultType  返回值类型(可能带有泛型信息)
     * @param resultClass 返回值类型
     * @param result      字符串数据
     * @return
     * @throws Throwable
     */
    @Override
    public Object parse(Type resultType, Class<?> resultClass, String result) throws Throwable {
        Class s = ClassUtils.getType(resultType);
        if (s == List.class) {
            return getListFromJSON(result, resultType);
        } else if (s == Object.class) {
            return getObjFromJSON(result, resultType);
        } else {
            throw new Exception("解析错误");
        }

    }

    private <T> UIEResult<T> getObjFromJSON(String str, Type type) {
        UIEResult<T> obj = new Gson().fromJson(str, type);
        return obj;
    }

    private <T> UIEResult<List<T>> getListFromJSON(String str, Type type) {
        UIEResult<List<T>> list = new Gson().fromJson(str, type);
        return list;
    }
}
