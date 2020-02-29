package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

import java.net.URI;

public class Aboutus extends AppCompatActivity {
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        TextView aboutusdesc = (TextView)findViewById(R.id.aboutusdesc);
        aboutusdesc.setText(Html.fromHtml(getString(R.string.aboutus)));
        TextView visiondesc = (TextView)findViewById(R.id.visiondesc);
        visiondesc.setText(Html.fromHtml(getString(R.string.visiondesc)));
        TextView missiondesc = (TextView)findViewById(R.id.missiondesc);
        missiondesc.setText(Html.fromHtml(getString(R.string.missiondesc)));
        TextView clubhierarchydesc = (TextView)findViewById(R.id.clubhierarchydesc);
        clubhierarchydesc.setText(Html.fromHtml(getString(R.string.clubhierdesc)));
        TextView technologiesdesc = (TextView)findViewById(R.id.technologydesc);
        technologiesdesc.setText(Html.fromHtml(getString(R.string.technologiesdesc)));



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
        FloatingActionButton fab2=(FloatingActionButton) findViewById(R.id.fabgallery);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(), Gallery.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Gallery activity is oopen now",Toast.LENGTH_SHORT).show();
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
