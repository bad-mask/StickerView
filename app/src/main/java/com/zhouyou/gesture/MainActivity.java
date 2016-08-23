package com.zhouyou.gesture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_gesture).setOnClickListener(this);
        findViewById(R.id.btn_touch_free).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_gesture:
                intent = new Intent(this, GestureZoomActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_touch_free:
                intent = new Intent(this, FreeTouchActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}