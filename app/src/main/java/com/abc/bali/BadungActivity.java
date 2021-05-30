package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BadungActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_badung);

//        toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle("SharePlace");
        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_1, R.drawable.b_1, R.drawable.c_1, R.drawable.d_4};

        placeNames = new String[]{"Suluban Beach", "Nasi Ayam Bu Oki", "Pura Uluwatu", "The Keranjang"};

        placeGuide = new String[]{"https://goo.gl/maps/jQmVYUWrjPr5HYo59",
                "https://goo.gl/maps/aGQCJiYwjdzJNHpm7",
                "https://goo.gl/maps/KwGXFofBNy1CKAuy5",
                "https://goo.gl/maps/WYYTn5LUqp7ZJ7x56"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BadungActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(BadungActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
