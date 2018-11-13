package com.wiktor.exercises1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Zadacha2 extends AppCompatActivity implements View.OnClickListener {

    EditText numberIn;
    Button revers;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadacha2);
        numberIn = findViewById(R.id.editTextA);
        revers = findViewById(R.id.button_change);
        result = findViewById(R.id.text_view_changedA);

        revers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        reversNumbers();
    }

    private void reversNumbers() {
        //Получить число
        String innerNumber = numberIn.getText().toString();
        //Разбить на символы

        Character num1 = innerNumber.charAt(0);
        Character num2 = innerNumber.charAt(1);
        Character num3 = innerNumber.charAt(2);


        //собрать символы в стоку
        String outerNumber = String.valueOf(num3 + "" + num2 + "" + num1);

        //Вывести в textView
        result.setText(outerNumber);


    }
}
