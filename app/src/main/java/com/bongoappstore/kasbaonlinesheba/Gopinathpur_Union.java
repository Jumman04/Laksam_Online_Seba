package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Gopinathpur_Union extends AppCompatActivity {

    CardView latuamura_btn, chandidwar_btn, vatshala_btn, vollabari_btn, mirjatpur_btn, alampur_btn,
             horiyaboho_btn, nowagao_btn, dowlotpur_btn, dojonagar_btn, rayermura_btn, gosaipur_btn,
             bishnaori_btn, ganokmura_btn, kashipur_btn, borthoda_btn, enayetpur_btn, fothehpur_btn,
             bahadurpur_btn, rajnagar_btn, gupinathpur_btn, gusaistol_btn, ganpur_btn, horipur_btn,
             jogonnatpur_btn, jethowamura_btn, khirnal_btn, koyipainna_btn, lokkhipur_btn, modupur_btn,
             manikkomuri_btn, pathoriadar_btn, rampur_btn, digirpar_btn, sotarmura_btn, ramnagar_btn,
             kajiyatula_btn, soyodpur_btn, barai_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_gopinathpur_union);
        getSupportActionBar().setTitle("গোপীনাথপুর ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        latuamura_btn = findViewById(R.id.latuamura_btn);
        chandidwar_btn = findViewById(R.id.chandidwar_btn);
        vatshala_btn = findViewById(R.id.vatshala_btn);
        vollabari_btn = findViewById(R.id.vollabari_btn);
        mirjatpur_btn = findViewById(R.id.mirjatpur_btn);

        alampur_btn = findViewById(R.id.alampur_btn);
        horiyaboho_btn = findViewById(R.id.horiyaboho_btn);
        nowagao_btn = findViewById(R.id.nowagao_btn);
        dowlotpur_btn = findViewById(R.id.dowlotpur_btn);
        dojonagar_btn = findViewById(R.id.dojonagar_btn);

        rayermura_btn = findViewById(R.id.rayermura_btn);
        gosaipur_btn = findViewById(R.id.gosaipur_btn);
        bishnaori_btn = findViewById(R.id.bishnaori_btn);
        ganokmura_btn = findViewById(R.id.ganokmura_btn);
        kashipur_btn = findViewById(R.id.kashipur_btn);

        borthoda_btn = findViewById(R.id.borthoda_btn);
        enayetpur_btn = findViewById(R.id.enayetpur_btn);
        fothehpur_btn = findViewById(R.id.fothehpur_btn);
        bahadurpur_btn = findViewById(R.id.bahadurpur_btn);
        rajnagar_btn = findViewById(R.id.rajnagar_btn);

        gupinathpur_btn = findViewById(R.id.gupinathpur_btn);
        gusaistol_btn = findViewById(R.id.gusaistol_btn);
        ganpur_btn = findViewById(R.id.ganpur_btn);
        horipur_btn = findViewById(R.id.horipur_btn);
        jogonnatpur_btn = findViewById(R.id.jogonnatpur_btn);

        jethowamura_btn = findViewById(R.id.jethowamura_btn);
        khirnal_btn = findViewById(R.id.khirnal_btn);
        koyipainna_btn = findViewById(R.id.koyipainna_btn);
        lokkhipur_btn = findViewById(R.id.lokkhipur_btn);
        modupur_btn = findViewById(R.id.modupur_btn);

        manikkomuri_btn = findViewById(R.id.manikkomuri_btn);
        pathoriadar_btn = findViewById(R.id.pathoriadar_btn);
        rampur_btn = findViewById(R.id.rampur_btn);
        digirpar_btn = findViewById(R.id.digirpar_btn);
        sotarmura_btn = findViewById(R.id.sotarmura_btn);

        ramnagar_btn = findViewById(R.id.ramnagar_btn);
        kajiyatula_btn = findViewById(R.id.kajiyatula_btn);
        soyodpur_btn = findViewById(R.id.soyodpur_btn);
        barai_btn = findViewById(R.id.barai_btn);




        latuamura_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Latuamura_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        chandidwar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chandidwar_Online_Sheba_Activity");
                startActivity(myIntent);


            }
        });


        vatshala_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Vatshala_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        vollabari_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Vollabari_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        mirjatpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mirjatpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        alampur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Alampur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        horiyaboho_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Horiyaboho_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nowagao_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nowagao_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        dowlotpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dowlotpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        dojonagar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dojonagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        rayermura_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Rayermura_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gosaipur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gosaipur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bishnaori_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bishnaori_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        ganokmura_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Ganokmura_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kashipur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kashipur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        borthoda_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Borthoda_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        enayetpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Enayetpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        fothehpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Fothehpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bahadurpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bahadurpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        rajnagar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Rajnagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gupinathpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gupinathpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gusaistol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gusaistol_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        ganpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Ganpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        horipur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Horipur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        jogonnatpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jogonnatpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        jethowamura_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jethowamura_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        khirnal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Khirnal_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        koyipainna_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Koyipainna_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        lokkhipur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Lokkhipur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        modupur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Modupur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        manikkomuri_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Manikkomuri_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        pathoriadar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Pathoriadar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        rampur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Rampur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        digirpar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Digirpar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        sotarmura_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sotarmura_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        ramnagar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Ramnagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        kajiyatula_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kajiyatula_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        soyodpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Soyodpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        barai_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Gopinathpur_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Barai_Online_Sheba_Activity");
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