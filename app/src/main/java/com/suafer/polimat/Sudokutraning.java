package com.suafer.polimat;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class Sudokutraning extends Activity {

    private ScrollView vscroll1;
    private LinearLayout linear1;
    private TextView textview1;
    private LinearLayout linear28;
    private LinearLayout linear27;
    private LinearLayout linear29;
    private LinearLayout linear30;
    private Button button1;
    private TextView textview2;
    private LinearLayout linear3;
    private LinearLayout linear32;
    private LinearLayout linear4;
    private LinearLayout linear7;
    private LinearLayout linear5;
    private EditText edittext1;
    private LinearLayout linear25;
    private TextView textview3;
    private TextView textview4;
    private LinearLayout linear26;
    private EditText edittext2;
    private TextView textview6;
    private TextView textview5;
    private TextView textview7;

    private AlertDialog.Builder d;
    private Intent i = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_sudokutraning);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        textview1 = (TextView) findViewById(R.id.textview1);
        linear28 = (LinearLayout) findViewById(R.id.linear28);
        linear27 = (LinearLayout) findViewById(R.id.linear27);
        linear29 = (LinearLayout) findViewById(R.id.linear29);
        linear30 = (LinearLayout) findViewById(R.id.linear30);
        button1 = (Button) findViewById(R.id.button1);
        textview2 = (TextView) findViewById(R.id.textview2);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear32 = (LinearLayout) findViewById(R.id.linear32);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        edittext1 = (EditText) findViewById(R.id.edittext1);
        linear25 = (LinearLayout) findViewById(R.id.linear25);
        textview3 = (TextView) findViewById(R.id.textview3);
        textview4 = (TextView) findViewById(R.id.textview4);
        linear26 = (LinearLayout) findViewById(R.id.linear26);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        textview6 = (TextView) findViewById(R.id.textview6);
        textview5 = (TextView) findViewById(R.id.textview5);
        textview7 = (TextView) findViewById(R.id.textview7);
        d = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (edittext1.getText().toString().equals("1")) {
                    if (edittext2.getText().toString().equals("1")) {
                        d.setTitle("Отлично");
                        d.setMessage("Уровень пройден");
                        d.setPositiveButton("Перейти к тестовом уровню 3×3", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface _dialog, int _which) {
                                i.setClass(getApplicationContext(),Sudoky.class);
                                startActivity(i);
                            }
                        });
                        d.create().show();
                    }
                }
                else {
                    d.setTitle("Ошибка");
                    d.setMessage("Вы где-то совершили ошибку или заполнили не все поля ");
                    d.create().show();
                }
            }
        });
    }

    private void initializeLogic() {
        android.graphics.drawable.GradientDrawable rb1 = new android.graphics.drawable.GradientDrawable(); rb1.setColor(Color.parseColor("#673AB7"));
        rb1.setCornerRadius(10);
        linear28.setBackground(rb1);
        android.graphics.drawable.GradientDrawable rb2 = new android.graphics.drawable.GradientDrawable(); rb2.setColor(Color.parseColor("#673AB7"));
        rb2.setCornerRadius(10);
        linear32.setBackground(rb2);
        android.graphics.drawable.GradientDrawable rb3 = new android.graphics.drawable.GradientDrawable(); rb3.setColor(Color.parseColor("#673AB7"));
        rb3.setCornerRadius(10);
        linear29.setBackground(rb3);
        android.graphics.drawable.GradientDrawable rb4 = new android.graphics.drawable.GradientDrawable(); rb4.setColor(Color.parseColor("#673AB7"));
        rb4.setCornerRadius(10);
        linear30.setBackground(rb4);
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