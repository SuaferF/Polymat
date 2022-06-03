package com.suafer.polimat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;


public class VictorinaBiologia extends AppCompatActivity {

    private double results = 0;

    private LinearLayout linear1;
    private ScrollView vscroll1;
    private ImageView imageview7;
    private TextView textview12;
    private LinearLayout linear2;
    private TextView textview2;
    private TextView textview3;
    private ImageView imageview2;
    private LinearLayout linear4;
    private LinearLayout linear7;
    private LinearLayout linear9;
    private TextView textview4;
    private TextView textview5;
    private ImageView imageview3;
    private LinearLayout linear10;
    private LinearLayout linear12;
    private LinearLayout linear14;
    private TextView textview6;
    private TextView textview7;
    private ImageView imageview4;
    private LinearLayout linear17;
    private LinearLayout linear15;
    private LinearLayout linear19;
    private TextView textview8;
    private TextView textview9;
    private ImageView imageview5;
    private LinearLayout linear21;
    private LinearLayout linear20;
    private LinearLayout linear23;
    private TextView textview11;
    private TextView textview10;
    private ImageView imageview6;
    private LinearLayout linear26;
    private LinearLayout linear24;
    private LinearLayout linear25;
    private Button button1;
    private CheckBox checkbox2;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private CheckBox checkbox6;
    private CheckBox checkbox7;
    private CheckBox checkbox8;
    private CheckBox checkbox9;
    private CheckBox checkbox10;
    private CheckBox checkbox13;
    private CheckBox checkbox14;
    private CheckBox checkbox11;
    private CheckBox checkbox12;
    private CheckBox checkbox17;
    private CheckBox checkbox18;
    private CheckBox checkbox15;
    private CheckBox checkbox16;
    private CheckBox checkbox25;
    private CheckBox checkbox26;
    private CheckBox checkbox21;
    private CheckBox checkbox22;
    private CheckBox checkbox23;
    private CheckBox checkbox24;

