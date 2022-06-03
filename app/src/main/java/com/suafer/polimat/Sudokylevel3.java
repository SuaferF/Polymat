package com.suafer.polimat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;


public class Sudokylevel3 extends AppCompatActivity {

    private LinearLayout linear47;
    private LinearLayout linear48;
    private TextView textview1;
    private LinearLayout linear1;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear13;
    private LinearLayout linear20;
    private LinearLayout linear14;
    private Button button1;
    private EditText edittext1;
    private LinearLayout linear12;
    private TextView textview12;
    private LinearLayout linear21;
    private TextView textview6;
    private LinearLayout linear32;
    private TextView textview13;
    private LinearLayout linear38;
    private TextView textview14;
    private LinearLayout linear44;
    private EditText edittext19;
    private EditText edittext2;
    private LinearLayout linear19;
    private EditText edittext7;
    private LinearLayout linear22;
    private EditText edittext9;
    private LinearLayout linear31;
    private EditText edittext13;
    private LinearLayout linear37;
    private EditText edittext17;
    private LinearLayout linear43;
    private EditText edittext20;
    private EditText edittext3;
    private LinearLayout linear15;
    private TextView textview3;
    private LinearLayout linear23;
    private EditText edittext10;
    private LinearLayout linear30;
    private EditText edittext14;
    private LinearLayout linear36;
    private TextView textview17;
    private LinearLayout linear42;
    private EditText edittext21;
    private EditText edittext4;
    private LinearLayout linear16;
    private TextView textview21;
    private LinearLayout linear24;
    private EditText edittext11;
    private LinearLayout linear29;
    private EditText edittext15;
    private LinearLayout linear35;
    private TextView textview22;
    private LinearLayout linear41;
    private EditText edittext22;
    private EditText edittext5;
    private LinearLayout linear17;
    private EditText edittext8;
    private LinearLayout linear25;
    private EditText edittext12;
    private LinearLayout linear28;
    private EditText edittext16;
    private LinearLayout linear34;
    private EditText edittext18;
    private LinearLayout linear40;
    private EditText edittext23;
    private EditText edittext6;
    private LinearLayout linear18;
    private TextView textview18;
    private LinearLayout linear26;
    private TextView textview19;
    private LinearLayout linear27;
    private TextView textview7;
    private LinearLayout linear33;
    private TextView textview20;
    private LinearLayout linear39;
    private EditText edittext24;
    private LinearLayout linear51;

    private Intent i = new Intent();

