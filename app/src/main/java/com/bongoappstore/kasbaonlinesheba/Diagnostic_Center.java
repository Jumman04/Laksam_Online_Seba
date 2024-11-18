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

public class Diagnostic_Center extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_diagnostic_center);
        getSupportActionBar().setTitle("ডায়াগনস্টিক সেন্টার এর তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_01);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_02);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_03);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_04);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_05);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_06);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_07);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_08);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_09);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_09);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_10);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_11);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_12);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_12);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_13);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_13);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_14);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_14);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_15);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_15);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_16);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_16);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_17);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_17);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_18);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_18);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_19);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_19);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_20);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_20);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_21);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_21);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_22);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_22);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_23);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_23);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_24);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_24);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_25);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_25);
        arrayList.add(hashMap);



        hashMap = new HashMap<>();
        hashMap.put("diagnostic_center_name_text", R.string.diagnostic_center_name_text_26);
        hashMap.put("diagnostic_center_address_text", R.string.diagnostic_center_address_text_26);
        arrayList.add(hashMap);




        //==========================================================================================
        //==========================================================================================

        Diagnostic_Center.MyAdapter myAdapter = new Diagnostic_Center.MyAdapter();
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

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }

            if (position == 1) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }

            if (position == 2) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }

            if (position == 3) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }


            if (position == 4) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 5) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 6) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 7) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 8) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 9) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 10) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 11) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 12) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }


            if (position == 13) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 14) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 15) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 16) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 17) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 18) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 19) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 20) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }
            if (position == 21) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }

            if (position == 22) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }

            if (position == 23) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }

            if (position == 24) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }

            if (position == 25) {

                sim_company_name_image.setImageResource(R.drawable.diagnostic_icon);

            }



            //-----------------------Sim Image List Line End Here-----------------//


            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (position == 0) {

                        String phoneNumber = "01329-630555";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 1) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01811522874", null));
                        startActivity(intentcall);
                    }

                    if (position == 2) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01717587787", null));
                        startActivity(intentcall);
                    }


                    if (position == 3) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01715988799", null));
                        startActivity(intentcall);
                    }


                    if (position == 4) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01713624740", null));
                        startActivity(intentcall);
                    }


                    if (position == 5) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01715991642", null));
                        startActivity(intentcall);

                    }

                    if (position == 6) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01718283698", null));
                        startActivity(intentcall);

                    }

                    if (position == 7) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01783802080", null));
                        startActivity(intentcall);

                    }


                    if (position == 8) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01708647937", null));
                        startActivity(intentcall);

                    }


                    if (position == 9) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01713607861", null));
                        startActivity(intentcall);

                    }


                    if (position == 10) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01757559034", null));
                        startActivity(intentcall);

                    }


                    if (position == 11) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01711831094", null));
                        startActivity(intentcall);

                    }


                    if (position == 12) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01720261870", null));
                        startActivity(intentcall);

                    }




                    if (position == 13) {

                        String phoneNumber = "01977-964599";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 14) {

                        String phoneNumber = "01712-225336";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 15) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01743445030", null));
                        startActivity(intentcall);
                    }



                    if (position == 16) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01725553431", null));
                        startActivity(intentcall);
                    }


                    if (position == 17) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01746868458", null));
                        startActivity(intentcall);
                    }


                    if (position == 18) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01712225363", null));
                        startActivity(intentcall);

                    }


                    if (position == 19) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01713618790", null));
                        startActivity(intentcall);

                    }

                    if (position == 20) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01912670397", null));
                        startActivity(intentcall);

                    }


                    if (position == 21) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01712747128", null));
                        startActivity(intentcall);

                    }


                    if (position == 22) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01943225899", null));
                        startActivity(intentcall);

                    }


                    if (position == 23) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01775726433", null));
                        startActivity(intentcall);

                    }


                    if (position == 24) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01816451039", null));
                        startActivity(intentcall);

                    }


                    if (position == 25) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01819648440", null));
                        startActivity(intentcall);

                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("diagnostic_center_name_text"));
            all_sub_headline_text.setText(hashMap.get("diagnostic_center_address_text"));


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


} //------------------------Diagnostic_Center Method Line End Here