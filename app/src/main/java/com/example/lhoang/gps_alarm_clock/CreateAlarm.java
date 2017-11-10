package com.example.lhoang.gps_alarm_clock;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateAlarm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_alarm);
        EditText hour = (EditText) findViewById(R.id.hours);
        EditText mins = (EditText)findViewById(R.id.minutes);
        Button create = (Button)findViewById(R.id.createButton);
        Button cancel = (Button)findViewById(R.id.cancelButton);
    }

}
