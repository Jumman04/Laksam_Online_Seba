package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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

public class Blood_Organization extends AppCompatActivity {

    CardView blood_organization_btn_01,
            blood_organization_btn_02,
            blood_organization_btn_03,
            blood_organization_btn_04,
            blood_organization_btn_05,
            blood_organization_btn_06,
            blood_organization_btn_07,
            blood_organization_btn_08,

            blood_organization_btn_09,

            blood_organization_btn_10,

            blood_organization_btn_11;

    TextView marqueebutton;




    //===================================================================
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    //===================================================================

    String whatsappUser = "+8801766874923";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_blood_organization);


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





        blood_organization_btn_01 = findViewById(R.id.blood_organization_btn_01);
        blood_organization_btn_02 = findViewById(R.id.blood_organization_btn_02);
        blood_organization_btn_03 = findViewById(R.id.blood_organization_btn_03);
        blood_organization_btn_04 = findViewById(R.id.blood_organization_btn_04);
        blood_organization_btn_05 = findViewById(R.id.blood_organization_btn_05);
        blood_organization_btn_06 = findViewById(R.id.blood_organization_btn_06);
        blood_organization_btn_07 = findViewById(R.id.blood_organization_btn_07);
        blood_organization_btn_08 = findViewById(R.id.blood_organization_btn_08);
        blood_organization_btn_09 = findViewById(R.id.blood_organization_btn_09);
        blood_organization_btn_10 = findViewById(R.id.blood_organization_btn_10);
        blood_organization_btn_11 = findViewById(R.id.blood_organization_btn_11);







        blood_organization_btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Blood_Organization_01();
                Intent intent = new Intent(Blood_Organization.this, Multiple_Details_02.class);
                intent.putExtra("title", "কসবা ব্লাড ফাউন্ডেশন");
                intent.putExtra("title2", "                    জরুরী রক্তের প্রয়োজনে (কসবা ব্লাড ফাউন্ডেশন কল সেন্টার- ০১৩০৯-৭৭২৭০১, ০১৭৬৭-৪৫০৮৪০) এই নাম্বারে স্বেচ্ছাসেবী ভাইদের সাথে যোগাযোগ করুন।");
                startActivity(intent);
            }
        });


        blood_organization_btn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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


        blood_organization_btn_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(Blood_Organization.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(Blood_Organization.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত তথ্য গুলো খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.information_collecting2);
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





    } //------------------------Oncreate Bundle Method End







    //==================================Emergency Number Activity Start=============================
    public void Blood_Organization_01() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_01));
        hashMap.put("address_text", getString(R.string.desi_txt_01));
        hashMap.put("phone", getString(R.string.numb_txt_01));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_02));
        hashMap.put("address_text", getString(R.string.desi_txt_02));
        hashMap.put("phone", getString(R.string.numb_txt_02));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_03));
        hashMap.put("address_text", getString(R.string.desi_txt_03));
        hashMap.put("phone", getString(R.string.numb_txt_03));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);



        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_04));
        hashMap.put("address_text", getString(R.string.desi_txt_04));
        hashMap.put("phone", getString(R.string.numb_txt_04));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);



        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_05));
        hashMap.put("address_text", getString(R.string.desi_txt_05));
        hashMap.put("phone", getString(R.string.numb_txt_05));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_06));
        hashMap.put("address_text", getString(R.string.desi_txt_06));
        hashMap.put("phone", getString(R.string.numb_txt_06));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_07));
        hashMap.put("address_text", getString(R.string.desi_txt_07));
        hashMap.put("phone", getString(R.string.numb_txt_07));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_08));
        hashMap.put("address_text", getString(R.string.desi_txt_08));
        hashMap.put("phone", getString(R.string.numb_txt_08));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_09));
        hashMap.put("address_text", getString(R.string.desi_txt_09));
        hashMap.put("phone", getString(R.string.numb_txt_09));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_10));
        hashMap.put("address_text", getString(R.string.desi_txt_10));
        hashMap.put("phone", getString(R.string.numb_txt_10));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);



        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.name_txt_11));
        hashMap.put("address_text", getString(R.string.desi_txt_11));
        hashMap.put("phone", getString(R.string.numb_txt_11));
        hashMap.put("imageView", String.valueOf(R.drawable.blood_organization_icon));
        arrayList.add(hashMap);





        Multiple_Details_02.donnerarrayList = arrayList;
    }
    //==================================Emergency Number Activity End===============================






    //====================================================================
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    //======================================================================


} //-----------------------Blood_Organization Method End