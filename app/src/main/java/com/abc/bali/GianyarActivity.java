package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GianyarActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_gianyar);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_3, R.drawable.b_3, R.drawable.c_3, R.drawable.d_3};

        placeNames = new String[]{"Bukit Campuhan", "Babi Guling Pande Egi", "Tirta Empul", "Pasar Seni Sukawati"};

        placeGuide = new String[]{"https://goo.gl/maps/KwGXFofBNy1CKAuy5",
                "https://g.page/babigulingpandeegi?share",
                "https://goo.gl/maps/HPXTxeL76pXBQJ4cA",
                "https://goo.gl/maps/bj545BVYRNj4yGoZA"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(GianyarActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(GianyarActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
