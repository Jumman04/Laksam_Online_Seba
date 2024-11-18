package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Food_Order extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_food_order);
        getSupportActionBar().setTitle("খাবার ডেলিভারি রেস্টুরেন্ট");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_01);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_02);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_03);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_04);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_05);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_06);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_07);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("resturant_sub_text", R.string.resturant_sub_textview_08);
        hashMap.put("resturant_sub_details_text", R.string.resturant_sub_details_textview_08);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================
        Food_Order.MyAdapter myAdapter = new Food_Order.MyAdapter();
        listView.setAdapter(myAdapter);







    } //------------------OnCreate Bundle Method Line End Here


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
            View myView = layoutInflater.inflate(R.layout.basic_all_custom_item_design, viewGroup, false);


            TextView all_sub_textview = myView.findViewById(R.id.all_sub_textview_01);
            TextView all_sub_details_textview = myView.findViewById(R.id.all_sub_details_textview_01);


            //-----------------------Sim Image List Line Start Here-----------------//

            ImageView all_profile_image = myView.findViewById(R.id.all_profile_image);

            if (position == 0) {

                all_profile_image.setImageResource(R.drawable.resturant_icon2);

            }


            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.resturant_icon3);

            }


            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.food_order_icon);

            }

            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.food_order_icon);

            }

            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.food_order_icon);

            }

            if (position == 5) {

                all_profile_image.setImageResource(R.drawable.food_order_icon);

            }

            if (position == 6) {

                all_profile_image.setImageResource(R.drawable.food_order_icon);

            }

            if (position == 7) {

                all_profile_image.setImageResource(R.drawable.food_order_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);

            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (position == 0) {
                        String myNumber = "01741-699899";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String myNumber = "01799-944414";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String myNumber = "01627886556";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 3) {
                        String myNumber = "01795462124";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 4) {
                        String myNumber = "01763992934";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 5) {
                        String myNumber = "018183355526";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 6) {
                        String myNumber = "01331538073";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 7) {
                        String myNumber = "01704522686";
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

                        String phoneNumber = "01741-699899";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String phoneNumber = "01799-944414";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 2) {

                        String phoneNumber = "01627886556";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 3) {
                        String phoneNumber = "01795462124";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);


                    }


                    if (position == 4) {

                        String phoneNumber = "01763992934";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 5) {

                        String phoneNumber = "018183355526";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 6) {

                        String phoneNumber = "01331538073";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 7) {

                        String phoneNumber = "01704522686";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_sub_textview.setText(hashMap.get("resturant_sub_text"));
            all_sub_details_textview.setText(hashMap.get("resturant_sub_details_text"));


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




} //------------------Food_Order Method Line End Here