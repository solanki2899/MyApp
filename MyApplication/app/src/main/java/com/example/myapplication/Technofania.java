package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class Technofania extends AppCompatActivity {
    Intent in;
    View view;
    @SuppressLint("InflateParams")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technofania);
        ImageView agamya=(ImageView)findViewById(R.id.agamya);
        ImageView upside=(ImageView)findViewById(R.id.upside_down);
        ImageView techathon=(ImageView)findViewById(R.id.techathon);
        ImageView treasurehunt=(ImageView)findViewById(R.id.treasure_hunt);
        ImageView maze=(ImageView)findViewById(R.id.maze_runner);
        ImageView oz=(ImageView)findViewById(R.id.oz_runner);
        ImageView sql=(ImageView)findViewById(R.id.sql);
        ImageView codestorm=(ImageView)findViewById(R.id.codestorm);
        ImageView kodachrome=(ImageView)findViewById(R.id.kodachrome);
        ImageView horseman=(ImageView)findViewById(R.id.horseman);
        ImageView bizoku=(ImageView)findViewById(R.id.bizoku);
        ImageView greedy=(ImageView)findViewById(R.id.greedy_queen);
        ImageView etambola=(ImageView)findViewById(R.id.etambola);


        view=getLayoutInflater().inflate(R.layout.layout_event_description,null);


        //image click functions
        agamya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.agamya_string)));
                showDialog();
            }
        });

        kodachrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.koda_chrome)));
                showDialog();
            }
        });
        upside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.upside_down_string)));
                showDialog();
            }
        });
        maze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.mystery_puzzle_string)));
                showDialog();
            }
        });
        oz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.maze_runner_string)));
                showDialog();
            }
        });
        codestorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.code_storm_string)));
                showDialog();
            }
        });
        greedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.greedy_queen_string)));
                showDialog();
            }
        });
        sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.sql_string)));
                showDialog();
            }
        });
        etambola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.etambola_string)));
                showDialog();
            }
        });
        treasurehunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.treasure_hunt_string)));
                showDialog();
            }
        });
        bizoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.bizoku_string)));
                showDialog();
            }
        });
        horseman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.horseman_string)));
                showDialog();
            }
        });
        techathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tv=(TextView) view.findViewById(R.id.event_description);
                tv.setText(Html.fromHtml(getString(R.string.techathon_string)));
                showDialog();
            }
        });



        //Floatint Button
        FloatingActionButton fab1=(FloatingActionButton) findViewById(R.id.fabcontactus);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Contactus.class);
                startActivity(in);
               // Toast.makeText(getApplicationContext(),"Contact us activity is oopen now",Toast.LENGTH_SHORT).show();
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

        FloatingActionButton fab4=(FloatingActionButton) findViewById(R.id.fabgallery);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(getApplicationContext(),Gallery.class);
                startActivity(in);
                //Toast.makeText(getApplicationContext(),"Gallery activity is open now",Toast.LENGTH_SHORT).show();
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

    public void showDialog()
    {
        AlertDialog.Builder d = new AlertDialog.Builder(Technofania.this);

        Log.d("here", String.valueOf(getString(R.string.agamya_string)));

        Log.d("here","it is not  working");
        ViewGroup parent = (ViewGroup)view.getParent();
        if(parent!=null)
            parent.removeView(view);
        d.setView(view);

        final AlertDialog alert = d.create();
        alert.setCanceledOnTouchOutside(false);
        Button bt= (Button)view.findViewById(R.id.dialog_button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alert.dismiss();
            }
        });
        alert.show();
    }
    public void onBackPressed() {
        super.onBackPressed();
        in=new Intent(getApplicationContext(),Home.class);
        startActivity(in);
        finish();
    }

}
