package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Mehari_Union extends AppCompatActivity {

    CardView chaubepur_btn, shimrail_btn, jumuna_btn, ishannagar_btn, mehari_btn, baharata_btn,
             bamutia_btn, ballavpur_btn, purquil_btn, tilarpar_btn, kheora_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_mehari_union);
        getSupportActionBar().setTitle("মেহারী ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        chaubepur_btn = findViewById(R.id.chaubepur_btn);
        shimrail_btn = findViewById(R.id.shimrail_btn);

        jumuna_btn = findViewById(R.id.jumuna_btn);
        ishannagar_btn = findViewById(R.id.ishannagar_btn);
        mehari_btn = findViewById(R.id.mehari_btn);
        baharata_btn = findViewById(R.id.baharata_btn);
        bamutia_btn = findViewById(R.id.bamutia_btn);
        ballavpur_btn = findViewById(R.id.ballavpur_btn);
        purquil_btn = findViewById(R.id.purquil_btn);
        tilarpar_btn = findViewById(R.id.tilarpar_btn);
        kheora_btn = findViewById(R.id.kheora_btn);




        chaubepur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chaubepur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        shimrail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Shimrail_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        jumuna_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jumuna_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        ishannagar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Ishannagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        mehari_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mehari_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        baharata_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Baharata_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        bamutia_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bamutia_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        ballavpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Ballavpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        purquil_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Purquil_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        tilarpar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Tilarpar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        kheora_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mehari_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kheora_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });





















    } //------------------------------------OnCreate Bundle Method Line End Here


    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //------------------------------------Gopinathpur_Union Method Line End Here