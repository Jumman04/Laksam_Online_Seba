package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Kayempur_Union extends AppCompatActivity {

    CardView kayempur_vill_btn, paniyarup_vill_btn, nowagao_vill_btn, lokkhipur_vill_btn, jajisar_vill_btn,
             chokbosta_vill_btn, gonganagar_vill_btn, omorpur_vill_btn, kalta_vill_btn, khoraishar_vill_btn,
             digirpar_vill_btn, nakhaora_vill_btn, rajvollobpur_vill_btn2, chatowakhola_vill_btn,
             raoutkhola_vill_btn, kamalpur_vill_btn, sreepur_vill_btn, mondovag_vill_btn, jogonnathpur_vill_btn,
             nowapara_vill_btn2, moinpur_vill_btn, jikra_vill_btn, kalinagar_vill_btn, girisnagar_vill_btn,
             gobindopur_vill_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_kayempur_union);
        getSupportActionBar().setTitle("কায়েমপুর ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        kayempur_vill_btn = findViewById(R.id.kayempur_vill_btn);
        paniyarup_vill_btn = findViewById(R.id.paniyarup_vill_btn);
        nowagao_vill_btn = findViewById(R.id.nowagao_vill_btn);

        lokkhipur_vill_btn = findViewById(R.id.lokkhipur_vill_btn);
        jajisar_vill_btn = findViewById(R.id.jajisar_vill_btn);
        chokbosta_vill_btn = findViewById(R.id.chokbosta_vill_btn);

        gonganagar_vill_btn = findViewById(R.id.gonganagar_vill_btn);
        omorpur_vill_btn = findViewById(R.id.omorpur_vill_btn);
        kalta_vill_btn = findViewById(R.id.kalta_vill_btn);

        khoraishar_vill_btn = findViewById(R.id.khoraishar_vill_btn);
        digirpar_vill_btn = findViewById(R.id.digirpar_vill_btn);
        nakhaora_vill_btn = findViewById(R.id.nakhaora_vill_btn);

        rajvollobpur_vill_btn2 = findViewById(R.id.rajvollobpur_vill_btn2);
        chatowakhola_vill_btn = findViewById(R.id.chatowakhola_vill_btn);
        raoutkhola_vill_btn = findViewById(R.id.raoutkhola_vill_btn);

        kamalpur_vill_btn = findViewById(R.id.kamalpur_vill_btn);
        sreepur_vill_btn = findViewById(R.id.sreepur_vill_btn);
        mondovag_vill_btn = findViewById(R.id.mondovag_vill_btn);

        jogonnathpur_vill_btn = findViewById(R.id.jogonnathpur_vill_btn);
        nowapara_vill_btn2 = findViewById(R.id.nowapara_vill_btn2);
        moinpur_vill_btn = findViewById(R.id.moinpur_vill_btn);

        jikra_vill_btn = findViewById(R.id.jikra_vill_btn);
        kalinagar_vill_btn = findViewById(R.id.kalinagar_vill_btn);
        girisnagar_vill_btn = findViewById(R.id.girisnagar_vill_btn);
        gobindopur_vill_btn = findViewById(R.id.gobindopur_vill_btn);











        kayempur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kayempur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });





        paniyarup_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Paniyarup_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        nowagao_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nowagao_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        lokkhipur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Lokkhipur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        jajisar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jajisar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        chokbosta_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chokbosta_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gonganagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gonganagar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        omorpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Omorpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kalta_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kalta_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        khoraishar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Khoraishar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        digirpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Digirpar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nakhaora_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nakhaora_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        rajvollobpur_vill_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Rajvollobpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        chatowakhola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chatowakhola_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        raoutkhola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Raoutkhola_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kamalpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kamalpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        sreepur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sreepur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        mondovag_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mondovag_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        jogonnathpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jogonnathpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nowapara_vill_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nowapara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        moinpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Moinpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        jikra_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jikra_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kalinagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kalinagar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        girisnagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Girisnagar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        gobindopur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Kayempur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gobindopur_vill_btn_Online_Sheba_Activity");
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


} //------------------------------------Kayempur_Union Method Line End Here