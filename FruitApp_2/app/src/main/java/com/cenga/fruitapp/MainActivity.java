package com.cenga.fruitapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import adapters.MeyveAdapter;

public class MainActivity<Meyve> extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Meyve> meyveListesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById((R.id.list_meyveler));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MeyveAdapter adapter = new MeyveAdapter(this, meyveListesi);
        recyclerView.setAdapter(adapter);

        meyveListesi.add(new Meyve("Ananas", "10₺", "100", "Ananas açıklama", R.drawable.ananas));
        meyveListesi.add(new Meyve("Armut", "2₺", "500", "Armut açıklama", R.drawable.armut));
        meyveListesi.add(new Meyve("Çilek", "3₺", "300", "Çilek açıklama", R.drawable.cilek));
        meyveListesi.add(new Meyve("Elma", "1₺", "1000", "Elma açıklama", R.drawable.elma));


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ButtonActivity.class));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;

        } else if (id == R.id.action_profile) {
            //Profil sayfasını aç
            startActivity(new Intent(MainActivity.this, ProfileActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}
