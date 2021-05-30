package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class KarangasemActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_karangasem);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_7, R.drawable.b_7, R.drawable.c_7};

        placeNames = new String[]{"Gunung Agung", "Warung Blayag Dek Ani", "Pura Besakih"};

        placeGuide = new String[]{"https://goo.gl/maps/bwutyTmsPX3mpjpX7",
                "https://goo.gl/maps/eem2EKkhCFijQzGy9",
                "https://goo.gl/maps/3FYg4FRJeSeZxgNR7"
        };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(KarangasemActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(KarangasemActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
