package com.ep.jyq.mytop.lister;


import com.ep.joy.library.base.ToolbarActvitiy;
import com.ep.joy.library.http.JsonResult;
import com.ep.joy.library.utils.L;
import com.ep.joy.library.utils.NetWorkUtil;
import com.ep.joy.library.weight.MultipleStatusView;
import com.ep.jyq.mytop.App;

import org.xutils.common.Callback;

import java.net.ConnectException;
import java.net.SocketTimeoutException;


public abstract class MyCallBack<ResultType extends JsonResult> implements Callback.CacheCallback<ResultType> {
    private ToolbarActvitiy mContext;
    private Boolean isCache = false;
    private Boolean isshowing = true;

    public MyCallBack(ToolbarActvitiy context) {
        mContext = context;
        if (NetWorkUtil.isNetConnected(App.getContext()) && isshowing) {
            mContext.showLoading();
        }
    }

    public MyCallBack(ToolbarActvitiy context, boolean isshowing) {
        mContext = context;
        this.isshowing = isshowing;
        if (NetWorkUtil.isNetConnected(App.getContext()) && isshowing) {
            mContext.showLoading();
        }
    }

    @Override
    public void onSuccess(ResultType result) {
        if (isCache) {
            isCache = false;
        } else if (result.getErrMsg().isEmpty() && result.getRetMsg().equals("success")) {
            onSuccess(result, isCache);
        } else if (!result.getErrMsg().isEmpty()) {
            mContext.showError();
            mContext.showSnackbar(result.getErrMsg());
        } else {
            mContext.showError();
            mContext.showSnackbar(result.getRetMsg());
        }
    }

    private void doCancel() {
        if (mContext.viewStatus() != MultipleStatusView.STATUS_EMPTY && mContext.viewStatus() != MultipleStatusView.STATUS_ERROR && mContext.viewStatus() != MultipleStatusView.STATUS_NO_NETWORK)
            mContext.showContent();
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        //可以根据公司的需求进行统一的请求网络失败的逻辑处理
        L.e(ex, "HTTP ERROR");
        if (!NetWorkUtil.isNetConnected(App.getContext())) {
            mContext.showNoNetwork();
            mContext.showSnackbar("请检查网络链接");
        } else if (ex instanceof SocketTimeoutException) {
            mContext.showSnackbar("网络中断，请检查您的网络状态");
        } else if (ex instanceof ConnectException) {
            mContext.showSnackbar("网络中断，请检查您的网络状态");
        } else if (ex instanceof RuntimeException) {
            mContext.showSnackbar("运行时错误!");
        } else {
            mContext.showError();
            mContext.showSnackbar(ex.getMessage());
        }
    }

    @Override
    public void onCancelled(CancelledException cex) {
        doCancel();
    }

    @Override
    public void onFinished() {
        doCancel();
    }


    @Override
    public boolean onCache(ResultType result) {
        isCache = true;
        if (result.getErrMsg().equals("success")) {
            onSuccess(result, true);
            return true;
        } else {
            isCache = false;
            return false;
        }


    }


    protected abstract void onSuccess(ResultType result, boolean isCache);


}
