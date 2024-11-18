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

public class Health_Service extends AppCompatActivity {

    CardView hospital_btn, clinic_btn, diagnostic_btn, specialist_doctor_btn, homeopathic_doctor_btn,
            animal_doctor_btn, upazila_doctor_btn, ambulance_service_button, pharmacy_shop_btn, nurse_btn;

    String whatsappUser = "+8801766874923";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_health_service);
        getSupportActionBar().setTitle("কসবা উপজেলা স্বাস্থ্য সেবা সমূহ");


        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        hospital_btn = findViewById(R.id.hospital_btn);
        clinic_btn = findViewById(R.id.clinic_btn);
        diagnostic_btn = findViewById(R.id.diagnostic_btn);
        specialist_doctor_btn = findViewById(R.id.specialist_doctor_btn);
        homeopathic_doctor_btn = findViewById(R.id.homeopathic_doctor_btn);
        animal_doctor_btn = findViewById(R.id.animal_doctor_btn);
        pharmacy_shop_btn = findViewById(R.id.pharmacy_shop_btn);
        upazila_doctor_btn = findViewById(R.id.upazila_doctor_btn);
        nurse_btn = findViewById(R.id.nurse_btn);




        hospital_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Hospital.class);
                startActivity(myIntent);
            }
        });

        clinic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Clinic.class);
                startActivity(myIntent);
            }
        });

        diagnostic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Diagnostic_Center.class);
                startActivity(myIntent);
            }
        });

        specialist_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Specialist_Doctor.class);
                startActivity(myIntent);
            }
        });

        homeopathic_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Homeopathic_Doctor.class);
                startActivity(myIntent);
            }
        });

        animal_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Animal_Doctor.class);
                startActivity(myIntent);
            }
        });

        upazila_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Upazila_Doctor.class);
                startActivity(myIntent);
            }
        });

        pharmacy_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Health_Service.this, Pharmacy_Shop.class);
                startActivity(myIntent);
            }
        });



        nurse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Health_Service.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Health_Service.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে নার্স সেবা এর কোন সঠিক তথ্য থাকে তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার সেবাটি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.nurse_service);
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







    } //-------------------------OnCreate Bundle Method End

    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //-------------------------Health_Service Bundle Method End