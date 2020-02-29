package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Batch_2020 extends AppCompatActivity {
    Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch_2020);
    }

    public void onBackPressed() {
        super.onBackPressed();
        in=new Intent(getApplicationContext(),Team.class);
        startActivity(in);
        finish();
    }
}
