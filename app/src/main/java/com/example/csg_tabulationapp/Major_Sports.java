package com.example.csg_tabulationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Major_Sports extends AppCompatActivity {

    Button btn_cheerdance,btn_banner,btn_hataw,btn_bands,btn_pop,
            btn_basketballmen,btn_basketballwomen,btn_volleyballmen,btn_volleyballwomen,btn_mr,btn_ms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports2);

        btn_cheerdance = findViewById(R.id.btn_cheerdance);
        btn_banner = findViewById(R.id.btn_banner);
        btn_hataw = findViewById(R.id.btn_hataw);
        btn_bands = findViewById(R.id.btn_bands);
        btn_pop = findViewById(R.id.btn_pop);

        btn_basketballmen = findViewById(R.id.btn_basketballmen);
        btn_basketballwomen = findViewById(R.id.btn_basketballwomen);
        btn_volleyballmen = findViewById(R.id.btn_volleyballmen);
        btn_volleyballwomen = findViewById(R.id.btn_volleyballwomen);
        btn_mr = findViewById(R.id.btn_mr);
        btn_ms = findViewById(R.id.btn_ms);


        btn_cheerdance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Cheerdance");
                startActivity(intent);
            }
        });

        btn_banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Banner Raising");
                startActivity(intent);
            }
        });


        btn_hataw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Hataw Sayaw");
                startActivity(intent);
            }
        });

        btn_bands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Battle of the Bands");
                startActivity(intent);
            }
        });

        btn_pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Pop Idol");
                startActivity(intent);
            }
        });




        btn_basketballmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Basketball(Men)");
                startActivity(intent);
            }
        });

        btn_basketballwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Basketball(Women)");
                startActivity(intent);
            }
        });

        btn_volleyballmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Volleyball(Men)");
                startActivity(intent);
            }
        });

        btn_volleyballwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Volleyball(Women)");
                startActivity(intent);
            }
        });

        btn_mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Mr STI 2022");
                startActivity(intent);
            }
        });

        btn_ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Major_Sports.this,Tabulation.class);
                intent.putExtra("Category","Major");
                intent.putExtra("Sport","Ms STI 2022");
                startActivity(intent);
            }
        });



    }
}