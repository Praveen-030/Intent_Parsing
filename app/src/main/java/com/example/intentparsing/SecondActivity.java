package com.example.intentparsing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    String name,rollNum;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.tvView);
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        rollNum = intent.getStringExtra("roll num");
        a = Integer.parseInt(rollNum);

        textView.setText("name : " + name + "\nroll Num : " + a);





    }
}