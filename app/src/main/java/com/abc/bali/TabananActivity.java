package com.abc.bali;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TabananActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    int[] images;
    String[] placeNames;
    String[] placeGuide;

    @Override
    protected void  onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_tabanan);

        recyclerView = findViewById(R.id.recyclerView);

        images = new int[]{R.drawable.a_4, R.drawable.b_4, R.drawable.c_4, R.drawable.d_3};

        placeNames = new String[]{"kebun raya Bedugul", "Be Genyol Men Sedu", "Pura Batukaru", "Joger Jelek"};

        placeGuide = new String[]{"https://goo.gl/maps/F976fgq7stpmMemB6",
                "https://goo.gl/maps/PWBQFp3XXXh6RXbc8",
                "https://goo.gl/maps/7jvJTZQ7KysnjSaz8",
                "https://goo.gl/maps/R79hEWrjcxT5wSm3A"
        };

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TabananActivity.this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapterR myAdapterR = new MyAdapterR(TabananActivity.this, images, placeNames, placeGuide);
        recyclerView.setAdapter(myAdapterR);
    }
}
