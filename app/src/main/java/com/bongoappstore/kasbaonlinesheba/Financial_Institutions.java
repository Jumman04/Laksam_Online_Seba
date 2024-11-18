package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Financial_Institutions extends AppCompatActivity {

    CardView bank_list_btn, bima_list_btn, anjio_list_btn, atm_both_list_btn, bank_feature_01, bank_feature_02;

    String whatsappUser = "+8801766874923";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_financial_institutions);
        getSupportActionBar().setTitle("আর্থিক প্রতিষ্ঠানের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        bank_list_btn = findViewById(R.id.bank_list_btn);
        bima_list_btn = findViewById(R.id.bima_list_btn);
        anjio_list_btn = findViewById(R.id.anjio_list_btn);
        atm_both_list_btn = findViewById(R.id.atm_both_list_btn);
        bank_feature_01 = findViewById(R.id.bank_feature_01);
        bank_feature_02 = findViewById(R.id.bank_feature_02);


        bank_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Financial_Institutions.this, Bank_Information.class);
                startActivities(new Intent[]{myIntent});

            }

        });


        bima_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Financial_Institutions.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Financial_Institutions.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। খুব শীঘ্রই বীমা সার্ভিস টি উক্ত অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


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
                        String UriText = "mailto:" + Uri.encode("kasbaupazilaonlineseba@gmail.com") + "?subject=" +
                                Uri.encode("কসবা উপজেলা অনলাইন সেবা") + " =" + Uri.encode("");
                        Uri uri = Uri.parse(UriText);
                        intent.setData(uri);
                        startActivity(Intent.createChooser(intent, "send email"));
                    }
                });


                information_send_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String url = "https://api.whatsapp.com/send?phone=" + whatsappUser;
                        try {
                            PackageManager pm = getApplicationContext().getPackageManager();
                            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        } catch (PackageManager.NameNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                        }
                    }
                });


            } //------------------if (position == 0) { End Here

        });


        anjio_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Financial_Institutions.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Financial_Institutions.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। খুব শীঘ্রই এনজিও সার্ভিস টি উক্ত অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


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
                        String UriText = "mailto:" + Uri.encode("kasbaupazilaonlineseba@gmail.com") + "?subject=" +
                                Uri.encode("কসবা উপজেলা অনলাইন সেবা") + " =" + Uri.encode("");
                        Uri uri = Uri.parse(UriText);
                        intent.setData(uri);
                        startActivity(Intent.createChooser(intent, "send email"));
                    }
                });


                information_send_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String url = "https://api.whatsapp.com/send?phone=" + whatsappUser;
                        try {
                            PackageManager pm = getApplicationContext().getPackageManager();
                            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        } catch (PackageManager.NameNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                        }
                    }
                });


            } //------------------if (position == 0) { End Here

        });


        atm_both_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(Financial_Institutions.this, Atm_Booth.class);
                startActivities(new Intent[]{myIntent});

            }

        });


        bank_feature_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Financial_Institutions.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Financial_Institutions.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("এই সেকশন এ নতুন ফিচার সংযুক্ত করার কাজ চলছে। খুব শিঘ্রই নতুন ফিচার সংযুক্ত হবে। ধন্যবাদ।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.new_feature);
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
                        String UriText = "mailto:" + Uri.encode("kasbaupazilaonlineseba@gmail.com") + "?subject=" +
                                Uri.encode("কসবা উপজেলা অনলাইন সেবা") + " =" + Uri.encode("");
                        Uri uri = Uri.parse(UriText);
                        intent.setData(uri);
                        startActivity(Intent.createChooser(intent, "send email"));
                    }
                });


                information_send_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String url = "https://api.whatsapp.com/send?phone=" + whatsappUser;
                        try {
                            PackageManager pm = getApplicationContext().getPackageManager();
                            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        } catch (PackageManager.NameNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                        }
                    }
                });


            } //------------------if (position == 0) { End Here

        });


        bank_feature_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Financial_Institutions.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Financial_Institutions.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("এই সেকশন এ নতুন ফিচার সংযুক্ত করার কাজ চলছে। খুব শিঘ্রই নতুন ফিচার সংযুক্ত হবে। ধন্যবাদ।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.new_feature);
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
                        String UriText = "mailto:" + Uri.encode("kasbaupazilaonlineseba@gmail.com") + "?subject=" +
                                Uri.encode("কসবা উপজেলা অনলাইন সেবা") + " =" + Uri.encode("");
                        Uri uri = Uri.parse(UriText);
                        intent.setData(uri);
                        startActivity(Intent.createChooser(intent, "send email"));
                    }
                });


                information_send_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String url = "https://api.whatsapp.com/send?phone=" + whatsappUser;
                        try {
                            PackageManager pm = getApplicationContext().getPackageManager();
                            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        } catch (PackageManager.NameNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                        }
                    }
                });


            } //------------------if (position == 0) { End Here

        });


    } //------------------------OnCreate Bundle Method Line End Here

    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //------------------------Ambulance Method Line End Here