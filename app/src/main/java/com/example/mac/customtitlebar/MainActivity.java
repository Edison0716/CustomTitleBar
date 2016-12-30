package com.example.mac.customtitlebar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    public void onTitleBarBtnClick(View v){
        Toast.makeText(getApplicationContext(),"finish",Toast.LENGTH_LONG).show();
    }
}
