package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Mulgram_Union extends AppCompatActivity {

    CardView amkhar_btn, baurkhanda_btn, dabirghar_btn, mulgram_btn, neyamatpur_btn, nibra_btn,
             lobkhan_btn, raitola_btn, shyambari_btn, nimbari_btn, chandrapur_btn, bahadurpur_btn,
             chargachh_btn, sherpur_btn, jaipur_btn, shyamnagar_btn, pukurpar_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_mulgram_union);
        getSupportActionBar().setTitle("মূলগ্রাম ইউনিয়ন অনলাইন সেবাসমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        amkhar_btn = findViewById(R.id.amkhar_btn);
        baurkhanda_btn = findViewById(R.id.baurkhanda_btn);
        dabirghar_btn = findViewById(R.id.dabirghar_btn);
        mulgram_btn = findViewById(R.id.mulgram_btn);
        neyamatpur_btn = findViewById(R.id.neyamatpur_btn);

        nibra_btn = findViewById(R.id.nibra_btn);
        lobkhan_btn = findViewById(R.id.lobkhan_btn);
        raitola_btn = findViewById(R.id.raitola_btn);
        shyambari_btn = findViewById(R.id.shyambari_btn);
        nimbari_btn = findViewById(R.id.nimbari_btn);

        chandrapur_btn = findViewById(R.id.chandrapur_btn);
        bahadurpur_btn = findViewById(R.id.bahadurpur_btn);
        chargachh_btn = findViewById(R.id.chargachh_btn);
        sherpur_btn = findViewById(R.id.sherpur_btn);
        jaipur_btn = findViewById(R.id.jaipur_btn);

        shyamnagar_btn = findViewById(R.id.shyamnagar_btn);
        pukurpar_btn = findViewById(R.id.pukurpar_btn);






        amkhar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Amkhar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        baurkhanda_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Baurkhanda_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        dabirghar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Dabirghar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        mulgram_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Mulgram_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        neyamatpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Neyamatpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nibra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nibra_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        lobkhan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Lobkhan_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        raitola_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Raitola_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        shyambari_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Shyambari_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        nimbari_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Nimbari_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        chandrapur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chandrapur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        bahadurpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Bahadurpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        chargachh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Chargachh_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        sherpur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Sherpur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        jaipur_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Jaipur_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        shyamnagar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Shyamnagar_Online_Sheba_Activity");
                startActivity(myIntent);

            }
        });


        pukurpar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Mulgram_Union.this, All_Vill_Activity_Show.class);
                myIntent.putExtra("keyItem_Name", "Pukurpar_Online_Sheba_Activity");
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


} //------------------------------------Mulgram_Union Method Line End Here