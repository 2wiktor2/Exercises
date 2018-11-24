package com.wiktor.exercises1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Zadacha6 extends AppCompatActivity implements View.OnClickListener {

    TextView textViewBottom;
    EditText num1, num2;
    Button buttonX;

    int numb1, numb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadacha6);

        num1 = findViewById(R.id.edit_text1);
        num2 = findViewById(R.id.edit_text2);
        buttonX = findViewById(R.id.button1);
        textViewBottom = findViewById(R.id.text_view_bottom);

        buttonX.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        numb1 = Integer.parseInt(num1.getText().toString());
        if (!num1.getText().toString().equals("")) {

            textViewBottom.setText("" + numb1);
        } else textViewBottom.setText("Введите число");

    }
}
