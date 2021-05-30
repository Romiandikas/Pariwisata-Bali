package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class KlungkungActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_klungkung);

//        toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle("SharePlace");
        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_6, R.drawable.b_6, R.drawable.c_6, R.drawable.d_5};

        placeNames = new String[]{"Nusa Penida", "Warung Lesehan Merta Sari Pesinggahan", "Pura Goa Lawah", "Pasar Seni Klungkung"};

        placeGuide = new String[]{"https://goo.gl/maps/nJsvnNDayCt9HeFL6",
                "https://goo.gl/maps/W3YNHWF2GVXMdU276",
                "https://goo.gl/maps/VLPT8cWuCi6sLjAS6",
                "https://goo.gl/maps/VNPT5CqaSFdJPYU9A"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(KlungkungActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(KlungkungActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
