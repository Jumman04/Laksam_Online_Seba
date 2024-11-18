package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class All_Sim_Dial_Code extends AppCompatActivity {

    CardView teletalk_sim_all_code, gp_sim_all_code, banglalink_sim_all_code, robi_sim_all_sim_code, airtel_sim_all_code,
            all_customer_service_number, nagad_dial_btn, bkash_dial_btn, rocket_dial_btn;


    //===================================================================
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    //===================================================================


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_all_sim_dial_code);

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        teletalk_sim_all_code = findViewById(R.id.teletalk_sim_all_code);
        gp_sim_all_code = findViewById(R.id.gp_sim_all_code);
        banglalink_sim_all_code = findViewById(R.id.banglalink_sim_all_code);
        robi_sim_all_sim_code = findViewById(R.id.robi_sim_all_sim_code);
        airtel_sim_all_code = findViewById(R.id.airtel_sim_all_code);
        all_customer_service_number = findViewById(R.id.all_customer_service_number);

        nagad_dial_btn = findViewById(R.id.nagad_dial_btn);
        bkash_dial_btn = findViewById(R.id.bkash_dial_btn);
        rocket_dial_btn = findViewById(R.id.rocket_dial_btn);


        teletalk_sim_all_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Teletalk_Sim_Code();
                Intent intent = new Intent(All_Sim_Dial_Code.this, Multiple_Details_01.class);
                intent.putExtra("title", "টেলিটক সিমের কোড সমূহ");
                startActivity(intent);
            }
        });


        gp_sim_all_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gp_Sim_Code();
                Intent intent = new Intent(All_Sim_Dial_Code.this, Multiple_Details_01.class);
                intent.putExtra("title", "গ্রামীন সিমের কোড সমূহ");
                startActivity(intent);
            }
        });


        banglalink_sim_all_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bl_Sim_Code();
                Intent intent = new Intent(All_Sim_Dial_Code.this, Multiple_Details_01.class);
                intent.putExtra("title", "বাংলালিংক সিমের কোড সমূহ");
                startActivity(intent);
            }
        });


        robi_sim_all_sim_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Robi_Sim_Code();
                Intent intent = new Intent(All_Sim_Dial_Code.this, Multiple_Details_01.class);
                intent.putExtra("title", "রবি সিমের কোড সমূহ");
                startActivity(intent);
            }
        });


        airtel_sim_all_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Airtel_Sim_Code();
                Intent intent = new Intent(All_Sim_Dial_Code.this, Multiple_Details_01.class);
                intent.putExtra("title", "এয়ারটেল সিমের কোড সমূহ");
                startActivity(intent);
            }
        });


        airtel_sim_all_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Airtel_Sim_Code();
                Intent intent = new Intent(All_Sim_Dial_Code.this, Multiple_Details_01.class);
                intent.putExtra("title", "এয়ারটেল সিমের কোড সমূহ");
                startActivity(intent);
            }
        });


        all_customer_service_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                All_Customer_Service();
                Intent intent = new Intent(All_Sim_Dial_Code.this, Multiple_Details_01.class);
                intent.putExtra("title", "সকল সিমের কাস্টমার নাম্বার সমূহ");
                startActivity(intent);
            }
        });


        nagad_dial_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "*167#", null));
                startActivity(intentcall);
            }
        });


        bkash_dial_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "*247#", null));
                startActivity(intentcall);
            }
        });


        rocket_dial_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "*322#", null));
                startActivity(intentcall);
            }
        });


    } //--------------------OnCreate Bundle Method End


    //==================================Teletalk_Sim_Code Activity Start============================
    public void Teletalk_Sim_Code() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_01));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_02));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_02));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_03));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_03));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_04));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_04));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_05));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_05));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (06) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_06));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_06));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (07) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_07));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_07));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (08) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_08));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_08));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (09) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_09));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_09));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (10) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_10));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_10));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (11) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_head_text_11));
        hashMap.put("phone", getString(R.string.tele_sim_dial_text_11));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Teletalk_Sim_Code Activity End==============================


    //==================================GP_Sim_Code Activity Start============================
    public void Gp_Sim_Code() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_01));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_02));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_02));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_03));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_03));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_04));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_04));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_05));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_05));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (06) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_06));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_06));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (07) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_07));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_07));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (08) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_08));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_08));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (09) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_09));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_09));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (10) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_10));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_10));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (11) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_11));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_11));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (11) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_head_text_12));
        hashMap.put("phone", getString(R.string.gp_sim_dial_text_12));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================GP_Sim_Code Activity End==============================


    //==================================GP_Sim_Code Activity Start============================
    public void Bl_Sim_Code() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_01));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_02));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_02));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_03));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_03));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_04));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_04));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_05));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_05));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (06) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_06));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_06));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (07) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_07));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_07));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (08) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_08));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_08));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (09) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_09));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_09));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (10) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_10));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_10));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (11) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_11));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_11));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (11) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_head_text_12));
        hashMap.put("phone", getString(R.string.bl_sim_dial_text_12));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================GP_Sim_Code Activity End==============================


    //==================================Robi_Sim_Code Activity Start============================
    public void Robi_Sim_Code() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_01));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_02));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_02));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_03));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_03));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);
        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_04));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_04));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_05));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_05));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (06) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_06));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_06));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (07) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_07));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_07));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (08) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_08));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_08));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (09) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_09));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_09));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (10) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_10));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_10));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (11) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_head_text_11));
        hashMap.put("phone", getString(R.string.robi_sim_dial_text_11));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Robi_Sim_Code Activity End==============================


    //==================================Airtel_Sim_Code Activity Start============================
    public void Airtel_Sim_Code() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_01));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_02));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_02));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_03));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_03));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_04));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_04));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_05));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_05));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (06) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_06));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_06));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (07) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_07));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_07));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (08) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_08));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_08));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);
        //----------Serial No: (09) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_09));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_09));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);
        //----------Serial No: (10) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_10));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_10));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (11) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_head_text_11));
        hashMap.put("phone", getString(R.string.airtel_sim_dial_text_11));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Airtel_Sim_Code Activity End==============================


    //==================================Customer_Sim_Code Activity Start============================
    public void All_Customer_Service() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.tele_sim_help_head_text_01));
        hashMap.put("phone", getString(R.string.tele_sim_help_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.teletalk_sim_logo));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.gp_sim_help_head_text_01));
        hashMap.put("phone", getString(R.string.gp_sim_help_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.grameen_phone_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bl_sim_help_head_text_01));
        hashMap.put("phone", getString(R.string.bl_sim_help_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.banglalink_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.robi_sim_help_head_text_01));
        hashMap.put("phone", getString(R.string.robi_sim_help_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.robi_sim_logo));
        arrayList.add(hashMap);

        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.airtel_sim_help_head_text_01));
        hashMap.put("phone", getString(R.string.airtel_sim_help_dial_text_01));
        hashMap.put("imageView", String.valueOf(R.drawable.airtel_sim_logo));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Customer_Sim_Code Activity End==============================





    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //--------------------OnCreate All_Sim_Dial_Code Method End