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

public class Jewellery_Shop extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jewellery_shop);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        getSupportActionBar().setTitle("জুয়েলারি শপের তালিকা");


        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_01);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_01);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_02);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_03);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_04);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_05);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_06);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_07);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_07);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_08);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_08);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_09);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_09);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_10);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_11);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_11);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_12);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_12);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_13);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_13);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("jewellery_shop_sub_text", R.string.jewellery_shop_sub_text_14);
        hashMap.put("jewellery_shop_sub_details_text", R.string.jewellery_shop_sub_details_text_14);
        arrayList.add(hashMap);



        //==========================================================================================
        //==========================================================================================
        Jewellery_Shop.MyAdapter myAdapter = new Jewellery_Shop.MyAdapter();
        listView.setAdapter(myAdapter);


    } //---------------------OnCreate Bundle Method Line End Here


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

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }


            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 5) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 6) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 7) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 8) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 9) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 10) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 11) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 12) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }

            if (position == 13) {

                all_profile_image.setImageResource(R.drawable.jewellery_icon);

            }




            //-----------------------Sim Image List Line End Here-----------------//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);


            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        String myNumber = "01734-170914";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String myNumber = "01745-141731";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }





                    if (position == 2) {
                        String myNumber = "01832-695569";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 3) {
                        String myNumber = "01914-509301";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 4) {
                        String myNumber = "01740-985244";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 5) {
                        String myNumber = "01922-511962";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 6) {
                        String myNumber = "01832-572005";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 7) {
                        String myNumber = "01735-226143";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String myNumber = "01721-292601";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String myNumber = "01819-930306";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 10) {
                        String myNumber = "01710-742798";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 11) {
                        String myNumber = "01874-160733";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 12) {
                        String myNumber = "01754-291554";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 13) {
                        String myNumber = "01823-944784";
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
                        String phoneNumber = "01734-170914";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String phoneNumber = "01745-141731";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String phoneNumber = "01832-695569";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 3) {
                        String phoneNumber = "01914-509301";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 4) {
                        String phoneNumber = "01740-985244";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 5) {
                        String phoneNumber = "01922-511962";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 6) {
                        String phoneNumber = "01832-572005";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 7) {
                        String phoneNumber = "01735-226143";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String phoneNumber = "01721-292601";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String phoneNumber = "01819-930306";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 10) {
                        String phoneNumber = "01710-742798";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 11) {
                        String phoneNumber = "01874-160733";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 12) {
                        String phoneNumber = "01754-291554";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 13) {
                        String phoneNumber = "01823-944784";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }







                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_sub_textview.setText(hashMap.get("jewellery_shop_sub_text"));
            all_sub_details_textview.setText(hashMap.get("jewellery_shop_sub_details_text"));


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


} //---------------------Jewellery_Shop Bundle Method Line End Here