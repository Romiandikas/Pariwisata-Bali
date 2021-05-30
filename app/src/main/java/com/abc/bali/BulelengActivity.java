package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BulelengActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_buleleng);

//        toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle("SharePlace");
        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_8, R.drawable.b_8, R.drawable.c_8, R.drawable.d_6};

        placeNames = new String[]{"Kembar Waterfall", "Siobak Khe Lok", "Pura Pulaki", "Krisna Oleh-Oleh"};

        placeGuide = new String[]{"https://goo.gl/maps/JhvdxUWAfySdEokKA",
                "https://goo.gl/maps/68q4c4Zuc8NDWc2k7",
                "https://goo.gl/maps/QTFVthezexnyPtNb7",
                "https://goo.gl/maps/jQTkETa4mTJy5Bd79"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BulelengActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(BulelengActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
