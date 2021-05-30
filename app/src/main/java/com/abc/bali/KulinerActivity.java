package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;


public class KulinerActivity extends AppCompatActivity{
    ActionBar actionBar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_kuliner);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.b_1, R.drawable.b_2, R.drawable.b_3, R.drawable.b_4, R.drawable.b_5, R.drawable.b_6, R.drawable.b_7, R.drawable.b_8, R.drawable.b_9};

        placeNames = new String[]{"Nasi Ayam Bu Oki", "Nasi Bali Men Weti", "Babi Guling Pande Egi", "Be Genyol Men Sedu", "Warung Jowet", "Warung Lesehan Mertasari Pesinggahan", "Warung Blayag Dek Ani", "Siobak Khe Lok", "Ayam Betutu Men Tempeh"};

        placeGuide = new String[]{"https://goo.gl/maps/aGQCJiYwjdzJNHpm7",
                "https://goo.gl/maps/R95qDoxhZKTR5Dm87",
                "https://g.page/babigulingpandeegi?share",
                "https://goo.gl/maps/PWBQFp3XXXh6RXbc8",
                "https://goo.gl/maps/UehsakE2yuLXaBhy5",
                "https://goo.gl/maps/W3YNHWF2GVXMdU276",
                "https://goo.gl/maps/eem2EKkhCFijQzGy9",
                "https://goo.gl/maps/68q4c4Zuc8NDWc2k7",
                "https://goo.gl/maps/kDisugFF4sDQXM2Q8"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(KulinerActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterK myAdapterk = new MyAdapterK(KulinerActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterk);
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