    private Intent i = new Intent();
    private AlertDialog.Builder d;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_victorina_biologia);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        imageview7 = (ImageView) findViewById(R.id.imageview7);
        textview12 = (TextView) findViewById(R.id.textview12);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        textview2 = (TextView) findViewById(R.id.textview2);
        textview3 = (TextView) findViewById(R.id.textview3);
        imageview2 = (ImageView) findViewById(R.id.imageview2);

        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        linear9 = (LinearLayout) findViewById(R.id.linear9);
        textview4 = (TextView) findViewById(R.id.textview4);
        textview5 = (TextView) findViewById(R.id.textview5);
        imageview3 = (ImageView) findViewById(R.id.imageview3);
        linear10 = (LinearLayout) findViewById(R.id.linear10);
        linear12 = (LinearLayout) findViewById(R.id.linear12);
        linear14 = (LinearLayout) findViewById(R.id.linear14);
        textview6 = (TextView) findViewById(R.id.textview6);
        textview7 = (TextView) findViewById(R.id.textview7);
        imageview4 = (ImageView) findViewById(R.id.imageview4);
        linear17 = (LinearLayout) findViewById(R.id.linear17);
        linear15 = (LinearLayout) findViewById(R.id.linear15);
        linear19 = (LinearLayout) findViewById(R.id.linear19);
        textview8 = (TextView) findViewById(R.id.textview8);
        textview9 = (TextView) findViewById(R.id.textview9);
        imageview5 = (ImageView) findViewById(R.id.imageview5);
        linear21 = (LinearLayout) findViewById(R.id.linear21);
        linear20 = (LinearLayout) findViewById(R.id.linear20);
        linear23 = (LinearLayout) findViewById(R.id.linear23);
        textview11 = (TextView) findViewById(R.id.textview11);
        textview10 = (TextView) findViewById(R.id.textview10);
        imageview6 = (ImageView) findViewById(R.id.imageview6);
        linear26 = (LinearLayout) findViewById(R.id.linear26);
        linear24 = (LinearLayout) findViewById(R.id.linear24);
        linear25 = (LinearLayout) findViewById(R.id.linear25);
        button1 = (Button) findViewById(R.id.button1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkbox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkbox6 = (CheckBox) findViewById(R.id.checkbox6);
        checkbox7 = (CheckBox) findViewById(R.id.checkbox7);
        checkbox8 = (CheckBox) findViewById(R.id.checkbox8);
        checkbox9 = (CheckBox) findViewById(R.id.checkbox9);
        checkbox10 = (CheckBox) findViewById(R.id.checkbox10);
        checkbox13 = (CheckBox) findViewById(R.id.checkbox13);
        checkbox14 = (CheckBox) findViewById(R.id.checkbox14);
        checkbox11 = (CheckBox) findViewById(R.id.checkbox11);
        checkbox12 = (CheckBox) findViewById(R.id.checkbox12);
        checkbox17 = (CheckBox) findViewById(R.id.checkbox17);
        checkbox18 = (CheckBox) findViewById(R.id.checkbox18);
        checkbox15 = (CheckBox) findViewById(R.id.checkbox15);
        checkbox16 = (CheckBox) findViewById(R.id.checkbox16);
        checkbox25 = (CheckBox) findViewById(R.id.checkbox25);
        checkbox26 = (CheckBox) findViewById(R.id.checkbox26);
        checkbox21 = (CheckBox) findViewById(R.id.checkbox21);
        checkbox22 = (CheckBox) findViewById(R.id.checkbox22);
        checkbox23 = (CheckBox) findViewById(R.id.checkbox23);
        checkbox24 = (CheckBox) findViewById(R.id.checkbox24);
        d = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if ((checkbox4.isChecked() && !checkbox2.isChecked()) && (!checkbox6.isChecked() && !checkbox5.isChecked())) {
                    results++;
                    linear4.setBackgroundColor(0xFF4CAF50);
                    linear7.setBackgroundColor(0xFF4CAF50);
                }
                else {
                    linear4.setBackgroundColor(0xFFF44336);
                    linear7.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox10.isChecked() && !checkbox9.isChecked()) && (!checkbox8.isChecked() && !checkbox7.isChecked())) {
                    results++;
                    linear10.setBackgroundColor(0xFF4CAF50);
                    linear12.setBackgroundColor(0xFF4CAF50);
                }
                else {
                    linear10.setBackgroundColor(0xFFF44336);
                    linear12.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox13.isChecked() && !checkbox14.isChecked()) && (!checkbox11.isChecked() && !checkbox12.isChecked())) {

                    results++;
                    linear15.setBackgroundColor(0xFF4CAF50);
                    linear17.setBackgroundColor(0xFF4CAF50);
                }
                else {
                    linear15.setBackgroundColor(0xFFF44336);
                    linear17.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox15.isChecked() && !checkbox17.isChecked()) && (!checkbox18.isChecked() && !checkbox16.isChecked())) {
                    results++;
                    linear21.setBackgroundColor(0xFF4CAF50);
                    linear20.setBackgroundColor(0xFF4CAF50);
                }
                else {
                    linear21.setBackgroundColor(0xFFF44336);
                    linear20.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox25.isChecked() && (checkbox22.isChecked() && checkbox24.isChecked())) && (!checkbox26.isChecked() && (!checkbox23.isChecked() && !checkbox21.isChecked()))) {
                    results++;
                    linear26.setBackgroundColor(0xFF4CAF50);
                    linear25.setBackgroundColor(0xFF4CAF50);
                    linear24.setBackgroundColor(0xFF4CAF50);
                }
                else {
                    linear26.setBackgroundColor(0xFFF44336);
                    linear25.setBackgroundColor(0xFFF44336);
                    linear24.setBackgroundColor(0xFFF44336);
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