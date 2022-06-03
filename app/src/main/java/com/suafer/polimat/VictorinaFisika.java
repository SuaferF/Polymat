package com.suafer.polimat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;



public class VictorinaFisika extends AppCompatActivity {

    private double results = 0;

    private LinearLayout linear1;
    private ScrollView vscroll1;
    private TextView textview12;
    private LinearLayout linear2;
    private TextView textview2;
    private TextView textview3;
    private LinearLayout linear3;
    private LinearLayout linear9;
    private TextView textview4;
    private TextView textview5;
    private LinearLayout linear10;
    private LinearLayout linear14;
    private TextView textview6;
    private TextView textview7;
    private LinearLayout linear17;
    private LinearLayout linear15;
    private LinearLayout linear19;
    private TextView textview8;
    private TextView textview9;
    private LinearLayout linear21;
    private LinearLayout linear20;
    private LinearLayout linear23;
    private TextView textview11;
    private TextView textview10;
    private LinearLayout linear27;
    private Button button1;
    private CheckBox checkbox2;
    private CheckBox checkbox4;
    private CheckBox checkbox25;
    private CheckBox checkbox6;
    private CheckBox checkbox5;
    private CheckBox checkbox7;
    private CheckBox checkbox8;
    private CheckBox checkbox9;
    private CheckBox checkbox10;
    private CheckBox checkbox13;
    private CheckBox checkbox14;
    private CheckBox checkbox11;
    private CheckBox checkbox12;
    private TextView textview13;
    private EditText edittext1;
    private TextView textview14;
    private EditText edittext2;
    private CheckBox checkbox21;
    private CheckBox checkbox22;
    private CheckBox checkbox26;
    private CheckBox checkbox23;
    private CheckBox checkbox24;

    private AlertDialog.Builder d;
    private Intent i = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_victorina_fisika);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        textview12 = (TextView) findViewById(R.id.textview12);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        textview2 = (TextView) findViewById(R.id.textview2);
        textview3 = (TextView) findViewById(R.id.textview3);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear9 = (LinearLayout) findViewById(R.id.linear9);
        textview4 = (TextView) findViewById(R.id.textview4);
        textview5 = (TextView) findViewById(R.id.textview5);
        linear10 = (LinearLayout) findViewById(R.id.linear10);
        linear14 = (LinearLayout) findViewById(R.id.linear14);
        textview6 = (TextView) findViewById(R.id.textview6);

        textview7 = (TextView) findViewById(R.id.textview7);
        linear17 = (LinearLayout) findViewById(R.id.linear17);
        linear15 = (LinearLayout) findViewById(R.id.linear15);
        linear19 = (LinearLayout) findViewById(R.id.linear19);
        textview8 = (TextView) findViewById(R.id.textview8);
        textview9 = (TextView) findViewById(R.id.textview9);
        linear21 = (LinearLayout) findViewById(R.id.linear21);
        linear20 = (LinearLayout) findViewById(R.id.linear20);
        linear23 = (LinearLayout) findViewById(R.id.linear23);
        textview11 = (TextView) findViewById(R.id.textview11);
        textview10 = (TextView) findViewById(R.id.textview10);
        linear27 = (LinearLayout) findViewById(R.id.linear27);
        button1 = (Button) findViewById(R.id.button1);
        checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkbox25 = (CheckBox) findViewById(R.id.checkbox25);
        checkbox6 = (CheckBox) findViewById(R.id.checkbox6);
        checkbox5 = (CheckBox) findViewById(R.id.checkbox5);
        checkbox7 = (CheckBox) findViewById(R.id.checkbox7);
        checkbox8 = (CheckBox) findViewById(R.id.checkbox8);
        checkbox9 = (CheckBox) findViewById(R.id.checkbox9);
        checkbox10 = (CheckBox) findViewById(R.id.checkbox10);
        checkbox13 = (CheckBox) findViewById(R.id.checkbox13);
        checkbox14 = (CheckBox) findViewById(R.id.checkbox14);
        checkbox11 = (CheckBox) findViewById(R.id.checkbox11);
        checkbox12 = (CheckBox) findViewById(R.id.checkbox12);
        textview13 = (TextView) findViewById(R.id.textview13);
        edittext1 = (EditText) findViewById(R.id.edittext1);
        textview14 = (TextView) findViewById(R.id.textview14);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        checkbox21 = (CheckBox) findViewById(R.id.checkbox21);
        checkbox22 = (CheckBox) findViewById(R.id.checkbox22);
        checkbox26 = (CheckBox) findViewById(R.id.checkbox26);
        checkbox23 = (CheckBox) findViewById(R.id.checkbox23);
        checkbox24 = (CheckBox) findViewById(R.id.checkbox24);
        d = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if ((checkbox2.isChecked() && checkbox5.isChecked()) && (!checkbox4.isChecked() && (!checkbox25.isChecked() && !checkbox6.isChecked()))) {
                    linear3.setBackgroundColor(0xFF4CAF50);
                    results++;
                }
                else {
                    linear3.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox7.isChecked() && !checkbox8.isChecked()) && (!checkbox9.isChecked() && !checkbox10.isChecked())) {
                    results++;
                    linear10.setBackgroundColor(0xFF4CAF50);
                }
                else {
                    linear10.setBackgroundColor(0xFFF44336);
                }
                if ((!checkbox13.isChecked() && !checkbox14.isChecked()) && (checkbox11.isChecked() && !checkbox12.isChecked())) {
                    linear15.setBackgroundColor(0xFF4CAF50);
                    linear17.setBackgroundColor(0xFF4CAF50);
                    results++;
                }
                else {
                    linear15.setBackgroundColor(0xFFF44336);
                    linear17.setBackgroundColor(0xFFF44336);
                }
                if (edittext1.getText().toString().equals("1") && edittext2.getText().toString().equals("1")) {
                    linear20.setBackgroundColor(0xFF4CAF50);
                    linear21.setBackgroundColor(0xFF4CAF50);
                    results++;
                }
                else {
                    linear21.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox22.isChecked() && checkbox23.isChecked()) && (!checkbox24.isChecked() && (!checkbox26.isChecked() && !checkbox21.isChecked()))) {
                    linear27.setBackgroundColor(0xFF4CAF50);
                    results++;
                }
                else {
                    linear27.setBackgroundColor(0xFFF44336);
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
                            d.create().show();
                            results = 0;
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
                                results = 0;
                                d.create().show();
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
                                    results = 0;
                                    d.create().show();
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