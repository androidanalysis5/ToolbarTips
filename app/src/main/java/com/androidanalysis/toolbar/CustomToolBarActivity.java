package com.androidanalysis.toolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class CustomToolBarActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button btnMenuToolbar,btnCustomToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);


        setUpToolbar();

        setUpButtons();
    }



    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Set Title of toolbar dynamically
       // setTitle("Custom Toolbar Activity");

        //To use actionbar's utility functions on toolbar, use getSupportActionBar.()
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        }
    }



    private void setUpButtons() {
       btnCustomToolbar = (Button)findViewById(R.id.btnCustomToolbar);
       btnMenuToolbar = (Button)findViewById(R.id.btnMenuToolbar);


    }
}
