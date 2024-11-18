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

public class Electricity_Complaint_Centre extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_electricity_complaint_centre);
        getSupportActionBar().setTitle("অভিযোগ কেন্দ্রের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_01);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_02);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_03);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_04);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_05);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_06);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_07);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_08);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_09);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_09);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_10);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_11);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_12);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_12);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_13);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_13);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_14);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_14);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_15);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_15);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_16);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_16);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_17);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_17);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_18);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_18);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_19);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_19);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_20);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_20);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_21);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_21);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_22);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_22);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_23);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_23);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_24);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_24);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_25);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_25);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_26);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_26);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_27);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_27);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("complaint_name_address_text", R.string.complaint_name_address_text_28);
        hashMap.put("complaint_name_mobile_no_text", R.string.complaint_name_mobile_no_text_28);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================

        Electricity_Complaint_Centre.MyAdapter myAdapter = new Electricity_Complaint_Centre.MyAdapter();
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

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 1) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 2) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 3) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 4) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 5) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 6) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 7) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 8) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 9) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 10) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 11) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 12) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 13) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 14) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 15) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 16) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 17) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 18) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 19) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }


            if (position == 20) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 21) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 22) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 23) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 24) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 25) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 26) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }

            if (position == 27) {

                sim_company_name_image.setImageResource(R.drawable.complaint_center_icon);

            }






            //-----------------------Sim Image List Line End Here-----------------//


            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400824", null));
                        startActivity(intentcall);
                    }

                    if (position == 1) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400831", null));
                        startActivity(intentcall);
                    }


                    if (position == 2) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-407109", null));
                        startActivity(intentcall);
                    }


                    if (position == 3) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400819", null));
                        startActivity(intentcall);
                    }


                    if (position == 4) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400830", null));
                        startActivity(intentcall);
                    }


                    if (position == 5) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400832", null));
                        startActivity(intentcall);
                    }


                    if (position == 6) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400818", null));
                        startActivity(intentcall);
                    }


                    if (position == 7) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400826", null));
                        startActivity(intentcall);
                    }


                    if (position == 8) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-402068", null));
                        startActivity(intentcall);
                    }


                    if (position == 9) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400820", null));
                        startActivity(intentcall);
                    }

                    if (position == 10) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400836", null));
                        startActivity(intentcall);
                    }

                    if (position == 11) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-407517", null));
                        startActivity(intentcall);
                    }


                    if (position == 12) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400822", null));
                        startActivity(intentcall);
                    }


                    if (position == 13) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-403121", null));
                        startActivity(intentcall);
                    }


                    if (position == 14) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01704-108789", null));
                        startActivity(intentcall);
                    }


                    if (position == 15) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400823", null));
                        startActivity(intentcall);
                    }


                    if (position == 16) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400829", null));
                        startActivity(intentcall);
                    }


                    if (position == 17) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-407516", null));
                        startActivity(intentcall);
                    }


                    if (position == 18) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-407518", null));
                        startActivity(intentcall);
                    }


                    if (position == 19) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-402067", null));
                        startActivity(intentcall);
                    }


                    if (position == 20) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400827", null));
                        startActivity(intentcall);
                    }

                    if (position == 21) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400833", null));
                        startActivity(intentcall);
                    }
                    if (position == 22) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400825", null));
                        startActivity(intentcall);
                    }

                    if (position == 23) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400834", null));
                        startActivity(intentcall);
                    }

                    if (position == 24) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400835", null));
                        startActivity(intentcall);
                    }

                    if (position == 25) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01704-106576", null));
                        startActivity(intentcall);
                    }

                    if (position == 26) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-407514", null));
                        startActivity(intentcall);
                    }

                    if (position == 27) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01769-400828", null));
                        startActivity(intentcall);
                    }









                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("complaint_name_address_text"));
            all_sub_headline_text.setText(hashMap.get("complaint_name_mobile_no_text"));


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


} //------------------------Hospital Method Line End Here