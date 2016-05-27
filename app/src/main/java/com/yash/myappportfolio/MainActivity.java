package com.yash.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popular = (Button) findViewById(R.id.popularmovie);
        Button stock = (Button) findViewById(R.id.stockhawk);
        Button bigger = (Button) findViewById(R.id.builditbigger);
        Button material = (Button) findViewById(R.id.material);
        Button ubiquiyous = (Button) findViewById(R.id.ubiquitous);
        Button capstone = (Button) findViewById(R.id.capstone);

        popular.setOnClickListener(this);
        stock.setOnClickListener(this);
        bigger.setOnClickListener(this);
        material.setOnClickListener(this);
        ubiquiyous.setOnClickListener(this);
        capstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.popularmovie:
                Toast.makeText(getApplicationContext(),"This button will launch popular movie app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.stockhawk:
                Toast.makeText(getApplicationContext(),"This button will launch stock hawk app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.material:
                Toast.makeText(getApplicationContext(),"This button will launch material app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.builditbigger:
                Toast.makeText(getApplicationContext(),"This button will launch build it bigger app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ubiquitous:
                Toast.makeText(getApplicationContext(),"This button will launch ubiquitous app",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone: Toast.makeText(getApplicationContext(),"This button will launch capstone app",Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
