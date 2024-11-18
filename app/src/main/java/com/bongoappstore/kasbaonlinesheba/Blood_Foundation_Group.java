package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class Blood_Foundation_Group extends AppCompatActivity {

    CardView blood_foundation_group_btn_01,
             blood_foundation_group_btn_02,
             blood_foundation_group_btn_03,
             blood_foundation_group_btn_04,
             blood_foundation_group_btn_05,
             blood_foundation_group_btn_06,

             blood_foundation_group_btn_07,

             blood_foundation_group_btn_08,

             blood_foundation_group_btn_09,

             blood_foundation_group_btn_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_blood_foundation_group);
        getSupportActionBar().setTitle("ব্লাড ফাউন্ডেশন গ্রুপের তালিকা");
        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        blood_foundation_group_btn_01 = findViewById(R.id.blood_foundation_group_btn_01);
        blood_foundation_group_btn_02 = findViewById(R.id.blood_foundation_group_btn_02);
        blood_foundation_group_btn_03 = findViewById(R.id.blood_foundation_group_btn_03);
        blood_foundation_group_btn_04 = findViewById(R.id.blood_foundation_group_btn_04);
        blood_foundation_group_btn_05 = findViewById(R.id.blood_foundation_group_btn_05);
        blood_foundation_group_btn_06 = findViewById(R.id.blood_foundation_group_btn_06);
        blood_foundation_group_btn_07 = findViewById(R.id.blood_foundation_group_btn_07);
        blood_foundation_group_btn_08 = findViewById(R.id.blood_foundation_group_btn_08);
        blood_foundation_group_btn_09 = findViewById(R.id.blood_foundation_group_btn_09);
        blood_foundation_group_btn_10 = findViewById(R.id.blood_foundation_group_btn_10);




        blood_foundation_group_btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/922137548706371"));
                startActivity(myIntent);

            }
        });


        blood_foundation_group_btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/325787504916324/?ref=share_group_link"));
                startActivity(myIntent);

            }
        });


        blood_foundation_group_btn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/769005653291776"));
                startActivity(myIntent);

            }
        });


        blood_foundation_group_btn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/Bloodforkasbaimampara"));
                startActivity(myIntent);

            }
        });


        blood_foundation_group_btn_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Nbbankofficial"));
                startActivity(myIntent);

            }
        });


        blood_foundation_group_btn_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/393505441793204/"));
                startActivity(myIntent);

            }
        });



        blood_foundation_group_btn_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/24699404359644930"));
                startActivity(myIntent);

            }
        });



        blood_foundation_group_btn_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/1744303495721749/?ref=share&mibextid=K8Wfd2"));
                startActivity(myIntent);

            }
        });


        blood_foundation_group_btn_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/303462426911001/?ref=share"));
                startActivity(myIntent);

            }
        });


        blood_foundation_group_btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/496396332542695"));
                startActivity(myIntent);

            }
        });








    } //------------------------OnCreate Bundle Method Line End Here

    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //





} //------------------------Blood_Foundation_Group Method Line End Here