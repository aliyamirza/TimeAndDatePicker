package com.example.hp.timeandpicker;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimeActivity extends AppCompatActivity {

    EditText et2;
    TimePickerDialog timePickerDialog;
    Calendar calendar;
    int hr,min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        et2=(EditText) findViewById(R.id.et2);
        calendar=Calendar.getInstance();
        hr=calendar.get(calendar.HOUR_OF_DAY);
        min=calendar.get(calendar.MINUTE);
        et2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                timePickerDialog=new TimePickerDialog(TimeActivity.this,new TimePickerDialog.OnTimeSetListener(){

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        et2.setText(hourOfDay+":"+minute);

                    }
                },hr,min,false);
                timePickerDialog.show();
            }
        });


    }
}
