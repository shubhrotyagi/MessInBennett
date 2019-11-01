package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThreeButtons extends AppCompatActivity {

    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_buttons);
        btn1=findViewById(R.id.breakfast);
        btn2=findViewById(R.id.lunch);
        btn3=findViewById(R.id.dinner);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forBreakfast();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forLunch();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forDinner();
            }
        });
    }
    private void forBreakfast() {
        System.out.println("Opened");
        Toast.makeText(ThreeButtons.this,"Breakfast",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MenuAgain.class);
       startActivity(intent);
    }
    private void forLunch() {
        System.out.println("Opened");
        Toast.makeText(ThreeButtons.this,"Lunch",Toast.LENGTH_SHORT).show();
       // Intent intent = new Intent(this, Menu.class);
      //  startActivity(intent);
    }
    private void forDinner() {
        System.out.println("Opened");
        Toast.makeText(ThreeButtons.this,"Dinner",Toast.LENGTH_SHORT).show();
     //   Intent intent = new Intent(this, Menu.class);
       // startActivity(intent);
    }
}
