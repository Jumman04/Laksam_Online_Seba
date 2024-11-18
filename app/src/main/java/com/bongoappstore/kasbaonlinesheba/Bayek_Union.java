package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Bayek_Union extends AppCompatActivity {

    CardView charua_vill_btn, bayek_vill_btn, nayonpur_vill_btn, konaghata_vill_btn, kandarpar_vill_btn,
             donrajpur_vill_btn, koykhola_vill_btn, borobayek_vill_btn, sagortola_vill_btn, joydebpur_vill_btn,
             kollapathor_vill_btn, horipur_vill_btn, madla_vill_btn, biddanagor_vill_btn, khadla_vill_btn,
             nichontopur_vill_btn, ghopinagar_vill_btn, gowrangula_vill_btn, barikhola_vill_btn, badaliya_vill_btn,
             shampur_vill_btn, putiya_vill_btn, beltoli_vill_btn, baliyahura_vill_btn, kasirampur_vill_btn,
             rogurampur_vill_btn, chandkhola_vill_btn, sostapur_vill_btn, mizzapur_vill_btn, dopakhola_vill_btn,
             nowapara_vill_btn, nayonpur_hat_vill_btn, rajvollobpur_vill_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_bayek_union);
        getSupportActionBar().setTitle("বায়েক ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        charua_vill_btn = findViewById(R.id.charua_vill_btn);
        bayek_vill_btn = findViewById(R.id.bayek_vill_btn);
        nayonpur_vill_btn = findViewById(R.id.nayonpur_vill_btn);
        konaghata_vill_btn = findViewById(R.id.konaghata_vill_btn);
        kandarpar_vill_btn = findViewById(R.id.kandarpar_vill_btn);

        donrajpur_vill_btn = findViewById(R.id.donrajpur_vill_btn);
        koykhola_vill_btn = findViewById(R.id.koykhola_vill_btn);
        borobayek_vill_btn = findViewById(R.id.borobayek_vill_btn);
        sagortola_vill_btn = findViewById(R.id.sagortola_vill_btn);
        joydebpur_vill_btn = findViewById(R.id.joydebpur_vill_btn);

        kollapathor_vill_btn = findViewById(R.id.kollapathor_vill_btn);
        horipur_vill_btn = findViewById(R.id.horipur_vill_btn);
        madla_vill_btn = findViewById(R.id.madla_vill_btn);
        biddanagor_vill_btn = findViewById(R.id.biddanagor_vill_btn);
        khadla_vill_btn = findViewById(R.id.khadla_vill_btn);

        nichontopur_vill_btn = findViewById(R.id.nichontopur_vill_btn);
        ghopinagar_vill_btn = findViewById(R.id.ghopinagar_vill_btn);
        gowrangula_vill_btn = findViewById(R.id.gowrangula_vill_btn);
        barikhola_vill_btn = findViewById(R.id.barikhola_vill_btn);
        badaliya_vill_btn = findViewById(R.id.badaliya_vill_btn);

        shampur_vill_btn = findViewById(R.id.shampur_vill_btn);
        putiya_vill_btn = findViewById(R.id.putiya_vill_btn);
        beltoli_vill_btn = findViewById(R.id.beltoli_vill_btn);
        baliyahura_vill_btn = findViewById(R.id.baliyahura_vill_btn);
        kasirampur_vill_btn = findViewById(R.id.kasirampur_vill_btn);

        rogurampur_vill_btn = findViewById(R.id.rogurampur_vill_btn);
        chandkhola_vill_btn = findViewById(R.id.chandkhola_vill_btn);
        sostapur_vill_btn = findViewById(R.id.sostapur_vill_btn);
        mizzapur_vill_btn = findViewById(R.id.mizzapur_vill_btn);
        dopakhola_vill_btn = findViewById(R.id.dopakhola_vill_btn);

        nowapara_vill_btn = findViewById(R.id.nowapara_vill_btn);
        nayonpur_hat_vill_btn = findViewById(R.id.nayonpur_hat_vill_btn);
        rajvollobpur_vill_btn = findViewById(R.id.rajvollobpur_vill_btn);





        charua_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Charua_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        bayek_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bayek_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        nayonpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nayonpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        konaghata_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Konaghata_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        kandarpar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kandarpar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        donrajpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Donrajpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        koykhola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Koykhola_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        borobayek_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Borobayek_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        sagortola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sagortola_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        joydebpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Joydebpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        kollapathor_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kollapathor_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        horipur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Horipur_Online_Sheba_Activity_01");
                startActivity(myIntent);

            }
        });


        madla_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Madla_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        biddanagor_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Biddanagor_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        khadla_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Khadla_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        nichontopur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nichontopur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        ghopinagar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Ghopinagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        gowrangula_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gowrangula_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        barikhola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Barikhola_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        badaliya_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Badaliya_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        shampur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Shampur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        putiya_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Putiya_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        beltoli_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Beltoli_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        baliyahura_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Baliyahura_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        kasirampur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Kasirampur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        rogurampur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Rogurampur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        chandkhola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chandkhola_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        sostapur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sostapur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        mizzapur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mizzapur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        dopakhola_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dopakhola_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nowapara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nowapara_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nayonpur_hat_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "NayonpurHat_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        rajvollobpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Bayek_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Rajvollobpur_Online_Sheba_Activity");
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


} //------------------------------------Bayek_Union Method Line End Here