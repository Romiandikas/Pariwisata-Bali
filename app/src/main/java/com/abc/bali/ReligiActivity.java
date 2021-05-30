package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ReligiActivity extends AppCompatActivity {

    ActionBar actionBar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_religi);
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.c_1, R.drawable.c_2, R.drawable.c_3, R.drawable.c_4, R.drawable.c_5, R.drawable.c_6, R.drawable.c_7, R.drawable.c_8, R.drawable.c_9};

        placeNames = new String[]{"Pura Uluwatu", "Pura Jagatnatha", "Tirta Empul", "Pura Batukaru", "Pura Ulun Danu Batur", "Pura Goa Lawah", "Pura Besakih", "Pura Pulaki", "Pura Menjangan"};

        placeGuide = new String[]{"https://goo.gl/maps/jnA4NQqDWwSud6n99",
                "https://goo.gl/maps/KkPwTCZNYZMXZX5d7",
                "https://goo.gl/maps/HPXTxeL76pXBQJ4cA",
                "https://goo.gl/maps/7jvJTZQ7KysnjSaz8",
                "https://goo.gl/maps/A9hZBwABU2bjvqqZA",
                "https://goo.gl/maps/VLPT8cWuCi6sLjAS6",
                "https://goo.gl/maps/3FYg4FRJeSeZxgNR7",
                "https://goo.gl/maps/QTFVthezexnyPtNb7",
                "https://goo.gl/maps/6L6LtESmz463BLUf6"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ReligiActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(ReligiActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
