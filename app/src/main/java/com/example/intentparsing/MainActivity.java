package com.example.intentparsing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btnNext;
    EditText name,rollNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.etName);
        rollNum = findViewById(R.id.etRollNum);
        btnNext = findViewById(R.id.btnNext);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("roll num",rollNum.getText().toString());
                startActivity(intent);
            }
        });
    }
}