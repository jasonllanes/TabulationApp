package com.example.csg_tabulationapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Tabulation extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();


    TextView tv_sports,tv_sphinx,tv_griffin,tv_phoenix;
    EditText et_sphinx,et_griffin,et_phoenix;
    Button btn_submit;

    String sphinx,griffin,phoenix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabulation);

        String category = getIntent().getStringExtra("Category");
        String sport = getIntent().getStringExtra("Sport");

        tv_sports = findViewById(R.id.tv_sport);
        tv_sphinx = findViewById(R.id.tv_sphinx);
        tv_griffin = findViewById(R.id.tv_griffin);
        tv_phoenix = findViewById(R.id.tv_phoenix);
        btn_submit = findViewById(R.id.btn_submit);
        et_sphinx = findViewById(R.id.et_sphinx);
        et_griffin = findViewById(R.id.et_griffin);
        et_phoenix = findViewById(R.id.et_phoenix);

        tv_sports.setText(sport);




        DatabaseReference myRef = database.getReference(category);
        DatabaseReference data = database.getReference(category + "/" + sport );
        data.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                tv_sphinx.setText(snapshot.child("sphinx").getValue(String.class));
                tv_griffin.setText(snapshot.child("griffin").getValue(String.class));
                tv_phoenix.setText(snapshot.child("phoenix").getValue(String.class));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sphinx = et_sphinx.getText().toString();
                griffin = et_griffin.getText().toString();
                phoenix = et_phoenix.getText().toString();


                Score s = new Score(sphinx,griffin,phoenix);
                myRef.child(sport).setValue(s).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(Tabulation.this, "Successfully Updated!", Toast.LENGTH_SHORT).show();
                        et_sphinx.setText("0");
                        et_griffin.setText("0");
                        et_phoenix.setText("0");
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Tabulation.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });



    }
}