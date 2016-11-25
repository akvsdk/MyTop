package com.ep.jyq.mytop;


import android.widget.TextView;

import com.ep.joy.library.base.ToolbarActvitiy;
import com.zzhoujay.richtext.RichText;


/**
 * author   Joy
 * Date:  2016/10/9.
 * version:  V1.0
 * Description:
 */

public class WebActivity extends ToolbarActvitiy {
    private String content;
    private TextView mTextView;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.web;
    }

    @Override
    protected void initViewsAndEvents() {
        mTextView = (TextView) findViewById(R.id.text);
        content = "<p>\n" +
                "\t<span style=\"font-size: 21px\"><span style=\"font-family: 仿宋\">各加油站：</span></span></p>\n" +
                "<p>\n" +
                "\t<span style=\"font-size: 21px\"><span style=\"font-family: 仿宋\">&nbsp;&nbsp;&nbsp; 多渠道支付系统消费端目前已在所有加油站部署成功，加油站前台POS会有一个宝石花图标，由于目前多渠道支付系统还在测试阶段，请各加油站不要使用多渠道支付系统进行支付，如未按要求进行操作，导致对账不平，将由加油站承担差异金额。多渠道支付由公司测试成功后，业务部门通知正式启用再开始使用。</span></span></p>\n" +
                "<p>\n" +
                "\t<span style=\"font-size: 21px\"><span style=\"font-family: 仿宋\">&nbsp;&nbsp;&nbsp; 多渠道支付未启用之前，各加油站可在前台退出多渠道支付程序，退出步骤：在POS桌面上依次打开&ldquo;我的电脑&rdquo;-D盘-&ldquo;TPC&rdquo;文件夹-双击&ldquo;退出多渠道&rdquo;。（个别加油站POS上只有一个C盘，退出步骤为：在POS桌面上依次打开&ldquo;我的电脑&rdquo;-C盘-&ldquo;TPC&rdquo;文件夹-双击&ldquo;退出多渠道&rdquo;。）</span></span></p>\n" +
                "<p>\n" +
                "\t<span style=\"font-size: 21px\"><span style=\"font-family: 仿宋\">&nbsp;&nbsp;&nbsp; 特此通知。</span></span></p>\n" +
                "<p>\n" +
                "\t<span style=\"font-size: 20px\"><span style=\"font-family: 宋体\"><span mso-hansi-font-family:=\"\" new=\"\" times=\"\"><img alt=\"\" src=\"/ext/150728/96e32784e0c73403aee48fefa079e1fd.jpg\" style=\"width: 497px; height: 497px\" /><img alt=\"\" src=\"/uie3/sm/CkeditorAttachment!viewImage.action?sid=3000478\" style=\"width: 583px; height: 800px\" /></span></span></span></p>\n";

        RichText.from(content).into(mTextView);
    }
}
