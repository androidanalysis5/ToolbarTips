package com.androidanalysis.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button btnMenuToolbar,btnCustomToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUpToolbar();

        setUpButtons();
    }



    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Set Title of toolbar dynamically
        setTitle("Main Activity");

        //To use actionbar's utility functions on toolbar, use getSupportActionBar.()
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setHomeButtonEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(false);


        }
    }



    private void setUpButtons() {
       btnCustomToolbar = (Button)findViewById(R.id.btnCustomToolbar);
       btnMenuToolbar = (Button)findViewById(R.id.btnMenuToolbar);

        btnCustomToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomToolBarActivity.class);
                startActivity(intent);
            }
        });

        btnMenuToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActionButtonToolbarActivity.class);
                startActivity(intent);
            }
        });


    }
}
