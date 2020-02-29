package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class Home extends AppCompatActivity {
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView im = (ImageView)findViewById(R.id.logo);
        ImageView heart = (ImageView)findViewById(R.id.heart);
        TextView textView=(TextView)findViewById(R.id.title);
        Animation an= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink_anim);
        textView.startAnimation(an);
        heart.startAnimation(an);
        im.startAnimation(an);
        RelativeLayout rl= (RelativeLayout)findViewById(R.id.clickit);

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Press Floating Button in Bottom Right for menu",Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton fab6=(FloatingActionButton) findViewById(R.id.fabgallery);
        fab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Gallery.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Gallery activity is oopen now",Toast.LENGTH_SHORT).show();
                finish();

            }
        });
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
                in=new Intent(getApplicationContext(),Aboutus.class);
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
}
