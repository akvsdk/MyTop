package com.ep.joy.library.http;

import android.support.annotation.Nullable;

import org.xutils.http.annotation.HttpResponse;


@HttpResponse(parser = JsonResponseParser.class)
public class JsonResult<T> {

    public int errNum;
    public String retMsg;

    @Nullable
    public String errMsg;

    public T retData;

    public T getRetData() {
        return retData;
    }

    public void setRetData(T retData) {
        this.retData = retData;
    }

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }


}
