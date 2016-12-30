package com.example.mac.customtitlebar;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mac on 16/12/30.
 */

public class MyTitleBar extends FrameLayout {

    // 左边的返回键
    private ImageButton mIvBtnBack;
    // 标题文字
    private TextView mTvTitle;
    // 右边的按钮
    private Button mBtnRight;
    public MyTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.titlebar_back_title_btn, this);
        mIvBtnBack = (ImageButton) findViewById(R.id.titleBar_btn_back);
        mTvTitle = (TextView) findViewById(R.id.titleBar_title);
        mBtnRight = (Button) findViewById(R.id.titleBar_btn_ok);

        /*得到属性*/
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyTitleBar);
        try {
            String titleText = typedArray.getString(R.styleable.MyTitleBar_mtb_title);
            mTvTitle.setText(titleText);
            String btnText = typedArray.getString(R.styleable.MyTitleBar_mtb_btn_text);
            mBtnRight.setText(btnText);
        } finally {
            typedArray.recycle();
        }
        // 左边按钮的监听事件
        mIvBtnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();//finish掉Activity
            }
        });
    }
    /**
     * 重新设置左边按钮的点击事件监听器
     */
    public void setBtnBckClickListener(View.OnClickListener listener) {
        mIvBtnBack.setOnClickListener(listener);
    }
    public void setRightBtnVisibility(int v){
        mBtnRight.setVisibility(v);
    }


}
