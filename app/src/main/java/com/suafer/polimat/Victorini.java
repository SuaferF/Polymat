package com.suafer.polimat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.graphics.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;


public class Victorini extends AppCompatActivity {

    private LinearLayout linear18;
    private ScrollView vscroll2;
    private TextView textview1;
    private LinearLayout linear1;
    private LinearLayout linear16;
    private TextView textview7;
    private LinearLayout linear17;
    private LinearLayout linear19;
    private LinearLayout linear20;
    private LinearLayout linear21;
    private LinearLayout linear22;
    private LinearLayout linear23;
    private LinearLayout linear2;
    private ImageView imageview1;
    private LinearLayout linear3;
    private TextView textview4;
    private TextView textview3;
    private LinearLayout linear4;
    private ImageView imageview3;
    private LinearLayout linear5;
    private TextView textview8;
    private TextView textview9;
    private LinearLayout linear6;
    private ImageView imageview5;
    private LinearLayout linear7;
    private TextView textview12;
    private TextView textview13;
    private LinearLayout linear8;
    private ImageView imageview4;
    private LinearLayout linear9;
    private TextView textview10;
    private TextView textview11;
    private LinearLayout linear10;
    private ImageView imageview6;
    private LinearLayout linear11;
    private TextView textview14;
    private TextView textview15;

    private Intent i = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_victorini);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear18 = (LinearLayout) findViewById(R.id.linear18);
        vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
        textview1 = (TextView) findViewById(R.id.textview1);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear16 = (LinearLayout) findViewById(R.id.linear16);
        textview7 = (TextView) findViewById(R.id.textview7);
        linear17 = (LinearLayout) findViewById(R.id.linear17);
        linear19 = (LinearLayout) findViewById(R.id.linear19);
        linear20 = (LinearLayout) findViewById(R.id.linear20);
        linear21 = (LinearLayout) findViewById(R.id.linear21);
        linear22 = (LinearLayout) findViewById(R.id.linear22);
        linear23 = (LinearLayout) findViewById(R.id.linear23);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        imageview1 = (ImageView) findViewById(R.id.imageview1);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        textview4 = (TextView) findViewById(R.id.textview4);
        textview3 = (TextView) findViewById(R.id.textview3);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        imageview3 = (ImageView) findViewById(R.id.imageview3);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        textview8 = (TextView) findViewById(R.id.textview8);
        textview9 = (TextView) findViewById(R.id.textview9);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        imageview5 = (ImageView) findViewById(R.id.imageview5);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        textview12 = (TextView) findViewById(R.id.textview12);
        textview13 = (TextView) findViewById(R.id.textview13);
        linear8 = (LinearLayout) findViewById(R.id.linear8);
        imageview4 = (ImageView) findViewById(R.id.imageview4);
        linear9 = (LinearLayout) findViewById(R.id.linear9);
        textview10 = (TextView) findViewById(R.id.textview10);
        textview11 = (TextView) findViewById(R.id.textview11);
        linear10 = (LinearLayout) findViewById(R.id.linear10);
        imageview6 = (ImageView) findViewById(R.id.imageview6);
        linear11 = (LinearLayout) findViewById(R.id.linear11);
        textview14 = (TextView) findViewById(R.id.textview14);
        textview15 = (TextView) findViewById(R.id.textview15);

        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), victorinageografia.class);

                startActivity(i);
            }
        });

        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), VictorinaBiologia.class);
                startActivity(i);
            }
        });

        linear6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), VictorinaRussian.class);
                startActivity(i);
            }
        });

        linear8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), VictorinaFisika.class);
                startActivity(i);
            }
        });

        linear10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                i.setClass(getApplicationContext(), VictorinaHisoria.class);
                startActivity(i);
            }
        });
    }

    private void initializeLogic() {
        android.graphics.drawable.GradientDrawable rb1 = new android.graphics.drawable.GradientDrawable(); rb1.setColor(Color.parseColor("#212121"));
        rb1.setCornerRadius(10);
        linear2.setBackground(rb1);
        android.graphics.drawable.GradientDrawable rb2 = new android.graphics.drawable.GradientDrawable(); rb2.setColor(Color.parseColor("#03A9F4"));
        rb2.setCornerRadius(10);
        linear19.setBackground(rb2);
        android.graphics.drawable.GradientDrawable rb3 = new android.graphics.drawable.GradientDrawable(); rb3.setColor(Color.parseColor("#212121"));
        rb3.setCornerRadius(10);
        linear4.setBackground(rb3);
        android.graphics.drawable.GradientDrawable rb4 = new android.graphics.drawable.GradientDrawable(); rb4.setColor(Color.parseColor("#212121"));
        rb4.setCornerRadius(10);
        linear6.setBackground(rb4);
        android.graphics.drawable.GradientDrawable rb5 = new android.graphics.drawable.GradientDrawable(); rb5.setColor(Color.parseColor("#4CAF50"));
        rb5.setCornerRadius(10);
        linear20.setBackground(rb5);
        android.graphics.drawable.GradientDrawable rb6 = new android.graphics.drawable.GradientDrawable(); rb6.setColor(Color.parseColor("#F44336"));
        rb6.setCornerRadius(10);
        linear21.setBackground(rb6);
        android.graphics.drawable.GradientDrawable rb7 = new android.graphics.drawable.GradientDrawable(); rb7.setColor(Color.parseColor("#212121"));
        rb7.setCornerRadius(10);
        linear8.setBackground(rb7);
        android.graphics.drawable.GradientDrawable rb8 = new android.graphics.drawable.GradientDrawable(); rb8.setColor(Color.parseColor("#212121"));
        rb8.setCornerRadius(10);
        linear10.setBackground(rb8);
        android.graphics.drawable.GradientDrawable rb9 = new android.graphics.drawable.GradientDrawable(); rb9.setColor(Color.parseColor("#673AB7"));
        rb9.setCornerRadius(10);
        linear22.setBackground(rb9);
        android.graphics.drawable.GradientDrawable rb10 = new android.graphics.drawable.GradientDrawable(); rb10.setColor(Color.parseColor("#EF6C00"));
        rb10.setCornerRadius(10);
        linear23.setBackground(rb10);
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