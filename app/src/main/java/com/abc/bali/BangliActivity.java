package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BangliActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_bangli);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_5, R.drawable.b_5, R.drawable.c_5};

        placeNames = new String[]{"Pinggan Sunrise Spot", "Warung Jowet", "Pura Ulun Danu Batur"};

        placeGuide = new String[]{"https://goo.gl/maps/D4U4dkTsUQvZoxs48",
                "https://goo.gl/maps/UehsakE2yuLXaBhy5",
                "https://goo.gl/maps/A9hZBwABU2bjvqqZA"
        };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BangliActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(BangliActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
