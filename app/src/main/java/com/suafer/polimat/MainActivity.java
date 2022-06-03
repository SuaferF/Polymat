package com.suafer.polimat;

import android.app.Activity;
import android.os.*;
import android.graphics.*;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    private Timer _timer = new Timer();

    private LinearLayout linear1;
    private LinearLayout linear3;
    private LinearLayout linear2;
    private ImageView imageview1;
    private TextView textview1;

    private Intent i = new Intent();
    private TimerTask t;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        imageview1 = (ImageView) findViewById(R.id.imageview1);
        textview1 = (TextView) findViewById(R.id.textview1);
    }

    private void initializeLogic() {
        android.graphics.drawable.GradientDrawable rb1 = new android.graphics.drawable.GradientDrawable(); rb1.setColor(Color.parseColor("#000000"));
        rb1.setCornerRadius(10);
        linear2.setBackground(rb1);
        t = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        i.setClass(getApplicationContext(), Levelmenu.class);
                        startActivity(i);
                    }
                });
            }
        };
        _timer.schedule(t, (int)(2000));
    }

    @Override
    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
        super.onActivityResult(_requestCode, _resultCode, _data);
        switch (_requestCode) {

            default:
                break;
        }
    }
}