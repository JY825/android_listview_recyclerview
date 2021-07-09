package com.example.combine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThirdActivityRecyclerview extends AppCompatActivity {

    RecyclerView recycleView;

    String s1[], s2[];
    int image[] ={R.drawable.c_plus_plus,R.drawable.c_sharp, R.drawable.java, R.drawable.javascript, R.drawable.kotlin,
            R.drawable.python, R.drawable.ruby, R.drawable. swift, R.drawable.typescript, R.drawable. visual_studio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_recyclerview);
        getSupportActionBar().setTitle("RecyclerView");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recycleView = findViewById(R.id.recyclerview);

        s1 = getResources().getStringArray(R.array.programming_languages);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter= new MyAdapter(this, s1, s2,image);
        recycleView.setAdapter(myAdapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
    }
}