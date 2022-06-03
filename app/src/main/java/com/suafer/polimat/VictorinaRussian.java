package com.suafer.polimat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;


public class VictorinaRussian extends AppCompatActivity {

    private double results = 0;

    private LinearLayout linear1;
    private ScrollView vscroll1;
    private TextView textview1;
    private LinearLayout linear2;
    private TextView textview2;
    private TextView textview3;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout line1;
    private TextView textview4;
    private TextView textview5;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear14;
    private TextView textview6;
    private TextView textview7;
    private TextView textview13;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private LinearLayout linear19;
    private TextView textview8;
    private TextView textview9;
    private LinearLayout linear10;
    private LinearLayout linear23;
    private TextView textview11;
    private TextView textview10;
    private LinearLayout linear11;
    private Button button1;
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private CheckBox checkbox6;
    private CheckBox checkbox7;
    private CheckBox checkbox8;
    private CheckBox checkbox28;
    private CheckBox checkbox9;
    private CheckBox checkbox10;
    private CheckBox checkbox13;
    private CheckBox checkbox14;
    private CheckBox checkbox11;
    private CheckBox checkbox12;
    private CheckBox checkbox31;
    private CheckBox checkbox32;
    private CheckBox checkbox17;
    private CheckBox checkbox15;
    private CheckBox checkbox22;
    private CheckBox checkbox23;
    private CheckBox checkbox21;
    private CheckBox checkbox33;
    private CheckBox checkbox24;

