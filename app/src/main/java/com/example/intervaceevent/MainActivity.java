package com.example.intervaceevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHello(View v)
    {
        TextView hello = findViewById(R.id.txtHello);
        hello.setText("WELCOME KOMINFO");
        System.out.println("WELCOME KOMINFO");
    }
}