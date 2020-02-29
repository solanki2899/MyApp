package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class Contactus extends AppCompatActivity {
    Intent in;
    ImageView call_sunil,call_rakshat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

       call_sunil = (ImageView) findViewById(R.id.call_sunil);
        call_sunil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ActivityCompat.checkSelfPermission(Contactus.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    ActivityCompat.requestPermissions(Contactus.this,new String[]{
                            Manifest.permission.CALL_PHONE
                    },1);
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                } else
                {
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:8802487442"));
                    startActivity(i);
                }

            }
        });

        call_rakshat = (ImageView) findViewById(R.id.call_rakshat);
        call_rakshat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ActivityCompat.checkSelfPermission(Contactus.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    ActivityCompat.requestPermissions(Contactus.this,new String[]{
                            Manifest.permission.CALL_PHONE
                    },1);
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                } else
                {
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:9522222459"));
                    startActivity(i);
                }

            }
        });



        com.google.android.material.floatingactionbutton.FloatingActionButton wordpress = findViewById(R.id.wordpress);
        wordpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://osocnitt.wordpress.com/");
                Intent launch = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(launch);
            }
        });

        com.google.android.material.floatingactionbutton.FloatingActionButton facebook = findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://www.facebook.com/groups/633779233333438/");
                Intent launch = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(launch);
            }
        });

        com.google.android.material.floatingactionbutton.FloatingActionButton technofania = findViewById(R.id.technofania);
        technofania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri=Uri.parse("https://technofania.com/");
                Intent launch = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(launch);
            }
        });

        FloatingActionButton fab1=(FloatingActionButton) findViewById(R.id.fabgallery);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Gallery.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Gallery activity is oopen now",Toast.LENGTH_SHORT).show();
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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==1)
        {
            if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
               call_sunil.callOnClick();
            }
            else
            {
                Toast.makeText(Contactus.this,"Permission Denied",Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void onBackPressed() {
        super.onBackPressed();
        in=new Intent(getApplicationContext(),Home.class);
        startActivity(in);
        finish();
    }
}

