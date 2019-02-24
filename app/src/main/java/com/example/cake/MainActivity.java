package com.example.cake;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import petrov.kristiyan.colorpicker.ColorPicker;

public class MainActivity extends AppCompatActivity {

    int cakelayercount = 0;
    int sprinklesbtncount = 0;
    int frostingbtncount=0;
    int bluefrostingbtncount=0;
    int rainbowfrostingbtncount=0;
    int candlebtncount=0;
    int submitcount = 0;
    boolean  visibility = true ;



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
        final ImageButton squarecake = (ImageButton) findViewById(R.id.squarecake);
        squarecake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  squarecake);

            }
        });

        final ImageButton heartcake = (ImageButton) findViewById(R.id.heartcake);
        heartcake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  heartcake);

            }
        });


        final ImageButton roundcake1 = (ImageButton) findViewById(R.id.roundcake1);
        roundcake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  roundcake1);

            }
        });

        final ImageButton squarecake1 = (ImageButton) findViewById(R.id.squarecake1);
        squarecake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  squarecake1);

            }
        });

        final ImageButton heartcake1 = (ImageButton) findViewById(R.id.heartlayer1);
        heartcake1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  heartcake1);

            }
        });

        final ImageButton roundcake2 = (ImageButton) findViewById(R.id.roundcake2);
        roundcake2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  roundcake2);

            }
        });

        final ImageButton squarecake2 = (ImageButton) findViewById(R.id.squarecake2);
        squarecake2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  squarecake2);

            }
        });


        final ImageButton heartcake2 = (ImageButton) findViewById(R.id.heartcake2);
        heartcake2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencolorpicker(  heartcake2);

            }
        });

////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // brings the images to the front
        final ImageButton bluefrostingcaketier2 = (ImageButton) findViewById(R.id.bluefrostingcaketier2);
        bluefrostingcaketier2.bringToFront();

        final ImageButton bluefrostingcake = (ImageButton) findViewById(R.id.bluefrostingcake);
        bluefrostingcake.bringToFront();

        final ImageButton rainbowfrosting = (ImageButton) findViewById(R.id.rainbowfrostingcake);
        rainbowfrosting.bringToFront();

        final ImageButton rainbowfrostingtier2 = (ImageButton) findViewById(R.id.rainbowfrostingcaketier2);
        rainbowfrostingtier2.bringToFront();

        final ImageButton yellowfrosting = (ImageButton) findViewById(R.id.yellowfrostingcake);
        yellowfrosting.bringToFront();

        final ImageButton coloredsprinkles = (ImageButton) findViewById(R.id.sprinklescake);
        coloredsprinkles.bringToFront();

        final ImageButton heartsprinkles = (ImageButton) findViewById(R.id.heartsprinklescake);
        heartsprinkles.bringToFront();

        final ImageButton blacksprinklescake = (ImageButton) findViewById(R.id.blacksprinklescake);
        blacksprinklescake.bringToFront();

        final ImageButton check = (ImageButton) findViewById(R.id.check);
        check.bringToFront();

        final ImageButton wrong = (ImageButton) findViewById(R.id.wrong);
        wrong.bringToFront();

        final ImageButton bluecandle = (ImageButton) findViewById(R.id.bluecandle);
        bluecandle.bringToFront();

        final ImageButton purplecandle = (ImageButton) findViewById(R.id.purplecandle);
        purplecandle.bringToFront();

        final ImageButton pinkcandle = (ImageButton) findViewById(R.id.pinkcandle);
        pinkcandle.bringToFront();

        final ImageButton pinkcandletier2 = (ImageButton) findViewById(R.id.pinkcandletier2);
        pinkcandletier2.bringToFront();

        final ImageButton purplecandletier2 = (ImageButton) findViewById(R.id.bluecandletier2);
        purplecandletier2.bringToFront();

        final ImageButton bluecandletier2 = (ImageButton) findViewById(R.id.bluecandletier2);
        bluecandletier2.bringToFront();

        final ImageButton pinkcandletier1 = (ImageButton) findViewById(R.id.pinkcandletier2);
        pinkcandletier1.bringToFront();

        final ImageButton purplecandletier1 = (ImageButton) findViewById(R.id.bluecandletier2);
        purplecandletier1.bringToFront();

        final ImageButton bluecandletier1 = (ImageButton) findViewById(R.id.bluecandletier2);
        bluecandletier1.bringToFront();





