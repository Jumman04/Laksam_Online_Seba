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

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Fire_Service extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_fire_service);
        getSupportActionBar().setTitle("কুমিল্লা জেলার সকল ফায়ার সার্ভিস");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//



        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_01);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_02);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_03);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_04);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_05);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_06);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_07);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_07);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_08);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_08);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_09);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_09);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_10);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_10);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_11);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_11);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_12);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_12);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_13);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_13);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_14);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_14);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_15);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_15);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("fire_service_text", R.string.fire_service_text_16);
        hashMap.put("fire_service_number_dial_text", R.string.fire_service_number_dial_text_16);
        arrayList.add(hashMap);






        //==========================================================================================
        //==========================================================================================

        Fire_Service.MyAdapter myAdapter = new Fire_Service.MyAdapter();
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


            //-----------------------Sim Image List Line Start Here-----------------//

            CircleImageView sim_company_name_image = myView.findViewById(R.id.sim_company_name_image);

            if (position == 0) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);

            }

            if (position == 1) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);

            }


            if (position == 2) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }



            if (position == 3) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }
            if (position == 4) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 5) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 6) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 7) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 8) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }
            if (position == 9) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }
            if (position == 10) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 11) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 12) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 13) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }


            if (position == 14) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }
            if (position == 15) {

                sim_company_name_image.setImageResource(R.drawable.fire_service_car_icon);
            }



            //-----------------------fire Image List Line End Here-----------------//
            //====================================================================//
            //====================================================================//
            //====================================================================//





            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01741-251989", null));
                        startActivity(intentcall);
                    }

                    if (position == 1) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01968-880061", null));
                        startActivity(intentcall);
                    }


                    if (position == 2) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01730-002470", null));
                        startActivity(intentcall);
                    }



                    if (position == 3) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01736-731273", null));
                        startActivity(intentcall);
                    }



                    if (position == 4) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01763-945331", null));
                        startActivity(intentcall);
                    }



                    if (position == 5) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01986-112222", null));
                        startActivity(intentcall);
                    }



                    if (position == 6) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01730-000066", null));
                        startActivity(intentcall);
                    }



                    if (position == 7) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01715-736788", null));
                        startActivity(intentcall);
                    }



                    if (position == 8) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01572-060642", null));
                        startActivity(intentcall);
                    }


                    if (position == 9) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01973-071010", null));
                        startActivity(intentcall);
                    }



                    if (position == 10) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01730-002466", null));
                        startActivity(intentcall);
                    }



                    if (position == 11) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01556-410510", null));
                        startActivity(intentcall);
                    }



                    if (position == 12) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01766-306868", null));
                        startActivity(intentcall);
                    }



                    if (position == 13) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01745-929191", null));
                        startActivity(intentcall);
                    }



                    if (position == 14) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081-65888", null));
                        startActivity(intentcall);
                    }

                    if (position == 15) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081-65087", null));
                        startActivity(intentcall);
                    }

                    //==============================================================================//
                    //==============================================================================//
                    //==============================================================================//

                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("fire_service_text"));
            all_sub_headline_text.setText(hashMap.get("fire_service_number_dial_text"));


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


} //------------------------Fire_Service Method Line End Here

