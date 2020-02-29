package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class Gallery extends AppCompatActivity {

    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        FloatingActionButton fab1=(FloatingActionButton) findViewById(R.id.fabcontactus);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Contactus.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Contact us activity is oopen now",Toast.LENGTH_SHORT).show();
                finish();

            }
        });
        FloatingActionButton fab2=(FloatingActionButton) findViewById(R.id.fababoutus);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(), Aboutus.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"About us activity is oopen now",Toast.LENGTH_SHORT).show();
                finish();

            }
        });
        FloatingActionButton fab3=(FloatingActionButton) findViewById(R.id.fabteam);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Team.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Team activity is open now",Toast.LENGTH_SHORT).show();
                finish();

            }
        });
        FloatingActionButton fab4=(FloatingActionButton) findViewById(R.id.fabtechnofania);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Technofania.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Technofania activity is open now",Toast.LENGTH_SHORT).show();
                finish();

            }
        });
        FloatingActionButton fab5=(FloatingActionButton) findViewById(R.id.fabevents);
        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Events.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Events activity is open now",Toast.LENGTH_SHORT).show();
                finish();

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        in=new Intent(getApplicationContext(),Home.class);
        startActivity(in);
        finish();
    }
}
