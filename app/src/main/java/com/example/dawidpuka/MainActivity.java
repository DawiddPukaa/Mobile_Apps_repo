package com.example.dawidpuka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_student_mark);
    }

    public void check(View v) {
        EditText grade = (EditText) findViewById(R.id.editTextAvergrade);
        EditText name = (EditText) findViewById(R.id.editTextName);
        EditText surName = (EditText) findViewById(R.id.editTextSurname);
        TextView result = (TextView) findViewById(R.id.textViewResult2);

        String nameS = String.valueOf(name.getText().toString());
        String surNameS = String.valueOf(surName.getText().toString());
        String resText = "Sudent: " + nameS + " " + surNameS;

        double avGrade = Double.valueOf(grade.getText().toString());

        if (avGrade < 4.5) {
            result.setText(resText + " didn't get scholarship");
        } else {
            result.setText(resText + " get scholarship");
        }
    }

}