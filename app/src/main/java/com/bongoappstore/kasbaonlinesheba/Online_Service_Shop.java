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

public class Online_Service_Shop extends AppCompatActivity {


    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_online_service_shop);
        getSupportActionBar().setTitle("অনলাইন সার্ভিস শপের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_01);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_02);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_03);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_04);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_05);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_06);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_07);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_08);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_09);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_09);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_10);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_11);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_12);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_12);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("training_center_sub_text", R.string.online_service_shop_sub_textview_13);
        hashMap.put("training_center_sub_details_text", R.string.online_service_shop_sub_details_textview_13);
        arrayList.add(hashMap);




        //==========================================================================================
        //==========================================================================================
        Online_Service_Shop.MyAdapter myAdapter = new Online_Service_Shop.MyAdapter();
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

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.sm_computer_icon_01);

            }


            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.sm_computer_icon_02);

            }


            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 5) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 6) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 7) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 8) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 9) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 10) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }

            if (position == 11) {

                all_profile_image.setImageResource(R.drawable.computer_sevice_icon);

            }


            if (position == 12) {

                all_profile_image.setImageResource(R.drawable.city_zone_travels_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);


            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        String myNumber = "01642-496318";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String myNumber = "01711575211";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String myNumber = "01710970905";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 3) {
                        String myNumber = "01710970905";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 4) {
                        String myNumber = "01890808742";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 5) {
                        String myNumber = "01628886326";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 6) {
                        String myNumber = "01942008090";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 7) {
                        String myNumber = "01798394549";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String myNumber = "01715971642";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String myNumber = "01711941567";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 10) {

                        Toast.makeText(Online_Service_Shop.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();
                    }


                    if (position == 11) {
                        Toast.makeText(Online_Service_Shop.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();
                    }


                    if (position == 12) {
                        String myNumber = "01713-161355";
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
                        String phoneNumber = "01642496318";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 1) {
                        String phoneNumber = "01711575211";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String phoneNumber = "01710970905";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 3) {
                        String phoneNumber = "01710970905";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 4) {
                        String phoneNumber = "01890808742";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 5) {
                        String phoneNumber = "01628886326";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 6) {
                        String phoneNumber = "01942008090";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 7) {
                        String phoneNumber = "01798394549";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String phoneNumber = "01715971642";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String phoneNumber = "01711941567";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 10) {

                        Toast.makeText(Online_Service_Shop.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();
                    }


                    if (position == 11) {
                        Toast.makeText(Online_Service_Shop.this, "নাম্বারটি সংগ্রহ করা সম্ভব হয়নি!", Toast.LENGTH_SHORT).show();
                    }


                    if (position == 12) {
                        String phoneNumber = "01713-161355";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_sub_textview.setText(hashMap.get("training_center_sub_text"));
            all_sub_details_textview.setText(hashMap.get("training_center_sub_details_text"));


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


} //------------------------Online_Service_Shop Bundle Method Line End Here