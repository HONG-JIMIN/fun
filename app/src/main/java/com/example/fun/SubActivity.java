package com.example.fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView TV_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TV_result = findViewById(R.id.TV_result);

        Intent intent = getIntent();
        String str =intent.getStringExtra("str");


        TV_result.setText(str);


    }
}