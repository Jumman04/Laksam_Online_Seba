package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Badair_Union extends AppCompatActivity {

    CardView badair_viil_btn, borni_vill_btn, hatorabari_vill_btn, jomserpor_vill_btn, kalsar_vill_btn,
             mandarpor_vill_btn, podua_vill_btn, shikarpor_vill_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_badair_union);
        getSupportActionBar().setTitle("বাদৈর ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        badair_viil_btn = findViewById(R.id.badair_viil_btn);
        borni_vill_btn = findViewById(R.id.borni_vill_btn);
        hatorabari_vill_btn = findViewById(R.id.hatorabari_vill_btn);

        jomserpor_vill_btn = findViewById(R.id.jomserpor_vill_btn);
        kalsar_vill_btn = findViewById(R.id.kalsar_vill_btn);
        mandarpor_vill_btn = findViewById(R.id.mandarpor_vill_btn);

        podua_vill_btn = findViewById(R.id.podua_vill_btn);
        shikarpor_vill_btn = findViewById(R.id.shikarpor_vill_btn);




        badair_viil_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Badair_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        borni_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Borni_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        hatorabari_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Hatorabarir_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        jomserpor_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jomserpor_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        kalsar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kalsar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        mandarpor_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mandarpor_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        podua_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Podua_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        shikarpor_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Badair_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Shikarpor_Online_Sheba_Activity");
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


} //------------------------------------Badair_Union Method Line End Here