//////////////////rainbow frosting//////////////////////////////////////////////////////////////////////////////////////


        ImageButton colorfrosting = (ImageButton) findViewById(R.id.coloredfrosting);
        colorfrosting.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    ImageButton bluefrostingcake = (ImageButton) findViewById(R.id.bluefrostingcake);
                    ImageButton bluefrostingcaketier2 = (ImageButton) findViewById(R.id.bluefrostingcaketier2);
                    ImageButton rainbowfrostingcake = (ImageButton) findViewById(R.id.rainbowfrostingcake);
                    ImageButton rainbowfrostingcaketier2 = (ImageButton) findViewById(R.id.rainbowfrostingcaketier2);
                    ImageButton yellowfrostingcake = (ImageButton) findViewById(R.id.yellowfrostingcake);

                    if(roundcake.getVisibility()== View.VISIBLE && roundcake1.getVisibility()== View.VISIBLE)
                    {
                        rainbowfrostingcake.setVisibility(View.VISIBLE);
                        bluefrostingcake.setVisibility(View.INVISIBLE);
                        rainbowfrostingcaketier2.setVisibility(View.VISIBLE);
                        bluefrostingcaketier2.setVisibility(View.INVISIBLE);
                        yellowfrostingcake.setVisibility(View.INVISIBLE);


                    }
                    else {
                        rainbowfrostingcake.setVisibility(View.VISIBLE);
                        bluefrostingcake.setVisibility(View.INVISIBLE);
                        bluefrostingcaketier2.setVisibility(View.INVISIBLE);
                        yellowfrostingcake.setVisibility(View.INVISIBLE);
                    }





            }
        }));

        ////////////////////////////////////////////////////////////////////////////////////////////////
        // adds blue frosting onto the cake

        ImageButton bluefrostingbtn = (ImageButton) findViewById(R.id.bluefrosting);
        bluefrostingbtn.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               // if (bluefrostingbtncount == 0)
              //  {
                    ImageButton bluefrostingcake = (ImageButton) findViewById(R.id.bluefrostingcake);
                    ImageButton bluefrostingcaketier2 = (ImageButton) findViewById(R.id.bluefrostingcaketier2);
                ImageButton rainbowfrostingcake = (ImageButton) findViewById(R.id.rainbowfrostingcake);
                ImageButton rainbowfrostingcaketier2 = (ImageButton) findViewById(R.id.rainbowfrostingcaketier2);
                ImageButton yellowfrostingcake = (ImageButton) findViewById(R.id.yellowfrostingcake);

                 bluefrostingcake.setVisibility(View.VISIBLE);
                    bluefrostingcaketier2.setVisibility(View.VISIBLE);
                rainbowfrostingcake.setVisibility(View.INVISIBLE);
                rainbowfrostingcaketier2.setVisibility(View.INVISIBLE);
                yellowfrostingcake.setVisibility(View.INVISIBLE);






            }
        }));

        ////////////////////////////adds yellow frosting on cake/////////////
        ImageButton yellowfrostingbtn = (ImageButton) findViewById(R.id.yellowfrosting);
        yellowfrostingbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if (bluefrostingbtncount == 0)
                //  {
                ImageButton yellowfrostingcake = (ImageButton) findViewById(R.id.yellowfrostingcake);
                ImageButton bluefrostingcake = (ImageButton) findViewById(R.id.bluefrostingcake);
                ImageButton bluefrostingcaketier2 = (ImageButton) findViewById(R.id.bluefrostingcaketier2);
                ImageButton rainbowfrostingcake = (ImageButton) findViewById(R.id.rainbowfrostingcake);
                ImageButton rainbowfrostingcaketier2 = (ImageButton) findViewById(R.id.rainbowfrostingcaketier2);

                yellowfrostingcake.setVisibility(View.VISIBLE);
                bluefrostingcake.setVisibility(View.INVISIBLE);
                bluefrostingcaketier2.setVisibility(View.INVISIBLE);
                rainbowfrostingcake.setVisibility(View.INVISIBLE);
                rainbowfrostingcaketier2.setVisibility(View.INVISIBLE);



            }
        }));

        // puts sprinkles on cake
        ImageButton coloredsprinklesbtn = (ImageButton) findViewById(R.id.roundsprinkles);
        coloredsprinklesbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    ImageButton coloredsprinkles = (ImageButton) findViewById(R.id.sprinklescake);
                    coloredsprinkles.setVisibility(View.VISIBLE);



            }
        }));

        ImageButton blacksprinklesbtn = (ImageButton) findViewById(R.id.blacksprinkles);
        blacksprinklesbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton blacksprinklescake = (ImageButton) findViewById(R.id.blacksprinklescake);
                blacksprinklescake.setVisibility(View.VISIBLE);
            }
        }));

        ImageButton heartsprinklesbtn = (ImageButton) findViewById(R.id.heartsprinkles);
        heartsprinklesbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton heartsprinklescake = (ImageButton) findViewById(R.id.heartsprinklescake);
                heartsprinklescake.setVisibility(View.VISIBLE);
            }
        }));

