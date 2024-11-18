package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Kuti_Union extends AppCompatActivity {

    CardView kuti_vill_btn, jajiyara_vill_btn, bishnopur_vill_btn, gognanagar_vill_btn, lesiyara_vill_btn,
            maizkhar_vill_btn, maniknagar_vill_btn, sorotnagar_vill_btn, thokapara_vill_btn, taranagar_vill_btn,
            rampur_vill_btn, dokkhinkhar_vill_btn, bangur_vill_btn, bilghar_vill_btn, baisar_vill_btn, voyrobnagar_vill_btn,
            raniyara_vill_btn, santipur_vill_btn, katerpul_vill_btn, kalamuriya_vill_btn, shasansar_vill_btn, gunsagar_vill_btn,
            atokpara_vill_btn, kaiccanagar_vill_btn, ekobnagar_vill_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_kuti_union);
        getSupportActionBar().setTitle("কুটি ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        kuti_vill_btn = findViewById(R.id.kuti_vill_btn);
        jajiyara_vill_btn = findViewById(R.id.jajiyara_vill_btn);
        bishnopur_vill_btn = findViewById(R.id.bishnopur_vill_btn);
        gognanagar_vill_btn = findViewById(R.id.gognanagar_vill_btn);
        lesiyara_vill_btn = findViewById(R.id.lesiyara_vill_btn);

        maizkhar_vill_btn = findViewById(R.id.maizkhar_vill_btn);
        maniknagar_vill_btn = findViewById(R.id.maniknagar_vill_btn);
        sorotnagar_vill_btn = findViewById(R.id.sorotnagar_vill_btn);
        thokapara_vill_btn = findViewById(R.id.thokapara_vill_btn);
        taranagar_vill_btn = findViewById(R.id.taranagar_vill_btn);

        rampur_vill_btn = findViewById(R.id.rampur_vill_btn);
        dokkhinkhar_vill_btn = findViewById(R.id.dokkhinkhar_vill_btn);
        bangur_vill_btn = findViewById(R.id.bangur_vill_btn);
        bilghar_vill_btn = findViewById(R.id.bilghar_vill_btn);
        baisar_vill_btn = findViewById(R.id.baisar_vill_btn);

        voyrobnagar_vill_btn = findViewById(R.id.voyrobnagar_vill_btn);
        raniyara_vill_btn = findViewById(R.id.raniyara_vill_btn);
        santipur_vill_btn = findViewById(R.id.santipur_vill_btn);
        katerpul_vill_btn = findViewById(R.id.katerpul_vill_btn);
        kalamuriya_vill_btn = findViewById(R.id.kalamuriya_vill_btn);

        shasansar_vill_btn = findViewById(R.id.shasansar_vill_btn);
        gunsagar_vill_btn = findViewById(R.id.gunsagar_vill_btn);
        atokpara_vill_btn = findViewById(R.id.atokpara_vill_btn);
        kaiccanagar_vill_btn = findViewById(R.id.kaiccanagar_vill_btn);
        ekobnagar_vill_btn = findViewById(R.id.ekobnagar_vill_btn);


        kuti_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kuti_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        jajiyara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jajiyara_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bishnopur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bishnopur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gognanagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gognanagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        lesiyara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Lesiyara_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        maizkhar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Maizkhar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        maniknagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Maniknagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        sorotnagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sorotnagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        thokapara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Thokapara_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        taranagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Taranagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        rampur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Rampur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        dokkhinkhar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dokkhinkhar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bangur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bangur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bilghar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bilghar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        baisar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Baisar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        voyrobnagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Voyrobnagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        raniyara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Raniyara_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        santipur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Santipur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        katerpul_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Katerpul_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kalamuriya_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kalamuriya_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        shasansar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Shasansar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gunsagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gunsagar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        atokpara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Atokpara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kaiccanagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kaiccanagar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        ekobnagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kuti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Ekobnagar_Online_Sheba_Activity");
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


} //------------------------------------Kuti_Union Method Line End Here