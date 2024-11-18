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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Book_Library extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_book_library);
        getSupportActionBar().setTitle("কসবা বই লাইব্রেরি এর তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("library_title_text", R.string.library_title_text_01);
        hashMap.put("library_description_text", R.string.library_description_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("library_title_text", R.string.library_title_text_02);
        hashMap.put("library_description_text", R.string.library_description_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("library_title_text", R.string.library_title_text_03);
        hashMap.put("library_description_text", R.string.library_description_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("library_title_text", R.string.library_title_text_04);
        hashMap.put("library_description_text", R.string.library_description_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("library_title_text", R.string.library_title_text_05);
        hashMap.put("library_description_text", R.string.library_description_text_05);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================
        Book_Library.MyAdapter myAdapter = new Book_Library.MyAdapter();
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

            if (position == 0) {

                all_profile_image.setImageResource(R.drawable.book_library_icon);

            }


            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.book_library_icon);

            }

            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.book_library_icon);

            }

            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.book_library_icon);

            }

            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.book_library_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            TextView message_btn = myView.findViewById(R.id.message_btn);
            TextView call_button = myView.findViewById(R.id.call_button);


            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        String myNumber = "01944414657";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 1) {
                        String myNumber = "01843413944";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }

                    if (position == 2) {
                        String myNumber = "01716-274227";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 3) {

                        String myNumber = "01911-670204";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);

                    }


                    if (position == 4) {
                        String myNumber = "01715562100";
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
                        String phoneNumber = "01944414657";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String phoneNumber = "01843413944";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String phoneNumber = "01716-274227";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 3) {
                        String phoneNumber = "01911-670204";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 4) {
                        String phoneNumber = "01715562100";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_sub_textview.setText(hashMap.get("library_title_text"));
            all_sub_details_textview.setText(hashMap.get("library_description_text"));


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


} //------------------------Book_Library Bundle Method Line End Here