////////////////////// correct, wrong images ///////////////////////////////////////////////////////
        ImageButton submitbtn = (ImageButton) findViewById(R.id.submit);
        submitbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                  if (roundcake.getVisibility() == View.VISIBLE && roundcake1.getVisibility() == View.VISIBLE && bluecandletier2.getVisibility() == View.VISIBLE) {
                      final ImageButton check = (ImageButton) findViewById(R.id.check);
                      check.setVisibility(View.VISIBLE);
                      check.animate().alpha(0f).setDuration(3000);
                      moveTaskToBack(true);
                  } else if(wrong.getVisibility()==View.INVISIBLE) {

                      ImageButton wrong = (ImageButton) findViewById(R.id.wrong);
                      wrong.setVisibility(View.VISIBLE);
                   //   wrong.animate().alpha(0f).setDuration(3000);


                      //  wrong.animate().
                  }





              }



        }));




/////////////////////////////////////////////////////////////////////////////////////////////////////
        // displays all types of frosting when clicked
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



////////// sprinkles appear with button click //////////////////////////////////////////////////////
        ImageButton sprinklesbtn = (ImageButton) findViewById(R.id.sprinklesbutton);
        sprinklesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton squarecakebutton = (ImageButton) findViewById(R.id.squarecakebutton);
                ImageButton heartcakebutton = (ImageButton) findViewById(R.id.heartbutton);
                ImageButton roundcakebutton = (ImageButton) findViewById(R.id.roundcakebutton);
                TextView roundcakelabel = (TextView) findViewById(R.id.roundcakelabel);
                TextView squarecakeLabel = (TextView) findViewById(R.id.squarecakelabel);
                TextView heartcakelabel = (TextView) findViewById(R.id.heartlabel);

                squarecakebutton.setVisibility(View.INVISIBLE);
                heartcakebutton.setVisibility(View.INVISIBLE);
                roundcakebutton.setVisibility(View.INVISIBLE);

                squarecakeLabel.setVisibility(View.INVISIBLE);
                roundcakelabel.setVisibility(View.INVISIBLE);
                heartcakelabel.setVisibility(View.INVISIBLE);

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

        /////////////////////////reset button////////////////////////////
        ImageButton resetbtn = (ImageButton) findViewById(R.id.reset);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                roundcake.setVisibility(View.INVISIBLE);
                roundcake1.setVisibility(View.INVISIBLE);
                roundcake2.setVisibility(View.INVISIBLE);
                squarecake.setVisibility(View.INVISIBLE);
                squarecake2.setVisibility(View.INVISIBLE);
                squarecake1.setVisibility(View.INVISIBLE);
                heartcake.setVisibility(View.INVISIBLE);
                heartcake1.setVisibility(View.INVISIBLE);
                heartcake2.setVisibility(View.INVISIBLE);
                heartsprinkles.setVisibility(View.INVISIBLE);
                coloredsprinkles.setVisibility(View.INVISIBLE);
                blacksprinklescake.setVisibility(View.INVISIBLE);
                bluefrostingcake.setVisibility(View.INVISIBLE);
                bluefrostingcaketier2.setVisibility(View.INVISIBLE);
                rainbowfrosting.setVisibility(View.INVISIBLE);
                rainbowfrostingtier2.setVisibility(View.INVISIBLE);
                yellowfrosting.setVisibility(View.INVISIBLE);
                pinkcandle.setVisibility(View.INVISIBLE);
                bluecandle.setVisibility(View.INVISIBLE);
                purplecandle.setVisibility(View.INVISIBLE);

                pinkcandletier2.setVisibility(View.INVISIBLE);
                purplecandletier2.setVisibility(View.INVISIBLE);
                bluecandletier2.setVisibility(View.INVISIBLE);

                purplecandletier1.setVisibility(View.INVISIBLE);
                purplecandletier1.setVisibility(View.INVISIBLE);
                bluecandletier1.setVisibility(View.INVISIBLE);

                wrong.setVisibility(View.INVISIBLE);



                cakelayercount = 0;
            }
        });

        ////////////////////// displays candle options with button click ///////////////////////////

        ImageButton candlebtn = (ImageButton) findViewById(R.id.candlebutton);
        candlebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton squarecakebutton = (ImageButton) findViewById(R.id.squarecakebutton);
                ImageButton heartcakebutton = (ImageButton) findViewById(R.id.heartbutton);
                ImageButton roundcakebutton = (ImageButton) findViewById(R.id.roundcakebutton);
                TextView roundcakelabel = (TextView) findViewById(R.id.roundcakelabel);
                TextView squarecakeLabel = (TextView) findViewById(R.id.squarecakelabel);
                TextView heartcakelabel = (TextView) findViewById(R.id.heartlabel);

                squarecakebutton.setVisibility(View.INVISIBLE);
                heartcakebutton.setVisibility(View.INVISIBLE);
                roundcakebutton.setVisibility(View.INVISIBLE);

                squarecakeLabel.setVisibility(View.INVISIBLE);
                roundcakelabel.setVisibility(View.INVISIBLE);
                heartcakelabel.setVisibility(View.INVISIBLE);

                if(candlebtncount==0) {
                    ImageButton pinkcandleoption = (ImageButton) findViewById(R.id.pinkcandleoption);
                    ImageButton bluecandleoption = (ImageButton) findViewById(R.id.bluecandleoption);
                    ImageButton purplecandleoption = (ImageButton) findViewById(R.id.purplecandleoption);

                   pinkcandleoption.setVisibility(View.VISIBLE);
                   bluecandleoption.setVisibility(View.VISIBLE);
                   purplecandleoption.setVisibility(View.VISIBLE);
                    candlebtncount++;
                }

                else{

                    ImageButton pinkcandleoption = (ImageButton) findViewById(R.id.pinkcandleoption);
                    ImageButton bluecandleoption = (ImageButton) findViewById(R.id.bluecandleoption);
                    ImageButton purplecandleoption = (ImageButton) findViewById(R.id.purplecandleoption);

                    pinkcandleoption.setVisibility(View.INVISIBLE);
                    bluecandleoption.setVisibility(View.INVISIBLE);
                    purplecandleoption.setVisibility(View.INVISIBLE);

                    candlebtncount--;

                }
            }
        });

        /////////////////////put correct candle on cake /////////////////////////////////////////////

        ImageButton pinkcandleoption = (ImageButton) findViewById(R.id.pinkcandleoption);
        ImageButton bluecandleoption = (ImageButton) findViewById(R.id.bluecandleoption);
        ImageButton purplecandleoption = (ImageButton) findViewById(R.id.purplecandleoption);



        pinkcandleoption.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageButton pinkcandle = (ImageButton) findViewById(R.id.pinkcandle);
                ImageButton bluecandle = (ImageButton) findViewById(R.id.bluecandle);
                ImageButton purplecandle = (ImageButton) findViewById(R.id.purplecandle);
                ImageButton pinkcandletier2 = (ImageButton) findViewById(R.id.pinkcandletier2);
                ImageButton bluecandletier2 = (ImageButton) findViewById(R.id.bluecandletier2);
                ImageButton purplecandletier2 = (ImageButton) findViewById(R.id.purplecandletier2);


                if((roundcake1.getVisibility()== View.VISIBLE || squarecake1.getVisibility()== View.VISIBLE || heartcake1.getVisibility()== View.VISIBLE)
                        && (roundcake2.getVisibility()== View.VISIBLE || squarecake2.getVisibility()== View.VISIBLE || heartcake2.getVisibility()== View.VISIBLE))
                {
                    pinkcandle.setVisibility(View.VISIBLE);
                    purplecandle.setVisibility(View.INVISIBLE);
                    bluecandle.setVisibility(View.INVISIBLE);
                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);



                }

                else if ((roundcake.getVisibility()==View.VISIBLE || squarecake.getVisibility()==View.VISIBLE || heartcake.getVisibility()==View.VISIBLE)
                        && (roundcake1.getVisibility()==View.VISIBLE || squarecake1.getVisibility()==View.VISIBLE || heartcake1.getVisibility()==View.VISIBLE)
                        && (roundcake2.getVisibility()==View.INVISIBLE || squarecake2.getVisibility()==View.INVISIBLE || heartcake2.getVisibility()==View.INVISIBLE)) {

                    pinkcandletier2.setVisibility(View.VISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    purplecandle.setVisibility(View.INVISIBLE);
                    bluecandle.setVisibility(View.INVISIBLE);


                }

                else if(roundcake.getVisibility()==View.VISIBLE && roundcake1.getVisibility()==View.INVISIBLE && roundcake2.getVisibility()==View.INVISIBLE){


                    pinkcandletier1.setVisibility(View.VISIBLE);
                    purplecandletier1.setVisibility(View.INVISIBLE);
                    bluecandletier1.setVisibility(View.INVISIBLE);
                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    purplecandle.setVisibility(View.INVISIBLE);
                    bluecandle.setVisibility(View.INVISIBLE);
                }



            }
        }));

        bluecandleoption.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageButton pinkcandle = (ImageButton) findViewById(R.id.pinkcandle);
                ImageButton bluecandle = (ImageButton) findViewById(R.id.bluecandle);
                ImageButton purplecandle = (ImageButton) findViewById(R.id.purplecandle);
                ImageButton pinkcandletier2 = (ImageButton) findViewById(R.id.pinkcandletier2);
                ImageButton bluecandletier2 = (ImageButton) findViewById(R.id.bluecandletier2);
                ImageButton purplecandletier2 = (ImageButton) findViewById(R.id.purplecandletier2);


                if((roundcake1.getVisibility()== View.VISIBLE || heartcake1.getVisibility()==View.VISIBLE || squarecake1.getVisibility()==View.VISIBLE) &&
                        (roundcake2.getVisibility()== View.VISIBLE || heartcake2.getVisibility()==View.VISIBLE || squarecake2.getVisibility()==View.VISIBLE))
                {
                    bluecandle.setVisibility(View.VISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    purplecandle.setVisibility(View.INVISIBLE);

                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);



                }

                else if ((roundcake.getVisibility()==View.VISIBLE || squarecake.getVisibility()==View.VISIBLE || heartcake.getVisibility()==View.VISIBLE)

                        && (roundcake1.getVisibility()==View.VISIBLE || squarecake1.getVisibility()==View.VISIBLE || heartcake1.getVisibility()==View.VISIBLE)
                        && (roundcake2.getVisibility()==View.INVISIBLE || squarecake2.getVisibility()==View.INVISIBLE || heartcake2.getVisibility()==View.INVISIBLE)) {

                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.VISIBLE);

                    bluecandle.setVisibility(View.INVISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    purplecandle.setVisibility(View.INVISIBLE);


                }

                else if(roundcake.getVisibility()==View.VISIBLE && roundcake1.getVisibility()==View.INVISIBLE && roundcake2.getVisibility()==View.INVISIBLE){


                    pinkcandletier1.setVisibility(View.INVISIBLE);
                    purplecandletier1.setVisibility(View.INVISIBLE);
                    bluecandletier1.setVisibility(View.VISIBLE);

                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);

                    bluecandle.setVisibility(View.INVISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    purplecandle.setVisibility(View.INVISIBLE);


                }


            }
        }));

        purplecandleoption.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageButton pinkcandle = (ImageButton) findViewById(R.id.pinkcandle);
                ImageButton bluecandle = (ImageButton) findViewById(R.id.bluecandle);
                ImageButton purplecandle = (ImageButton) findViewById(R.id.purplecandle);
                ImageButton pinkcandletier2 = (ImageButton) findViewById(R.id.pinkcandletier2);
                ImageButton bluecandletier2 = (ImageButton) findViewById(R.id.bluecandletier2);
                ImageButton purplecandletier2 = (ImageButton) findViewById(R.id.purplecandletier2);
                //   ImageButton bluecandle = (ImageButton) findViewById(R.id.bluecandle);
                //  ImageButton bluefrostingcaketier2 = (ImageButton) findViewById(R.id.bluefrostingcaketier2);
                //  ImageButton rainbowfrostingcake = (ImageButton) findViewById(R.id.rainbowfrostingcake);
                //  ImageButton rainbowfrostingcaketier2 = (ImageButton) findViewById(R.id.rainbowfrostingcaketier2);
                //  ImageButton yellowfrostingcake = (ImageButton) findViewById(R.id.yellowfrostingcake);

                if((roundcake1.getVisibility()== View.VISIBLE || squarecake1.getVisibility()==View.VISIBLE || heartcake1.getVisibility()==View.VISIBLE)&&
                        (roundcake2.getVisibility()== View.VISIBLE || squarecake2.getVisibility()==View.VISIBLE || heartcake2.getVisibility()==View.VISIBLE))
                {
                    purplecandle.setVisibility(View.VISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    bluecandle.setVisibility(View.INVISIBLE);

                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);

                    pinkcandletier1.setVisibility(View.INVISIBLE);
                    purplecandletier1.setVisibility(View.INVISIBLE);
                    bluecandletier1.setVisibility(View.INVISIBLE);

                }


                else if ((roundcake.getVisibility()==View.VISIBLE || squarecake.getVisibility()==View.VISIBLE || heartcake.getVisibility()==View.VISIBLE)
                        && (roundcake1.getVisibility()==View.VISIBLE || squarecake1.getVisibility()==View.VISIBLE || heartcake1.getVisibility()==View.VISIBLE) &&
                        (roundcake2.getVisibility()==View.INVISIBLE || squarecake2.getVisibility()==View.VISIBLE || heartcake2.getVisibility()==View.VISIBLE)){

                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.VISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);

                    purplecandle.setVisibility(View.INVISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    bluecandle.setVisibility(View.INVISIBLE);


                    pinkcandletier1.setVisibility(View.INVISIBLE);
                    purplecandletier1.setVisibility(View.INVISIBLE);
                    bluecandletier1.setVisibility(View.INVISIBLE);

                }

                else if(roundcake.getVisibility()==View.VISIBLE && roundcake1.getVisibility()==View.INVISIBLE && roundcake2.getVisibility()==View.INVISIBLE){


                    pinkcandletier1.setVisibility(View.INVISIBLE);
                    purplecandletier1.setVisibility(View.VISIBLE);
                    bluecandletier1.setVisibility(View.INVISIBLE);

                    purplecandle.setVisibility(View.INVISIBLE);
                    pinkcandle.setVisibility(View.INVISIBLE);
                    bluecandle.setVisibility(View.INVISIBLE);

                    pinkcandletier2.setVisibility(View.INVISIBLE);
                    purplecandletier2.setVisibility(View.INVISIBLE);
                    bluecandletier2.setVisibility(View.INVISIBLE);
                }



            }
        }));






