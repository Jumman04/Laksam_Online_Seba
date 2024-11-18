package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class Palli_Bidyut extends AppCompatActivity {

    CardView zonal_office_btn, palli_bidyut_comp_btn, prepaid_meter_btn;

    //===================================================================
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    //===================================================================


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_palli_bidyut);


        //================================================================
        //================================================================
        //================================================================
        zonal_office_btn = findViewById(R.id.zonal_office_btn);
        palli_bidyut_comp_btn = findViewById(R.id.palli_bidyut_comp_btn);
        prepaid_meter_btn = findViewById(R.id.prepaid_meter_btn);
        //================================================================
        //================================================================

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


        zonal_office_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Zonal_Office();
                Intent intent = new Intent(Palli_Bidyut.this, Multiple_Details_02.class);
                intent.putExtra("title", "পল্লী বিদ্যুৎ জোনাল অফিস হেল্প লাইন");
                startActivity(intent);
            }
        });


        palli_bidyut_comp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Palli_Bidyut_Comp();
                Intent intent = new Intent(Palli_Bidyut.this, Multiple_Details_01.class);
                intent.putExtra("title", "পল্লী বিদ্যুৎ অভিযোগ হেল্প লাইন");
                startActivity(intent);
            }
        });


        prepaid_meter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Palli_Bidyut.this, Prepaid_Meter_Code.class);
                intent.putExtra("title", "প্রিপেইড মিটারের প্রয়োজনীয় কোড");
                startActivity(intent);
            }
        });




    } //---------------------------Oncreate Bundle Method End



    //==================================Zonal Office Activity Start=================================
    public void Zonal_Office() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_01));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_01));
        hashMap.put("phone", getString(R.string.zonal_num_txt_01));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_02));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_02));
        hashMap.put("phone", getString(R.string.zonal_num_txt_02));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_03));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_03));
        hashMap.put("phone", getString(R.string.zonal_num_txt_03));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_04));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_04));
        hashMap.put("phone", getString(R.string.zonal_num_txt_04));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_05));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_05));
        hashMap.put("phone", getString(R.string.zonal_num_txt_05));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_06));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_06));
        hashMap.put("phone", getString(R.string.zonal_num_txt_06));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_07));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_07));
        hashMap.put("phone", getString(R.string.zonal_num_txt_07));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_08));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_08));
        hashMap.put("phone", getString(R.string.zonal_num_txt_08));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_09));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_09));
        hashMap.put("phone", getString(R.string.zonal_num_txt_09));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_10));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_10));
        hashMap.put("phone", getString(R.string.zonal_num_txt_10));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_11));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_11));
        hashMap.put("phone", getString(R.string.zonal_num_txt_11));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_12));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_12));
        hashMap.put("phone", getString(R.string.zonal_num_txt_12));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_13));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_13));
        hashMap.put("phone", getString(R.string.zonal_num_txt_13));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_14));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_14));
        hashMap.put("phone", getString(R.string.zonal_num_txt_14));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.zonal_name_txt_15));
        hashMap.put("address_text", getString(R.string.zonal_addr_txt_15));
        hashMap.put("phone", getString(R.string.zonal_num_txt_15));
        hashMap.put("imageView", String.valueOf(R.drawable.zonal_office_icon));
        arrayList.add(hashMap);


        Multiple_Details_02.donnerarrayList = arrayList;
    }
    //==================================Zonal Office Activity End===================================




    //==================================Palli Bidyut Comp Activity Start============================
    public void Palli_Bidyut_Comp() {

        //----------Serial No: (05) ----------
        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_01));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_01));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_02));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_02));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_03));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_03));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_04));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_04));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_05));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_05));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_06));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_06));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_07));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_07));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_08));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_08));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_09));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_09));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_10));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_10));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_11));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_11));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_12));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_12));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_13));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_13));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_14));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_14));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_15));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_15));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_16));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_16));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_17));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_17));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_18));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_18));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_19));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_19));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_20));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_20));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_21));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_21));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_22));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_22));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_23));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_23));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_24));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_24));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_25));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_25));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_26));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_26));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_27));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_27));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.compl_addres_txt_28));
        hashMap.put("phone", getString(R.string.compl_mobile_txt_28));
        hashMap.put("imageView", String.valueOf(R.drawable.complaint_icon));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Palli_Bidyut_Comp Activity End==============================


    //==================================Prepaid_Meter Activity Start================================
    //----------------------------------------------------------
    //----------------------------------------------------------
    //----------------------------------------------------------
    //==================================Prepaid_Meter Activity End==================================






    //====================================================================
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    //======================================================================

} //-------------------------Palli_Bidyut Method End