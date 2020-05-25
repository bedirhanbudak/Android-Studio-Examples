package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnTikla;
    Button btnTiklama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String deger =getIntent().getStringExtra("isim");
        Toast.makeText(this, deger, Toast.LENGTH_SHORT).show();

        btnTikla = findViewById(R.id.btnTikla);
        btnTikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("bedirhan","butona tıklandı");
            }
        });

        btnTiklama=findViewById(R.id.btnTiklama);
        btnTiklama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("tıklanmadı", "Cenga");
            }
        });
    }

    public void logaYaz(View view) {
        Log.d("click", "yazı");
    }
}
