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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class About_Apps extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_about_apps);
        getSupportActionBar().setTitle("অ্যাপস সম্পর্কে বিস্তারিত");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("lokkho_oddesso_text", R.string.lokkho_oddesso_text);
        hashMap.put("service_somoho_text", R.string.service_somoho_text);

        hashMap.put("prottoko_opokarvogi_text", R.string.prottoko_opokarvogi_text);
        hashMap.put("porokkho_opokarvogi_text", R.string.porokkho_opokarvogi_text);
        hashMap.put("samgrik_provab_text", R.string.samgrik_provab_text);

        hashMap.put("bises_montobbo_text", R.string.bises_montobbo_text);
        hashMap.put("donnobadonte_text", R.string.donnobadonte_text);
        arrayList.add(hashMap);





        //==========================================================================================
        //==========================================================================================
        About_Apps.MyAdapter myAdapter = new About_Apps.MyAdapter();
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
            View myView = layoutInflater.inflate(R.layout.about_app_custom_design, viewGroup, false);




            TextView textview_01 = myView.findViewById(R.id.lokkho_oddesso_text);
            TextView textview_02 = myView.findViewById(R.id.service_somoho_text);

            TextView textview_03 = myView.findViewById(R.id.prottoko_opokarvogi_text);
            TextView textview_04 = myView.findViewById(R.id.porokkho_opokarvogi_text);
            TextView textview_05 = myView.findViewById(R.id.samgrik_provab_text);

            TextView textview_06 = myView.findViewById(R.id.bises_montobbo_text);
            TextView textview_07 = myView.findViewById(R.id.donnobadonte_text);








            HashMap<String, Integer> hashMap = arrayList.get(position);


            textview_01.setText(hashMap.get("lokkho_oddesso_text"));
            textview_02.setText(hashMap.get("service_somoho_text"));

            textview_03.setText(hashMap.get("prottoko_opokarvogi_text"));
            textview_04.setText(hashMap.get("porokkho_opokarvogi_text"));
            textview_05.setText(hashMap.get("samgrik_provab_text"));

            textview_06.setText(hashMap.get("bises_montobbo_text"));
            textview_07.setText(hashMap.get("donnobadonte_text"));




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



} //------------------------Book_Library Bundle Method Line End Here