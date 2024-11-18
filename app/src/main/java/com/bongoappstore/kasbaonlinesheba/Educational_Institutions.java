package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Educational_Institutions extends AppCompatActivity {


    CardView primary_school_btn, high_scool_btn, collage_institute_btn, mosque_btn, madrash_btn, mondir_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_educational_institutions);
        getSupportActionBar().setTitle("শিক্ষা ও ধর্মীয় প্রতিষ্ঠানের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        primary_school_btn = findViewById(R.id.primary_school_btn);
        high_scool_btn = findViewById(R.id.high_scool_btn);
        collage_institute_btn = findViewById(R.id.collage_institute_btn);
        mosque_btn = findViewById(R.id.mosque_btn);
        mondir_btn = findViewById(R.id.mondir_btn);
        madrash_btn = findViewById(R.id.madrash_btn);



        primary_school_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Educational_Institutions.this, Primary_School.class);
                startActivity(myIntent);
            }
        });


        high_scool_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Educational_Institutions.this, High_School.class);
                startActivity(myIntent);
            }
        });


        collage_institute_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Educational_Institutions.this, College_Institute.class);
                startActivity(myIntent);
            }
        });


        mosque_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Educational_Institutions.this, Mosque.class);
                startActivity(myIntent);
            }
        });


        mondir_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Educational_Institutions.this, Mondir.class);
                startActivity(myIntent);
            }
        });


        madrash_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Educational_Institutions.this, Madrasah.class);
                startActivity(myIntent);
            }
        });





    } //----------------------OnCreate Bundle Method End












    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //----------------------Educational_Institutions Bundle Method End