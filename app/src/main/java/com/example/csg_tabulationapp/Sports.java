package com.example.csg_tabulationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sports extends AppCompatActivity {

    Button btn_major,btn_minor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        btn_major = findViewById(R.id.btn_major);
        btn_minor = findViewById(R.id.btn_minor);


        btn_major.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sports.this, Major_Sports.class);
                intent.putExtra("Category","Major");
                startActivity(intent);
            }
        });

        btn_minor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Sports.this, Minor_Sports.class);
                intent.putExtra("Category","Minor");
                startActivity(intent);
            }
        });

    }
}