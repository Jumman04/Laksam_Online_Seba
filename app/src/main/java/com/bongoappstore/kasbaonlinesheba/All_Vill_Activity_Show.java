package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class All_Vill_Activity_Show extends AppCompatActivity {


    CardView village_doctor_btn;
    TextView village_name_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_all_vill_show);

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        village_doctor_btn = findViewById(R.id.village_doctor_btn);
        village_name_textview = findViewById(R.id.village_name_textview);


        Bundle extras = getIntent().getExtras();
        String item_name = "Default Item Name Text";

        if (extras != null) { //============================================//

            item_name = extras.getString("keyItem_Name");


            //---------------------------------Bayek Union All Village Online Sheba Method Line Start Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==============================================================================================

            if (item_name.equals("Charua_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চারুয়া অনলাইন সেবা");
                village_name_textview.setText("চারুয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bayek_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বায়েক অনলাইন সেবা");
                village_name_textview.setText("বায়েক অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nayonpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নয়নপুর অনলাইন সেবা");
                village_name_textview.setText("নয়নপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Konaghata_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কোনাঘাটা অনলাইন সেবা");
                village_name_textview.setText("কোনাঘাটা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kandarpar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কান্দারপাড় অনলাইন সেবা");
                village_name_textview.setText("কান্দারপাড় অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Donrajpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ধনরাজপুর অনলাইন সেবা");
                village_name_textview.setText("ধনরাজপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Koykhola_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কৈখলা অনলাইন সেবা");
                village_name_textview.setText("কৈখলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Borobayek_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বড়বায়েক অনলাইন সেবা");
                village_name_textview.setText("বড়বায়েক অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sagortola_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সাগড়তলা অনলাইন সেবা");
                village_name_textview.setText("সাগড়তলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Joydebpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জয়দেবপুর অনলাইন সেবা");
                village_name_textview.setText("জয়দেবপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kollapathor_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কোল্লাপাথর অনলাইন সেবা");
                village_name_textview.setText("কোল্লাপাথর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Horipur_Online_Sheba_Activity_01")) {

                getSupportActionBar().setTitle("হরিপুর অনলাইন সেবা");
                village_name_textview.setText("হরিপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Madla_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মাদলা অনলাইন সেবা");
                village_name_textview.setText("মাদলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Biddanagor_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বিদ্যানগর অনলাইন সেবা");
                village_name_textview.setText("বিদ্যানগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Khadla_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("খাদলা অনলাইন সেবা");
                village_name_textview.setText("খাদলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nichontopur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নিচন্তপুর অনলাইন সেবা");
                village_name_textview.setText("নিচন্তপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Ghopinagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গোপীনগর অনলাইন সেবা");
                village_name_textview.setText("গোপীনগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gowrangula_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গৌরাঙ্গুলা অনলাইন সেবা");
                village_name_textview.setText("গৌরাঙ্গুলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Barikhola_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাড়ীখলা অনলাইন সেবা");
                village_name_textview.setText("বাড়ীখলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Badaliya_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাদালিয়া অনলাইন সেবা");
                village_name_textview.setText("বাদালিয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Shampur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শ্যামপুর অনলাইন সেবা");
                village_name_textview.setText("শ্যামপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Putiya_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পুটিয়া অনলাইন সেবা");
                village_name_textview.setText("পুটিয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Beltoli_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বেলতলী অনলাইন সেবা");
                village_name_textview.setText("বেলতলী অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Baliyahura_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বালিয়াহুড়া অনলাইন সেবা");
                village_name_textview.setText("বালিয়াহুড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kasirampur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কাশিরামপুর অনলাইন সেবা");
                village_name_textview.setText("কাশিরামপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Rogurampur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রঘুরামপুর অনলাইন সেবা");
                village_name_textview.setText("রঘুরামপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Chandkhola_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চাঁন্দখলা অনলাইন সেবা");
                village_name_textview.setText("চাঁন্দখলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sostapur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সস্তাপুর অনলাইন সেবা");
                village_name_textview.setText("সস্তাপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Mizzapur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মিজ্জাপুর অনলাইন সেবা");
                village_name_textview.setText("মিজ্জাপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Dopakhola_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ধোপখলা অনলাইন সেবা");
                village_name_textview.setText("ধোপখলা অনলাইন সকল সেবা সমূহ");

            } else if (item_name.equals("Nowapara_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নোয়াপাড়া অনলাইন সেবা");
                village_name_textview.setText("নোয়াপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("NayonpurHat_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নয়নপুরহাট অনলাইন সেবা");
                village_name_textview.setText("নয়নপুরহাট অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Rajvollobpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাজবল্লভপুর অনলাইন সেবা");
                village_name_textview.setText("রাজবল্লভপুর অনলাইন সকল সেবা সমূহ");

            }


            //---------------------------------Bayek Union All Village Online Sheba Method Line End Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==============================================================================================


            //---------------------------------Kayempur Union All Village Online Sheba Method Line Start Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==============================================================================================

            if (item_name.equals("Kayempur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কায়েমপুর অনলাইন সেবা");
                village_name_textview.setText("কায়েমপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Paniyarup_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পানিয়ারুপ অনলাইন সেবা");
                village_name_textview.setText("পানিয়ারুপ অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nowagao_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নোয়াগাঁও অনলাইন সেবা");
                village_name_textview.setText("নোয়াগাঁও অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Lokkhipur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("লক্ষিপুর অনলাইন সেবা");
                village_name_textview.setText("লক্ষিপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Jajisar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জাজিসার অনলাইন সেবা");
                village_name_textview.setText("জাজিসার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Chokbosta_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চকবস্তা অনলাইন সেবা");
                village_name_textview.setText("চকবস্তা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gonganagar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গংঙ্গানগর অনলাইন সেবা");
                village_name_textview.setText("গংঙ্গানগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Omorpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ওমরপুর অনলাইন সেবা");
                village_name_textview.setText("ওমরপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kalta_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কালতা অনলাইন সেবা");
                village_name_textview.setText("কালতা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Khoraishar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("খোড়াইশার অনলাইন সেবা");
                village_name_textview.setText("খোড়াইশার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Digirpar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("দিঘিরপার অনলাইন সেবা");
                village_name_textview.setText("দিঘিরপার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nakhaora_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নাখাউরা অনলাইন সেবা");
                village_name_textview.setText("নাখাউরা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Rajvollobpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাজবল্লভপুর অনলাইন সেবা");
                village_name_textview.setText("রাজবল্লভপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Chatowakhola_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চাটুয়াখলা অনলাইন সেবা");
                village_name_textview.setText("চাটুয়াখলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Raoutkhola_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাউৎখলা অনলাইন সেবা");
                village_name_textview.setText("রাউৎখলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kamalpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কামালপুর অনলাইন সেবা");
                village_name_textview.setText("কামালপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sreepur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শ্রীপুর অনলাইন সেবা");
                village_name_textview.setText("শ্রীপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Mondovag_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মন্দভাগ অনলাইন সেবা");
                village_name_textview.setText("মন্দভাগ অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Jogonnathpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জগন্নাথপুর অনলাইন সেবা");
                village_name_textview.setText("জগন্নাথপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nowapara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নোয়াপাড়া অনলাইন সেবা");
                village_name_textview.setText("নোয়াপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Moinpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মইনপুর অনলাইন সেবা");
                village_name_textview.setText("মইনপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Jikra_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ঝিকড়া অনলাইন সেবা");
                village_name_textview.setText("ঝিকড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kalinagar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কালিনগর অনলাইন সেবা");
                village_name_textview.setText("কালিনগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Girisnagar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গিরিশনগর অনলাইন সেবা");
                village_name_textview.setText("গিরিশনগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gobindopur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গোবিন্দপুর অনলাইন সেবা");
                village_name_textview.setText("গোবিন্দপুর অনলাইন সকল সেবা সমূহ");


            }
            //---------------------------------Kayempur Union All Village Online Sheba Method Line Start Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==============================================================================================


            //---------------------------------Koti Union All Village Online Sheba Method Line Start Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==============================================================================================

            if (item_name.equals("Kuti_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কুটি অনলাইন সেবা");
                village_name_textview.setText("কুটি অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Jajiyara_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জাজিয়ারা অনলাইন সেবা");
                village_name_textview.setText("জাজিয়ারা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bishnopur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বিষ্ণপুর অনলাইন সেবা");
                village_name_textview.setText("বিষ্ণপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gognanagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গংগানগর অনলাইন সেবা");
                village_name_textview.setText("গংগানগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Lesiyara_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("লেশিয়ারা অনলাইন সেবা");
                village_name_textview.setText("লেশিয়ারা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Maizkhar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মাইজখার অনলাইন সেবা");
                village_name_textview.setText("মাইজখার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Maniknagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মানিকনগর অনলাইন সেবা");
                village_name_textview.setText("মানিকনগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sorotnagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শরৎনগর অনলাইন সেবা");
                village_name_textview.setText("শরৎনগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Thokapara_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("তকাপাড়া অনলাইন সেবা");
                village_name_textview.setText("তকাপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Thokapara_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("তকাপাড়া অনলাইন সেবা");
                village_name_textview.setText("তকাপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Taranagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("তারানগর অনলাইন সেবা");
                village_name_textview.setText("তারানগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Rampur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রামপুর অনলাইন সেবা");
                village_name_textview.setText("রামপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Dokkhinkhar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("দক্ষিণখার অনলাইন সেবা");
                village_name_textview.setText("দক্ষিণখার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bangur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাগুর অনলাইন সেবা");
                village_name_textview.setText("বাগুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bilghar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বিলঘর অনলাইন সেবা");
                village_name_textview.setText("বিলঘর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Baisar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাইসার অনলাইন সেবা");
                village_name_textview.setText("বাইসার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Voyrobnagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ভৈরবনগর অনলাইন সেবা");
                village_name_textview.setText("ভৈরবনগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Raniyara_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাণীয়ারা অনলাইন সেবা");
                village_name_textview.setText("রাণীয়ারা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Santipur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সান্তীপুর অনলাইন সেবা");
                village_name_textview.setText("সান্তীপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Katerpul_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কাঠেরপুল অনলাইন সেবা");
                village_name_textview.setText("কাঠেরপুল অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kalamuriya_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কালামুড়িয়া অনলাইন সেবা");
                village_name_textview.setText("কালামুড়িয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Shasansar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শাসনসার অনলাইন সেবা");
                village_name_textview.setText("শাসনসার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gunsagar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গুনসাগর অনলাইন সেবা");
                village_name_textview.setText("গুনসাগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Atokpara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আতকাপাড়া অনলাইন সেবা");
                village_name_textview.setText("আতকাপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kaiccanagar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কাইচ্ছানগর অনলাইন সেবা");
                village_name_textview.setText("কাইচ্ছানগর অনলাইন সকল সেবা সমূহ");

            }



        } else if (item_name.equals("Ekobnagar_Online_Sheba_Activity")) {

            getSupportActionBar().setTitle("একুবনগর অনলাইন সেবা");
            village_name_textview.setText("একুবনগর অনলাইন সকল সেবা সমূহ");

        }



            //---------------------------------Koti Union All Village Online Sheba Method Line End Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==============================================================================================


            //---------------------------------Kasba East Union All Village Online Sheba Method Line Start Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==============================================================================================

            if (item_name.equals("Mirpokorpar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মীরপুকুরপাড় অনলাইন সেবা সমূহ");
                village_name_textview.setText("মীরপুকুরপাড় অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kaliyara_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কালিয়ারা অনলাইন সেবা সমূহ");
                village_name_textview.setText("কালিয়ারা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Mirtola_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মীরতলা অনলাইন সেবা সমূহ");
                village_name_textview.setText("মীরতলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bilghar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বিলঘর অনলাইন সেবা সমূহ");
                village_name_textview.setText("বিলঘর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kollabari_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কুল্লাবাড়ী অনলাইন সেবা সমূহ");
                village_name_textview.setText("কুল্লাবাড়ী অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Aksina_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আকছিনা অনলাইন সেবা সমূহ");
                village_name_textview.setText("আকছিনা অনলাইন সকল সেবা সমূহ");

            }


            //---------------------------------Gopinathpur Union All Village Online Sheba Method Line Start Here
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================
            //==================================================================================================

            if (item_name.equals("Latuamura_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("লতুয়ামুড়া অনলাইন সেবা");
                village_name_textview.setText("লতুয়ামুড়া অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Chandidwar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চন্ডিদ্বার অনলাইন সেবা");
                village_name_textview.setText("চন্ডিদ্বার অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Vatshala_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ভাতশালা অনলাইন সেবা");
                village_name_textview.setText("ভাতশালা অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Vollabari_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ভোল্লাবাড়ি অনলাইন সেবা");
                village_name_textview.setText("ভোল্লাবাড়ি অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Mirjatpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মির্জাতপুর অনলাইন সেবা");
                village_name_textview.setText("মির্জাতপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Alampur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আলমপুর অনলাইন সেবা");
                village_name_textview.setText("আলমপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Horiyaboho_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("হরিয়াবহ অনলাইন সেবা");
                village_name_textview.setText("হরিয়াবহ অনলাইন সেবা সমূহ");

            } else if (item_name.equals("Nowagao_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নোয়াগাও অনলাইন সেবা");
                village_name_textview.setText("নোয়াগাও অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Dowlotpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("দৌলতপুর অনলাইন সেবা");
                village_name_textview.setText("দৌলতপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Dojonagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ধব্জর্নগর অনলাইন সেবা ");
                village_name_textview.setText("ধব্জর্নগর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Rayermura_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রায়েরমুড়া অনলাইন সেবা");
                village_name_textview.setText("রায়েরমুড়া অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Gosaipur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গোসাইপুর অনলাইন সেবা");
                village_name_textview.setText("গোসাইপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Bishnaori_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বিষ্ণাউড়ি অনলাইন সেবা");
                village_name_textview.setText("বিষ্ণাউড়ি অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Ganokmura_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গনকমুড়া অনলাইন সেবা");
                village_name_textview.setText("গনকমুড়া অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Kashipur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কাশিপুর অনলাইন সেবা");
                village_name_textview.setText("কাশিপুর অনলাইন সেবা সমূহ");

            } else if (item_name.equals("Borthoda_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বড়ঠোটা অনলাইন সেবা");
                village_name_textview.setText("বড়ঠোটা অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Enayetpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("এনায়েতপুর অনলাইন সেবা");
                village_name_textview.setText("এনায়েতপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Fothehpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ফতেহপুর অনলাইন সেবা");
                village_name_textview.setText("ফতেহপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Bahadurpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাহাদুরপুর অনলাইন সেবা");
                village_name_textview.setText("বাহাদুরপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Rajnagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাজনগর অনলাইন সেবা");
                village_name_textview.setText("রাজনগর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Gupinathpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গোপীনাথপুর অনলাইন সেবা");
                village_name_textview.setText("গোপীনাথপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Gusaistol_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গোসাইস্থল অনলাইন সেবা");
                village_name_textview.setText("গোসাইস্থল অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Ganpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গানপুর অনলাইন সেবা");
                village_name_textview.setText("গানপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Horipur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("হরিপুর অনলাইন সেবা");
                village_name_textview.setText("হরিপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Jogonnatpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জগন্নাথপুর অনলাইন সেবা");
                village_name_textview.setText("জগন্নাথপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Jethowamura_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জেঠুয়ামুড়া অনলাইন সেবা");
                village_name_textview.setText("জেঠুয়ামুড়া অনলাইন সেবা সমূহ");

            } else if (item_name.equals("Khirnal_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("খিরনাল অনলাইন সেবা");
                village_name_textview.setText("খিরনাল অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Koyipainna_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কুইয়াপানিয়া অনলাইন সেবা");
                village_name_textview.setText("কুইয়াপানিয়া অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Lokkhipur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("লক্ষিপুর অনলাইন সেবা");
                village_name_textview.setText("লক্ষিপুর অনলাইন সেবা সমূহ");

            } else if (item_name.equals("Modupur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মধুপুর অনলাইন সেবা");
                village_name_textview.setText("মধুপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Manikkomuri_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মানিক্যমুড়ি অনলাইন সেবা");
                village_name_textview.setText("মানিক্যমুড়ি অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Pathoriadar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পাথারিয়াদ্বার অনলাইন সেবা");
                village_name_textview.setText("পাথারিয়াদ্বার অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Rampur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রামপুর অনলাইন সেবা");
                village_name_textview.setText("রামপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Digirpar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("দিঘীরপাড় অনলাইন সেবা");
                village_name_textview.setText("দিঘীরপাড় অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Sotarmura_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সুতারমুড়া অনলাইন সেবা");
                village_name_textview.setText("সুতারমুড়া অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Ramnagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রামনগর অনলাইন সেবা");
                village_name_textview.setText("রামনগর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Kajiyatula_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কাজীয়াটুলা অনলাইন সেবা");
                village_name_textview.setText("কাজীয়াটুলা অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Soyodpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সৈয়দপুর অনলাইন সেবা");
                village_name_textview.setText("সৈয়দপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Barai_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাড়াই অনলাইন সেবা");
                village_name_textview.setText("বাড়াই অনলাইন সেবা সমূহ");

            }


            //---------------------------------Gopinathpur Union All Village Online Sheba Method Line End Here
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================


            //---------------------------------Badair Union All Village Online Sheba Method Line End Here
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================

            if (item_name.equals("Badair_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাদৈর অনলাইন সেবা সমূহ");
                village_name_textview.setText("বাদৈর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Borni_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বর্ণী অনলাইন সেবা সমূহ");
                village_name_textview.setText("বর্ণী অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Hatorabarir_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("হাতুরাবাড়ি অনলাইন সেবা সমূহ");
                village_name_textview.setText("হাতুরাবাড়ি অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Jomserpor_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জমশেরপুর অনলাইন সেবা সমূহ");
                village_name_textview.setText("জমশেরপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kalsar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কালসার অনলাইন সেবা সমূহ");
                village_name_textview.setText("কালসার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Mandarpor_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মান্দারপুর অনলাইন সেবা সমূহ");
                village_name_textview.setText("মান্দারপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Podua_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পদুয়া অনলাইন সেবা সমূহ");
                village_name_textview.setText("পদুয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Shikarpor_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শিকারপুর অনলাইন সেবা সমূহ");
                village_name_textview.setText("শিকারপুর অনলাইন সকল সেবা সমূহ");


            }


            //---------------------------------Badair Union All Village Online Sheba Method Line End Here
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================
            //=================================================================================================


            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //---------------------------------Mehari Union All Village Online Sheba Method Line Start  Here


            if (item_name.equals("Chaubepur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চৌবেপুর অনলাইন সেবা");
                village_name_textview.setText("চৌবেপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Shimrail_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শিমরাইল অনলাইন সেবা");
                village_name_textview.setText("শিমরাইল অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Jumuna_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("যমুনা অনলাইন সেবা");
                village_name_textview.setText("যমুনা অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Ishannagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ঈশাননগর অনলাইন সেবা");
                village_name_textview.setText("ঈশাননগর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Mehari_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মেহারী অনলাইন সেবা");
                village_name_textview.setText("মেহারী অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Baharata_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাহারআটা অনলাইন সেবা");
                village_name_textview.setText("বাহারআটা অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Bamutia_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বামুটিয়া অনলাইন সেবা");
                village_name_textview.setText("বামুটিয়া অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Ballavpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বল্লভপুর অনলাইন সেবা");
                village_name_textview.setText("বল্লভপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Purquil_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পুরকুইল অনলাইন সেবা");
                village_name_textview.setText("পুরকুইল অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Tilarpar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("তিলারপার অনলাইন সেবা");
                village_name_textview.setText("তিলারপার অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Kheora_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("খেওড়া অনলাইন সেবা");
                village_name_textview.setText("খেওড়া অনলাইন সেবা সমূহ");

            }


            //---------------------------------Mehari Union All Village Online Sheba Method Line Start  Here
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//




            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //---------------------------------Binawoti Union All Village Online Sheba Method Line Start  Here

            if (item_name.equals("Soydabad_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সৈয়দাবাদ অনলাইন সেবা ");
                village_name_textview.setText("সৈয়দাবাদ অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Dorowil_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("দরুইল অনলাইন সেবা ");
                village_name_textview.setText("দরুইল অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Hazipur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("হাজীপুর অনলাইন সেবা ");
                village_name_textview.setText("হাজীপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Routhat_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাউৎহাট অনলাইন সেবা ");
                village_name_textview.setText("রাউৎহাট অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Binawoti_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বিনাউটি অনলাইন সেবা ");
                village_name_textview.setText("বিনাউটি অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Monichong_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মনিচং অনলাইন সেবা ");
                village_name_textview.setText("মনিচং অনলাইন সকল সেবা সমূহ");


                //==========================

            } else if (item_name.equals("Chandaisar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চান্দাইসার অনলাইন সেবা ");
                village_name_textview.setText("চান্দাইসার অনলাইন সকল সেবা সমূহ");

                CardView mudi_dokan_btn;
                mudi_dokan_btn = findViewById(R.id.mudi_dokan_btn);


                mudi_dokan_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(All_Vill_Activity_Show.this,Mudi_Dokan.class);
                        startActivities(new Intent[]{myIntent});
                    }
                });






            } else if (item_name.equals("Khidirpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("খিদিরপুর অনলাইন সেবা ");
                village_name_textview.setText("খিদিরপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Brahmangram_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ব্রাহ্মণগ্রাম অনলাইন সেবা ");
                village_name_textview.setText("ব্রাহ্মণগ্রাম অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nemtabad_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নেমতাবাদ অনলাইন সেবা ");
                village_name_textview.setText("নেমতাবাদ অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gabbari_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গাববাড়ি অনলাইন সেবা ");
                village_name_textview.setText("গাববাড়ি অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nowapara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নোয়াপাড়া অনলাইন সেবা ");
                village_name_textview.setText("নোয়াপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nowapara_south_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নোয়াপাড়া (দক্ষিণ) অনলাইন সেবা ");
                village_name_textview.setText("নোয়াপাড়া (দক্ষিণ) অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Vorajongle_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ভরাজাঙ্গাল অনলাইন সেবা ");
                village_name_textview.setText("ভরাজাঙ্গাল অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sankhala_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সানখলা অনলাইন সেবা ");
                village_name_textview.setText("সানখলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("mojlishpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মজলিশপুর অনলাইন সেবা ");
                village_name_textview.setText("মজলিশপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Onontopur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("অনন্তপুর অনলাইন সেবা ");
                village_name_textview.setText("অনন্তপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Chapiya_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চাপিয়া অনলাইন সেবা ");
                village_name_textview.setText("চাপিয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Tigouriya_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("টিঘরিয়া অনলাইন সেবা ");
                village_name_textview.setText("টিঘরিয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Chokchandrapur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চকচন্দ্রপুর অনলাইন সেবা ");
                village_name_textview.setText("চকচন্দ্রপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Adra_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আদ্রা অনলাইন সেবা ");
                village_name_textview.setText("আদ্রা অনলাইন সকল সেবা সমূহ");


            }


            //---------------------------------Binawoti Union All Village Online Sheba Method Line End  Here
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//


            //---------------------------------Kharera Union All Village Online Sheba Method Line Start  Here
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//


            if (item_name.equals("Kharera_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("খাড়েরা অনলাইন সেবা");
                village_name_textview.setText("খাড়েরা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Deli_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("দেলী অনলাইন সেবা");
                village_name_textview.setText("দেলী অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Pataisar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পাতাইসার অনলাইন সেবা");
                village_name_textview.setText("পাতাইসার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Monkasair_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মনকাশাইর অনলাইন সেবা");
                village_name_textview.setText("মনকাশাইর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Goneshpukorpar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গনেশপুকুরপাড় অনলাইন সেবা");
                village_name_textview.setText("গনেশপুকুরপাড় অনলাইন সকল সেবা সমূহ");

            } else if (item_name.equals("Radanagar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাধানগর অনলাইন সেবা");
                village_name_textview.setText("রাধানগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sonargao_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সোনারগাঁও অনলাইন সেবা");
                village_name_textview.setText("সোনারগাঁও অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gulasar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গোলাসার অনলাইন সেবা");
                village_name_textview.setText("গোলাসার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bogir_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বুগীর অনলাইন সেবা");
                village_name_textview.setText("বুগীর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Dormopur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ধর্মপুর অনলাইন সেবা");
                village_name_textview.setText("ধর্মপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Keyar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কেয়াইর অনলাইন সেবা");
                village_name_textview.setText("কেয়াইর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Dampar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("দামসার অনলাইন সেবা");
                village_name_textview.setText("দামসার অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gojaria_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গজারিয়া অনলাইন সেবা");
                village_name_textview.setText("গজারিয়া অনলাইন সকল সেবা সমূহ");


            }


            //---------------------------------Kharera Union All Village Online Sheba Method Line Start  Here
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//


            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //---------------------------------Mulgram Union All Village Online Sheba Method Line Start  Here

            if (item_name.equals("Amkhar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আমখার অনলাইন সেবা");
                village_name_textview.setText("আমখার অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Baurkhanda_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাউরখন্ড অনলাইন সেবা");
                village_name_textview.setText("বাউরখন্ড অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Dabirghar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ডাবিরঘর অনলাইন সেবা");
                village_name_textview.setText("ডাবিরঘর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Mulgram_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মূলগ্রাম অনলাইন সেবা");
                village_name_textview.setText("মূলগ্রাম অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Neyamatpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নেয়ামতপুর অনলাইন সেবা");
                village_name_textview.setText("নেয়ামতপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Nibra_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নিবড়া অনলাইন সেবা");
                village_name_textview.setText("নিবড়া অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Lobkhan_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("লবখাঁ অনলাইন সেবা");
                village_name_textview.setText("লবখাঁ অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Raitola_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("রাইতলা অনলাইন সেবা");
                village_name_textview.setText("রাইতলা অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Shyambari_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শ্যামবাড়ী অনলাইন সেবাa");
                village_name_textview.setText("শ্যামবাড়ী অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Nimbari_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নিমবাড়ী অনলাইন সেবা");
                village_name_textview.setText("নিমবাড়ী অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Chandrapur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চন্দ্রপুর অনলাইন সেবা");
                village_name_textview.setText("চন্দ্রপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Bahadurpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বাহাদুরপুর অনলাইন সেবা");
                village_name_textview.setText("বাহাদুরপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Chargachh_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চারগাছ অনলাইন সেবা ");
                village_name_textview.setText("চারগাছ অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Sherpur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শেরপুর অনলাইন সেবা");
                village_name_textview.setText("শেরপুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Jaipur_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জয়পুর অনলাইন সেবা");
                village_name_textview.setText("জয়পুর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Shyamnagar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শ্যামনগর অনলাইন সেবা");
                village_name_textview.setText("শ্যামনগর অনলাইন সেবা সমূহ");


            } else if (item_name.equals("Pukurpar_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পুকুরপাড় অনলাইন সেবা ");
                village_name_textview.setText("পুকুরপাড় অনলাইন সেবা সমূহ");


            }

            //---------------------------------Mulgram Union All Village Online Sheba Method Line Start  Here
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//


            //---------------------------------Kasba Powrosoba Union All Village Online Sheba Method Line Start  Here
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//

            if (item_name.equals("Shapur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শাহপুর অনলাইন সেবা");
                village_name_textview.setText("শাহপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Goriyarup_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গুরিয়ারুপ অনলাইন সেবা");
                village_name_textview.setText("গুরিয়ারুপ অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Taltola_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("তালতলা অনলাইন সেবা");
                village_name_textview.setText("তালতলা অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nitainagar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নিতাইনগর অনলাইন সেবা");
                village_name_textview.setText("নিতাইনগর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Jogotpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("জগতপুর অনলাইন সেবা");
                village_name_textview.setText("জগতপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Araibari_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আড়াইবাড়ি অনলাইন সেবা");
                village_name_textview.setText("আড়াইবাড়ি অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bisarabari_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বিশারাবাড়ী অনলাইন সেবা");
                village_name_textview.setText("বিশারাবাড়ী অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Salikpar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শালিকপাড় অনলাইন সেবা");
                village_name_textview.setText("শালিকপাড় অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Tetouya_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("তেতৈয়া অনলাইন সেবা");
                village_name_textview.setText("তেতৈয়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Fultoli_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ফুলতলি অনলাইন সেবা");
                village_name_textview.setText("ফুলতলি অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Gorohit_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("গুরুহীত অনলাইন সেবা");
                village_name_textview.setText("গুরুহীত অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sitolpara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("শীতলপাড়া অনলাইন সেবা");
                village_name_textview.setText("শীতলপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Chornal_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("চড়নাল অনলাইন সেবা");
                village_name_textview.setText("চড়নাল অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Akobpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আকুবপুর অনলাইন সেবা");
                village_name_textview.setText("আকুবপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("mirpokorpar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মিরপুকুরপাড় অনলাইন সেবা");
                village_name_textview.setText("মিরপুকুরপাড় অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Atkapara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("আতকাপাড়া অনলাইন সেবা");
                village_name_textview.setText("আতকাপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Nowapara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("নোয়াপাড়া অনলাইন সেবা");
                village_name_textview.setText("নোয়াপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Sahapara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("সাহাপাড়া অনলাইন সেবা");
                village_name_textview.setText("সাহাপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("kharpara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("খারপাড়া অনলাইন সেবা");
                village_name_textview.setText("খারপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kollansagor_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কল্যানসাগরেরচারপার্শ্ব অনলাইন সেবা");
                village_name_textview.setText("কল্যানসাগরেরচারপার্শ্ব অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Tarapur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("তারাপুর অনলাইন সেবা");
                village_name_textview.setText("তারাপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kalikapur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কালিকাপুর অনলাইন সেবা");
                village_name_textview.setText("কালিকাপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kormokarpara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কর্মকারপাড়া অনলাইন সেবা");
                village_name_textview.setText("কর্মকারপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Morapukorpar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("মরাপুকুরপাড় অনলাইন সেবা");
                village_name_textview.setText("মরাপুকুরপাড় অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kasba_sadarpara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কসবাসদরপাড়া অনলাইন সেবা");
                village_name_textview.setText("কসবাসদরপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Imampara_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("ইমামপাড়া অনলাইন সেবা");
                village_name_textview.setText("ইমামপাড়া অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Hakor_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("হাঁকর অনলাইন সেবা");
                village_name_textview.setText("হাঁকর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Bogabari_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("বগাবাড়ী অনলাইন সেবা");
                village_name_textview.setText("বগাবাড়ী অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Kanchonmuri_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কাঞ্চনমুড়ী অনলাইন সেবা");
                village_name_textview.setText("কাঞ্চনমুড়ী অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Krishpur_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("কৃষপুর অনলাইন সেবা");
                village_name_textview.setText("কৃষপুর অনলাইন সকল সেবা সমূহ");


            } else if (item_name.equals("Panaiyarpar_vill_btn_Online_Sheba_Activity")) {

                getSupportActionBar().setTitle("পানাইয়ারপাড় অনলাইন সেবা");
                village_name_textview.setText("পানাইয়ারপাড় অনলাইন সকল সেবা সমূহ");





            //---------------------------------Kasba Powrosoba Union All Village Online Sheba Method Line Start  Here
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//
            //===============================================================================================//


        } //----------------------- if (extras != null) { Line End Here


    } //----------------------OnCreate Bundle Method Line End Here


    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //


} //----------------------All_Vill_Activity_Show Bundle Method Line End Here