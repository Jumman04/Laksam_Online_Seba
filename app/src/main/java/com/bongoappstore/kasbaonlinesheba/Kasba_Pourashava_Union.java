package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Kasba_Pourashava_Union extends AppCompatActivity {

    CardView shapur_vill_btn, goriyarup_vill_btn, taltola_vill_btn, nitainagar_vill_btn, jogotpur_vill_btn,
             araibari_vill_btn, bisarabari_vill_btn, salikpar_vill_btn, tetouya_vill_btn, fultoli_vill_btn,
             gorohit_vill_btn, sitolpara_vill_btn, chornal_vill_btn, akobpur_vill_btn, mirpokorpar_vill_btn,
             atkapara_vill_btn, nowapara_vill_btn, sahapara_vill_btn, kharpara_vill_btn, kollansagor_vill_btn,
             tarapur_vill_btn, kalikapur_vill_btn, kormokarpara_vill_btn, morapukorpar_vill_btn,
             kasba_sadarpara_vill_btn, imampara_vill_btn, hakor_vill_btn, bogabari_vill_btn,
             kanchonmuri_vill_btn, krishpur_vill_btn, panaiyarpar_vill_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_kasba_pourashava_union);
        getSupportActionBar().setTitle("কসবা-পৌরসভা ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        shapur_vill_btn = findViewById(R.id.shapur_vill_btn);
        goriyarup_vill_btn = findViewById(R.id.goriyarup_vill_btn);
        taltola_vill_btn = findViewById(R.id.taltola_vill_btn);
        nitainagar_vill_btn = findViewById(R.id.nitainagar_vill_btn);
        jogotpur_vill_btn = findViewById(R.id.jogotpur_vill_btn);


        araibari_vill_btn = findViewById(R.id.araibari_vill_btn);
        bisarabari_vill_btn = findViewById(R.id.bisarabari_vill_btn);
        salikpar_vill_btn = findViewById(R.id.salikpar_vill_btn);
        tetouya_vill_btn = findViewById(R.id.tetouya_vill_btn);
        fultoli_vill_btn = findViewById(R.id.fultoli_vill_btn);


        gorohit_vill_btn = findViewById(R.id.gorohit_vill_btn);
        sitolpara_vill_btn = findViewById(R.id.sitolpara_vill_btn);
        chornal_vill_btn = findViewById(R.id.chornal_vill_btn);
        akobpur_vill_btn = findViewById(R.id.akobpur_vill_btn);
        mirpokorpar_vill_btn = findViewById(R.id.mirpokorpar_vill_btn);


        atkapara_vill_btn = findViewById(R.id.atkapara_vill_btn);
        nowapara_vill_btn = findViewById(R.id.nowapara_vill_btn);
        sahapara_vill_btn = findViewById(R.id.sahapara_vill_btn);
        kharpara_vill_btn = findViewById(R.id.kharpara_vill_btn);
        kollansagor_vill_btn = findViewById(R.id.kollansagor_vill_btn);


        tarapur_vill_btn = findViewById(R.id.tarapur_vill_btn);
        kalikapur_vill_btn = findViewById(R.id.kalikapur_vill_btn);
        kormokarpara_vill_btn = findViewById(R.id.kormokarpara_vill_btn);
        morapukorpar_vill_btn = findViewById(R.id.morapukorpar_vill_btn);
        kasba_sadarpara_vill_btn = findViewById(R.id.kasba_sadarpara_vill_btn);


        imampara_vill_btn = findViewById(R.id.imampara_vill_btn);
        hakor_vill_btn = findViewById(R.id.hakor_vill_btn);
        bogabari_vill_btn = findViewById(R.id.bogabari_vill_btn);
        kanchonmuri_vill_btn = findViewById(R.id.kanchonmuri_vill_btn);
        krishpur_vill_btn = findViewById(R.id.krishpur_vill_btn);

        panaiyarpar_vill_btn = findViewById(R.id.panaiyarpar_vill_btn);





        shapur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Shapur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        goriyarup_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Goriyarup_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        taltola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Taltola_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        nitainagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nitainagar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });




        jogotpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jogotpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });




        araibari_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Araibari_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        bisarabari_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bisarabari_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        salikpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Salikpar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        tetouya_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Tetouya_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        fultoli_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Fultoli_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });



        gorohit_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gorohit_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        sitolpara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sitolpara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        chornal_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chornal_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        akobpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Akobpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });



        mirpokorpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "mirpokorpar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });




        atkapara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Atkapara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        nowapara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nowapara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        sahapara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sahapara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });



        kharpara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "kharpara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });



        kollansagor_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kollansagor_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        tarapur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Tarapur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        kalikapur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kalikapur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        kormokarpara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kormokarpara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });

        morapukorpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Morapukorpar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });



        kasba_sadarpara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kasba_sadarpara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        imampara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Imampara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        hakor_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Hakor_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });



        bogabari_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bogabari_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });



        kanchonmuri_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kanchonmuri_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        krishpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Krishpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);
            }
        });


        panaiyarpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kasba_Pourashava_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Panaiyarpar_vill_btn_Online_Sheba_Activity");
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


} //------------------------------------Kasba_Pourashava_Union Method Line End Here