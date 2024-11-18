package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Binawoti_Union extends AppCompatActivity {


    CardView soydabad_vill_btn, dorowil_vill_btn, hazipur_vill_btn, routhat_vill_btn, binawoti_vill_btn,
             monichong_vill_btn, chandaisar_vill_btn, khidirpur_vill_btn, brahmangram_vill_btn, nemtabad_vill_btn,
             gabbari_vill_btn, nowapara_vill_btn, nowapara_south_vill_btn, vorajongle_vill_btn, sankhala_vill_btn,
             mojlishpur_vill_btn, onontopur_vill_btn, chapiya_vill_btn, tigouriya_vill_btn, chokchandrapur_vill_btn,
             adra_vill_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_binawoti_union);
        getSupportActionBar().setTitle("বিনাউটি ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//





        soydabad_vill_btn = findViewById(R.id.soydabad_vill_btn);
        dorowil_vill_btn = findViewById(R.id.dorowil_vill_btn);
        hazipur_vill_btn = findViewById(R.id.hazipur_vill_btn);
        routhat_vill_btn = findViewById(R.id.routhat_vill_btn);
        binawoti_vill_btn = findViewById(R.id.binawoti_vill_btn);

        monichong_vill_btn = findViewById(R.id.monichong_vill_btn);
        chandaisar_vill_btn = findViewById(R.id.chandaisar_vill_btn);
        khidirpur_vill_btn = findViewById(R.id.khidirpur_vill_btn);
        brahmangram_vill_btn = findViewById(R.id.brahmangram_vill_btn);
        nemtabad_vill_btn = findViewById(R.id.nemtabad_vill_btn);

        gabbari_vill_btn = findViewById(R.id.gabbari_vill_btn);
        nowapara_vill_btn = findViewById(R.id.nowapara_vill_btn);
        nowapara_south_vill_btn = findViewById(R.id.nowapara_south_vill_btn);
        vorajongle_vill_btn = findViewById(R.id.vorajongle_vill_btn);
        sankhala_vill_btn = findViewById(R.id.sankhala_vill_btn);

        mojlishpur_vill_btn = findViewById(R.id.mojlishpur_vill_btn);
        onontopur_vill_btn = findViewById(R.id.onontopur_vill_btn);
        chapiya_vill_btn = findViewById(R.id.chapiya_vill_btn);
        tigouriya_vill_btn = findViewById(R.id.tigouriya_vill_btn);
        chokchandrapur_vill_btn = findViewById(R.id.chokchandrapur_vill_btn);

        adra_vill_btn = findViewById(R.id.adra_vill_btn);





        soydabad_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Soydabad_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        dorowil_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dorowil_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        hazipur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Hazipur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        routhat_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Routhat_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        binawoti_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Binawoti_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });




        monichong_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Monichong_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        chandaisar_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chandaisar_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        khidirpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Khidirpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        brahmangram_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Brahmangram_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nemtabad_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nemtabad_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        gabbari_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Gabbari_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        nowapara_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nowapara_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        nowapara_south_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nowapara_south_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });





        vorajongle_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Vorajongle_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });



        sankhala_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sankhala_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        mojlishpur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "mojlishpur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });






        onontopur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Onontopur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        chapiya_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chapiya_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        tigouriya_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Tigouriya_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });

        chokchandrapur_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chokchandrapur_vill_btn_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        adra_vill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Binawoti_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Adra_vill_btn_Online_Sheba_Activity");
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


} //------------------------------------Binawoti_Union Method Line End Here