    private AlertDialog.Builder d;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_sudokylevel3);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear47 = (LinearLayout) findViewById(R.id.linear47);
        linear48 = (LinearLayout) findViewById(R.id.linear48);
        textview1 = (TextView) findViewById(R.id.textview1);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        linear8 = (LinearLayout) findViewById(R.id.linear8);
        linear9 = (LinearLayout) findViewById(R.id.linear9);
        linear10 = (LinearLayout) findViewById(R.id.linear10);
        linear11 = (LinearLayout) findViewById(R.id.linear11);
        linear13 = (LinearLayout) findViewById(R.id.linear13);
        linear20 = (LinearLayout) findViewById(R.id.linear20);
        linear14 = (LinearLayout) findViewById(R.id.linear14);
        button1 = (Button) findViewById(R.id.button1);
        edittext1 = (EditText) findViewById(R.id.edittext1);
        linear12 = (LinearLayout) findViewById(R.id.linear12);
        textview12 = (TextView) findViewById(R.id.textview12);
        linear21 = (LinearLayout) findViewById(R.id.linear21);
        textview6 = (TextView) findViewById(R.id.textview6);
        linear32 = (LinearLayout) findViewById(R.id.linear32);
        textview13 = (TextView) findViewById(R.id.textview13);
        linear38 = (LinearLayout) findViewById(R.id.linear38);
        textview14 = (TextView) findViewById(R.id.textview14);
        linear44 = (LinearLayout) findViewById(R.id.linear44);
        edittext19 = (EditText) findViewById(R.id.edittext19);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        linear19 = (LinearLayout) findViewById(R.id.linear19);
        edittext7 = (EditText) findViewById(R.id.edittext7);
        linear22 = (LinearLayout) findViewById(R.id.linear22);
        edittext9 = (EditText) findViewById(R.id.edittext9);
        linear31 = (LinearLayout) findViewById(R.id.linear31);
        edittext13 = (EditText) findViewById(R.id.edittext13);
        linear37 = (LinearLayout) findViewById(R.id.linear37);
        edittext17 = (EditText) findViewById(R.id.edittext17);
        linear43 = (LinearLayout) findViewById(R.id.linear43);
        edittext20 = (EditText) findViewById(R.id.edittext20);
        edittext3 = (EditText) findViewById(R.id.edittext3);
        linear15 = (LinearLayout) findViewById(R.id.linear15);
        textview3 = (TextView) findViewById(R.id.textview3);
        linear23 = (LinearLayout) findViewById(R.id.linear23);
        edittext10 = (EditText) findViewById(R.id.edittext10);
        linear30 = (LinearLayout) findViewById(R.id.linear30);
        edittext14 = (EditText) findViewById(R.id.edittext14);
        linear36 = (LinearLayout) findViewById(R.id.linear36);
        textview17 = (TextView) findViewById(R.id.textview17);
        linear42 = (LinearLayout) findViewById(R.id.linear42);
        edittext21 = (EditText) findViewById(R.id.edittext21);
        edittext4 = (EditText) findViewById(R.id.edittext4);
        linear16 = (LinearLayout) findViewById(R.id.linear16);
        textview21 = (TextView) findViewById(R.id.textview21);
        linear24 = (LinearLayout) findViewById(R.id.linear24);
        edittext11 = (EditText) findViewById(R.id.edittext11);
        linear29 = (LinearLayout) findViewById(R.id.linear29);
        edittext15 = (EditText) findViewById(R.id.edittext15);
        linear35 = (LinearLayout) findViewById(R.id.linear35);
        textview22 = (TextView) findViewById(R.id.textview22);
        linear41 = (LinearLayout) findViewById(R.id.linear41);
        edittext22 = (EditText) findViewById(R.id.edittext22);
        edittext5 = (EditText) findViewById(R.id.edittext5);

        linear17 = (LinearLayout) findViewById(R.id.linear17);
        edittext8 = (EditText) findViewById(R.id.edittext8);
        linear25 = (LinearLayout) findViewById(R.id.linear25);
        edittext12 = (EditText) findViewById(R.id.edittext12);
        linear28 = (LinearLayout) findViewById(R.id.linear28);
        edittext16 = (EditText) findViewById(R.id.edittext16);
        linear34 = (LinearLayout) findViewById(R.id.linear34);
        edittext18 = (EditText) findViewById(R.id.edittext18);
        linear40 = (LinearLayout) findViewById(R.id.linear40);
        edittext23 = (EditText) findViewById(R.id.edittext23);
        edittext6 = (EditText) findViewById(R.id.edittext6);
        linear18 = (LinearLayout) findViewById(R.id.linear18);
        textview18 = (TextView) findViewById(R.id.textview18);
        linear26 = (LinearLayout) findViewById(R.id.linear26);
        textview19 = (TextView) findViewById(R.id.textview19);
        linear27 = (LinearLayout) findViewById(R.id.linear27);
        textview7 = (TextView) findViewById(R.id.textview7);
        linear33 = (LinearLayout) findViewById(R.id.linear33);
        textview20 = (TextView) findViewById(R.id.textview20);
        linear39 = (LinearLayout) findViewById(R.id.linear39);
        edittext24 = (EditText) findViewById(R.id.edittext24);
        linear51 = (LinearLayout) findViewById(R.id.linear51);
        d = new AlertDialog.Builder(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (edittext1.getText().toString().equals("1")) {
                    if (edittext2.getText().toString().equals("2")) {
                        if (edittext3.getText().toString().equals("5")) {
                            if (edittext4.getText().toString().equals("3")) {
                                if (edittext5.getText().toString().equals("4")) {
                                    if (edittext6.getText().toString().equals("6")) {
                                        if (edittext7.getText().toString().equals("3")) {
                                            if (edittext8.getText().toString().equals("1")) {
                                                if (edittext9.getText().toString().equals("6")) {
                                                    if (edittext10.getText().toString().equals("4")) {
                                                        if (edittext11.getText().toString().equals("1")) {
                                                            if (edittext12.getText().toString().equals("2")) {
                                                                if (edittext13.getText().toString().equals("1")) {
                                                                    if (edittext14.getText().toString().equals("3")) {
                                                                        if (edittext15.getText().toString().equals("4")) {
                                                                            if (edittext16.getText().toString().equals("5")) {
                                                                                if (edittext17.getText().toString().equals("5")) {
                                                                                    if (edittext18.getText().toString().equals("3")) {
                                                                                        if (edittext19.getText().toString().equals("3")) {
                                                                                            if (edittext20.getText().toString().equals("4")) {
                                                                                                if (edittext21.getText().toString().equals("2")) {
                                                                                                    if (edittext22.getText().toString().equals("5")) {
                                                                                                        if (edittext23.getText().toString().equals("6")) {
                                                                                                            if (edittext24.getText().toString().equals("1")) {
                                                                                                                d.setTitle("Отлично");
                                                                                                                d.setMessage("Вы прошли уровень");
                                                                                                                d.setPositiveButton("Перейти к четвертому уровню", new DialogInterface.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(DialogInterface _dialog, int _which) {
                                                                                                                        i.setClass(getApplicationContext(), Sudokylevel3.class);
                                                                                                                        startActivity(i);
                                                                                                                    }
                                                                                                                });
                                                                                                                d.setNegativeButton("Вернуться к меню", new DialogInterface.OnClickListener() {
                                                                                                                    @Override
                                                                                                                    public void onClick(DialogInterface _dialog, int _which) {
                                                                                                                        i.setClass(getApplicationContext(), Sudoky.class);
                                                                                                                        startActivity(i);
                                                                                                                    }
                                                                                                                });
                                                                                                                d.create().show();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }

                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    d.setTitle("Что-то не так");
                    d.setMessage("Вы где-то совершили ошибку или заполнили не все поля");
                    d.setPositiveButton("Хорошо", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface _dialog, int _which) {
                        }
                    });
                    d.create().show();
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