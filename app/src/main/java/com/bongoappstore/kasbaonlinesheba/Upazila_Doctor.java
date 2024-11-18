package com.bongoappstore.kasbaonlinesheba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Upazila_Doctor extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_upazila_doctor);
        getSupportActionBar().setTitle("কসবা উপজেলা ডাক্তারের তালিকা");


        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_01);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_02);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_03);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_04);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_05);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_06);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_07);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_08);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_09);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_09);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_10);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_11);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("doctor_name_text", R.string.doctor_name_text_12);
        hashMap.put("doctor_title_text", R.string.doctor_title_text_12);
        arrayList.add(hashMap);



        //==========================================================================================
        //==========================================================================================

        Upazila_Doctor.MyAdapter myAdapter = new Upazila_Doctor.MyAdapter();
        listView.setAdapter(myAdapter);


    } //------------------------OnCreate Bundle Methode Line End Here

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

            if (position == 0) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 1) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 2) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 3) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 4) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 5) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 6) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 7) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 8) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 9) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 10) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }

            if (position == 11) {

                sim_company_name_image.setImageResource(R.drawable.upazila_doctor);

            }



            //-----------------------Sim Image List Line End Here-----------------//


            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {




                    if (position == 0) {
                        String phoneNumber = "01913129628";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 1) {
                        String phoneNumber = "01716376716";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 2) {
                        String phoneNumber = "01940994586";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 3) {
                        String phoneNumber = "01674735667";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 4) {
                        String phoneNumber = "01665155788";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 5) {
                        String phoneNumber = "01673244542";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 6) {
                        String phoneNumber = "01861682156";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }



                    if (position == 7) {
                        String phoneNumber = "01725880667";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 8) {
                        String phoneNumber = "01680365083";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 9) {
                        String phoneNumber = "01747812379";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 10) {
                        String phoneNumber = "01913662626";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 11) {
                        String phoneNumber = "01750218189";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }












                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("doctor_name_text"));
            all_sub_headline_text.setText(hashMap.get("doctor_title_text"));


            return myView;


        }


    } //-----------------------Create My Own Adapter Line End Here-------------------------------------//


} //------------------------Upazila_Doctor  Methode Line End Here