package com.wiktor.exercises1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button exercise1, exercise2, exercise3,exercise4,exercise5;
    Button exerciseAndroid1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exercise1 = findViewById(R.id.zadacha1);
        exercise2 = findViewById(R.id.zadacha2);
        exercise3 = findViewById(R.id.zadacha3);
        exercise4 = findViewById(R.id.zadacha4);
        exercise5 = findViewById(R.id.zadacha5);

        exerciseAndroid1 = findViewById(R.id.android_zadacha1);

        exercise1.setOnClickListener(this);
        exercise2.setOnClickListener(this);
        exercise3.setOnClickListener(this);
        exercise4.setOnClickListener(this);
        exercise5.setOnClickListener(this);
        exerciseAndroid1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zadacha1:
                Intent intent_zadacha1 = new Intent(this, Zadacha1.class);
                startActivity(intent_zadacha1);
                break;
            case R.id.zadacha2:
                Intent intent_zadacha2 = new Intent(this, Zadacha2.class);
                startActivity(intent_zadacha2);
                break;
                case R.id.zadacha3:
                Intent intent_zadacha3 = new Intent(this, Zadacha3.class);
                startActivity(intent_zadacha3);
                break;
                case R.id.zadacha4:
                Intent intent_zadacha4 = new Intent(this, Zadacha4.class);
                startActivity(intent_zadacha4);
                break;
                case R.id.zadacha5:
                Intent intent_zadacha5 = new Intent(this, Zadacha5.class);
                startActivity(intent_zadacha5);
                break;

            case R.id.android_zadacha1:
                Intent intent_android_zadacha1 = new Intent(this, AndroidZadacha1.class);
                startActivity(intent_android_zadacha1);
                break;
        }
    }
}
