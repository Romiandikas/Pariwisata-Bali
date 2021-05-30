package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class JembranaActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_jembrana);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_9, R.drawable.b_9, R.drawable.c_9};

        placeNames = new String[]{"Taman Nasional Bali Barat", "Ayam Betutu Men Tempeh", "Pura Menjangan"};

        placeGuide = new String[]{"https://goo.gl/maps/AxMa2XeLcSSzwuqB6",
                "https://goo.gl/maps/kDisugFF4sDQXM2Q8",
                "https://goo.gl/maps/6L6LtESmz463BLUf6"
           };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(JembranaActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(JembranaActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
