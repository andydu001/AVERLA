package com.example.averla;
/*
This class implements a recycle view .
Our data base results will be posted here.

Author: Andy Duverneau

 */

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Menu2 extends AppCompatActivity {
    private ImageView ima;
    private SearchView sch;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        // Create a recycle view
        recyclerView = findViewById(R.id.recycle);
        ima = findViewById(R.id.imageView3);
        sch= findViewById(R.id.searcch);
        sch.setQueryRefinementEnabled(true);
        sch.setBackgroundColor(Color.LTGRAY);
        sch.setQueryHint("menu,drinks");
        sch.setSubmitButtonEnabled(true);

        ima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte =new Intent(Menu2.this ,MainActivity.class);
                startActivity(inte);
            }
        });

        sch.setSubmitButtonEnabled(true);


    }
}