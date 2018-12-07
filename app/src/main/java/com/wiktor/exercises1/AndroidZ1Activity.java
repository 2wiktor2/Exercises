package com.wiktor.exercises1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AndroidZ1Activity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton buttonInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_zadacha1);

        Button buttonDialog1 = findViewById(R.id.button_dialog1);
        Button buttonDialog2 = findViewById(R.id.button_dialog2);
        Button buttonDialog3 = findViewById(R.id.button_dialog3);
        Button buttonDialog4 = findViewById(R.id.button_dialog4);
        Button buttonDialog5 = findViewById(R.id.button_dialog5);
        buttonInfo = findViewById(R.id.button_info);

        buttonDialog1.setOnClickListener(this);
        buttonDialog2.setOnClickListener(this);
        buttonDialog3.setOnClickListener(this);
        buttonDialog4.setOnClickListener(this);
        buttonDialog5.setOnClickListener(this);
        buttonInfo.setOnClickListener(this);

        buttonInfo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(AndroidZ1Activity.this,
                        "Вы очень долго жали на кнопку",
                        Toast.LENGTH_SHORT).show();
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
            case R.id.button_dialog3:
                createListDialog();
                break;
            case R.id.button_dialog4:
                createSingleChoiceDialog();
                break;
            case R.id.button_dialog5:

                break;
            case R.id.button_info:
                createInfoDialog();
                break;
        }
    }

    private void createListDialog() {
        final String[] myColorsOfBackground = {"Синий", "Зеленый", "Оранжевый", "Красный"};
        AlertDialog.Builder dialogList = new AlertDialog.Builder(this);
        dialogList.setTitle("Смена цвета фона активити")
                .setItems(myColorsOfBackground, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {
                        // Разобрать как менять цвет фона активити
                        Toast.makeText(AndroidZ1Activity.this, "Выбран цвет :" + myColorsOfBackground[item], Toast.LENGTH_SHORT).show();
                    }
                })
                .setCancelable(false)
                .show();
    }

    private void createSingleChoiceDialog() {
        final String[] myColorsOfBackground2 = {"Синий", "Зеленый", "Оранжевый", "Красный", "Черный", "Белый"};
        final AlertDialog.Builder dialogList = new AlertDialog.Builder(this);
        dialogList.setTitle("Смена цвета фона активити")
                .setSingleChoiceItems(myColorsOfBackground2, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AndroidZ1Activity.this, "Выбран цвет :" + myColorsOfBackground2[which], Toast.LENGTH_SHORT).show();

                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
// что-то сделать не работает dialogList.cancel();
                    }
                })
                .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //dialogList.cancel();
                        // что-то сделать

                    }
                })
                .setCancelable(true)
                .show();
    }

    private void createInfoDialog() {
        AlertDialog.Builder dialogInfo = new AlertDialog.Builder(this);
        dialogInfo.setTitle("Диалог 1")
                .setMessage(R.string.infoDialogText)
                .setCancelable(false)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = dialogInfo.create();
        alert.show();
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
                        Toast.makeText(AndroidZ1Activity.this, "Нажата кнопка OK",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Midle Button", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(android.content.DialogInterface dialog, int which) {
                        Toast.makeText(AndroidZ1Activity.this, "Нажата средняя кнопка",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Cencel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(android.content.DialogInterface dialog, int which) {
                        Toast.makeText(AndroidZ1Activity.this, "Нажата кнопка Cancel",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(android.content.DialogInterface dialog) {
                        Toast.makeText(AndroidZ1Activity.this, "Вы ничего не выбрали",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

}


