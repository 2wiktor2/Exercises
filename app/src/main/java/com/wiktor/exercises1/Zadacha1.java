package com.wiktor.exercises1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Zadacha1 extends AppCompatActivity implements View.OnClickListener {

    int a, b, x = 0;
    Button change;
    EditText numberA, numberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadacha1);

        change = findViewById(R.id.button_change);
        numberA = findViewById(R.id.editTextA);
        numberB = findViewById(R.id.editTextB);

        change.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {
            a = Integer.parseInt(numberA.getText().toString());
            b = Integer.parseInt(numberB.getText().toString());
        } catch (NumberFormatException e){
            a=0;
            b=0;
        }
        x = a;
        a = b;
        b = x;
        numberA.setText("" + a);
        numberB.setText("" + b);

    }
}
