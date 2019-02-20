package com.example.cake;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

import petrov.kristiyan.colorpicker.ColorPicker;

public class MainActivity extends AppCompatActivity {

    int cakelayercount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencolorpicker();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        ImageButton button= (ImageButton) findViewById(R.id.cakebutton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(cakelayercount ==0){
                ImageButton roundcake = (ImageButton) findViewById(R.id.roundcake);
                roundcake.setVisibility(View.VISIBLE);
                }
                if(cakelayercount ==1){
                    ImageButton roundcake1 = (ImageButton) findViewById(R.id.roundcake1);
                    roundcake1.setVisibility(View.VISIBLE);
                }
                if(cakelayercount ==2){
                    ImageButton roundcake2 = (ImageButton) findViewById(R.id.roundcake2);
                    roundcake2.setVisibility(View.VISIBLE);
                }

                cakelayercount = cakelayercount + 1 ;
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void opencolorpicker(){
        final ColorPicker colorPicker = new ColorPicker(this);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("#6a3ab2");
        colors.add("#258174");

        colorPicker.setColors(colors)
                .setColumns(5)
                .setRoundColorButton(true)
                .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        ConstraintLayout layout = (ConstraintLayout)findViewById(R.id.layout);
                        layout.setBackgroundColor(color);

                    }

                    @Override
                    public void onCancel() {

                    }
                }).show();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
