package com.example.combine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SecondActivityyCustomelistview extends AppCompatActivity {

    ListView listView;

    String[] numberWord={"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

    int[] numberImage={R.drawable.one,R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six
            , R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activityy_customelistview);
        getSupportActionBar().setTitle("Custom List View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView =findViewById(R.id.list_view);

        MainAdapter adapter= new MainAdapter(SecondActivityyCustomelistview.this, numberWord, numberImage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(SecondActivityyCustomelistview.this, SesecondActivityCustomelistview.class);
                intent.putExtra("image",numberImage[position]);
                intent.putExtra("word",numberWord[position]);
                startActivity(intent);

            }
        });

    }
}