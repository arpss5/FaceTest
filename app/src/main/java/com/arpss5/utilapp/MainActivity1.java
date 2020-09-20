package com.arpss5.utilapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.arpss5.logmodule.LogReport;


public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        try{
            Intent myIntent = new Intent(MainActivity1.this, LogReport.class);
            MainActivity1.this.startActivity(myIntent);

        }catch (Exception e)
        {
            System.out.print("helo");
        }

    }
}