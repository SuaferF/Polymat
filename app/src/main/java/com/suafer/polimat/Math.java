package com.suafer.polimat;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.os.*;
import android.content.*;
import android.graphics.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import java.util.Random;
import android.widget.Toast;


public class Math extends AppCompatActivity {

    private double score = 0;
    private double i1 = 0;
    private double i2 = 0;
    private double record = 0;
    private String simvol = "";
    private double r = 0;
    Random random = new Random();


    private LinearLayout linear1;
    private TextView textview11;
    private LinearLayout linear3;
    private LinearLayout linear2;
    private Button button1;
    private LinearLayout linear12;
    private TextView textview12;
    private TextView textview5;
    private TextView textview6;
    private TextView textview1;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private EditText edittext1;

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_math);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        textview11 = (TextView) findViewById(R.id.textview11);
        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        button1 = (Button) findViewById(R.id.button1);
        linear12 = (LinearLayout) findViewById(R.id.linear12);
        textview12 = (TextView) findViewById(R.id.textview12);
        textview5 = (TextView) findViewById(R.id.textview5);
        textview6 = (TextView) findViewById(R.id.textview6);
        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);
        textview3 = (TextView) findViewById(R.id.textview3);
        textview4 = (TextView) findViewById(R.id.textview4);
        edittext1 = (EditText) findViewById(R.id.edittext1);
        sp = getSharedPreferences("save", Activity.MODE_PRIVATE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                if (edittext1.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Вы не ввели число", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    if (((i1 - i2) == Double.parseDouble(edittext1.getText().toString())) || (((i1 * i2) == Double.parseDouble(edittext1.getText().toString())) || ((i1 + i2) == Double.parseDouble(edittext1.getText().toString())))) {
                        i1 = random.nextInt(11);
                        i2 = random.nextInt(11);
                        textview1.setText(String.valueOf((long)(i1)));
                        textview3.setText(String.valueOf((long)(i2)));
                        score++;
                        textview6.setText(String.valueOf((long)(score)));
                        r = random.nextInt(4);
                        if (r == 1) {
                            textview2.setText("+");
                        }
                        if (r == 2) {
                            textview2.setText("-");
                        }
                        if (r == 3) {
                            textview2.setText("×");
                        }
                        edittext1.setText("");
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Правильно", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    else {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Ошибка", Toast.LENGTH_SHORT);
                        toast.show();
                        score = 0;
                        textview6.setText(String.valueOf((long)(score)));
                    }
                }
            }
        });
    }

    private void initializeLogic() {
        android.graphics.drawable.GradientDrawable rb1 = new android.graphics.drawable.GradientDrawable(); rb1.setColor(Color.parseColor("#2196F3"));
        rb1.setCornerRadius(30);
        button1.setBackground(rb1);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Решайте примеры, получая очки", Toast.LENGTH_SHORT);
        toast.show();
        score = 0;
        textview6.setText(String.valueOf((long)(score)));;
        i1 = random.nextInt(11);
        i2 = random.nextInt(11);;
        score = 0;
        r = random.nextInt(4);
        textview1.setText(String.valueOf((long)(i1)));
        textview3.setText(String.valueOf((long)(i2)));
        if (r == 1) {
            textview2.setText("+");
        }
        if (r == 2) {
            textview2.setText("-");
        }
        if (r == 3) {
            textview2.setText("×");
        }
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