package com.suafer.polimat;

import android.app.Activity;
import android.os.*;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class Levelmenu extends Activity {

    private LinearLayout linear1;
    private ImageView imageview1;
    private LinearLayout linear2;
    private TextView textview1;
    private LinearLayout linear25;
    private TextView textview2;
    private LinearLayout linear29;
    private TextView textview3;
    private LinearLayout linear31;
    private LinearLayout linear28;
    private ImageView imageview2;
    private LinearLayout linear30;
    private ImageView imageview3;
    private LinearLayout linear32;
    private ImageView imageview4;

    private Intent i = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_levelmenu);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        imageview1 = (ImageView) findViewById(R.id.imageview1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        textview1 = (TextView) findViewById(R.id.textview1);
        linear25 = (LinearLayout) findViewById(R.id.linear25);
        textview2 = (TextView) findViewById(R.id.textview2);
        linear29 = (LinearLayout) findViewById(R.id.linear29);
        textview3 = (TextView) findViewById(R.id.textview3);
        linear31 = (LinearLayout) findViewById(R.id.linear31);
        linear28 = (LinearLayout) findViewById(R.id.linear28);
        imageview2 = (ImageView) findViewById(R.id.imageview2);
        linear30 = (LinearLayout) findViewById(R.id.linear30);
        imageview3 = (ImageView) findViewById(R.id.imageview3);
        linear32 = (LinearLayout) findViewById(R.id.linear32);
        imageview4 = (ImageView) findViewById(R.id.imageview4);

        linear28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Sudoky.class);
                startActivity(i);
            }
        });

        linear30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Math.class);
                startActivity(i);
            }
        });

        linear32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Victorini.class);
                startActivity(i);
            }
        });
    }
    private void initializeLogic() {
    }

}