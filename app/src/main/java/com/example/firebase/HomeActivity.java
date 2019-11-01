package com.example.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout,menu,inc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        menu = findViewById(R.id.menu);
       // textview = findViewById(R.id.yesno);

        btnLogout = findViewById(R.id.logout);
        inc = findViewById(R.id.inception);



        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("Opened");
                menuActivity();
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.out.println("Opened");
                incept();
            }
        });


    }

    private void menuActivity() {
        System.out.println("Opened");
        Toast.makeText(HomeActivity.this,"opened",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ThreeButtons.class);
        startActivity(intent);
    }
    private void incept() {
        System.out.println("Opened");
        Toast.makeText(HomeActivity.this,"opened",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ChooseModel.class);
        startActivity(intent);
    }

}

