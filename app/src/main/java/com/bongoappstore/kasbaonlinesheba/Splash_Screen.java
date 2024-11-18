package com.bongoappstore.kasbaonlinesheba;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {


   // LinearLayout deveoper_id;
    ImageView logo;
    TextView app_naame;


    Animation splash_top, splash_bottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.white));
        //==============================Full Screen Activity Code=================================//
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);



        logo = findViewById(R.id.logo);
        app_naame = findViewById(R.id.appName);
       // deveoper_id = findViewById(R.id.deveoper_id);



        splash_top = AnimationUtils.loadAnimation(this, R.anim.splash_top);
        splash_bottom = AnimationUtils.loadAnimation(this, R.anim.splash_bottom);



        logo.setAnimation(splash_top);
        app_naame.setAnimation(splash_top);
        //deveoper_id.setAnimation(splash_top);



        // For Hide Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        //For Splash Screen
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Code here
                Intent myIntent = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(myIntent);
                finish();
            }
        }, 2800);
        //==============================================================






    } //-------------------------OnCreate Bundle Method Line End Here



} //-------------------------Splash_Screen Bundle Method Line End Here