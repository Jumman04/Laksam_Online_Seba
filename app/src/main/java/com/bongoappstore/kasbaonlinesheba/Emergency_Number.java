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

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Emergency_Number extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_emergency_number);
        getSupportActionBar().setTitle("জরুরী নাম্বার সমূহের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//



        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_01);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_01);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_02);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_02);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_03);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_03);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_04);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_04);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_05);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_05);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_06);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_06);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_07);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_07);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_08);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_08);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_09);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_09);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_10);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_10);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_11);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_11);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("emergency_number_text", R.string.emergency_number_text_12);
        hashMap.put("emergency_number_dial_code_text", R.string.emergency_number_dial_code_text_12);
        arrayList.add(hashMap);























        //==========================================================================================
        //==========================================================================================

        Emergency_Number.MyAdapter myAdapter = new Emergency_Number.MyAdapter();
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
            View myView = layoutInflater.inflate(R.layout.activity_custom_item_design, viewGroup, false);


            TextView all_headline_text = myView.findViewById(R.id.all_headline_text);
            TextView all_sub_headline_text = myView.findViewById(R.id.all_sub_headline_text);


            LottieAnimationView lottie_animation_view = myView.findViewById(R.id.lottie_animation_view);
            lottie_animation_view.setAnimation(R.raw.call_dial);

            //-----------------------Sim Image List Line Start Here-----------------//

            CircleImageView sim_company_name_image = myView.findViewById(R.id.sim_company_name_image);

            if (position == 0){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }

            if (position == 1){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }

            if (position == 2){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }



            if (position == 3){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }
            if (position == 4){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }


            if (position == 5){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }


            if (position == 6){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }


            if (position == 7){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }


            if (position == 8){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }


            if (position == 9){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }


            if (position == 10){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }


            if (position == 11){

                sim_company_name_image.setImageResource(R.drawable.emergency_number_icon);

            }







            //-----------------------Sim Image List Line End Here-----------------//





            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "100", null));
                        startActivity(intentcall);
                    }

                    if (position == 1) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "16120", null));
                        startActivity(intentcall);
                    }


                    if (position == 2) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "16402", null));
                        startActivity(intentcall);
                    }


                    if (position == 3) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "105", null));
                        startActivity(intentcall);
                    }


                    if (position == 4) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "106", null));
                        startActivity(intentcall);
                    }


                    if (position == 5) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "109", null));
                        startActivity(intentcall);
                    }



                    if (position == 6) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "1090", null));
                        startActivity(intentcall);
                    }



                    if (position == 7) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "1098", null));
                        startActivity(intentcall);
                    }



                    if (position == 8) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "16263", null));
                        startActivity(intentcall);
                    }




                    if (position == 9) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "16430", null));
                        startActivity(intentcall);
                    }




                    if (position == 10) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "16123", null));
                        startActivity(intentcall);
                    }



                    if (position == 11) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "16256", null));
                        startActivity(intentcall);
                    }






                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("emergency_number_text"));
            all_sub_headline_text.setText(hashMap.get("emergency_number_dial_code_text"));


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


} //------------------------Emergency_Number Method Line End Here