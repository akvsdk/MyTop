package com.ep.joy.library.base;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.ep.joy.library.R;
import com.ep.joy.library.weight.MultipleStatusView;
import com.ep.joy.library.weight.ToolbarX;

import java.lang.reflect.Field;


/**
 * author  Joy
 * Date:  2016/6/13 0013.
 * version:  V1.0
 * Description:
 */
public abstract class ToolbarActvitiy extends AppCompatActivity {
    private MultipleStatusView rlContent;
    protected Toolbar toolbar;
    private ToolbarX mToolbarX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        setContentView(R.layout.baselayout);
        rlContent = (MultipleStatusView) findViewById(R.id.main_multiplestatusview);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (null != extras) {
            getBundleExtras(extras);
        }
        if (null != savedInstanceState) {
            getsavedInstanceState(savedInstanceState);
        }

        if (getContentViewLayoutID() != 0) {
//            View v = getLayoutInflater().inflate(getContentViewLayoutID(), rlContent, false);      //其他布局用法
//            rlContent.addView(v);
            rlContent.showContent(getContentViewLayoutID());
            toolbar.setBackgroundColor(getResources().getColor(R.color.md_indigo_500));
            mToolbarX = new ToolbarX(toolbar, this);
            initTranslucentBars();          //沉浸

        } else {
            throw new IllegalArgumentException("You must return a right contentView layout resource Id");
        }
        initViewsAndEvents();
    }


    public ToolbarX getToolbar() {
        if (null == mToolbarX) {
            mToolbarX = new ToolbarX(toolbar, this);
        }

        return mToolbarX;
    }

    public void hideToolbar() {
        if (mToolbarX.isShowing())
            mToolbarX.hide();
    }


    public void showToolbar() {
        if (!mToolbarX.isShowing())
            mToolbarX.show();
    }


    private void initTranslucentBars() {
        //当系统版本为4.4或者4.4以上时可以使用沉浸式状态栏
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            LinearLayout linear_bar = (LinearLayout) findViewById(R.id.linear_bar);
            linear_bar.setVisibility(View.GONE);   //// TODO: 2016/6/24  
            int statusHeight = getStatusBarHeight();
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) linear_bar.getLayoutParams();
            params.height = statusHeight;
            linear_bar.setLayoutParams(params);
        }
    }

    /**
     * show Snackbar
     *
     * @param msg
     */
    public void showSnackbar(String msg) {
        //防止遮盖虚拟按键
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (null != msg && !TextUtils.isEmpty(msg)) {
                Snackbar.make(rlContent, msg, Snackbar.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * show toast
     *
     * @param msg
     */
    protected void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


    /**
     * startActivity
     *
     * @param clazz
     */
    protected void readyGo(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);
    }

    /**
     * startActivity with bundle
     *
     * @param clazz
     * @param bundle
     */
    protected void readyGo(Class<?> clazz, Bundle bundle) {
        Intent intent = new Intent(this, clazz);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);
    }

    /**
     * startActivity then finish
     *
     * @param clazz
     */
    protected void readyGoThenKill(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);
    }


    /**
     * startActivity with bundle then finish
     *
     * @param clazz
     * @param bundle
     */
    protected void readyGoThenKill(Class<?> clazz, Bundle bundle) {
        Intent intent = new Intent(this, clazz);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);
        BaseAppManager.getInstance().removeActivity(this);
    }

    /**
     * startActivityForResult
     *
     * @param clazz
     * @param requestCode
     */
    protected void readyGoForResult(Class<?> clazz, int requestCode) {
        Intent intent = new Intent(this, clazz);
        startActivityForResult(intent, requestCode);
        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);
    }

    /**
     * startActivityForResult with bundle
     *
     * @param clazz
     * @param requestCode
     * @param bundle
     */
    protected void readyGoForResult(Class<?> clazz, int requestCode, Bundle bundle) {
        Intent intent = new Intent(this, clazz);
        if (null != bundle) {
            intent.putExtras(bundle);
        }
        startActivityForResult(intent, requestCode);
        overridePendingTransition(R.anim.anmi_in_right_left, R.anim.anmi_out_right_left);
    }


    protected void getBundleExtras(Bundle extras) {
    }

    protected void getsavedInstanceState(Bundle savedInstanceState) {
    }


    protected abstract int getContentViewLayoutID();

    protected abstract void initViewsAndEvents();

    /**
     * 获取状态栏的高度
     *
     * @return
     */
    private int getStatusBarHeight() {
        try {
            Class<?> c = Class.forName("com.android.internal.R$dimen");
            Object obj = c.newInstance();
            Field field = c.getField("status_bar_height");
            int x = Integer.parseInt(field.get(obj).toString());
            return getResources().getDimensionPixelSize(x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void showLoading() {
        rlContent.showLoading();  //显示加载中视图
    }


    public void showEmpty() {
        rlContent.showEmpty();         //显示空视图

    }

    public void showError() {

        rlContent.showError();   //显示错误视图
    }

    public void showNoNetwork() {

        rlContent.showNoNetwork();  //显示无网络视图
    }

    public void showContent() {
        rlContent.showContent();          //显示内容视图
    }

    protected void setOnRetryClick(View.OnClickListener onRetryClick) {
        rlContent.setOnRetryClickListener(onRetryClick);
    }

    /**
     * 获取当前view的状态
     * MultipleStatusView.STATUS_LOADING   //当前为加载中视图
     * MultipleStatusView.STATUS_EMPTY     //当前为空视图
     * MultipleStatusView.STATUS_ERROR     //当前为错误视图
     * MultipleStatusView.STATUS_NO_NETWORK//当前为无网络视图
     * MultipleStatusView.STATUS_CONTENT   //当前为内容视图
     */
    public int viewStatus() {
        return rlContent.getViewStatus();
    }

}

