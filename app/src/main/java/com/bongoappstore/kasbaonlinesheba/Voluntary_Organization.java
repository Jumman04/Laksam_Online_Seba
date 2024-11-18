package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Voluntary_Organization extends AppCompatActivity {

    CardView search_songaton_btn, tft_sangaton_btn, volun_orga_btn_03;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_voluntary_organization);
        getSupportActionBar().setTitle("সামাজিক স্বেচ্ছাসেবী সংগঠন");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        search_songaton_btn = findViewById(R.id.search_songaton_btn);
        tft_sangaton_btn = findViewById(R.id.tft_sangaton_btn);

        volun_orga_btn_03 = findViewById(R.id.volun_orga_btn_03);


        search_songaton_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/kasbasearch"));
                startActivity(browserIntent3);
            }
        });


        tft_sangaton_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/604844910782770/?ref=share&mibextid=I6gGtw"));
                startActivity(browserIntent3);
            }
        });


        volun_orga_btn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100092296307587&mibextid=ZbWKwL"));
                startActivity(browserIntent3);
            }
        });





    } //---------------------------OnCreate Bundle Method End


    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //---------------------------OnCreate Bundle Method End