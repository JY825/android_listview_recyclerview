package com.example.combine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Custom List View and RecyclerView");

    }

    public void btnCustom(View view) {
        Intent intent= new Intent(this,SecondActivityyCustomelistview.class);
        startActivity(intent);
    }

    public void btnRecycler(View view) {
        Intent intent= new Intent(this,ThirdActivityRecyclerview.class);
        startActivity(intent);
    }
}