/////////////////////////////build cake with button clicks ////////////////////////////////////////
        ImageButton button = (ImageButton) findViewById(R.id.cakebutton);
        ImageButton squarecakebutton = (ImageButton) findViewById(R.id.squarecakebutton);
        ImageButton heartcakebutton = (ImageButton) findViewById(R.id.heartbutton);
        ImageButton roundcakebutton = (ImageButton) findViewById(R.id.roundcakebutton);


        roundcakebutton.setOnClickListener(new View.OnClickListener() {
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


        squarecakebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(cakelayercount ==0){
                    ImageButton squarecake = (ImageButton) findViewById(R.id.squarecake);
                    squarecake.setVisibility(View.VISIBLE);
                }
                if(cakelayercount ==1){
                    ImageButton squarecake1 = (ImageButton) findViewById(R.id.squarecake1);
                    squarecake1.setVisibility(View.VISIBLE);
                }
                if(cakelayercount ==2){
                    ImageButton squarecake2 = (ImageButton) findViewById(R.id.squarecake2);
                    squarecake2.setVisibility(View.VISIBLE);
                }
                cakelayercount = cakelayercount + 1 ;
            }
        });

        heartcakebutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(cakelayercount ==0){
                    ImageButton heartcake = (ImageButton) findViewById(R.id.heartcake);
                    heartcake.setVisibility(View.VISIBLE);
                }
                if(cakelayercount ==1){
                    ImageButton heartcake1 = (ImageButton) findViewById(R.id.heartlayer1);
                    heartcake1.setVisibility(View.VISIBLE);
                }
                if(cakelayercount ==2){
                    ImageButton heartcake2 = (ImageButton) findViewById(R.id.heartcake2);
                    heartcake2.setVisibility(View.VISIBLE);
                }
                cakelayercount = cakelayercount + 1 ;
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("myTag",String.valueOf(visibility));

                ImageButton squarecakebutton = (ImageButton) findViewById(R.id.squarecakebutton);
            ImageButton heartcakebutton = (ImageButton) findViewById(R.id.heartbutton);
            ImageButton roundcakebutton = (ImageButton) findViewById(R.id.roundcakebutton);
            TextView roundcakelabel = (TextView) findViewById(R.id.roundcakelabel);
            TextView squarecakeLabel = (TextView) findViewById(R.id.squarecakelabel);
            TextView heartcakelabel = (TextView) findViewById(R.id.heartlabel);


              if(visibility == true  ) {
                  Log.d("myTag","in true ");

                  squarecakebutton.setVisibility(View.VISIBLE);
                  heartcakebutton.setVisibility(View.VISIBLE);
                  roundcakebutton.setVisibility(View.VISIBLE);

                  squarecakeLabel.setVisibility(View.VISIBLE);
                  roundcakelabel.setVisibility(View.VISIBLE);
                  heartcakelabel.setVisibility(View.VISIBLE);


                  final Animation animShake = AnimationUtils.loadAnimation(MainActivity.this, R.anim.shake);
                  squarecakebutton.startAnimation(animShake);
                  roundcakebutton.startAnimation(animShake);

                  squarecakeLabel.startAnimation(animShake);
                  roundcakelabel.startAnimation(animShake);
                  heartcakelabel.startAnimation(animShake);
                  heartcakebutton.startAnimation(animShake);
              }

              if(visibility == false ){
                  Log.d("myTag","in false ");
//                  v.clearAnimation();

                  squarecakebutton.setVisibility(View.INVISIBLE);
                  heartcakebutton.setVisibility(View.INVISIBLE);
                  roundcakebutton.setVisibility(View.INVISIBLE);

                  squarecakeLabel.setVisibility(View.INVISIBLE);
                  roundcakelabel.setVisibility(View.INVISIBLE);
                  heartcakelabel.setVisibility(View.INVISIBLE);
              }
              visibility = !visibility;

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
