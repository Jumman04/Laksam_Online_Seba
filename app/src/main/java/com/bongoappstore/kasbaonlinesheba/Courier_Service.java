package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
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

public class Courier_Service extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_courier_service);
        getSupportActionBar().setTitle("লাকসাম উপজেলা কুরিয়ার সার্ভিস সমূহ");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_01);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_01);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_02);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_03);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_04);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_05);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_06);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_07);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_08);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_09);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_10);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("courier_service_name_text", R.string.courier_service_name_text_11);
        hashMap.put("courier_service_address_text", R.string.courier_service_address_text_03);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================

        Courier_Service.MyAdapter myAdapter = new Courier_Service.MyAdapter();
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


            //-----------------------Courier Image List Line Start Here-----------------//

            ImageView all_profile_image = myView.findViewById(R.id.all_profile_image);

            if (position == 0) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }


            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 5) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 6) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 7) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }
            if (position == 8) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 9) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 10) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }

            if (position == 11) {

                all_profile_image.setImageResource(R.drawable.courier_all_photo);

            }








            //-----------------------courier Image List Line End Here-----------------//


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
                        String myNumber = "01936006543";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String myNumber = "01324711646";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String myNumber = "01917242560";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        String myNumber = "01755512748";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 4) {
                        String myNumber = "01730594498";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 5) {
                        String myNumber = "01705407942";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 6) {
                        String myNumber = "01791242560";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 7) {
                        String myNumber = "01711780827";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 8) {
                        String myNumber = "01835415161";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }
                    if (position == 9) {
                        String myNumber = "01313349601";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }
                    if (position == 10) {
                        String myNumber = "01632651800";
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
                        String phoneNumber = "01936006543";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 1) {
                        String phoneNumber = "01324711646";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 2) {
                        String phoneNumber = "01917242560";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 3) {
                        String phoneNumber = "01755512748";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 4) {
                        String phoneNumber = "01730594498";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 5) {
                        String phoneNumber = "01705407942";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 6) {
                        String phoneNumber = "01791242560";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 7) {
                        String phoneNumber = "01711780827";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 8) {
                        String phoneNumber = "01835415161";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 9) {
                        String phoneNumber = "01313349601";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }
                    if (position == 10) {
                        String phoneNumber = "01632651800";
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


} //------------------------Hospital Method Line End Here