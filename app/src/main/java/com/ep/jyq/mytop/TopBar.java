package com.ep.jyq.mytop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


/**
 * author   Joy
 * Date:   2015/10/14.
 * version:  V1.0
 * Description:
 */
public class TopBar extends RelativeLayout {
    private LayoutParams mLeftParams, mRightParams, mTitlepParams;
    private Button mLfetButton, mRightButton;
    private TextView mTitleView;
    private float mTitleTextSize;
    private String mLeftText, mRightText, mTitle;
    private Drawable mLeftBackground, mRightBackground;
    private int mLeftTextColor, mRightTextColor, mTitleColor;
    private topbarClickLister mListener;

    public TopBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        //通过这个方法 将attrs.xml 中定义的declare-styleable 所有属性值存到TypedArray中
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.TopBar);
        mLeftTextColor = ta.getColor(R.styleable.TopBar_leftTextColor, 0);
        mLeftBackground = ta.getDrawable(R.styleable.TopBar_leftBackground);
        mLeftText = ta.getString(R.styleable.TopBar_leftText);

        mRightBackground = ta.getDrawable(R.styleable.TopBar_rightBackground);
        mRightText = ta.getString(R.styleable.TopBar_rightText);
        mRightTextColor = ta.getColor(R.styleable.TopBar_rightTextColor, 0);

        mTitleTextSize = ta.getDimension(R.styleable.TopBar_mtitleTextSize, 0);
        mTitleColor = ta.getColor(R.styleable.TopBar_mtitleTextColor, 0);
        mTitle = ta.getString(R.styleable.TopBar_mtitle);
        //完成资源回收，防止重新创建时错误
        ta.recycle();
        mLfetButton = new Button(context);
        mRightButton = new Button(context);
        mTitleView = new TextView(context);
        //为组件赋值
        mLfetButton.setText(mLeftText);
        mLfetButton.setTextColor(mLeftTextColor);
        mLfetButton.setBackground(mLeftBackground);

        mRightButton.setText(mRightText);
        mRightButton.setTextColor(mRightTextColor);
        mRightButton.setBackground(mRightBackground);

        mTitleView.setText(mTitle);
        mTitleView.setTextColor(mTitleColor);
        mTitleView.setTextSize(mTitleTextSize);
        mTitleView.setGravity(Gravity.CENTER);
        //为组件元素设置相应的布局元素
        mLeftParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
        mLeftParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, TRUE);
        addView(mLfetButton, mLeftParams);
        mRightParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
        mRightParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, TRUE);
        addView(mRightButton, mRightParams);

        mTitlepParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
        mTitlepParams.addRule(RelativeLayout.CENTER_IN_PARENT, TRUE);
        addView(mTitleView, mTitlepParams);

        mLfetButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.leftClick();
            }
        });
        mRightButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.rightClick();
            }
        });
    }

    /**
     * 接口对象实现回调机制
     * 在回调方法中通过映射的接口对象调用接口中的方法
     * 不用考虑如何实现，具体的实现由调用者创建
     */
        public interface topbarClickLister {

        void leftClick();

        void rightClick();
    }


    /**
     * id     (0,1) (左，右)
     *
     * flage    (true,flase)(显示，隐藏)
     *
     */
    public void setOnTopbarClickListener(topbarClickLister mListener) {
        this.mListener = mListener;
    }


    public void setButtonVisable(int id, boolean flage) {
        if (flage) {
            if (id == 0) {
                mLfetButton.setVisibility(View.VISIBLE);
            } else {
                mRightButton.setVisibility(View.VISIBLE);
            }

        } else {
            if (id == 0) {
                mLfetButton.setVisibility(View.GONE);
            } else {
                mRightButton.setVisibility(View.GONE);
            }
        }
    }

    public void setLfetButtontext(String leftText){
        mLfetButton.setText(leftText);
    }
    public void setRightButtontext(String rightText){
        mRightButton.setText(rightText);
    }
    public void setTitletext(String title){
        mTitleView.setText(title);
    }
}
