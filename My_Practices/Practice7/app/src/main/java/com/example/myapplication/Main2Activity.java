package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class Main2Activity extends AppCompatActivity {

    EditText isim;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        isim=findViewById(R.id.et_isim);

    }

    public void showName(View view) {

        String girilen_isim = isim.getText().toString();
     // Toast.makeText(this, girilen_isim, Toast.LENGTH_LONG).show();
        Snackbar snackbar = Snackbar.make(layout, girilen_isim, Snackbar.LENGTH_LONG);
        snackbar.show();

    }

    public void goAnotherActivity(View view) {
        /*Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent); */

        //startActivity(new Intent(this,MainActivity.class));

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("isim","Bedirhan");
        startActivity(intent);

    }
}