    private Intent i = new Intent();
    private AlertDialog.Builder d;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_victorina_russian);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        textview1 = (TextView) findViewById(R.id.textview1);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        textview2 = (TextView) findViewById(R.id.textview2);
        textview3 = (TextView) findViewById(R.id.textview3);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        line1 = (LinearLayout) findViewById(R.id.line1);
        textview4 = (TextView) findViewById(R.id.textview4);
        textview5 = (TextView) findViewById(R.id.textview5);

        linear5 = (LinearLayout) findViewById(R.id.linear5);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        linear14 = (LinearLayout) findViewById(R.id.linear14);
        textview6 = (TextView) findViewById(R.id.textview6);
        textview7 = (TextView) findViewById(R.id.textview7);
        textview13 = (TextView) findViewById(R.id.textview13);
        linear8 = (LinearLayout) findViewById(R.id.linear8);
        linear9 = (LinearLayout) findViewById(R.id.linear9);
        linear19 = (LinearLayout) findViewById(R.id.linear19);
        textview8 = (TextView) findViewById(R.id.textview8);
        textview9 = (TextView) findViewById(R.id.textview9);
        linear10 = (LinearLayout) findViewById(R.id.linear10);
        linear23 = (LinearLayout) findViewById(R.id.linear23);
        textview11 = (TextView) findViewById(R.id.textview11);
        textview10 = (TextView) findViewById(R.id.textview10);
        linear11 = (LinearLayout) findViewById(R.id.linear11);
        button1 = (Button) findViewById(R.id.button1);
        checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkbox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkbox6 = (CheckBox) findViewById(R.id.checkbox6);
        checkbox7 = (CheckBox) findViewById(R.id.checkbox7);
        checkbox8 = (CheckBox) findViewById(R.id.checkbox8);
        checkbox28 = (CheckBox) findViewById(R.id.checkbox28);
        checkbox9 = (CheckBox) findViewById(R.id.checkbox9);
        checkbox10 = (CheckBox) findViewById(R.id.checkbox10);
        checkbox13 = (CheckBox) findViewById(R.id.checkbox13);
        checkbox14 = (CheckBox) findViewById(R.id.checkbox14);
        checkbox11 = (CheckBox) findViewById(R.id.checkbox11);
        checkbox12 = (CheckBox) findViewById(R.id.checkbox12);
        checkbox31 = (CheckBox) findViewById(R.id.checkbox31);
        checkbox32 = (CheckBox) findViewById(R.id.checkbox32);
        checkbox17 = (CheckBox) findViewById(R.id.checkbox17);
        checkbox15 = (CheckBox) findViewById(R.id.checkbox15);
        checkbox22 = (CheckBox) findViewById(R.id.checkbox22);
        checkbox23 = (CheckBox) findViewById(R.id.checkbox23);
        checkbox21 = (CheckBox) findViewById(R.id.checkbox21);
        checkbox33 = (CheckBox) findViewById(R.id.checkbox33);
        checkbox24 = (CheckBox) findViewById(R.id.checkbox24);
        d = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if ((checkbox5.isChecked() && checkbox3.isChecked()) && (true && (!checkbox2.isChecked() && !checkbox1.isChecked()))) {
                    results++;
                    linear3.setBackgroundColor(0xFF8BC34A);
                    linear4.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear3.setBackgroundColor(0xFFF44336);
                    linear4.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox9.isChecked() && ((!checkbox28.isChecked() && !checkbox10.isChecked()) && !checkbox6.isChecked())) && (checkbox8.isChecked() && checkbox7.isChecked())) {
                    results++;
                    linear5.setBackgroundColor(0xFF8BC34A);
                    linear7.setBackgroundColor(0xFF8BC34A);
                    linear6.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear5.setBackgroundColor(0xFFF44336);
                    linear7.setBackgroundColor(0xFFF44336);
                    linear6.setBackgroundColor(0xFFF44336);
                }
                if (checkbox13.isChecked() && (checkbox14.isChecked() && (checkbox11.isChecked() && checkbox12.isChecked()))) {
                    results++;
                    linear8.setBackgroundColor(0xFF8BC34A);
                    linear9.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear8.setBackgroundColor(0xFFF44336);
                    linear9.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox17.isChecked() && checkbox15.isChecked()) && (!checkbox32.isChecked() && !checkbox31.isChecked())) {

                    results++;
                    linear10.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear10.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox22.isChecked() && checkbox23.isChecked()) && (!checkbox33.isChecked() && (!checkbox24.isChecked() && !checkbox21.isChecked()))) {
                    results++;
                    linear11.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear11.setBackgroundColor(0xFFF44336);
                }
                if (results == 5) {
                    d.setTitle("Ваш результат 5/5");
                    d.setMessage("Это очень хороший результат");
                    d.setPositiveButton("Вернуться в меню", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface _dialog, int _which) {
                            i.setClass(getApplicationContext(), Victorini.class);
                            startActivity(i);
                        }
                    });
                    d.create().show();
                    results = 0;
                }
                else {
                    if (results == 4) {
                        d.setTitle("Ваш результат 4/5");
                        d.setMessage("Неплохой результат");
                        d.setPositiveButton("Вернуться в меню", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface _dialog, int _which) {
                                i.setClass(getApplicationContext(), Victorini.class);
                                startActivity(i);
                            }
                        });
                        d.create().show();
                        results = 0;
                    }
                    else {
                        if (results == 3) {
                            d.setTitle("Ваш результат 3/5");
                            d.setMessage("У Вас есть знания, но есть то, что нужно повторить");
                            d.setPositiveButton("Вернуться в меню", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface _dialog, int _which) {
                                    i.setClass(getApplicationContext(), Victorini.class);
                                    startActivity(i);
                                }
                            });
                            results = 0;
                            d.create().show();
                        }
                        else {
                            if (results == 2) {
                                d.setTitle("Ваш результат 2/5");
                                d.setMessage("Не очень хорошо");
                                d.setPositiveButton("Вернуться в меню", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface _dialog, int _which) {
                                        i.setClass(getApplicationContext(), Victorini.class);
                                        startActivity(i);
                                    }
                                });
                                d.create().show();
                                results = 0;
                            }
                            else {
                                if (results == 1) {
                                    d.setTitle("Ваш результат 1/5");
                                    d.setMessage("Вам стоит повторить данную тему");
                                    d.setPositiveButton("Вернуться в меню", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface _dialog, int _which) {
                                            i.setClass(getApplicationContext(), Victorini.class);
                                            startActivity(i);
                                        }
                                    });
                                    d.create().show();
                                    results = 0;
                                }
                                else {
                                    if (results == 0) {
                                        d.setTitle("Ваш результат 0/5");
                                        d.setMessage("Не очень хороший результат");
                                        d.setPositiveButton("Вернуться в меню", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface _dialog, int _which) {
                                                i.setClass(getApplicationContext(), Victorini.class);
                                                startActivity(i);
                                            }
                                        });
                                        d.create().show();
                                        results = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    }

    private void initializeLogic() {
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