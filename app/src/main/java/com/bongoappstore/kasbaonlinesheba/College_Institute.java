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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class College_Institute extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_collage_institute);
        getSupportActionBar().setTitle("কলেজ এবং ইন্সটিটিউট এর তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("college_name_text", R.string.college_name_text_09);
        arrayList.add(hashMap);





        //==========================================================================================
        //==========================================================================================
        College_Institute.MyAdapter myAdapter = new College_Institute.MyAdapter();
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
            View myView = layoutInflater.inflate(R.layout.college_item_design, viewGroup, false);


            TextView all_sub_textview = myView.findViewById(R.id.hat_bazar_name_text);


            //-----------------------Sim Image List Line Start Here-----------------//


            /*
            ImageView all_profile_image = myView.findViewById(R.id.all_profile_image);

            if (position == 0) {

                all_profile_image.setImageResource(R.drawable.resturant_icon2);

            }


            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.resturant_icon3);

            }

*/


            //-----------------------Sim Image List Line End Here-----------------//
/*

            Button mobile_no_btn = myView.findViewById(R.id.mobile_no_btn);

            if (position == 0) {

                mobile_no_btn.setText("মেসেজ করুন");
            }


            if (position == 1) {

                mobile_no_btn.setText("মেসেজ করুন");
            }




            Button call_button = myView.findViewById(R.id.call_button);


            call_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01741-699899", null));
                        startActivity(intentcall);
                    }


                    if (position == 1) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01799-944414", null));
                        startActivity(intentcall);
                    }




                }
            });

*/


            HashMap<String, Integer> hashMap = arrayList.get(position);

            all_sub_textview.setText(hashMap.get("college_name_text"));


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








} //-------------------Primary_School Method Line End Here