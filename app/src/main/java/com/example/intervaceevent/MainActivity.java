package com.example.intervaceevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnKiri = findViewById(R.id.btnKiri);
        btnKiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Kiri diklik", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnKanan = findViewById(R.id.btnKanan);
        btnKanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Kanan diklik", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void clickHello(View v)
    {
        TextView hello = findViewById(R.id.txtHello);
        hello.setText("WELCOME KOMINFO");
        System.out.println("WELCOME KOMINFO");
    }
}