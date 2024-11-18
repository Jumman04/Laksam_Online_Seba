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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Hospital extends AppCompatActivity {


    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_hospital);
        getSupportActionBar().setTitle("কসবা উপজেলা হাসপাতালের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//



        //============================ Banner Ad Coading Line Start Here==========================//
        mAdView = findViewById(R.id.adView);
        mAdView.setVisibility(View.GONE);

        if (getString(R.string.show_admob_ad).contains("ON")) {
            initAdmobAd();
            loadBannerAd();
        }
        //============================ Banner Ad Coading Line Start Here==========================//



        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.kasba_hospital_list_main_text_01);
        hashMap.put("sim_service_dial_code_text", R.string.kasba_hospital_list_address_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.kasba_hospital_list_main_text_02);
        hashMap.put("sim_service_dial_code_text", R.string.kasba_hospital_list_address_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.kasba_hospital_list_main_text_03);
        hashMap.put("sim_service_dial_code_text", R.string.kasba_hospital_list_address_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.kasba_hospital_list_main_text_04);
        hashMap.put("sim_service_dial_code_text", R.string.kasba_hospital_list_address_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.kasba_hospital_list_main_text_05);
        hashMap.put("sim_service_dial_code_text", R.string.kasba_hospital_list_address_text_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.kasba_hospital_list_main_text_06);
        hashMap.put("sim_service_dial_code_text", R.string.kasba_hospital_list_address_text_06);
        arrayList.add(hashMap);



        //==========================================================================================
        //==========================================================================================

        Hospital.MyAdapter myAdapter = new Hospital.MyAdapter();
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

                sim_company_name_image.setImageResource(R.drawable.hospital_icon);

            }

            if (position == 1) {

                sim_company_name_image.setImageResource(R.drawable.hospital_icon);

            }

            if (position == 2) {

                sim_company_name_image.setImageResource(R.drawable.hospital_icon);

            }

            if (position == 3) {

                sim_company_name_image.setImageResource(R.drawable.hospital_icon);

            }

            if (position == 4) {

                sim_company_name_image.setImageResource(R.drawable.hospital_icon);

            }

            if (position == 5) {

                sim_company_name_image.setImageResource(R.drawable.hospital_icon);

            }

            if (position == 6) {

                sim_company_name_image.setImageResource(R.drawable.hospital_icon);

            }



            //-----------------------Sim Image List Line End Here-----------------//


            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01730-324439", null));
                        startActivity(intentcall);
                    }

                    if (position == 1) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01329-630555", null));
                        startActivity(intentcall);
                    }

                    if (position == 2) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01726-989603", null));
                        startActivity(intentcall);
                    }



                    if (position == 3) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01740-985246", null));
                        startActivity(intentcall);
                    }


                    if (position == 4) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01715-813545", null));
                        startActivity(intentcall);
                    }


                    if (position == 5) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01819-146430", null));
                        startActivity(intentcall);
                    }


                    if (position == 6) {
                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01713-000250", null));
                        startActivity(intentcall);
                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("sim_service_headline_text"));
            all_sub_headline_text.setText(hashMap.get("sim_service_dial_code_text"));


            return myView;


        }


    } //-----------------------Create My Own Adapter Line End Here-------------------------------------//




    //=============================Banner Ad Controll Line Start Here===================================//
    int BANNER_AD_CLICK_COUNT = 0;

    private void loadBannerAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >= 3) {
                    if (mAdView != null) mAdView.setVisibility(View.GONE);
                } else {
                    if (mAdView != null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >= 3) {
                    if (mAdView != null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
    //=============================Banner Ad Controll Line End Here===================================//





    //===============================Admob Ad Initialization Line Start Here===========================//
    private void initAdmobAd() {

        if (getString(R.string.device_id).length() > 12) {
            //Adding your device id -- to avoid invalid activity from your device
            List<String> testDeviceIds = Arrays.asList(getString(R.string.device_id));
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }


        //Init Admob Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

    }

    //===============================AdmobAd Initialization Line End Here=============================//






    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //------------------------Hospital Method Line End Here