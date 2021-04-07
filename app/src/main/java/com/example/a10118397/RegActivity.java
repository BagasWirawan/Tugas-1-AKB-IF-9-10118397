package com.example.a10118397;




import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegActivity extends AppCompatActivity {




    private Button reg, batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        //inisialisasi
        reg = findViewById(R.id.reg);
        batal = findViewById(R.id.batal);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegActivity.this, Log2Activity.class);
                startActivity(i);
            }
        });

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegActivity.this, Log2Activity.class);
                startActivity(i);
            }
        });

    }
}