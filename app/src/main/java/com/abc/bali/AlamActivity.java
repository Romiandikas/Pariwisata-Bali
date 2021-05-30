package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AlamActivity extends AppCompatActivity {

     ActionBar actionBar;


    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_alam);

        actionBar =getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_1, R.drawable.a_2, R.drawable.a_3, R.drawable.a_4, R.drawable.a_5, R.drawable.a_6, R.drawable.a_7, R.drawable.a_8, R.drawable.a_9};

        placeNames = new String[]{"Suluban Beach", "Sanur Beach", "Bukit Campuhan", "Kebun Raya Bedugul", "Pinggan Sunrise Spot", "Nusa Penida", "Gunung Agung", "Kembar Waterfall", "Taman Nasional Bali Barat"};

        placeGuide = new String[]{"https://goo.gl/maps/jQmVYUWrjPr5HYo59",
                "https://goo.gl/maps/zfp788Pmqt7tJtWc6",
                "https://goo.gl/maps/KwGXFofBNy1CKAuy5",
                "https://goo.gl/maps/F976fgq7stpmMemB6",
                "https://goo.gl/maps/D4U4dkTsUQvZoxs48",
                "https://goo.gl/maps/nJsvnNDayCt9HeFL6",
                "https://goo.gl/maps/bwutyTmsPX3mpjpX7",
                "https://goo.gl/maps/JhvdxUWAfySdEokKA",
                "https://goo.gl/maps/AxMa2XeLcSSzwuqB6"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(AlamActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(AlamActivity.this, images, placeNames, placeGuide);
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
