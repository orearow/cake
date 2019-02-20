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
    int sprinklesbtncount = 0;
    int frostingbtncount=0;
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
               // opencolorpicker();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });


        final ImageButton roundcake = (ImageButton) findViewById(R.id.roundcake);
        roundcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  roundcake);

            }
        });


        final ImageButton roundcake1 = (ImageButton) findViewById(R.id.roundcake1);
        roundcake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  roundcake1);

            }
        });

        final ImageButton roundcake2 = (ImageButton) findViewById(R.id.roundcake2);
        roundcake2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  roundcake2);

            }
        });

        ImageButton frostingbtn = (ImageButton) findViewById(R.id.frostingbutton);
        frostingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(frostingbtncount==0) {
                    ImageButton coloredfrosting = (ImageButton) findViewById(R.id.coloredfrosting);
                    ImageButton yellowfrosting = (ImageButton) findViewById(R.id.yellowfrosting);
                    ImageButton bluefrosting = (ImageButton) findViewById(R.id.bluefrosting);
                    coloredfrosting.setVisibility(View.VISIBLE);
                    yellowfrosting.setVisibility(View.VISIBLE);
                    bluefrosting.setVisibility(View.VISIBLE);
                    frostingbtncount++;

                }

                else {
                    ImageButton coloredfrosting = (ImageButton) findViewById(R.id.coloredfrosting);
                    ImageButton yellowfrosting = (ImageButton) findViewById(R.id.yellowfrosting);
                    ImageButton bluefrosting = (ImageButton) findViewById(R.id.bluefrosting);
                    coloredfrosting.setVisibility(View.INVISIBLE);
                    yellowfrosting.setVisibility(View.INVISIBLE);
                    bluefrosting.setVisibility(View.INVISIBLE);
                    frostingbtncount--;
                }

            }
        });


        ImageButton sprinklesbtn = (ImageButton) findViewById(R.id.sprinklesbutton);
        sprinklesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sprinklesbtncount==0) {
                    ImageButton greensprinkles = (ImageButton) findViewById(R.id.greensprinkles);
                    ImageButton redsprinkles = (ImageButton) findViewById(R.id.redsprinkles);
                    ImageButton heartsprinkles = (ImageButton) findViewById(R.id.heartsprinkles);
                    ImageButton roundsprinkles = (ImageButton) findViewById(R.id.roundsprinkles);
                    ImageButton blacksprinkles = (ImageButton) findViewById(R.id.blacksprinkles);
                    greensprinkles.setVisibility(View.VISIBLE);
                    redsprinkles.setVisibility(View.VISIBLE);
                    heartsprinkles.setVisibility(View.VISIBLE);
                    roundsprinkles.setVisibility(View.VISIBLE);
                    blacksprinkles.setVisibility(View.VISIBLE);
                    sprinklesbtncount++;
                }

                else{
                    ImageButton greensprinkles = (ImageButton) findViewById(R.id.greensprinkles);
                    ImageButton redsprinkles = (ImageButton) findViewById(R.id.redsprinkles);
                    ImageButton heartsprinkles = (ImageButton) findViewById(R.id.heartsprinkles);
                    ImageButton roundsprinkles = (ImageButton) findViewById(R.id.roundsprinkles);
                    ImageButton blacksprinkles = (ImageButton) findViewById(R.id.blacksprinkles);
                    greensprinkles.setVisibility(View.INVISIBLE);
                    redsprinkles.setVisibility(View.INVISIBLE);
                    heartsprinkles.setVisibility(View.INVISIBLE);
                    roundsprinkles.setVisibility(View.INVISIBLE);
                    blacksprinkles.setVisibility(View.INVISIBLE);
                    sprinklesbtncount--;

                }
            }
        });



                ImageButton button = (ImageButton) findViewById(R.id.cakebutton);
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



    public void opencolorpicker(ImageButton image){
         final  ImageButton imagetochange = image;
        final ColorPicker colorPicker = new ColorPicker(this);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("#6a3ab2");
        colors.add("#258174");
        colors.add("#aaf5aa");
        colors.add("#cc3ab2");
        colors.add("#cc8174");
        colors.add("#ccf5aa");
        colorPicker.setColors(colors)
                .setColumns(5)
                .setRoundColorButton(true)
                .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        imagetochange.setColorFilter(color);

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
