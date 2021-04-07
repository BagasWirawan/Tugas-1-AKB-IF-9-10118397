package com.example.a10118397;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Log2Activity extends AppCompatActivity {

    private Button log2,reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log2);

        //inisialisasi
        log2 = findViewById(R.id.log2);
        reg = findViewById(R.id.reg);

        log2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Log2Activity.this, MainActivity.class);
                startActivity(i);

            }


        });
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Log2Activity.this, RegActivity.class);
                startActivity(i);
            }
        });
    }
}