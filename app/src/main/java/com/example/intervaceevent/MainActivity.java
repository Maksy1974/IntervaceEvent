package com.example.intervaceevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CheckBox nasi,lauk,sayur;
    private RadioGroup status;
    private ProgressBar pb;
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
        nasi = findViewById(R.id.chkNasi);
        lauk = findViewById(R.id.chkLauk);
        status = findViewById(R.id.rgStatus);
        pb = findViewById(R.id.pbHello);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    pb.incrementProgressBy(10);
                    SystemClock.sleep(1000);
                }
            }
        });
        thread.start();

        status.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbNikah:
                        Toast.makeText(MainActivity.this, "Anda sudah menikah", Toast.LENGTH_SHORT).show();
                        //pb.setVisibility(View.VISIBLE);
                        break;
                    case R.id.rbBelumNikah:
                        Toast.makeText(MainActivity.this, "Anda Belum menikah", Toast.LENGTH_SHORT).show();
                        //pb.setVisibility(View.GONE);
                        break;
                    case R.id.rbDuda:
                        Toast.makeText(MainActivity.this, "Anda Duda kasihan deh...", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });




        if(nasi.isChecked())
        {
            //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "Nasi sudah dipesan", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Nasi belum dipesan", Toast.LENGTH_SHORT).show();
        }
        nasi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(MainActivity.this, "Anda memesan nasi", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Anda tak memesan nasi", Toast.LENGTH_SHORT).show();
                }
            }
        });

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