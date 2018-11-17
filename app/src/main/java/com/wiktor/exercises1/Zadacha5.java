package com.wiktor.exercises1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Zadacha5 extends AppCompatActivity implements View.OnClickListener {

    EditText numberOfMonthIN;
    Button button1;
    TextView result1, result2;

    private int number1;
    String numberOfMonth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zadacha5);

        numberOfMonthIN = findViewById(R.id.edit_text1);
        button1 = findViewById(R.id.B1);
        result1 = findViewById(R.id.text_view_result1);
        result2 = findViewById(R.id.text_view_resultSeason);

        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Klick!!!", Toast.LENGTH_SHORT).show();

        if (getAndSetNumber()) {
            result1.setText("Введите номер месяца");
        } else {
            number1 = Integer.parseInt(numberOfMonth);
            choiсeMounth(number1);
            choiceSeason(number1);

        }
    }


    public boolean getAndSetNumber() {
        // Получить число из EditText
        numberOfMonth = numberOfMonthIN.getText().toString();
        return numberOfMonthIN.getText().toString().equals("");

    }

    public void choiсeMounth(int number1) {
        switch (number1) {
            case 1:
                result1.setText("Январь");
                break;
            case 2:
                result1.setText("Февраль");
                break;
            case 3:
                result1.setText("Март");
                break;
            case 4:
                result1.setText("Апрель");
                break;
            case 5:
                result1.setText("Май");
                break;
            case 6:
                result1.setText("Июнь");
                break;
            case 7:
                result1.setText("Июль");
                break;
            case 8:
                result1.setText("Август");
                break;
            case 9:
                result1.setText("Сентябрь");
                break;
            case 10:
                result1.setText("Октябрь");
                break;
            case 11:
                result1.setText("Ноябрь");
                break;
            case 12:
                result1.setText("Декабрь");
                break;
            default:
                result1.setText("Введите номер месяца от1 до 12");
        }
    }

    public void choiceSeason(int number1) {
        switch (number1) {
            case (12):
            case (1):
            case (2):
                result2.setText("Зима");
                //result2.setTextColor();
                break;
            case (3):
            case (4):
            case (5):
                result2.setText("Весна");
                break;
            case (6):
            case (7):
            case (8):
                result2.setText("Лето");
                break;
            case (9):
            case (10):
            case (11):
                result2.setText("Осень");
                break;
            default:
                result2.setText("Так не бывает");
        }

    }


}
