package com.abc.bali;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuUtama extends AppCompatActivity {
    TextView textView3;
    TextView textView4;
    TextView textview6;
    TextView textview7;
    TextView textview8;
    TextView textView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textview6 = (TextView) findViewById(R.id.textView6);
        textview7 = (TextView) findViewById(R.id.textView7);
        textview8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);


        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, AlamActivity.class);
                startActivity(intent);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, ReligiActivity.class);
                startActivity(intent);
            }
        });

        textview6.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent intent = new Intent(MenuUtama.this, KulinerActivity.class);
                startActivity(intent);
            }
        });

        textview7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuUtama.this, BelanjaActivity.class);
                startActivity(intent);
            }
        });

        textview8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MenuUtama.this, KabupatenActivity.class);
                startActivity(intent);
            }
        });

        textView9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            finish();
            System.exit(0);
            }
        });
    }
}