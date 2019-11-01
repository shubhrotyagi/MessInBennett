package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MenuAgain extends AppCompatActivity {
    Button menuforeyes,menuforno;
    ImageView imga;
    DatabaseReference reff;
    Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_again);
        menuforeyes = findViewById(R.id.menuyes);
        imga = findViewById(R.id.imageView1);
        menuforno = findViewById(R.id.menuno);
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        member= new Member();



        menuforeyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                member.setYesorno(menuforeyes.getText().toString().trim());
                System.out.println(menuforeyes.getText().toString());
                System.out.println(member);
                reff.push().setValue(member);
                Toast.makeText(MenuAgain.this,"uploaded",Toast.LENGTH_SHORT).show();
            }
        });
        menuforno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                member.setYesorno(menuforno.getText().toString().trim());
                System.out.println(menuforno.getText().toString());
                System.out.println(member);
                reff.push().setValue(member);
                Toast.makeText(MenuAgain.this,"uploaded",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
