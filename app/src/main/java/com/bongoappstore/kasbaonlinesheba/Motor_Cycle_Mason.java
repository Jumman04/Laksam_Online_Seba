package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

public class Motor_Cycle_Mason extends AppCompatActivity {
    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor_cycle_mason);
        getSupportActionBar().setTitle("অটো রিক্সা ও সিএনজি মেস্ত্রী তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.moto_cycle_mason_sub_textview_01);
        hashMap.put("beauty_parlour_sub_details_text", R.string.moto_cycle_mason_sub_details_textview_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.moto_cycle_mason_sub_textview_02);
        hashMap.put("beauty_parlour_sub_details_text", R.string.moto_cycle_mason_sub_details_textview_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.moto_cycle_mason_sub_textview_03);
        hashMap.put("beauty_parlour_sub_details_text", R.string.moto_cycle_mason_sub_details_textview_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.moto_cycle_mason_sub_textview_04);
        hashMap.put("beauty_parlour_sub_details_text", R.string.moto_cycle_mason_sub_details_textview_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.moto_cycle_mason_sub_textview_05);
        hashMap.put("beauty_parlour_sub_details_text", R.string.moto_cycle_mason_sub_details_textview_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.moto_cycle_mason_sub_textview_06);
        hashMap.put("beauty_parlour_sub_details_text", R.string.moto_cycle_mason_sub_details_textview_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.moto_cycle_mason_sub_textview_07);
        hashMap.put("beauty_parlour_sub_details_text", R.string.moto_cycle_mason_sub_details_textview_07);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================
        Motor_Cycle_Mason.MyAdapter myAdapter = new Motor_Cycle_Mason.MyAdapter();
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
            View myView = layoutInflater.inflate(R.layout.basic_all_custom_item_design, viewGroup, false);


            TextView all_sub_textview = myView.findViewById(R.id.all_sub_textview_01);
            TextView all_sub_details_textview = myView.findViewById(R.id.all_sub_details_textview_01);


            //-----------------------Sim Image List Line Start Here-----------------//

            ImageView all_profile_image = myView.findViewById(R.id.all_profile_image);


            all_profile_image.setImageResource(R.drawable.motorcycle_icon);

            //-----------------------Sim Image List Line End Here-----------------//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);

            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (position == 0) {
                        String myNumber = "01811557249";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 1) {
                        String myNumber = "01621041330";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 2) {
                        String myNumber = "01833772055";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 3) {
                        String myNumber = "01846466205";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 4) {
                        String myNumber = "01301613020";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 5) {
                        String myNumber = "01732897118";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 6) {
                        String myNumber = "01796655513";
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
                        String phoneNumber = "01811557249";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String phoneNumber = "01621041330";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 2) {
                        String phoneNumber = "01833772055";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 3) {
                        String phoneNumber = "01846466205";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 4) {
                        String phoneNumber = "01301613020";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 5) {
                        String phoneNumber = "01732897118";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 6) {
                        String phoneNumber = "01796655513";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);
            all_sub_textview.setText(hashMap.get("beauty_parlour_sub_text"));
            all_sub_details_textview.setText(hashMap.get("beauty_parlour_sub_details_text"));


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


} //------------------------Beauty_Parlour Bundle Method Line End Here