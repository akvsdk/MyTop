package com.ep.jyq.mytop;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ep.joy.library.base.ToolbarActvitiy;
import com.ep.joy.library.http.GlideProxy;
import com.ep.joy.library.http.JsonResult;
import com.ep.joy.library.http.XUtil;
import com.ep.joy.library.utils.T;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author   Joy
 * Date:  2016/6/30.
 * version:  V1.0
 * Description:
 */
public class TestAc extends ToolbarActvitiy {

    private String url = "http://apis.baidu.com/apistore/mobilenumber/mobilenumber";
    private String url2 = "http://apis.baidu.com/apistore/weatherservice/citylist";

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.main;
    }

    @Override
    protected void initViewsAndEvents() {
        ImageView view = (ImageView) findViewById(R.id.img);
        GlideProxy.getInstance().loadImage(this, "http://m.xxxiao.com/wp-content/uploads/sites/3/2015/04/m.xxxiao.com_ab1337cd6ef598f2d6769702f4f2f83a-760x500.jpg", view);
        getToolbar().setDisplayHomeAsUpEnabled(false).setSubTitle("首页");
        setOnRetryClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // dohttp();
            }
        });
    }

    public void go(View v) {
        // dohttp();
        getwea();
        //showLoading();
    }


    private void getwea() {
        Map<String, String> map = new HashMap<>();
        map.put("cityname", "重庆");
        XUtil.Get(url2, map, new MyCallBack<JsonResult<List<Wea>>>(this) {
            @Override
            protected void onSuccess(JsonResult<List<Wea>> result, boolean isCache) {
                if (isCache)
                    T.l("New Toast,new Cache" + result.getRetData().get(3).getName_cn());
                else
                    T.l("New Toast,No Cache" + result.getRetData().get(3).getName_cn());
            }
        });
    }

    private void dohttp() {
        Map<String, String> map = new HashMap<>();
        map.put("phone", "15723454853");
        XUtil.Get(url, map, new MyCallBack<JsonResult<EEE>>(this) {
            @Override
            protected void onSuccess(JsonResult<EEE> result, boolean isCache) {
                Toast.makeText(TestAc.this, result.getRetData().getProvince(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
