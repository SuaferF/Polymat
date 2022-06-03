package com.suafer.polimat;

import android.app.Activity;
import android.os.*;
import android.graphics.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;


public class Sudoky extends Activity {

    private LinearLayout linear1;
    private TextView textview1;
    private LinearLayout linear2;
    private TextView textview2;
    private LinearLayout linear3;
    private LinearLayout linear5;
    private TextView textview4;
    private LinearLayout linear4;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private TextView textview3;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear12;
    private LinearLayout linear13;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    private TextView textview9;
    private LinearLayout linear9;
    private TextView textview5;
    private LinearLayout linear14;
    private TextView textview10;

    private Intent i = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_sudoky);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        textview1 = (TextView) findViewById(R.id.textview1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        textview2 = (TextView) findViewById(R.id.textview2);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        textview4 = (TextView) findViewById(R.id.textview4);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        linear8 = (LinearLayout) findViewById(R.id.linear8);
        textview3 = (TextView) findViewById(R.id.textview3);
        linear10 = (LinearLayout) findViewById(R.id.linear10);
        linear11 = (LinearLayout) findViewById(R.id.linear11);
        linear12 = (LinearLayout) findViewById(R.id.linear12);
        linear13 = (LinearLayout) findViewById(R.id.linear13);
        textview6 = (TextView) findViewById(R.id.textview6);
        textview7 = (TextView) findViewById(R.id.textview7);
        textview8 = (TextView) findViewById(R.id.textview8);
        textview9 = (TextView) findViewById(R.id.textview9);
        linear9 = (LinearLayout) findViewById(R.id.linear9);
        textview5 = (TextView) findViewById(R.id.textview5);
        linear14 = (LinearLayout) findViewById(R.id.linear14);
        textview10 = (TextView) findViewById(R.id.textview10);

        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Sudokutraning.class);
                startActivity(i);
            }
        });

        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Sudokylevel1.class);
                startActivity(i);
            }
        });

        textview7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Sudokylevel2.class);
                startActivity(i);
            }
        });

        textview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Sudokylevel3.class);
                startActivity(i);
            }
        });

        textview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), Sudokylevel4.class);
                startActivity(i);
            }
        });
    }

    private void initializeLogic() {
        android.graphics.drawable.GradientDrawable rb1 = new android.graphics.drawable.GradientDrawable(); rb1.setColor(Color.parseColor("#9C27B0"));
        rb1.setCornerRadius(10);
        linear5.setBackground(rb1);
        android.graphics.drawable.GradientDrawable rb2 = new android.graphics.drawable.GradientDrawable(); rb2.setColor(Color.parseColor("#4CAF50"));
        rb2.setCornerRadius(10);
        linear10.setBackground(rb2);
        android.graphics.drawable.GradientDrawable rb3 = new android.graphics.drawable.GradientDrawable(); rb3.setColor(Color.parseColor("#4CAF50"));
        rb3.setCornerRadius(10);
        linear11.setBackground(rb3);
        android.graphics.drawable.GradientDrawable rb4 = new android.graphics.drawable.GradientDrawable(); rb4.setColor(Color.parseColor("#4CAF50"));
        rb4.setCornerRadius(10);
        linear12.setBackground(rb4);
        android.graphics.drawable.GradientDrawable rb5 = new android.graphics.drawable.GradientDrawable(); rb5.setColor(Color.parseColor("#4CAF50"));
        rb5.setCornerRadius(10);
        linear13.setBackground(rb5);
        android.graphics.drawable.GradientDrawable rb6 = new android.graphics.drawable.GradientDrawable(); rb6.setColor(Color.parseColor("#212121"));
        rb6.setCornerRadius(10);
        textview3.setBackground(rb6);
        android.graphics.drawable.GradientDrawable rb7 = new android.graphics.drawable.GradientDrawable(); rb7.setColor(Color.parseColor("#212121"));
        rb7.setCornerRadius(10);
        textview6.setBackground(rb7);
        android.graphics.drawable.GradientDrawable rb8 = new android.graphics.drawable.GradientDrawable(); rb8.setColor(Color.parseColor("#212121"));
        rb8.setCornerRadius(10);
        textview7.setBackground(rb8);
        android.graphics.drawable.GradientDrawable rb9 = new android.graphics.drawable.GradientDrawable(); rb9.setColor(Color.parseColor("#212121"));
        rb9.setCornerRadius(10);
        textview8.setBackground(rb9);
        android.graphics.drawable.GradientDrawable rb10 = new android.graphics.drawable.GradientDrawable(); rb10.setColor(Color.parseColor("#212121"));
        rb10.setCornerRadius(10);
        textview9.setBackground(rb10);
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