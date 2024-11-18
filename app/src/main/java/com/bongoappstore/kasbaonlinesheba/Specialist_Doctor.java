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

public class Specialist_Doctor extends AppCompatActivity {

    CardView dentist_doctor_btn, doctor_gynecologist_btn, doctor_orthopedic_btn, ear_nose_throat_button, diabetic_specialist_btn,
             doctor_cardiologist_btn, doctor_eye_specialist_btn, doctor_kidney_specialist_btn, doctor_child_specialist_btn, doctor_medicine_btn, doctor_dermatologist_btn,
             doctor_gastroenterology_btn;


    String whatsappUser = "+8801766874923";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_specialist_doctor);
        getSupportActionBar().setTitle("বিশেষজ্ঞ ডাক্তারের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//




        dentist_doctor_btn = findViewById(R.id.dentist_doctor_btn);
        doctor_gynecologist_btn = findViewById(R.id.doctor_gynecologist_btn);
        doctor_orthopedic_btn = findViewById(R.id.doctor_orthopedic_btn);
        ear_nose_throat_button = findViewById(R.id.ear_nose_throat_button);
        diabetic_specialist_btn = findViewById(R.id.diabetic_specialist_btn);
        doctor_cardiologist_btn = findViewById(R.id.doctor_cardiologist_btn);
        doctor_eye_specialist_btn = findViewById(R.id.doctor_eye_specialist_btn);
        doctor_kidney_specialist_btn = findViewById(R.id.doctor_kidney_specialist_btn);
        doctor_child_specialist_btn = findViewById(R.id.doctor_child_specialist_btn);
        doctor_medicine_btn = findViewById(R.id.doctor_medicine_btn);
        doctor_dermatologist_btn = findViewById(R.id.doctor_dermatologist_btn);
        doctor_gastroenterology_btn = findViewById(R.id.doctor_gastroenterology_btn);


        dentist_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Dentist.class);
                startActivity(myIntent);


            }
        });


        doctor_gynecologist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Gynecologist.class);
                startActivity(myIntent);

            }
        });


        doctor_orthopedic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Specialist_Doctor.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Specialist_Doctor.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে অর্থপেডিক বিশেষজ্ঞ ডাক্তারের কোন তথ্য থাকে তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার তথ্য টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


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



        ear_nose_throat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Ear_Nose_Throat.class);
                startActivity(myIntent);

            }
        });


        diabetic_specialist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Diabetic_Specialist.class);
                startActivity(myIntent);

            }
        });


        doctor_cardiologist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Cardiologist.class);
                startActivity(myIntent);

            }
        });


        doctor_eye_specialist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Specialist_Doctor.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Specialist_Doctor.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে চক্ষুরোগ বিশেষজ্ঞ ডাক্তারের কোন তথ্য থাকে তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার তথ্য টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


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


        doctor_kidney_specialist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Specialist_Doctor.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Specialist_Doctor.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে কিডনি রোগ বিশেষজ্ঞ ডাক্তারের কোন তথ্য থাকে তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার তথ্য টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


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


        doctor_child_specialist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Child_Specialist.class);
                startActivity(myIntent);

            }
        });


        doctor_medicine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Medicine_Specialist.class);
                startActivity(myIntent);

            }
        });



        doctor_dermatologist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Dermatologist.class);
                startActivity(myIntent);

            }
        });



        doctor_gastroenterology_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Specialist_Doctor.this, Doctor_Gastroenterology.class);
                startActivity(myIntent);

            }
        });







    } //------------------------OnCreate Bundle Method Line End Here


    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //------------------------Diagnostic_Center Method Line End Here