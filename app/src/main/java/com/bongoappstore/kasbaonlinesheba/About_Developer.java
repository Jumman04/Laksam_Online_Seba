package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class About_Developer extends AppCompatActivity {

    CardView whatsApp_contact_btn, fb_contact_btn, gmail_contact_btn, fb_page_btn, fb_group_btn;


    String whatsappUser = "+8801724463565";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_about_developer);
        getSupportActionBar().setTitle("অ্যাপ ডেভেলপার সম্পর্কে");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        whatsApp_contact_btn = findViewById(R.id.whatsApp_contact_btn);
        fb_contact_btn = findViewById(R.id.fb_contact_btn);
        gmail_contact_btn = findViewById(R.id.gmail_contact_btn);
        fb_page_btn = findViewById(R.id.fb_page_btn);
        fb_group_btn = findViewById(R.id.fb_group_btn);





        whatsApp_contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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





        fb_contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://web.facebook.com/profile.php?id=100010121419334";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);


            }
        });



        gmail_contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                String UriText = "mailto:" + Uri.encode("laksamonlineseba@gmail.com") + "?subject=" +
                        Uri.encode("লাকসাম অনলাইন সেবা") + " =" + Uri.encode("");
                Uri uri = Uri.parse(UriText);
                intent.setData(uri);
                startActivity(Intent.createChooser(intent, "send email"));
            }
        });





        fb_page_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100068119997408"));
                startActivity(myIntent);

            }
        });




        fb_group_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/1345162028918497"));
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


} //------------------------Ambulance Method Line End Here