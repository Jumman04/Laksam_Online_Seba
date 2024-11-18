package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Kharera_Union extends AppCompatActivity {

    CardView kharera_vill_btn, deli_vill_btn, pataisar_vill_btn, monkasair_vill_btn, goneshpukorpar_vill_btn,
             radanagar_vill_btn, sonargao_vill_btn, gulasar_vill_btn, bogir_vill_btn, dormopur_vill_btn,
             keyar_vill_btn, damsar_vill_btn, gojaria_vill_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_kharera_union);
        getSupportActionBar().setTitle("খাড়েরা ইউনিয়ন অনলাইন সেবা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//



        kharera_vill_btn = findViewById(R.id.kharera_vill_btn);
        deli_vill_btn = findViewById(R.id.deli_vill_btn);
        pataisar_vill_btn = findViewById(R.id.pataisar_vill_btn);
        monkasair_vill_btn = findViewById(R.id.monkasair_vill_btn);
        goneshpukorpar_vill_btn = findViewById(R.id.goneshpukorpar_vill_btn);

        radanagar_vill_btn = findViewById(R.id.radanagar_vill_btn);
        sonargao_vill_btn = findViewById(R.id.sonargao_vill_btn);
        gulasar_vill_btn = findViewById(R.id.gulasar_vill_btn);
        bogir_vill_btn = findViewById(R.id.bogir_vill_btn);
        dormopur_vill_btn = findViewById(R.id.dormopur_vill_btn);

        keyar_vill_btn = findViewById(R.id.keyar_vill_btn);
        damsar_vill_btn = findViewById(R.id.damsar_vill_btn);
        gojaria_vill_btn = findViewById(R.id.gojaria_vill_btn);




        kharera_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kharera_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        deli_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Deli_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        pataisar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Pataisar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        monkasair_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Monkasair_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        goneshpukorpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Goneshpukorpar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        radanagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Radanagar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        sonargao_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sonargao_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gulasar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gulasar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bogir_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bogir_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        dormopur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dormopur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        keyar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Keyar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        damsar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dampar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gojaria_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kharera_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gojaria_vill_btn_Online_Sheba_Activity");
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