package com.suafer.polimat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.CheckBox;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;


public class victorinageografia extends AppCompatActivity {

    private double results = 0;

    private LinearLayout linear1;
    private ScrollView vscroll1;
    private TextView textview1;
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
    private CheckBox checkbox21;
    private CheckBox checkbox22;
    private CheckBox checkbox23;
    private CheckBox checkbox24;

    private AlertDialog.Builder d;
    private Intent i = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_victorinageografia);
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
        checkbox21 = (CheckBox) findViewById(R.id.checkbox21);
        checkbox22 = (CheckBox) findViewById(R.id.checkbox22);
        checkbox23 = (CheckBox) findViewById(R.id.checkbox23);
        checkbox24 = (CheckBox) findViewById(R.id.checkbox24);
        d = new AlertDialog.Builder(this);

        textview1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View _view) {

                return true;
            }
        });

        linear17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

            }
        });

        linear20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if ((checkbox5.isChecked() && !checkbox2.isChecked()) && (!checkbox6.isChecked() && !checkbox4.isChecked())) {
                    results++;
                    checkbox5.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    checkbox5.setBackgroundColor(0xFFF44336);
                }
                if ((checkbox7.isChecked() && !checkbox9.isChecked()) && (!checkbox8.isChecked() && !checkbox10.isChecked())) {
                    results++;
                    linear10.setBackgroundColor(0xFF8BC34A);
                    linear12.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear10.setBackgroundColor(0xFFF44336);
                    linear12.setBackgroundColor(0xFFF44336);
                }
                if (checkbox12.isChecked() && (!checkbox11.isChecked() && (!checkbox13.isChecked() && !checkbox14.isChecked()))) {

                    results++;
                    linear17.setBackgroundColor(0xFF8BC34A);
                    linear15.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear17.setBackgroundColor(0xFFF44336);
                    linear15.setBackgroundColor(0xFFF44336);
                }
                if (checkbox17.isChecked() && (!checkbox16.isChecked() && (!checkbox15.isChecked() && !checkbox18.isChecked()))) {
                    results++;
                    linear20.setBackgroundColor(0xFF8BC34A);
                    linear21.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear20.setBackgroundColor(0xFFF44336);
                    linear21.setBackgroundColor(0xFFF44336);
                }
                if (checkbox22.isChecked() && (!checkbox24.isChecked() && (!checkbox23.isChecked() && !checkbox21.isChecked()))) {
                    results++;
                    linear24.setBackgroundColor(0xFF8BC34A);
                    linear25.setBackgroundColor(0xFF8BC34A);
                }
                else {
                    linear24.setBackgroundColor(0xFFF44336);
                    linear25.setBackgroundColor(0xFFF44336);
                }
                if (results == 5) {
                    d.setTitle("?????? ?????????????????? 5/5");
                    d.setMessage("?????? ?????????? ?????????????? ??????????????????");
                    d.setPositiveButton("?????????????????? ?? ????????", new DialogInterface.OnClickListener() {
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
                        d.setTitle("?????? ?????????????????? 4/5");
                        d.setMessage("???????????????? ??????????????????");
                        d.setPositiveButton("?????????????????? ?? ????????", new DialogInterface.OnClickListener() {
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
                            d.setTitle("?????? ?????????????????? 3/5");
                            d.setMessage("?? ?????? ???????? ????????????, ???? ???????? ????, ?????? ?????????? ??????????????????");
                            d.setPositiveButton("?????????????????? ?? ????????", new DialogInterface.OnClickListener() {
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
                                d.setTitle("?????? ?????????????????? 2/5");
                                d.setMessage("???? ?????????? ????????????");
                                d.setPositiveButton("?????????????????? ?? ????????", new DialogInterface.OnClickListener() {
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
                                    d.setTitle("?????? ?????????????????? 1/5");
                                    d.setMessage("?????? ?????????? ?????????????????? ???????????? ????????");
                                    d.setPositiveButton("?????????????????? ?? ????????", new DialogInterface.OnClickListener() {
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
                                        d.setTitle("?????? ?????????????????? 0/5");
                                        d.setMessage("???? ?????????? ?????????????? ??????????????????");
                                        d.setPositiveButton("?????????????????? ?? ????????", new DialogInterface.OnClickListener() {
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