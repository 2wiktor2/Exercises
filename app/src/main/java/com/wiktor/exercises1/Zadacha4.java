package com.wiktor.exercises1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Zadacha4 extends AppCompatActivity implements View.OnClickListener {

 /*    // Даны три числа. Если сумма первых двух чисел равна третьему числу,
       // то найти сумму квадратов данных трех чисел,
       // иначе найти разность между первым числом и третьим.
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int res1;
        if (a + b == c) {
        res1 = (a * a) + (b * b) + (c * c);
        System.out.println(res1);
    } else {
        res1 = a-c;
        System.out.println(res1);
    }                                                            */

    EditText inNumber1, inNumber2, inNumber3;
    Button calculate;
    TextView result;

    int resV1;
    int a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadacha4);

        inNumber1 = findViewById(R.id.number1);
        inNumber2 = findViewById(R.id.number2);
        inNumber3 = findViewById(R.id.number3);

        calculate = findViewById(R.id.button_calc);
        result = findViewById(R.id.text_view_result);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "кнопка работает. И это очень радует!!!", Toast.LENGTH_LONG).show();

        String s1 = inNumber1.getText().toString();
        String s2 = inNumber2.getText().toString();
        String s3 = inNumber3.getText().toString();


        if (!s1.equals("") ||
                !s2.equals("") ||
                !s2.equals("")) {

            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            c = Integer.parseInt(s3);
            if (a + b == c) {
                resV1 = (a * a) + (b * b) + (c * c);
                result.setText("" + resV1);

            } else {
                resV1 = a - c;
                result.setText("" + resV1);
            }

        } else Toast.makeText(this, "Введите 3 числа", Toast.LENGTH_LONG).show();


    }
}


