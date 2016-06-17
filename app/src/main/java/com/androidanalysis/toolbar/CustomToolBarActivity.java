package com.androidanalysis.toolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomToolBarActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button btnMenuToolbar,btnCustomToolbar;
    EditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);


        setUpToolbar();

    }



    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        //Note element here are handled just as other views in activity's layout
        etSearch = (EditText)findViewById(R.id.etSearchEditText);

        etSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do Search Here
                Toast.makeText(CustomToolBarActivity.this, "SearchBar Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        //Set Title of toolbar dynamically
       // setTitle("Custom Toolbar Activity");

        //To use actionbar's utility functions on toolbar, use getSupportActionBar.()
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        }
    }



}
