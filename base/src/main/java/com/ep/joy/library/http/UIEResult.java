package com.ep.joy.library.http;

import org.xutils.http.annotation.HttpResponse;


@HttpResponse(parser = UIEResponseParser.class)
public class UIEResult<T> {

    public boolean success;
    public String msg;

    public T result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
