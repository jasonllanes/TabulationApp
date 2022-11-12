package com.example.csg_tabulationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Minor_Sports extends AppCompatActivity {

    Button btn_badmintonmen,btn_badmintonwomen,btn_badmintondoubles,btn_tennismen,btn_tenniswomen,btn_tennisdoubles,
        btn_chessmen,btn_chesswomen,btn_scrabblemen,btn_scrabblewomen,btn_tugmen,btn_tugwomen,btn_dartmen,btn_dartwomen,btn_sepak,
        btn_patentero,btn_runningman,btn_poster,btn_sack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_sports);


        btn_badmintonmen = findViewById(R.id.btn_badmintonmen);
        btn_badmintonwomen = findViewById(R.id.btn_badmintonwomen);
        btn_badmintondoubles = findViewById(R.id.btn_badmintondoubles);
        btn_tennismen = findViewById(R.id.btn_tennismale);
        btn_tenniswomen = findViewById(R.id.btn_tenniswomen);
        btn_tennisdoubles = findViewById(R.id.btn_tennisdoubles);
        btn_chessmen = findViewById(R.id.btn_chessmen);
        btn_chesswomen = findViewById(R.id.btn_chesswomen);
        btn_scrabblemen = findViewById(R.id.btn_scrabblemen);
        btn_scrabblewomen = findViewById(R.id.btn_scrabblewomen);
        btn_tugmen = findViewById(R.id.btn_tugmen);
        btn_tugwomen = findViewById(R.id.btn_tugwomen);
        btn_dartmen = findViewById(R.id.btn_dartmen);
        btn_dartwomen = findViewById(R.id.btn_dartwomen);
        btn_sepak = findViewById(R.id.btn_sepak);
        btn_patentero = findViewById(R.id.btn_patentoro);
        btn_runningman = findViewById(R.id.btn_runningman);
        btn_poster = findViewById(R.id.btn_poster);
        btn_sack = findViewById(R.id.btn_sack);

        btn_badmintonmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Badminton(Men)");
                startActivity(intent);
            }
        });

        btn_badmintonwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Badminton(Women)");
                startActivity(intent);
            }
        });

        btn_badmintondoubles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Badminton(Doubles)");
                startActivity(intent);
            }
        });

        btn_tennismen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Table Tennis(Men)");
                startActivity(intent);
            }
        });

        btn_tenniswomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Table Tennis(Women)");
                startActivity(intent);
            }
        });

        btn_tennisdoubles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Table Tennis(Doubles)");
                startActivity(intent);
            }
        });

        btn_chessmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Chess(Men)");
                startActivity(intent);
            }
        });

        btn_chesswomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Chess(Women)");
                startActivity(intent);
            }
        });

        btn_scrabblemen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Scrabble(Men)");
                startActivity(intent);
            }
        });


        btn_scrabblewomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Scrabble(Women)");
                startActivity(intent);
            }
        });

        btn_tugmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Tug of War(Men)");
                startActivity(intent);
            }
        });

        btn_tugwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Tug of War(Women)");
                startActivity(intent);
            }
        });

        btn_dartmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Dart(Men)");
                startActivity(intent);
            }
        });

        btn_dartwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Dart(Women)");
                startActivity(intent);
            }
        });

        btn_sepak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Sepak Takraw");
                startActivity(intent);
            }
        });

        btn_patentero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Patentero");
                startActivity(intent);
            }
        });

        btn_runningman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Running Man");
                startActivity(intent);
            }
        });

        btn_poster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Poster Making");
                startActivity(intent);
            }
        });

        btn_sack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Minor_Sports.this,Tabulation.class);
                intent.putExtra("Category","Minor");
                intent.putExtra("Sport","Sack Race");
                startActivity(intent);
            }
        });




    }
}