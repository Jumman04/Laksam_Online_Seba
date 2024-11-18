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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Atm_Booth extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_atm_booth);
        getSupportActionBar().setTitle("কসবা এটিএম বুথ এর তালিকা");


        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("clinic_name_text", R.string.atm_booth_name_text_01);
        hashMap.put("clinic_address_text", R.string.atm_booth_address_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("clinic_name_text", R.string.atm_booth_name_text_02);
        hashMap.put("clinic_address_text", R.string.atm_booth_address_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("clinic_name_text", R.string.atm_booth_name_text_03);
        hashMap.put("clinic_address_text", R.string.atm_booth_address_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("clinic_name_text", R.string.atm_booth_name_text_04);
        hashMap.put("clinic_address_text", R.string.atm_booth_address_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("clinic_name_text", R.string.atm_booth_name_text_05);
        hashMap.put("clinic_address_text", R.string.atm_booth_address_text_05);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================
        Atm_Booth.MyAdapter myAdapter = new Atm_Booth.MyAdapter();
        listView.setAdapter(myAdapter);


    } //--------------------OnCreate Bundle Method End


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
            View myView = layoutInflater.inflate(R.layout.activity_custom_item_design, viewGroup, false);


            TextView all_headline_text = myView.findViewById(R.id.all_headline_text);
            TextView all_sub_headline_text = myView.findViewById(R.id.all_sub_headline_text);


            //-----------------------Sim Image List Line Start Here-----------------//

            CircleImageView sim_company_name_image = myView.findViewById(R.id.sim_company_name_image);

            sim_company_name_image.setImageResource(R.drawable.atm_booth_icon);

            //-----------------------Sim Image List Line End Here-----------------//


            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        String phoneNumber = "01755554481";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String phoneNumber = "01 08126236";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 2) {
                        String phoneNumber = "01727231970";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 3) {

                        Toast.makeText(Atm_Booth.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();
                    }


                    if (position == 4) {

                        Toast.makeText(Atm_Booth.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();
                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("clinic_name_text"));
            all_sub_headline_text.setText(hashMap.get("clinic_address_text"));


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
}