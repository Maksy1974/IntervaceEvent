package com.example.intervaceevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnKiri = findViewById(R.id.btnKiri);
        btnKiri.setOnClickListener(this);
        Button btnKanan = findViewById(R.id.btnKanan);
        btnKanan.setOnClickListener(this);
        EditText edtH = findViewById(R.id.edtHello);
        edtH.setOnClickListener(this);

//        Button btnKiri = findViewById(R.id.btnKiri);
//        btnKiri.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Button Kiri diklik", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        Button btnKanan = findViewById(R.id.btnKanan);
//        btnKanan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Button Kanan diklik", Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    public void clickHello(View v)
    {
        TextView hello = findViewById(R.id.txtHello);
        hello.setText("WELCOME KOMINFO");
        System.out.println("WELCOME KOMINFO");
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnKiri:
                Toast.makeText(MainActivity.this, "Button Kiri diklik", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnKanan:
                Toast.makeText(MainActivity.this, "Button Kanan diklik", Toast.LENGTH_SHORT).show();
                break;
            case R.id.edtHello:
                Toast.makeText(MainActivity.this, "Text diklik", Toast.LENGTH_SHORT).show();
                break;
                default:
                //Toast.makeText(MainActivity.this, "Button Kanan diklik", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}