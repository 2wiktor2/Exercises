package com.wiktor.exercises1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Zadacha5 extends AppCompatActivity implements View.OnClickListener {

    EditText numberOfMonth;
    Button button1;
    TextView result1;

     private int number1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadacha5);

        numberOfMonth= findViewById(R.id.edit_text1);
        button1= findViewById(R.id.B1);
        result1= findViewById(R.id.text_view_result1);

        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Klick!!!", Toast.LENGTH_SHORT).show();


    }
    public void getAndSetNumber (){

    }
}
