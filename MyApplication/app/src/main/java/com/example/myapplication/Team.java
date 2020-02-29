package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class Team extends AppCompatActivity {
    Intent in;
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        FloatingActionButton fab1=(FloatingActionButton) findViewById(R.id.fabcontactus);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Contactus.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Contact us activity is oopen now",Toast.LENGTH_SHORT).show();

            }
        });
        FloatingActionButton fab2=(FloatingActionButton) findViewById(R.id.fababoutus);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Aboutus.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"About us activity is oopen now",Toast.LENGTH_SHORT).show();

            }
        });
        FloatingActionButton fab3=(FloatingActionButton) findViewById(R.id.fabgallery);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Gallery.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Gallery activity is open now",Toast.LENGTH_SHORT).show();

            }
        });
        FloatingActionButton fab4=(FloatingActionButton) findViewById(R.id.fabtechnofania);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Technofania.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Technofania activity is open now",Toast.LENGTH_SHORT).show();

            }
        });
        FloatingActionButton fab5=(FloatingActionButton) findViewById(R.id.fabevents);
        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Events.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Events activity is open now",Toast.LENGTH_SHORT).show();

            }
        });


        btn1=(Button)findViewById(R.id.batch_2020);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Batch_2020.class);
                startActivity(in);
            }
        });


        btn2=(Button)findViewById(R.id.batch_2021);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Batch_2021.class);
                startActivity(in);
            }
        });


        btn3=(Button)findViewById(R.id.batch_2022);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Batch_2022.class);
                startActivity(in);
            }
        });


    }
    public void onBackPressed() {
        super.onBackPressed();
        in=new Intent(getApplicationContext(),Home.class);
        startActivity(in);
        finish();
    }
    }
