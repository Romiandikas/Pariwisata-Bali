package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DenpasarActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_denpasar);

//        toolbar = findViewById(R.id.toolbar);
//        toolbar.setTitle("SharePlace");
        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_2, R.drawable.b_2, R.drawable.c_2, R.drawable.d_2};

        placeNames = new String[]{"Sanur Beach", "Nasi Bali Men Weti", "Pura Jagatnata", "Pasar Kumbasari"};

        placeGuide = new String[]{"https://goo.gl/maps/zfp788Pmqt7tJtWc6",
                "https://goo.gl/maps/R95qDoxhZKTR5Dm87",
                "https://goo.gl/maps/KkPwTCZNYZMXZX5d7",
                "https://goo.gl/maps/BnRHqjV52TeRRenq8"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DenpasarActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(DenpasarActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
