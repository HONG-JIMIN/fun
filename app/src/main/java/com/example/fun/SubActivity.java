package com.example.fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView TV_result;
    private Button BT_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        BT_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        TV_result = findViewById(R.id.TV_result);
        BT_back = findViewById(R.id.BT_back);

        Intent intent = getIntent();
        String str =intent.getStringExtra("str");


        TV_result.setText(str);


    }
}