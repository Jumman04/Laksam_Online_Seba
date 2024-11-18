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

import java.util.ArrayList;
import java.util.HashMap;

public class Blood_Donor_Group extends AppCompatActivity {

    CardView blood_a_positive_btn, blood_a_negative_btn, blood_b_positive_btn, blood_b_negative_btn,
            blood_o_positive_btn, blood_o_negative_btn, blood_ab_positive_btn, blood_ab_negative_btn;

    TextView marqueebutton;

    //===================================================================
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    //===================================================================


    String whatsappUser = "+8801724463565";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_blood_donor_group);

        String title = getIntent().getStringExtra("title");

        if (title == null) {
            title = "";
        }


        // Set the title after setting the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //======================================

        marqueebutton = findViewById(R.id.marqueeId);
        marqueebutton.setSelected(true);


        blood_a_positive_btn = findViewById(R.id.blood_a_positive_btn);
        blood_a_negative_btn = findViewById(R.id.blood_a_negative_btn);


        blood_b_positive_btn = findViewById(R.id.blood_b_positive_btn);
        blood_b_negative_btn = findViewById(R.id.blood_b_negative_btn);


        blood_o_positive_btn = findViewById(R.id.blood_o_positive_btn);
        blood_o_negative_btn = findViewById(R.id.blood_o_negative_btn);


        blood_ab_positive_btn = findViewById(R.id.blood_ab_positive_btn);
        blood_ab_negative_btn = findViewById(R.id.blood_ab_negative_btn);


        blood_a_positive_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BLOOD_A_POSITIVE();
                Intent intent = new Intent(Blood_Donor_Group.this, Multiple_Details_04.class);
                intent.putExtra("title", "A (+) ব্লাড ডোনার এর তালিকা");
                startActivity(intent);

            }
        });

        blood_a_negative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Donor_Group.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Donor_Group.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনি এ-পজেটিভ (A+) রক্তদাতা হয়ে থাকেন এবং স্বেচ্ছায় রক্তদান করতে ইচ্ছুক হন তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার তথ্য টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.blood_donor);
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


            }
        });


        blood_b_positive_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLOOD_B_POSITIVE();
                Intent intent = new Intent(Blood_Donor_Group.this, Multiple_Details_04.class);
                intent.putExtra("title", "B (+) ব্লাড ডোনার এর তালিকা");
                startActivity(intent);
            }
        });


        blood_b_negative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLOOD_B_NEGATIVE();
                Intent intent = new Intent(Blood_Donor_Group.this, Multiple_Details_04.class);
                intent.putExtra("title", "B (-) ব্লাড ডোনার এর তালিকা");
                startActivity(intent);
            }
        });

        blood_o_positive_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BLOOD_O_POSITIVE();
                Intent intent = new Intent(Blood_Donor_Group.this, Multiple_Details_04.class);
                intent.putExtra("title", "O (+) ব্লাড ডোনার এর তালিকা");
                startActivity(intent);
            }
        });

        blood_o_negative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Donor_Group.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Donor_Group.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনি এ-পজেটিভ (O-) রক্তদাতা হয়ে থাকেন এবং স্বেচ্ছায় রক্তদান করতে ইচ্ছুক হন তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার তথ্য টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.blood_donor);
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
            }
        });


        blood_ab_positive_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLOOD_AB_POSITIVE();
                Intent intent = new Intent(Blood_Donor_Group.this, Multiple_Details_04.class);
                intent.putExtra("title", "AB (+) ব্লাড ডোনার এর তালিকা");
                startActivity(intent);
            }
        });

        blood_ab_negative_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Donor_Group.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Donor_Group.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনি এ-পজেটিভ (AB-) রক্তদাতা হয়ে থাকেন এবং স্বেচ্ছায় রক্তদান করতে ইচ্ছুক হন তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার তথ্য টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.blood_donor);
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
            }
        });




    } //------------------------OnCreate Bundle Method End-------------------------------------






    //=====================================BLOOD_A_POSITIVE Activity Start==========================
    public void BLOOD_A_POSITIVE() {

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.a_positive_donar_name_text_01));
        hashMap.put("address_text", getString(R.string.a_positive_address_text_01));
        hashMap.put("last_date_text", getString(R.string.a_positive_last_date_text_01));
        hashMap.put("donar_phone", getString(R.string.a_positive_donar_phone_01));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        Multiple_Details_04.donnerarrayList = arrayList;

    }
    //=====================================BLOOD_A_POSITIVE Activity End============================





    //=====================================BLOOD_B_POSITIVE Activity Start==========================
    public void BLOOD_B_POSITIVE() {

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_01));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_01));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_01));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_01));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_02));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_02));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_02));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_02));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_03));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_03));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_03));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_03));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_04));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_04));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_04));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_04));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_05));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_05));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_05));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_05));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_06));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_06));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_06));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_06));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_07));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_07));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_07));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_07));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_08));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_08));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_08));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_08));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_09));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_09));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_09));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_09));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_10));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_10));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_10));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_10));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_11));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_11));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_11));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_11));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_12));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_12));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_12));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_12));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_13));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_13));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_13));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_13));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_14));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_14));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_14));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_14));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_15));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_15));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_15));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_15));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_16));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_16));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_16));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_16));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_17));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_17));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_17));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_17));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_18));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_18));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_18));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_18));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_19));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_19));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_19));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_19));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_20));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_20));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_20));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_20));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_21));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_21));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_21));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_21));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_22));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_22));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_22));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_22));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_positive_donar_name_text_23));
        hashMap.put("address_text", getString(R.string.b_positive_address_text_23));
        hashMap.put("last_date_text", getString(R.string.b_positive_last_date_text_23));
        hashMap.put("donar_phone", getString(R.string.b_positive_donar_phone_23));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);



        Multiple_Details_04.donnerarrayList = arrayList;

    }
    //=====================================BLOOD_B_POSITIVE Activity End============================


    //=====================================BLOOD_B_NEGATIVE Activity Start==========================
    public void BLOOD_B_NEGATIVE() {

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.b_negative_donar_name_text_01));
        hashMap.put("address_text", getString(R.string.b_negative_address_text_01));
        hashMap.put("last_date_text", getString(R.string.b_negative_last_date_text_01));
        hashMap.put("donar_phone", getString(R.string.b_negative_donar_phone_01));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        Multiple_Details_04.donnerarrayList = arrayList;

    }
    //=====================================BLOOD_B_NEGATIVE Activity End============================


    //=====================================BLOOD_O_POSITIVE Activity Start==========================
    public void BLOOD_O_POSITIVE() {

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_01));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_01));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_01));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_01));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_02));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_02));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_02));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_02));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_03));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_03));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_03));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_03));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_04));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_04));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_04));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_04));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_05));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_05));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_05));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_05));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_06));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_06));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_06));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_06));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_07));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_07));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_07));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_07));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_08));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_08));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_08));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_08));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.o_positive_donar_name_text_09));
        hashMap.put("address_text", getString(R.string.o_positive_address_text_09));
        hashMap.put("last_date_text", getString(R.string.o_positive_last_date_text_09));
        hashMap.put("donar_phone", getString(R.string.o_positive_donar_phone_09));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);


        Multiple_Details_04.donnerarrayList = arrayList;

    }
    //=====================================BLOOD_O_POSITIVE Activity End============================


    //=====================================BLOOD_AB_POSITIVE Activity Start==========================
    public void BLOOD_AB_POSITIVE() {
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.ab_positive_donar_name_text_01));
        hashMap.put("address_text", getString(R.string.ab_positive_address_text_01));
        hashMap.put("last_date_text", getString(R.string.ab_positive_last_date_text_01));
        hashMap.put("donar_phone", getString(R.string.ab_positive_donar_phone_01));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.ab_positive_donar_name_text_02));
        hashMap.put("address_text", getString(R.string.ab_positive_address_text_02));
        hashMap.put("last_date_text", getString(R.string.ab_positive_last_date_text_02));
        hashMap.put("donar_phone", getString(R.string.ab_positive_donar_phone_02));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("donar_name", getString(R.string.ab_positive_donar_name_text_03));
        hashMap.put("address_text", getString(R.string.ab_positive_address_text_03));
        hashMap.put("last_date_text", getString(R.string.ab_positive_last_date_text_03));
        hashMap.put("donar_phone", getString(R.string.ab_positive_donar_phone_03));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_donation_icon));
        arrayList.add(hashMap);



        Multiple_Details_04.donnerarrayList = arrayList;

    }
    //=====================================BLOOD_AB_POSITIVE Activity End============================




    //====================================================================
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    //======================================================================


} //------------------------Blood_Donor_Group Bundle Method End