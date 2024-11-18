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

public class Mobile_Shop extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_mobile_shop);
        getSupportActionBar().setTitle("মোবাইল শপের তালিকা");


        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_01);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_02);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_03);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_04);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_05);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_06);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_07);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_08);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_09);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_09);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_10);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_11);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_12);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_12);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_13);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_13);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_14);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_14);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_15);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_15);
        arrayList.add(hashMap);

        

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_16);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_16);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_17);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_17);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_18);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_18);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_19);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_19);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_20);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_20);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_21);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_21);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_22);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_22);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_23);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_23);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.mobile_shop_name_text_24);
        hashMap.put("courier_service_address_text", R.string.mobile_shop_details_text_24);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================

        Mobile_Shop.MyAdapter myAdapter = new Mobile_Shop.MyAdapter();
        listView.setAdapter(myAdapter);


    } //----------------------------OnCreate Bundle Method End


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
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 1) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 2) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 3) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 4) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 5) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 6) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 7) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 8) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }

            if (position == 9) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 10) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 11) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 12) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 13) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 14) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 15) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 16) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 17) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 18) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 19) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 20) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 21) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 22) {
                all_profile_image.setImageResource(R.drawable.mobile_shop_icon);
            }


            if (position == 23) {
                all_profile_image.setImageResource(R.drawable.inteax_logo);
            }


            //-----------------------Sim Image List Line End Here-----------------//


//======================================================================================//
//======================================================================================//
//======================================================================================//


//======================================================================================//
//======================================================================================//
//======================================================================================//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);


            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        String myNumber = "01788490404";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String myNumber = "01711373299";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 2) {
                        String myNumber = "01728629028";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        String myNumber = "01318637686";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 4) {
                        String myNumber = "01740778777";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 5) {
                        String myNumber = "01716748711";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 6) {
                        String myNumber = "01782055080";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 7) {
                        String myNumber = "01711103593";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 8) {
                        String myNumber = "01819838287";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 9) {
                        String myNumber = "01920741713";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 10) {
                        String myNumber = "01741322876";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 11) {
                        String myNumber = "01918148331";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 12) {
                        String myNumber = "01712391644";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 13) {
                        String myNumber = "01719592060";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 14) {
                        String myNumber = "01401024213";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 15) {
                        String myNumber = "01642999090";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 16) {
                        String myNumber = "01760008714";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 17) {
                        String myNumber = "01713606014";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 18) {
                        String myNumber = "01997294455";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 19) {
                        String myNumber = "01632983982";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 20) {
                        String myNumber = "01758785567";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 21) {
                        String myNumber = "01731009733";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 22) {
                        String myNumber = "01311122640";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 23) {
                        String myNumber = "01616366332";
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
                        String phoneNumber = "01788490404";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String phoneNumber = "01711373299";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 2) {
                        String phoneNumber = "01728629028";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 3) {
                        String phoneNumber = "01318637686";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 4) {
                        String phoneNumber = "01740778777";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 5) {
                        String phoneNumber = "01716748711";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 6) {
                        String phoneNumber = "01782055080";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 7) {
                        String phoneNumber = "01711103593";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String phoneNumber = "01819838287";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String phoneNumber = "01920741713";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 10) {
                        String phoneNumber = "01741322876";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 11) {
                        String phoneNumber = "01918148331";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 12) {
                        String phoneNumber = "01712391644";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 13) {
                        String phoneNumber = "01719592060";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 14) {
                        String phoneNumber = "01401024213";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 15) {
                        String phoneNumber = "01642999090";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 16) {
                        String phoneNumber = "01760008714";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 17) {
                        String phoneNumber = "01713606014";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 18) {
                        String phoneNumber = "01997294455";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 19) {
                        String phoneNumber = "01632983982";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 20) {
                        String phoneNumber = "01758785567";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 21) {
                        String phoneNumber = "01731009733";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 22) {
                        String phoneNumber = "01311122640";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 23) {
                        String phoneNumber = "01616366332";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }











                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);
            all_sub_textview.setText(hashMap.get("courier_service_name_text"));
            all_sub_details_textview.setText(hashMap.get("courier_service_address_text"));


            return myView;


        }

    } //-----------------------Create My Own Adapter Line End Here-------------------------------------//


    //=====================================================================================//
    //=====================================================================================//
    //=====================================================================================//


    public void startSMSIntent(String phoneNumber, String message) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("smsto: " + phoneNumber));
        intent.putExtra("sms body", message);
        startActivity(intent);
    }
    //=====================================================================================//
    //=====================================================================================//
    //=====================================================================================//

    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //----------------------------OnCreate Bundle Method End