package com.ep.jyq.mytop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TopBar mTopBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTopBar= (TopBar) findViewById(R.id.top);
        mTopBar.setButtonVisable(0,true);
        mTopBar.setButtonVisable(1,false);
        mTopBar.setLfetButtontext("返回");
        mTopBar.setRightButtontext("更多");
        mTopBar.setTitletext("content");
        mTopBar.setOnTopbarClickListener(new TopBar.topbarClickLister() {
            @Override
            public void leftClick() {
                mTopBar.setButtonVisable(1, true);
            }

            @Override
            public void rightClick() {
                mTopBar.setButtonVisable(0, false);
                mTopBar.setButtonVisable(1, false);
            }
        });
    }
}
