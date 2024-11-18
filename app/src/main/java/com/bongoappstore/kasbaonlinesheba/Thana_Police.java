package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Thana_Police extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_thana_police);
        getSupportActionBar().setTitle("থানা পুলিশ নাম্বার এর তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_01);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_01);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_02);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_03);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_04);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_05);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_06);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_07);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_07);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_08);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_09);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_09);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_10);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_11);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_12);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_12);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_13);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_13);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_14);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_14);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_15);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_15);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_16);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_16);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_17);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_17);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_18);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_18);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_19);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_19);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_20);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_20);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_21);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_21);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_22);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_22);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_23);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_23);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_24);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_24);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_25);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_25);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_26);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_26);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_27);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_27);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_28);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_28);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_29);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_29);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_30);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_30);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_31);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_31);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_32);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_32);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_33);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_33);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_34);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_34);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_35);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_35);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("thana_police_number_text", R.string.thana_police_number_text_36);
        hashMap.put("thana_police_number_dial_text", R.string.thana_police_number_dial_text_36);
        arrayList.add(hashMap);














/*

        // Java
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Thana_Police.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Thana_Police.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে দর্জি কারিগর এর সঠিক কোন তথ্য থাকে তাহলে আমাদের কে আপনার নাম, মোবাইল নং, ঠিকানা সহ বিস্তারিত তথ্য দিন। আমরা খুব শীঘ্রই আপনার সার্ভিস টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.user_information_collect_02);
                lottie_animation.playAnimation();


                close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                gmail_send = alertCustomdialog.findViewById(R.id.gmail_send);
                information_send_button = alertCustomdialog.findViewById(R.id.information_send_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                close_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });


                gmail_send.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        String UriText = "mailto:" + Uri.encode("bongoappstore@gmail.com") + "?subject=" +
                                Uri.encode("ABC license apps user feedback") + " =" + Uri.encode("");
                        Uri uri = Uri.parse(UriText);
                        intent.setData(uri);
                        startActivity(Intent.createChooser(intent, "send email"));
                    }
                });


                information_send_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        String url = "https://chat.whatsapp.com/BFcaLXFsYSf84t8t3mpXOV";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    }
                });


            }
        });

*/


        //==========================================================================================
        //==========================================================================================

        Thana_Police.MyAdapter myAdapter = new Thana_Police.MyAdapter();
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

                sim_company_name_image.setImageResource(R.drawable.police_icon);

            }

            if (position == 1) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);

            }


            if (position == 2) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 3) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }
            if (position == 4) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 5) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 6) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 7) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 8) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 9) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 10) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 11) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 12) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 13) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 14) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 15) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 16) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 17) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 18) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 19) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 20) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 21) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 22) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 23) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 24) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 25) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 26) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 27) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 28) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 29) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }

            if (position == 30) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 31) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 32) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 33) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 34) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            if (position == 35) {

                sim_company_name_image.setImageResource(R.drawable.police_icon);
            }


            //-----------------------Sim Image List Line End Here-----------------//
            //====================================================================//
            //====================================================================//
            //====================================================================//


            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);


            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        String phoneNumber = "01320-114100";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 1) {
                        String phoneNumber = "01320-114105";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 2) {
                        String phoneNumber = "01320-114022";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 3) {
                        String phoneNumber = "01320-114027";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 4) {
                        String phoneNumber = "01320-114230";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 5) {
                        String phoneNumber = "01320-114235";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 6) {
                        String phoneNumber = "01320-114334";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 7) {
                        String phoneNumber = "01320-114339";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 8) {
                        String phoneNumber = "01320-114438";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 9) {
                        String phoneNumber = "01320-114443";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 10) {
                        String phoneNumber = "01320-114152";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 11) {
                        String phoneNumber = "01320-114157";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 12) {
                        String phoneNumber = "01320-114282";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 13) {
                        String phoneNumber = "01320-114287";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 14) {
                        String phoneNumber = "01320-114048";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 15) {
                        String phoneNumber = "01320-114053";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 16) {
                        String phoneNumber = "01320-114256";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 17) {
                        String phoneNumber = "01320-114261";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 18) {
                        String phoneNumber = "01320-114412";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 19) {
                        String phoneNumber = "01320-114417";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 20) {
                        String phoneNumber = "01320-114074";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 21) {
                        String phoneNumber = "01320-114079";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 22) {
                        String phoneNumber = "01320-114360";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 23) {
                        String phoneNumber = "01320-114365";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 24) {
                        String phoneNumber = "01320-114308";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 25) {
                        String phoneNumber = "01320-114313";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 26) {
                        String phoneNumber = "01320-114126";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 27) {
                        String phoneNumber = "01320-114131";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 28) {
                        String phoneNumber = "01320-114178";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 29) {
                        String phoneNumber = "01320-114183";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 30) {
                        String phoneNumber = "01320-114204";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 31) {
                        String phoneNumber = "01320-114209";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 32) {
                        String phoneNumber = "01320-114386";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 33) {
                        String phoneNumber = "01320-114391";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 34) {
                        String phoneNumber = "01320-113996";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    if (position == 35) {
                        String phoneNumber = "01320-114001";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }


                    //==============================================================================//
                    //==============================================================================//
                    //==============================================================================//

                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("thana_police_number_text"));
            all_sub_headline_text.setText(hashMap.get("thana_police_number_dial_text"));


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


} //------------------------Thana_Police Method Line End Here