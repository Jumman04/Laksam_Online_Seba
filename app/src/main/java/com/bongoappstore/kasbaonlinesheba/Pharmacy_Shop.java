package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Pharmacy_Shop extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_pharmacy_shop);
        getSupportActionBar().setTitle("কসবা ফার্মেসী শপ এর তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_01);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_02);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_03);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_04);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_05);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_06);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_07);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_08);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_09);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_09);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_10);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_11);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_12);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_12);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_13);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_13);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_14);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_14);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_15);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_15);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_16);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_16);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_17);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_17);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_18);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_18);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_19);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_19);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_20);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_20);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_21);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_21);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_22);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_22);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_23);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_23);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_24);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_24);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_25);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_20);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_26);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_26);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("all_sub_textview", R.string.pharmacy_sub_textview_27);
        hashMap.put("all_sub_details_textview", R.string.pharmacy_sub_details_textview_27);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================

        Pharmacy_Shop.MyAdapter myAdapter = new Pharmacy_Shop.MyAdapter();
        listView.setAdapter(myAdapter);


    } //------------------------OnCreate Bundle Method Line End Here

    //-----------------------Create My Own Adapter Line Start Here-------------------------------------//
    public class MyAdapter extends BaseAdapter {

        LayoutInflater layoutInflater;

        @Override
        public int getCount() {
            // return 1;
            return arrayList.size();

        }


        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        //=========================================================================================//


        //=========================================================================================//


        @SuppressLint("ResourceType")
        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {


            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.pharmacy_custom_item_design, viewGroup, false);


            TextView all_sub_textview = myView.findViewById(R.id.all_sub_textview_01);
            TextView all_sub_details_textview = myView.findViewById(R.id.all_sub_details_textview_01);


            //-----------------------Sim Image List Line Start Here-----------------//

            ImageView all_profile_image = myView.findViewById(R.id.all_profile_image);

            if (position == 0) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            if (position == 5) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 6) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 7) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 8) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 9) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 10) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            if (position == 11) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 12) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 13) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 14) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 15) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 16) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 17) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 18) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 19) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 20) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            if (position == 21) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            if (position == 22) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            if (position == 23) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            if (position == 24) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }

            if (position == 25) {

                all_profile_image.setImageResource(R.drawable.moktijodda_pharmacy_icon);

            }

            if (position == 26) {

                all_profile_image.setImageResource(R.drawable.pharmacy_shop_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);


            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        String myNumber = "01919-705125";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String myNumber = "01745-754852";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 2) {
                        String myNumber = "01789-071844";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 3) {
                        String myNumber = "01733-148410";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 4) {
                        String myNumber = "01715-307998";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 5) {
                        String myNumber = "01720-585669";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 6) {
                        String myNumber = "01749-316115";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 7) {
                        String myNumber = "01922-605454";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String myNumber = "01755121359";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String myNumber = "01912127706";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 10) {
                        String myNumber = "01814821279";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 11) {
                        String myNumber = "01915620964";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 12) {
                        String myNumber = "01632729614";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 13) {
                        String myNumber = "01720568113";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 14) {
                        String myNumber = "01739802627";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 15) {
                        String myNumber = "01742657792";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 16) {
                        String myNumber = "01631986597";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 17) {
                        String myNumber = "01838744158";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 18) {
                        String myNumber = "01727610610";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 19) {
                        String myNumber = "01827157815";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 20) {
                        String myNumber = "01717740064";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 21) {
                        String myNumber = "01720522063";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 22) {
                        String myNumber = "01731116411";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 23) {
                        String myNumber = "017422767646";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 24) {
                        String myNumber = "01913860800";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 25) {
                        String myNumber = "01714562534";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 26) {
                        String myNumber = "01736395644";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                }
            });


            call_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (position == 0) {
                        String phoneNumber = "01919-705125";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 1) {

                        String phoneNumber = "01745-754852";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String phoneNumber = "01789-071844";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 3) {
                        String phoneNumber = "01733-148410";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 4) {
                        String phoneNumber = "01715-307998";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 5) {
                        String phoneNumber = "01720-585669";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 6) {
                        String phoneNumber = "01749-316115";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 7) {
                        String phoneNumber = "01922-605454";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String phoneNumber = "01755121359";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String phoneNumber = "01912127706";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 10) {
                        String phoneNumber = "01814821279";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 11) {
                        String phoneNumber = "01915620964";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 12) {
                        String phoneNumber = "01632729614";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 13) {
                        String phoneNumber = "01720568113";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 14) {
                        String phoneNumber = "01739802627";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 15) {
                        String phoneNumber = "01742657792";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 16) {
                        String phoneNumber = "01631986597";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 17) {
                        String phoneNumber = "01838744158";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 18) {
                        String phoneNumber = "01727610610";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 19) {
                        String phoneNumber = "01827157815";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 20) {
                        String phoneNumber = "01717740064";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 21) {
                        String phoneNumber = "01720522063";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 22) {
                        String phoneNumber = "01731116411";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 23) {
                        String phoneNumber = "017422767646";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 24) {
                        String phoneNumber = "01913860800";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 25) {
                        String phoneNumber = "01714562534";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 26) {
                        String phoneNumber = "01736395644";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_sub_textview.setText(hashMap.get("all_sub_textview"));
            all_sub_details_textview.setText(hashMap.get("all_sub_details_textview"));


            return myView;


        }


    } //-----------------------Create My Own Adapter Line End Here-------------------------------------//

    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //------------------------Hospital Method Line End Here