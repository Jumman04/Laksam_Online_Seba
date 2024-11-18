package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class Dokan_Showroom extends AppCompatActivity {

    CardView mobile_shop_btn, electronics_shop_btn, jewellery_btn, furniture_shop_btn, grocery_shop_btn, online_shop_btn,
            printing_press_btn, laundry_shop_btn, decorators_shop_btn, computer_shop_btn;


    //===================================================================
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    //===================================================================


    String whatsappUser = "+8801766874923";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_dokan_showroom);
        getSupportActionBar().setTitle("দোকান শোরুম এর তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        grocery_shop_btn = findViewById(R.id.grocery_shop_btn);
        jewellery_btn = findViewById(R.id.jewellery_btn);
        online_shop_btn = findViewById(R.id.online_shop_btn);
        furniture_shop_btn = findViewById(R.id.furniture_shop_btn);
        mobile_shop_btn = findViewById(R.id.mobile_shop_btn);
        printing_press_btn = findViewById(R.id.printing_press_btn);
        laundry_shop_btn = findViewById(R.id.laundry_shop_btn);
        electronics_shop_btn = findViewById(R.id.electronics_shop_btn);
        computer_shop_btn = findViewById(R.id.computer_shop_btn);
        decorators_shop_btn = findViewById(R.id.decorators_shop_btn);


        grocery_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Grocery_Shop.class);
                startActivity(myIntent);
            }
        });

        electronics_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Electronics_Shop.class);
                startActivity(myIntent);
            }
        });


        online_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Online_Shop();
                Intent intent = new Intent(Dokan_Showroom.this, Multiple_Details_03.class);
                intent.putExtra("title", "অনলাইন শপের তালিকা");
                startActivity(intent);
            }
        });


        jewellery_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Jewellery_Shop.class);
                startActivity(myIntent);
            }
        });


        furniture_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Wood_Furniture_Shop.class);
                startActivity(myIntent);
            }
        });


        mobile_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Mobile_Shop.class);
                startActivity(myIntent);
            }
        });


        printing_press_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Printing_Press_Shop.class);
                startActivity(myIntent);
            }
        });


        laundry_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Laundry_Service.class);
                startActivity(myIntent);
            }
        });


        decorators_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Dokan_Showroom.this, Decorators_Shop.class);
                startActivity(myIntent);
            }
        });




        computer_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Computer_CC_Camera();
                Intent intent = new Intent(Dokan_Showroom.this, Multiple_Details_03.class);
                intent.putExtra("title", "কম্পিউটার ও সিসি ক্যামেরা সেবা");
                startActivity(intent);
            }
        });






    } //------------------------OnCreate Bundle Method End







    //==================================Computer_CC_Camera Shop Activity Start=============================
    public void Computer_CC_Camera() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("title_text", getString(R.string.computer_title_text_01));
        hashMap.put("adress_text", getString(R.string.computer_adress_text_01));
        hashMap.put("description_text", getString(R.string.computer_des_text_01));
        hashMap.put("phone_number_text", "01616366332");
        hashMap.put("fb_page_url", "https://www.facebook.com/inteax?mibextid=ZbWKwL");
        hashMap.put("whatsp_call_btn", "+88 01616366332");
        hashMap.put("imageView", String.valueOf(R.drawable.inteax_logo));
        arrayList.add(hashMap);


        Multiple_Details_03.donnerarrayList = arrayList;
    }
    //==================================Computer_CC_Camera Shop Activity Start=============================




    //==================================Nursary Shop Activity Start=============================
    public void Online_Shop() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("title_text", getString(R.string.online_shop_title_text_01));
        hashMap.put("adress_text", getString(R.string.online_shop_adress_text_01));
        hashMap.put("description_text", getString(R.string.online_shop_des_text_01));
        hashMap.put("phone_number_text", "01749-212776");
        hashMap.put("fb_page_url", "https://www.facebook.com/profile.php?id=100063818896525&mibextid=ZbWKwL");
        hashMap.put("whatsp_call_btn", "+88 01749-212776");
        hashMap.put("imageView", String.valueOf(R.drawable.hand_craft_logo));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("title_text", getString(R.string.online_shop_title_text_02));
        hashMap.put("adress_text", getString(R.string.online_shop_adress_text_02));
        hashMap.put("description_text", getString(R.string.online_shop_des_text_02));
        hashMap.put("phone_number_text", "01722014398");
        hashMap.put("fb_page_url", "https://www.facebook.com/seafishbd21");
        hashMap.put("whatsp_call_btn", "+88 01722014398");
        hashMap.put("imageView", String.valueOf(R.drawable.samodrik_fish_logo));
        arrayList.add(hashMap);


        Multiple_Details_03.donnerarrayList = arrayList;
    }
    //==================================Nursary Shop Activity Start=============================




    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //

} //------------------------OnCreate Bundle Method End