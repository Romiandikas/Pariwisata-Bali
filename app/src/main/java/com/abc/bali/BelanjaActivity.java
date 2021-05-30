package com.abc.bali;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BelanjaActivity extends AppCompatActivity {

    ActionBar actionBar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void onCreate(Bundle savedInstancedState) {
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_belanja);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.d_1, R.drawable.d_2, R.drawable.d_3, R.drawable.d_4, R.drawable.d_5, R.drawable.d_6};

        placeNames = new String[]{"The Keranjang", "Pasar Kumbasari", "Pasar Seni Sukawati", "Joger Jelek", "Pasar Seni Klungkung", "Krisna Bali"};

        placeGuide = new String[]{"https://goo.gl/maps/WYYTn5LUqp7ZJ7x56",
                "https://goo.gl/maps/BnRHqjV52TeRRenq8",
                "https://goo.gl/maps/bj545BVYRNj4yGoZA",
                "https://goo.gl/maps/R79hEWrjcxT5wSm3A",
                "https://goo.gl/maps/VNPT5CqaSFdJPYU9A",
                "https://goo.gl/maps/jQTkETa4mTJy5Bd79"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(BelanjaActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(BelanjaActivity.this, images, placeNames, placeGuide);
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
