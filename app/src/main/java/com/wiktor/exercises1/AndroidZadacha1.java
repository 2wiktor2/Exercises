package com.wiktor.exercises1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AndroidZadacha1 extends AppCompatActivity implements View.OnClickListener {

    Button buttonDialog1, buttonDialog2;
    ImageButton buttonInfo;
    private Object DialogInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_zadacha1);

        buttonDialog1 = findViewById(R.id.button_dialog1);
        buttonDialog2 = findViewById(R.id.button_dialog2);
        buttonInfo = findViewById(R.id.button_info);

        buttonDialog1.setOnClickListener(this);
        buttonDialog2.setOnClickListener(this);
        buttonInfo.setOnClickListener(this);

        buttonInfo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(AndroidZadacha1.this,
                        "Вы очень долго жали на кнопку",
                        Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_dialog1:
                onCreateAlertDialog1Button();
                break;
            case R.id.button_dialog2:
                onCreateAlertDialog2Buttons();
                break;
            case R.id.button_info:
                break;
        }

    }


    public void onCreateAlertDialog1Button() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Диалог 1")
                .setMessage("Сообщение")
                .setCancelable(false)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = dialog.create();
        alert.show();

    }


    public void onCreateAlertDialog2Buttons() {
        AlertDialog.Builder dialog2 = new AlertDialog.Builder(this);
        dialog2.setTitle("Диалог 2")
                .setMessage("Сообщение")
                .setCancelable(true)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AndroidZadacha1.this, "Нажата кнопка OK", Toast.LENGTH_SHORT).show();
                    }
                })

                .setNegativeButton("Cencel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(android.content.DialogInterface dialog, int which) {
                        Toast.makeText(AndroidZadacha1.this, "Нажата кнопка Cancel", Toast.LENGTH_SHORT).show();

                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(android.content.DialogInterface dialog) {
                        Toast.makeText(AndroidZadacha1.this, "Вы ничего не выбрали", Toast.LENGTH_SHORT).show();

                    }
                })
                .show();


    }


}


