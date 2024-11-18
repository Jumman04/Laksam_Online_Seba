package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Kasba_West_Union extends AppCompatActivity {
    
    CardView mirpokorpar_vill_btn, kaliyara_vill_btn, mirtola_vill_btn, bilghar_vill_btn,
             kollabari_vill_btn, aksina_vill_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_kasba_west_union);
        getSupportActionBar().setTitle("কসবা পশ্চিম ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        mirpokorpar_vill_btn = findViewById(R.id.mirpokorpar_vill_btn);
        kaliyara_vill_btn = findViewById(R.id.kaliyara_vill_btn);
        mirtola_vill_btn = findViewById(R.id.mirtola_vill_btn);

        bilghar_vill_btn = findViewById(R.id.bilghar_vill_btn);
        kollabari_vill_btn = findViewById(R.id.kollabari_vill_btn);
        aksina_vill_btn = findViewById(R.id.aksina_vill_btn);




        mirpokorpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_West_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mirpokorpar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kaliyara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_West_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kaliyara_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        mirtola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_West_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mirtola_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bilghar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_West_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bilghar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kollabari_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_West_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kollabari_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        aksina_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_West_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Aksina_Online_Sheba_Activity");
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


} //------------------------------------Kharera_Union Method Line End Here