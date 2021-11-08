package com.example.fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button BT_send;
    private EditText ET_user;
    private String str;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_user = findViewById(R.id.ET_user);
        BT_send = findViewById(R.id.BT_send);


        BT_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = ET_user.getText().toString();
                Intent intent = new Intent(MainActivity.this , SubActivity.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });

    }
}