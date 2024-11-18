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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Wifi_Internet_Service extends AppCompatActivity {


    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_wifi_internet_service);
        getSupportActionBar().setTitle("ইন্টারনেট প্রতিষ্ঠানের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_01);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_02);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_03);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_04);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_05);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_06);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_07);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_07);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("internet_service_sub_text", R.string.internet_service_sub_textview_08);
        hashMap.put("internet_service_sub_details_text", R.string.internet_service_sub_details_textview_08);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================
        Wifi_Internet_Service.MyAdapter myAdapter = new Wifi_Internet_Service.MyAdapter();
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

                all_profile_image.setImageResource(R.drawable.wifi_ogni_logo);

            }


            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.wifi_connect_icon);

            }

            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.wifi_connect_icon);

            }


            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.wifi_connect_icon);

            }

            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.wifi_connect_icon);

            }

            if (position == 5) {

                all_profile_image.setImageResource(R.drawable.wifi_connect_icon);

            }

            if (position == 6) {

                all_profile_image.setImageResource(R.drawable.wifi_dowr_logo);

            }

            if (position == 7) {

                all_profile_image.setImageResource(R.drawable.wifi_connect_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);

            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        String myNumber = "01727787600";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 1) {

                        String myNumber = "01793-954313";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 2) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01911-990550"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 3) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01714-975570"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }


                    if (position == 4) {

                        String myNumber = "01819-660779";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 5) {

                        Toast.makeText(Wifi_Internet_Service.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();

                    }


                    if (position == 6) {

                        String myNumber = "01958633759";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 7) {

                        Toast.makeText(Wifi_Internet_Service.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();

                    }


                }
            });


            call_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        String phoneNumber = "01727787600";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String phoneNumber = "01793-954313";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String phoneNumber = "01911-990550";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 3) {

                        String phoneNumber = "01714-975570";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 4) {

                        String phoneNumber = "01819-660779";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 5) {

                        Toast.makeText(Wifi_Internet_Service.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();

                    }


                    if (position == 6) {


                        String phoneNumber = "01958633759";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 7) {

                        Toast.makeText(Wifi_Internet_Service.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();

                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_sub_textview.setText(hashMap.get("internet_service_sub_text"));
            all_sub_details_textview.setText(hashMap.get("internet_service_sub_details_text"));


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


} //------------------------Wifi_Internet_Service Bundle Method Line End Here