package com.androidanalysis.toolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Shailesh on 16/06/16.
 */
public class ActionButtonToolbarActivity extends AppCompatActivity {
    Toolbar toolbar;
    Button btnMenuToolbar,btnCustomToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_button_toolbar);


        setUpToolbar();

        setUpButtons();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_action_buttons, menu);
        return true;
    }



    private void setUpToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //Set Title of toolbar dynamically
        setTitle("Action Toolbar");

        //To use actionbar's utility functions on toolbar, use getSupportActionBar.()
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(ActionButtonToolbarActivity.this, "Settings Clicked", Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_favorite:
                Toast.makeText(ActionButtonToolbarActivity.this, "Favourite Clicked", Toast.LENGTH_LONG).show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }


    private void setUpButtons() {
        btnCustomToolbar = (Button)findViewById(R.id.btnCustomToolbar);
        btnMenuToolbar = (Button)findViewById(R.id.btnMenuToolbar);


    }
}
