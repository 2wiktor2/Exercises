package com.wiktor.exercises1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Zadacha3 extends AppCompatActivity implements View.OnClickListener {
    EditText numberIn;
    Button calculate;
    TextView result;

    int resultat = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadacha3);
        numberIn = findViewById(R.id.editTextA);
        calculate = findViewById(R.id.button_change);
        result = findViewById(R.id.text_view_changedA);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        multyplicateEachNumbers();


    }

    private void multyplicateEachNumbers() {
        //Получить число
        String innerNumber = numberIn.getText().toString();

        if (innerNumber.equals("")) {
            Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show();
        } else if (numberIn.getText().length() < 3) {
            Toast.makeText(this, "Введите ТРЕХзначное число", Toast.LENGTH_SHORT).show();
        } else {

            //Разбить на символы
            Character num1 = innerNumber.charAt(0);
            Character num2 = innerNumber.charAt(1);
            Character num3 = innerNumber.charAt(2);

            int number1 = Integer.parseInt(num1.toString());
            int number2 = Integer.parseInt(num2.toString());
            int number3 = Integer.parseInt(num3.toString());

            resultat = number1 * number2 * number3;
            //Вывести в textView
            result.setText("" + resultat);
        }
    }
}
