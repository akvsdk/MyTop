package com.ep.jyq.mytop;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ep.joy.library.base.ToolbarActvitiy;
import com.ep.joy.library.http.GlideProxy;
import com.ep.joy.library.http.JsonResult;
import com.ep.joy.library.http.NetParams;
import com.ep.joy.library.http.UIEResult;
import com.ep.joy.library.http.XUtil;
import com.ep.joy.library.utils.SPUtil;
import com.ep.joy.library.utils.T;
import com.ep.jyq.mytop.bean.EEE;
import com.ep.jyq.mytop.bean.Login;
import com.ep.jyq.mytop.bean.Todo;
import com.ep.jyq.mytop.bean.Wea;
import com.ep.jyq.mytop.lister.MyCallBack;
import com.ep.jyq.mytop.lister.UIECallBack;
import com.ep.jyq.mytop.utils.Constant;

import org.xutils.common.util.LogUtil;
import org.xutils.http.cookie.DbCookieStore;

import java.net.HttpCookie;
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
    private String urlLogin = "http://219.153.5.3:6690/uie3/upc/login.action";
    private String todoURL = "http://219.153.5.3:6690/uie3/blm/Todo!findByPage.action";
    private String myCookie = "";

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
        // getwea();
        //showLoading();
        login();
    }

    public void gogo(View v) {

        getlogin();
    }

    private void getlogin() {
        Map<String, Object> map = new HashMap<>();
        map.put("pageSize", "5");
        map.put("pageNo", "1");
        NetParams params = new NetParams(todoURL,map);
        XUtil.Post(params, new UIECallBack<UIEResult<Todo>>(this) {

            @Override
            protected void onSuccess(UIEResult<Todo> result, boolean isCache) {
                Toast.makeText(TestAc.this, result.getResult().getRows().get(0).getActivity().getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void login() {
        Map<String, Object> map = new HashMap<>();
        map.put("tj_username", "oatest1");
        map.put("tj_password", "000000");
        map.put("json", "1");
        map.put("_jtype", "json");
        map.put("skipHtml", "1");
        map.put("role", "mobile");
        XUtil.Post(urlLogin, map, new UIECallBack<UIEResult<Login>>(this) {

            @Override
            protected void onSuccess(UIEResult<Login> result, boolean isCache) {
                DbCookieStore instance = DbCookieStore.INSTANCE;
                List<HttpCookie> cookies = instance.getCookies();
                for (HttpCookie cookie:cookies){
                    String name =   cookie.getName();
                    String value =   cookie.getValue();
                    if("JSESSIONID".equals(name)){
                        myCookie =value;
                        SPUtil.setValue(TestAc.this,Constant.COOKIE_NAME,myCookie);
                        Constant.cookie = myCookie;
                        LogUtil.e(myCookie);
                        break;
                    }
                }

                T.l(result.getResult().getCname());
            }
        });

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
