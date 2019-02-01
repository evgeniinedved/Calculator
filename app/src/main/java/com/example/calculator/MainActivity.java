package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7,button8,
            button9, buttonC, buttonPlus, buttonMinus, buttonMulti, buttonDiv, buttonEquals,
            buttonSqrt, buttonDot, buttonSign, buttonPower;

    EditText EditText_1;

    float ValueOne, ValueTwo;

    boolean Substraction, Difference, Multiplication, Division, ChangeSign, Power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonEquals = (Button) findViewById(R.id.buttonequals);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonSqrt = (Button) findViewById(R.id.buttonSqrt);
        buttonSign = (Button) findViewById(R.id.buttonSign);
        buttonPower = (Button) findViewById(R.id.buttonPower);
        EditText_1 = (EditText) findViewById(R.id.editText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + "0");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if (EditText_1 == null) {
//                    EditText_1.setText("");
//                }
                if(TextUtils.isEmpty(EditText_1.getText().toString())){
                    Toast.makeText(MainActivity.this,"Input value first!",Toast.LENGTH_SHORT).show();
                }
                else {
                    ValueOne = Float.parseFloat(EditText_1.getText() + "");
                    Substraction = true;
                    EditText_1.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(EditText_1.getText().toString())){
                    Toast.makeText(MainActivity.this,"Input value first!",Toast.LENGTH_SHORT).show();
                }
                else{
                    ValueOne = Float.parseFloat(EditText_1.getText() + "");
                    Difference = true;
                    EditText_1.setText(null);
                }
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(EditText_1.getText().toString())){
                    Toast.makeText(MainActivity.this,"Input value first!",Toast.LENGTH_SHORT).show();
                }
                else {
                    ValueOne = Float.parseFloat(EditText_1.getText() + "");
                    Multiplication = true;
                    EditText_1.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(EditText_1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Input value first!", Toast.LENGTH_SHORT).show();
                } else {
                    ValueOne = Float.parseFloat(EditText_1.getText() + "");
                    Division = true;
                    EditText_1.setText(null);
                }
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(EditText_1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Make some math operation!", Toast.LENGTH_SHORT).show();
                } else
                ValueTwo = Float.parseFloat(EditText_1.getText() + "");

                if (Substraction) {
                    EditText_1.setText(ValueOne + ValueTwo + "");
                    Substraction = false;
                }

                if (Difference) {
                    EditText_1.setText(ValueOne - ValueTwo + "");
                    Difference = false;
                }

                if (Multiplication) {
                    EditText_1.setText(ValueOne * ValueTwo + "");
                    Multiplication = false;
                }

                if (Division) {
                    EditText_1.setText(ValueOne / ValueTwo + "");
                    Division = false;
                }

            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(EditText_1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Input value first!", Toast.LENGTH_SHORT).show();
                } else {
                    ValueOne = Float.parseFloat(EditText_1.getText() + "");
                    EditText_1.setText(Math.sqrt(ValueOne) + "");
                }
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(EditText_1.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Input value first!", Toast.LENGTH_SHORT).show();
                } else {
                    ValueOne = Float.parseFloat(EditText_1.getText() + "");
                    EditText_1.setText(Math.pow(ValueOne,2) + "");
                }
            }
        });


        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(TextUtils.isEmpty(EditText_1.getText().toString())){
                        EditText_1.setText(EditText_1.getText()+"-");
                    }
                    else {
                        EditText_1.setText(null);
                    }
                }
                catch (NumberFormatException ex){
                    EditText_1.setText(null);

                }
            }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText_1.setText(EditText_1.getText() + ".");
            }
        });
    }
}


