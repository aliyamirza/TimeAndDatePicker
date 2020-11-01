package com.example.hp.timeandpicker;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText e1J;
    Button btn1J;
    DatePickerDialog datePickerDialog;
    Calendar calendar;
    int Year,Month,Day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1J= (EditText) findViewById(R.id.e1);
        calendar=Calendar.getInstance();
        Year=calendar.get(Calendar.YEAR);
        Month=calendar.get(Calendar.MONTH);
        Day=calendar.get(Calendar.DAY_OF_MONTH);
        btn1J=(Button)findViewById(R.id.btn1);
        e1J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        e1J.setText(dayOfMonth+"/"+(month+1)+"/"+year);

                    }
                },Year,Month,Day);
                datePickerDialog.show();
            }
        });
        btn1J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,TimeActivity.class);
                startActivity(i);
            }
        });

    }
}
