package com.abc.bali;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class KabupatenActivity extends AppCompatActivity {
    TextView textView01;
    TextView textView02;
    TextView textview03;
    TextView textview04;
    TextView textview05;
    TextView textView06;
    TextView textView07;
    TextView textview08;
    TextView textview09;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kabupaten);

        textView01 = (TextView) findViewById(R.id.textView01);
        textView02 = (TextView) findViewById(R.id.textView02);
        textview03 = (TextView) findViewById(R.id.textView03);
        textview04 = (TextView) findViewById(R.id.textView04);
        textview05 = (TextView) findViewById(R.id.textView05);
        textView06 = (TextView) findViewById(R.id.textView06);
        textView07 = (TextView) findViewById(R.id.textView07);
        textview08 = (TextView) findViewById(R.id.textView08);
        textview09 = (TextView) findViewById(R.id.textView09);


        textView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KabupatenActivity.this, BadungActivity.class);
                startActivity(intent);
            }
        });

        textView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KabupatenActivity.this, DenpasarActivity.class);
                startActivity(intent);
            }
        });

        textview03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(KabupatenActivity.this, BulelengActivity.class);
                startActivity(intent);
            }
        });

        textview04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(KabupatenActivity.this, GianyarActivity.class);
                startActivity(intent);
            }
        });

        textview05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(KabupatenActivity.this, JembranaActivity.class);
                startActivity(intent);
            }
        });
        textView06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(KabupatenActivity.this, KarangasemActivity.class);
                startActivity(intent);
            }
        });
        textView07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(KabupatenActivity.this, KlungkungActivity.class);
                startActivity(intent);
            }
        });
        textview08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(KabupatenActivity.this, TabananActivity.class);
                startActivity(intent);
            }
        });
        textview09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(KabupatenActivity.this, BangliActivity.class);
                startActivity(intent);
            }
        });
    }
}
