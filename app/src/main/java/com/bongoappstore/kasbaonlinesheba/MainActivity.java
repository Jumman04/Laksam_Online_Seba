package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //=============================Nagorik Sheba Button=============================================
    CardView emergency_service_button, gov_information_service_button, emergency_number_button,
            police_service_button, fire_service_button, all_sim_code_btn, voluntary_organization_btn;
    //=============================Nagorik Sheba Button=============================================


    //=============================Nagorik Sheba Button2============================================
    CardView emergency_service_btn2, gov_information_btn2, emergency_number_btn2, police_service_btn2,
            fire_service_btn2, palli_bidyut_btn2, blood_donar_btn2, blood_songathan_btn2, blood_social_btn2,
            health_service_btn, ambulance_btn2, wifi_service_btn2;
    //=============================Nagorik Sheba Button2============================================


    TextView marqueebutton;


    ImageSlider imageSlider;


    CardView hospital_btn, clinic_btn, diagnostic_btn, specialist_doctor_btn, homeopathic_doctor_btn,
            animal_doctor_btn, upazila_doctor_btn, ambulance_service_button, pharmacy_shop_btn, blood_btn,
            blood_foundation_btn, blood_social_group_btn;


    CardView kasba_map_btn, kasba_post_office_btn, edu_institution_btn, rural_electricity_btn, courier_service_btn,
            kasba_bank_btn, rent_a_car_btn, journalist_btn, lawyer_btn, book_library_btn,
            training_center_btn, gas_service_btn, kazi_office_btn, baik_right_share_btn, hat_bazar_btn,
            dish_service_btn, internet_service_btn, beauty_parlour_btn, resturant_btn,
            coaching_center_btn, teacher_btn, online_service_shop_btn, home_shifting_service_btn, food_btn,
            ghotok_btn, dolil_lekhok_btn, dokan_showroom_btn, nursery_shop_btn;


    CardView electrician_mason_btn, sanitary_mason_btn, tiels_mason_btn, tailors_btn, wood_mason_btn, auto_rickshw_mason_btn,
            painter_btn, tier_masson_btn, motor_cycle_mason_btn;


    CardView apps_share_btn, about_information_btn, more_apps_btn, apps_ratting_btn, about_apps_btn, about_app_developer_btn;


    CardView bayek_union_btn2, kayempur_union_btn2, kuti_union_btn2, kasba_west_union_btn2, gopinathpur_unino_btn2,
            badair_union_btn2, mehari_union_btn2, binawoti_union_btn2, kharera_union_btn2, mulgram_union_btn2,
            kasba_pourashava_union_btn2, union_new_feature_btn2;


    CardView whatsApp_contact_btn, fb_contact_btn, gmail_contact_btn, fb_page_btn, fb_group_btn;


    CardView gmail_contact_btn3, messenger_btn, call_dial_btn;

    //=====================================================================
    LinearLayout marqueelayout;

    ScrollView home_page_layout, service_page_layout, message_page_layout, union_page_layout, developer_page_layout;
    LinearLayout home_button_layout, service_button_layout, message_button_layout, union_button_layout, developer_button_layout;

    ImageView home_icon, service_icon, message_icon, union_icon, developer_icon;
    TextView home_text, service_text, message_text, union_text, developer_text;

    int green, normal;
    //=========================================================================


    //============================Navigation Drawer=================================//
    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    NavigationView navigationView;
    TextView header_Title;
    View headerView;
    ImageView imgHeader;
    //============================Navigation Drawer=================================//


    //===================================================================
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    //===================================================================


    String whatsappUser = "+8801724463565";

    String[] urls = new String[1];

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        //======================================================================================
        urls[0] = "https://sites.google.com/view/kasbaupazilaonlinesheba";

        //========================================================================================//
        home_icon = findViewById(R.id.home_icon);
        service_icon = findViewById(R.id.service_icon);
        message_icon = findViewById(R.id.message_icon);
        union_icon = findViewById(R.id.union_icon);
        developer_icon = findViewById(R.id.developer_icon);

        //========================================================================================//


        //========================================================================================//
        home_text = findViewById(R.id.home_text);
        service_text = findViewById(R.id.service_text);
        message_text = findViewById(R.id.message_text);
        union_text = findViewById(R.id.union_text);
        developer_text = findViewById(R.id.developer_text);

        //========================================================================================//


        //========================================================================================//
        marqueelayout = findViewById(R.id.marqueelayout);

        home_button_layout = findViewById(R.id.home_button_layout);
        service_button_layout = findViewById(R.id.service_button_layout);
        message_button_layout = findViewById(R.id.message_button_layout);
        union_button_layout = findViewById(R.id.union_button_layout);
        developer_button_layout = findViewById(R.id.developer_button_layout);
        //========================================================================================//


        //========================================================================================//
        home_page_layout = findViewById(R.id.home_page_layout);
        service_page_layout = findViewById(R.id.service_page_layout);
        message_page_layout = findViewById(R.id.message_page_layout);
        union_page_layout = findViewById(R.id.union_page_layout);
        developer_page_layout = findViewById(R.id.developer_page_layout);
        //========================================================================================//

        //========================================================================================//
        green = Color.parseColor("#06AC87");
        normal = Color.parseColor("#918D8D");
        //========================================================================================//


        //========================================================================================//
        whatsApp_contact_btn = findViewById(R.id.whatsApp_contact_btn);
        fb_contact_btn = findViewById(R.id.fb_contact_btn);
        gmail_contact_btn = findViewById(R.id.gmail_contact_btn);
        fb_page_btn = findViewById(R.id.fb_page_btn);
        fb_group_btn = findViewById(R.id.fb_group_btn);

        gmail_contact_btn3 = findViewById(R.id.gmail_contact_btn3);
        messenger_btn = findViewById(R.id.messenger_btn);
        call_dial_btn = findViewById(R.id.call_dial_btn);
        //========================================================================================//


//===============================================================================================
//===============================================================================================
//===============================================================================================
        hospital_btn = findViewById(R.id.hospital_btn);
        clinic_btn = findViewById(R.id.clinic_btn);
        diagnostic_btn = findViewById(R.id.diagnostic_btn);
        specialist_doctor_btn = findViewById(R.id.specialist_doctor_btn);
        homeopathic_doctor_btn = findViewById(R.id.homeopathic_doctor_btn);
        animal_doctor_btn = findViewById(R.id.animal_doctor_btn);
        pharmacy_shop_btn = findViewById(R.id.pharmacy_shop_btn);
        upazila_doctor_btn = findViewById(R.id.upazila_doctor_btn);


        blood_btn = findViewById(R.id.blood_btn);
        courier_service_btn = findViewById(R.id.courier_service_btn);
        kasba_bank_btn = findViewById(R.id.kasba_bank_btn);
        rural_electricity_btn = findViewById(R.id.rural_electricity_btn);
        kasba_map_btn = findViewById(R.id.kasba_map_btn);

        //====================================================================
        //====================================================================


        //=========================Emergency Service============================
        emergency_service_btn2 = findViewById(R.id.emergency_service_btn2);
        gov_information_btn2 = findViewById(R.id.gov_information_btn2);
        emergency_number_btn2 = findViewById(R.id.emergency_number_btn2);

        police_service_btn2 = findViewById(R.id.police_service_btn2);
        fire_service_btn2 = findViewById(R.id.fire_service_btn2);
        palli_bidyut_btn2 = findViewById(R.id.palli_bidyut_btn2);

        blood_donar_btn2 = findViewById(R.id.blood_donar_btn2);
        blood_songathan_btn2 = findViewById(R.id.blood_songathan_btn2);
        blood_social_btn2 = findViewById(R.id.blood_social_btn2);

        ambulance_btn2 = findViewById(R.id.ambulance_btn2);
        health_service_btn = findViewById(R.id.health_service_btn);
        wifi_service_btn2 = findViewById(R.id.wifi_service_btn2);
        //=========================Emergency Service============================


        //===================================================================
        //===================================================================


        kasba_post_office_btn = findViewById(R.id.kasba_post_office_btn);
        edu_institution_btn = findViewById(R.id.edu_institution_btn);

        rent_a_car_btn = findViewById(R.id.rent_a_car_btn);
        journalist_btn = findViewById(R.id.journalist_btn);
        lawyer_btn = findViewById(R.id.lawyer_btn);

        book_library_btn = findViewById(R.id.book_library_btn);


        training_center_btn = findViewById(R.id.training_center_btn);
        gas_service_btn = findViewById(R.id.gas_service_btn);
        kazi_office_btn = findViewById(R.id.kazi_office_btn);
        resturant_btn = findViewById(R.id.resturant_btn);

        coaching_center_btn = findViewById(R.id.coaching_center_btn);
        online_service_shop_btn = findViewById(R.id.online_service_shop_btn);
        home_shifting_service_btn = findViewById(R.id.home_shifting_service_btn);


        food_btn = findViewById(R.id.food_btn);


        hat_bazar_btn = findViewById(R.id.hat_bazar_btn);
        baik_right_share_btn = findViewById(R.id.baik_right_share_btn);
        dish_service_btn = findViewById(R.id.dish_service_btn);
        internet_service_btn = findViewById(R.id.internet_service_btn);
        beauty_parlour_btn = findViewById(R.id.beauty_parlour_btn);
        teacher_btn = findViewById(R.id.teacher_btn);


        ghotok_btn = findViewById(R.id.ghotok_btn);
        dolil_lekhok_btn = findViewById(R.id.dolil_lekhok_btn);
        dokan_showroom_btn = findViewById(R.id.dokan_showroom_btn);
        nursery_shop_btn = findViewById(R.id.nursery_shop_btn);


        motor_cycle_mason_btn = findViewById(R.id.motor_cycle_mason_btn);


        blood_social_group_btn = findViewById(R.id.blood_social_group_btn);
        blood_foundation_btn = findViewById(R.id.blood_foundation_btn);


        wood_mason_btn = findViewById(R.id.wood_mason_btn);
        auto_rickshw_mason_btn = findViewById(R.id.auto_rickshw_mason_btn);
        painter_btn = findViewById(R.id.painter_btn);


        //   message_send_button = findViewById(R.id.message_send_button);
        materialToolbar = findViewById(R.id.materialToolbar);


//===============================================================================================
//===============================================================================================
//===============================================================================================


//===============================================================================================
//===============================================================================================
//===============================================================================================


        gopinathpur_unino_btn2 = findViewById(R.id.gopinathpur_unino_btn2);
        mehari_union_btn2 = findViewById(R.id.mehari_union_btn2);
        mulgram_union_btn2 = findViewById(R.id.mulgram_union_btn2);
        binawoti_union_btn2 = findViewById(R.id.binawoti_union_btn2);
        bayek_union_btn2 = findViewById(R.id.bayek_union_btn2);
        badair_union_btn2 = findViewById(R.id.badair_union_btn2);

        kharera_union_btn2 = findViewById(R.id.kharera_union_btn2);
        kayempur_union_btn2 = findViewById(R.id.kayempur_union_btn2);
        kasba_west_union_btn2 = findViewById(R.id.kasba_west_union_btn2);
        kuti_union_btn2 = findViewById(R.id.kuti_union_btn2);
        kasba_pourashava_union_btn2 = findViewById(R.id.kasba_pourashava_union_btn2);
        union_new_feature_btn2 = findViewById(R.id.union_new_feature_btn2);
//===============================================================================================
//===============================================================================================
//===============================================================================================


//===============================================================================================
//===============================================================================================
//===============================================================================================
        emergency_service_button = findViewById(R.id.emergency_service_button);
        gov_information_service_button = findViewById(R.id.gov_information_service_button);
        emergency_number_button = findViewById(R.id.emergency_number_button);
        police_service_button = findViewById(R.id.police_service_button);
        fire_service_button = findViewById(R.id.fire_service_button);
        ambulance_service_button = findViewById(R.id.ambulance_service_button);
        all_sim_code_btn = findViewById(R.id.all_sim_code_btn);
        voluntary_organization_btn = findViewById(R.id.voluntary_organization_btn);

//===============================================================================================
//===============================================================================================
//===============================================================================================


//===============================================================================================
//===============================================================================================
//===============================================================================================

        electrician_mason_btn = findViewById(R.id.electrician_mason_btn);
        sanitary_mason_btn = findViewById(R.id.sanitary_mason_btn);
        tiels_mason_btn = findViewById(R.id.tiels_mason_btn);
        tailors_btn = findViewById(R.id.tailors_btn);
        tier_masson_btn = findViewById(R.id.tier_masson_btn);


//===============================================================================================
//===============================================================================================
//===============================================================================================


//===============================================================================================
//===============================================================================================
//===============================================================================================

        apps_share_btn = findViewById(R.id.apps_share_btn);
        about_information_btn = findViewById(R.id.about_information_btn);
        apps_ratting_btn = findViewById(R.id.apps_ratting_btn);
        more_apps_btn = findViewById(R.id.more_apps_btn);

        about_apps_btn = findViewById(R.id.about_apps_btn);
        about_app_developer_btn = findViewById(R.id.about_app_developer_btn);


//===============================================================================================
//===============================================================================================
//===============================================================================================


//===============================================================================================


        home_button_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marqueelayout.setVisibility(View.VISIBLE);

                home_icon.setColorFilter(green);
                home_text.setTextColor(green);

                service_icon.setColorFilter(normal);
                service_text.setTextColor(normal);

                message_icon.setColorFilter(normal);
                message_text.setTextColor(normal);

                union_icon.setColorFilter(normal);
                union_text.setTextColor(normal);

                developer_icon.setColorFilter(normal);
                developer_text.setTextColor(normal);


                home_page_layout.setVisibility(View.VISIBLE);
                service_page_layout.setVisibility(View.GONE);
                message_page_layout.setVisibility(View.GONE);
                union_page_layout.setVisibility(View.GONE);
                developer_page_layout.setVisibility(View.GONE);

                materialToolbar.setTitle("লাকসাম অনলাইন সেবা");

            }
        });


        service_button_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marqueelayout.setVisibility(View.GONE);

                home_icon.setColorFilter(normal);
                home_text.setTextColor(normal);

                service_icon.setColorFilter(green);
                service_text.setTextColor(green);

                message_icon.setColorFilter(normal);
                message_text.setTextColor(normal);

                union_icon.setColorFilter(normal);
                union_text.setTextColor(normal);

                developer_icon.setColorFilter(normal);
                developer_text.setTextColor(normal);


                home_page_layout.setVisibility(View.GONE);
                service_page_layout.setVisibility(View.VISIBLE);
                message_page_layout.setVisibility(View.GONE);
                union_page_layout.setVisibility(View.GONE);
                developer_page_layout.setVisibility(View.GONE);

                materialToolbar.setTitle("লাকসাম অনলাইন সেবা");


            }
        });


        message_button_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marqueelayout.setVisibility(View.GONE);

                home_icon.setColorFilter(normal);
                home_text.setTextColor(normal);

                service_icon.setColorFilter(normal);
                service_text.setTextColor(normal);

                message_icon.setColorFilter(green);
                message_text.setTextColor(green);

                union_icon.setColorFilter(normal);
                union_text.setTextColor(normal);

                developer_icon.setColorFilter(normal);
                developer_text.setTextColor(normal);


                home_page_layout.setVisibility(View.GONE);
                service_page_layout.setVisibility(View.GONE);
                message_page_layout.setVisibility(View.VISIBLE);
                union_page_layout.setVisibility(View.GONE);
                developer_page_layout.setVisibility(View.GONE);

                materialToolbar.setTitle("লাকসাম অনলাইন সেবা");


            }
        });


        union_button_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marqueelayout.setVisibility(View.GONE);

                home_icon.setColorFilter(normal);
                home_text.setTextColor(normal);

                service_icon.setColorFilter(normal);
                service_text.setTextColor(normal);

                union_icon.setColorFilter(green);
                union_text.setTextColor(green);

                message_icon.setColorFilter(normal);
                message_text.setTextColor(normal);

                developer_icon.setColorFilter(normal);
                developer_text.setTextColor(normal);


                home_page_layout.setVisibility(View.GONE);
                service_page_layout.setVisibility(View.GONE);
                message_page_layout.setVisibility(View.GONE);
                union_page_layout.setVisibility(View.VISIBLE);
                developer_page_layout.setVisibility(View.GONE);

                materialToolbar.setTitle("লাকসাম অনলাইন সেবা");


            }
        });


        developer_button_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marqueelayout.setVisibility(View.GONE);

                home_icon.setColorFilter(normal);
                home_text.setTextColor(normal);

                service_icon.setColorFilter(normal);
                service_text.setTextColor(normal);

                union_icon.setColorFilter(normal);
                union_text.setTextColor(normal);

                message_icon.setColorFilter(normal);
                message_text.setTextColor(normal);

                developer_icon.setColorFilter(green);
                developer_text.setTextColor(green);


                home_page_layout.setVisibility(View.GONE);
                service_page_layout.setVisibility(View.GONE);
                message_page_layout.setVisibility(View.GONE);
                union_page_layout.setVisibility(View.GONE);
                developer_page_layout.setVisibility(View.VISIBLE);

                materialToolbar.setTitle("লাকসাম অনলাইন সেবা");


            }
        });


//===============================================================================================


        marqueebutton = findViewById(R.id.marqueeId);
        marqueebutton.setSelected(true);


        imageSlider = findViewById(R.id.image_slider);
        createSlider();


        //================================Navigation Drawer===================================//
        drawerLayout = findViewById(R.id.drawerLayout);
        materialToolbar = findViewById(R.id.materialToolbar);
        navigationView = findViewById(R.id.navigationView);
        headerView = navigationView.getHeaderView(0);
        imgHeader = headerView.findViewById(R.id.imgHeader);
        header_Title = headerView.findViewById(R.id.header_Title);
        header_Title.setText("লাকসাম অনলাইন সেবা");
        //================================Navigation Drawer===================================//


        //==============================Navigation Drawer Code Here===============================//

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle
                (MainActivity.this, drawerLayout, materialToolbar, R.string.drawer_close, R.string.drawer_open);
        drawerLayout.addDrawerListener(toggle);

        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.mHome) {

                    Toast.makeText(MainActivity.this, "Home Button Selected", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);

                }

                return false;
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {

                    case R.id.mHome:
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mAboutApp:
                        Intent myIntent4 = new Intent(MainActivity.this, About_Apps.class);
                        startActivity(myIntent4);
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.mDeveloper:
                        Intent myIntent = new Intent(MainActivity.this, About_Developer.class);
                        startActivity(myIntent);
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.mShare:
                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        String play = "http://play.google.com/store/apps/details?id=";
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, "Share this app " + play + getPackageName());
                        sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                        startActivity(Intent.createChooser(sharingIntent, "Share this app"));
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mRate:
                        Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName()));
                        startActivity(browserIntent2);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mAdvertisement:

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
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.email_send:

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        String UriText = "mailto:" + Uri.encode("laksamonlineseba@gmail.com") + "?subject=" +
                                Uri.encode("লাকসাম অনলাইন সেবা") + " =" + Uri.encode("");
                        Uri uri = Uri.parse(UriText);
                        intent.setData(uri);
                        startActivity(Intent.createChooser(intent, "send email"));
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mUpdate:
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName()));
                        startActivity(browserIntent);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.mMore_apps:
                        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Bongo+App+Store"));
                        startActivity(browserIntent3);
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.mPrivacy_policy:

                        Intent myIntent2 = new Intent(MainActivity.this, Privacy_Policy_Webview.class);
                        myIntent2.putExtra("links", urls[0]);
                        startActivity(myIntent2);

                        Toast.makeText(MainActivity.this, "Please Wait....", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.mExit:

                        // if (Bottom_navigationView.getId()== R.id.developer_button_layout || Bottom_navigationView.getId()== R.id.service_button_layout)
                        TextView information_send_button, no_button, yes_button;
                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(false);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);
                        information_send_button = (TextView) alertCustomdialog.findViewById(R.id.information_send_button);
                        no_button = (TextView) alertCustomdialog.findViewById(R.id.no_button);
                        yes_button = (TextView) alertCustomdialog.findViewById(R.id.yes_button);
                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        information_send_button.setOnClickListener(new View.OnClickListener() {

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


                        no_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        yes_button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                finishAffinity();
                            }
                        });

                        drawerLayout.closeDrawers();
                        break;


                }

                return false;
            }
        });

        //==============================Navigation Drawer Code Here===============================//


        hospital_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Hospital.class);
                startActivity(myIntent);
            }
        });

        clinic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Clinic.class);
                startActivity(myIntent);
            }
        });

        diagnostic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Diagnostic_Center.class);
                startActivity(myIntent);
            }
        });

        specialist_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Specialist_Doctor.class);
                startActivity(myIntent);
            }
        });

        homeopathic_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Homeopathic_Doctor.class);
                startActivity(myIntent);
            }
        });

        animal_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Animal_Doctor.class);
                startActivity(myIntent);
            }
        });

        upazila_doctor_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Upazila_Doctor.class);
                startActivity(myIntent);
            }
        });

        pharmacy_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Pharmacy_Shop.class);
                startActivity(myIntent);
            }
        });


        blood_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Blood_Donor_Group.class);
                intent.putExtra("title", "সকল ব্লাড ডোনারের তালিকা");
                startActivity(intent);
            }
        });


        courier_service_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Courier_Service.class);
                startActivity(myIntent);
            }
        });

        kasba_bank_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Financial_Institutions.class);
                startActivity(myIntent);
            }
        });

        rural_electricity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Palli_Bidyut.class);
                startActivity(myIntent);
            }
        });

        kasba_map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Upazila_Information.class);
                startActivity(myIntent);

            }
        });


        kasba_post_office_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Post_Office.class);
                startActivity(myIntent);
            }
        });


        /*
        edu_institution_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। উক্ত সার্ভিস টি খুব শীঘ্রই অ্যাপসে যুক্ত করা হবে। ধন্যবাদ।");


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
        */


        edu_institution_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Educational_Institutions.class);
                startActivity(myIntent);

            }
        });


        rent_a_car_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Rent_Car.class);
                startActivity(myIntent);
            }
        });

        journalist_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Journalist.class);
                startActivity(myIntent);
            }
        });

        lawyer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Lawyer.class);
                startActivity(myIntent);
            }
        });

        book_library_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Book_Library.class);
                startActivity(myIntent);
            }
        });


        training_center_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Training_Center.class);
                startActivity(myIntent);
            }
        });

        gas_service_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Gas_Service.class);
                startActivity(myIntent);
            }
        });

        kazi_office_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Kazi_Office.class);
                startActivity(myIntent);
            }
        });

        resturant_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Resturant.class);
                startActivity(myIntent);
            }
        });


        coaching_center_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Coaching_Centre.class);
                startActivity(myIntent);
            }
        });

        online_service_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Online_Service_Shop.class);
                startActivity(myIntent);
            }
        });


        home_shifting_service_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে বাসা বদল সার্ভিস এর সঠিক কোন তথ্য থাকে তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার সার্ভিস টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.home_shifting_service);
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


        food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Food_Order.class);
                startActivity(myIntent);

            }
        });


        hat_bazar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Hat_Bazar.class);
                startActivity(myIntent);
            }
        });




        /*
        baik_right_share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে বাইক রাইট শেয়ারের কোন সঠিক তথ্য থাকে তাহলে আমাদের কে আপনার তথ্য দিন। আমরা খুব শীঘ্রই আপনার সেবাটি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


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

         */

        baik_right_share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TextView no_button, yes_button;
                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.bike_alert_dialog_layout, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(false);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);
                no_button = (TextView) alertCustomdialog.findViewById(R.id.no_button);
                yes_button = (TextView) alertCustomdialog.findViewById(R.id.yes_button);
                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();


                no_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });


                yes_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Bike_Ride_Share();
                        Intent intent = new Intent(MainActivity.this, Multiple_Details_02.class);
                        intent.putExtra("title", "বাইক রাইড শেয়ারের তালিকা");
                        intent.putExtra("title2", "               বাইক রাইড শেয়ারের সেবা পেতে নিচের নাম্বারে কল করুন।");
                        startActivity(intent);
                        dialog.dismiss();

                    }
                });


            } //------------------if (position == 0) { End Here

        });


        dish_service_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(MainActivity.this, Dish_Service.class);
                startActivity(myIntent);


            }

        });


        internet_service_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Wifi_Internet_Service.class);
                startActivity(myIntent);

            }

        });


        beauty_parlour_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Beauty_Parlour.class);
                startActivity(myIntent);

            }

        });


        ghotok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Ghotok.class);
                startActivity(myIntent);
            }
        });


        dokan_showroom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Dokan_Showroom.class);
                startActivity(myIntent);
            }
        });


        dolil_lekhok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে দলিল লেখক (মুহুরি) এর সঠিক কোন তথ্য থাকে তাহলে আমাদের কে নাম, মোবাইল নং, ঠিকানা সহ বিস্তারিত তথ্য দিন। আমরা খুব শীঘ্রই আপনার তথ্যটি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");

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

            }
        });


        teacher_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Tuition_Service.class);
                startActivities(new Intent[]{myIntent});

            }

        });



        /*
        nurse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

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


            } //------------------if (position == 0) { End Here

        });
       */


        blood_social_group_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Blood_Social_Group.class);
                intent.putExtra("title", "ব্লাড সোশ্যাল গ্রুপের তালিকা");
                startActivity(intent);
            }
        });


        blood_foundation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Blood_Organization.class);
                intent.putExtra("title", "সকল ব্লাড সংগঠনের তালিকা");
                startActivity(intent);
            }
        });


        //=====================================================================================
        //=====================================================================================
        //=====================================================================================
        //=====================================================================================
        //=====================================================================================


        emergency_service_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "999", null));
                startActivity(intentcall);

            }
        });

        gov_information_service_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "333", null));
                startActivity(intentcall);

            }
        });


        emergency_number_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Emergency_Number.class);
                startActivity(myIntent);
            }
        });

        police_service_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Thana_Police.class);
                startActivity(myIntent);
            }
        });


        fire_service_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Fire_Service.class);
                startActivity(myIntent);
            }
        });


        all_sim_code_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, All_Sim_Dial_Code.class);
                startActivity(myIntent);
            }
        });


        voluntary_organization_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Voluntary_Organization.class);
                startActivity(myIntent);
            }
        });


        ambulance_service_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Ambulance.class);
                startActivity(myIntent);
            }
        });


        //=====================================================================================
        //=====================================================================================
        //=====================================================================================
        //=====================================================================================
        //=====================================================================================

        electrician_mason_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Electrical_Mason.class);
                startActivities(new Intent[]{myIntent});

            }

        });

        sanitary_mason_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Sanitary_Mason.class);
                startActivities(new Intent[]{myIntent});

            }


        });


        tier_masson_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Tier_Mason.class);
                startActivities(new Intent[]{myIntent});

            }


        });


        tiels_mason_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে টাইলস মেস্ত্রী এর সঠিক কোন তথ্য থাকে তাহলে আমাদের কে আপনার নাম, মোবাইল নং, ঠিকানা সহ বিস্তারিত তথ্য দিন। আমরা খুব শীঘ্রই আপনার সার্ভিস টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


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
                        ;
                    }
                });


            } //------------------if (position == 0) { End Here
        });


        tailors_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Tailor_Craftsman.class);
                startActivities(new Intent[]{myIntent});

            } //------------------if (position == 0) { End Here

        });

        wood_mason_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("আমাদের প্রতিনিধি টিম তথ্য সংগ্রহের কাজ করছে। যদি আপনার কাছে কাঠের মেস্ত্রী এর সঠিক কোন তথ্য থাকে তাহলে আমাদের কে আপনার নাম, মোবাইল নং, ঠিকানা সহ বিস্তারিত তথ্য দিন। আমরা খুব শীঘ্রই আপনার সার্ভিস টি উক্ত অ্যাপসে যুক্ত করে দিব। ধন্যবাদ।");


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


        auto_rickshw_mason_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Auto_Rickshaw_Mason.class);
                startActivities(new Intent[]{myIntent});


            }

        });


        motor_cycle_mason_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Motor_Cycle_Mason.class);
                startActivities(new Intent[]{myIntent});


            }

        });


        painter_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Painter_Masson.class);
                startActivities(new Intent[]{myIntent});


            }

        });


        //=====================================================================================
        //=====================================================================================
        //=====================================================================================
        //=====================================================================================
        //=====================================================================================


//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================


//================================================================================================
//================================================================================================
//================================================================================================
//================================================================================================


        apps_share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String play = "http://play.google.com/store/apps/details?id=";
                sharingIntent.putExtra(Intent.EXTRA_TEXT, "Share this app " + play + getPackageName());
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                startActivity(Intent.createChooser(sharingIntent, "Share this app"));
            }
        });


        /*

        apps_update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName()));
                startActivity(browserIntent);
            }
        });


         */

        more_apps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Bongo+App+Store"));
                startActivity(browserIntent3);
            }
        });


        apps_ratting_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName()));
                startActivity(myIntent);

            }
        });


        about_information_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, About_Information_Collector.class);
                startActivity(myIntent);

            }
        });


        about_apps_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, About_Apps.class);
                startActivity(myIntent);

            }
        });


        about_app_developer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, About_Developer.class);
                startActivity(myIntent);

            }
        });


        //=================================Online Service Page Start Here=========================//


        //=================================Online Service Page End Here=========================//


        //=================================Message Page End Here=========================//
/*
        message_send_button.setOnClickListener(new View.OnClickListener() {
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

        //=================================Message Page End Here=========================//

 */

        //=================================Union Page Start Here=========================//

        bayek_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("বায়েক ইউনিয়ন এর অধীনে মোট ৩৩ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Bayek_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });


            }
        });


        kayempur_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("কায়েমপুর ইউনিয়ন এর অধীনে মোট ২৫ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Kayempur_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });


            }
        });


        kuti_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("কুটি ইউনিয়ন এর অধীনে মোট ২৫ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Kuti_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });


            }
        });


        kasba_west_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("কসবা পশ্চিম ইউনিয়ন এর অধীনে মোট ০৬ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Kasba_West_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });


            }
        });


        gopinathpur_unino_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("গোপীনাথপুর ইউনিয়ন এর অধীনে মোট ৩৯ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Gopinathpur_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });
            }
        });


        badair_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("বাদৈর ইউনিয়ন এর অধীনে মোট ০৮ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Badair_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });
            }
        });


        mehari_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("মেহারী ইউনিয়ন এর অধীনে মোট ১১ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Mehari_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });
            }
        });


        binawoti_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("বিনাউটি ইউনিয়ন এর অধীনে মোট ২১ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Binawoti_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });
            }
        });


        kharera_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("খাড়েরা ইউনিয়ন এর অধীনে মোট ১৩ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Kharera_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });
            }
        });


        mulgram_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("মূলগ্রাম ইউনিয়ন এর অধীনে মোট ১৭ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Mulgram_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });
            }
        });


        kasba_pourashava_union_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView user_allert_details_text, union_enter_button;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.union_enter_allert_dialog, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("কসবা পৌরসভা ইউনিয়ন এর অধীনে মোট ৩১ টি গ্রামের নাম ও উক্ত গ্রামের কিছু বিশেষ সেবার নাম এই অ্যাপে সংযুক্ত করতে পেরেছি। উক্ত সেবা গুলোর সকল তথ্য আমার একার পক্ষে সংগ্রহ করা সম্ভব হয়নি। যদি আপনার কাছে কোন তথ্য থাকে তাহলে ডেভেলপার বরাবর মেসেজ করুন।");

                lottie_animation = alertCustomdialog.findViewById(R.id.lottie_animation);
                lottie_animation.setAnimation(R.raw.message_send);
                lottie_animation.playAnimation();


                union_enter_button = alertCustomdialog.findViewById(R.id.union_enter_button);


                final AlertDialog dialog = alert.create();
                //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                //finally show the dialog box in android all
                dialog.show();
                dialog.setCancelable(true);


                union_enter_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent myIntent = new Intent(MainActivity.this, Kasba_Pourashava_Union.class);
                        startActivity(myIntent);
                        dialog.dismiss();
                    }
                });
            }
        });


        union_new_feature_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                CardView close_btn, gmail_send, information_send_button;
                TextView user_allert_details_text;

                LottieAnimationView lottie_animation;


                //will create a view of our custom dialog layout
                View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_user_information_send, null);
                //initialize alert builder.
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(true);

                //set our custom alert dialog to tha alertdialog builder
                alert.setView(alertCustomdialog);

                user_allert_details_text = alertCustomdialog.findViewById(R.id.user_allert_details_text);
                user_allert_details_text.setText("এই সেকশন এ নতুন ফিচার সংযুক্ত করার কাজ চলছে। খুব শিঘ্রই নতুন ফিচার সংযুক্ত করা হবে। ধন্যবাদ।");

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
                        String UriText = "mailto:" + Uri.encode("laksamonlineseba@gmail.com") + "?subject=" +
                                Uri.encode("লাকসাম অনলাইন সেবা") + " =" + Uri.encode("");
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

        //=================================Union Page End Here=========================//


        //=================================Developer Page End Here=========================//
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

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100068119997408"));
                startActivity(myIntent);

            }
        });


        messenger_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.me/Mr.sojibkhan.officials"));
                startActivity(myIntent);

            }
        });


        gmail_contact_btn3.setOnClickListener(new View.OnClickListener() {
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


        call_dial_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String phoneNumber = "01724463565";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(intent);

            }
        });


        //=================================Developer Page End Here=========================//


        //==========================================================================================
        //==========================================================================================
        //============================Emergency Service Button OnClic End===========================
        //==========================================================================================
        //==========================================================================================
        emergency_service_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "999", null));
                startActivity(intentcall);
            }
        });

        gov_information_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "333", null));
                startActivity(intentcall);
            }
        });


        emergency_number_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Emergency_Number();
                Intent intent = new Intent(MainActivity.this, Multiple_Details_01.class);
                intent.putExtra("title", "জরুরী সেবা পেতে কল করুন");
                startActivity(intent);
            }
        });

        police_service_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thana_Police();
                Intent intent = new Intent(MainActivity.this, Multiple_Details_01.class);
                intent.putExtra("title", "জরুরী থানা পুলিশ সেবা");
                startActivity(intent);
            }
        });

        fire_service_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fire_Service();
                Intent intent = new Intent(MainActivity.this, Multiple_Details_01.class);
                intent.putExtra("title", "জরুরী ফায়ার সার্ভিস সেবা");
                startActivity(intent);
            }
        });


        palli_bidyut_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Palli_Bidyut.class);
                intent.putExtra("title", "জরুরী পল্লী বিদ্যুৎ সেবা");
                startActivity(intent);
            }
        });


        blood_donar_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Blood_Donor_Group.class);
                intent.putExtra("title", "সকল ব্লাড ডোনারের তালিকা");
                startActivity(intent);
            }
        });


        blood_songathan_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Blood_Organization.class);
                intent.putExtra("title", "সকল ব্লাড সংগঠনের তালিকা");
                startActivity(intent);
            }
        });


        blood_social_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Blood_Social_Group.class);
                intent.putExtra("title", "ব্লাড সোশ্যাল গ্রুপের তালিকা");
                startActivity(intent);
            }
        });


        ambulance_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ambulance();
                Intent intent = new Intent(MainActivity.this, Multiple_Details_02.class);
                intent.putExtra("title", "এ্যাম্বুলেন্স সেবা এর তালিকা");
                intent.putExtra("title2", "                  জরুরী এ্যাম্বুলেন্স সেবা পেতে নিচের দেওয়া নাম্বারে যোগাযোগ করতে পারেন।");

                startActivity(intent);
            }
        });


        health_service_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Health_Service.class);
                intent.putExtra("title", "সকল ব্লাড গ্রুপের তালিকা");
                startActivity(intent);
            }
        });


        wifi_service_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WIFI_SERVICE();
                Intent intent = new Intent(MainActivity.this, Multiple_Details_02.class);
                intent.putExtra("title", "ইন্টারনেট সেবা এর তালিকা");
                intent.putExtra("title2", "                  জরুরী ইন্টারনেট সেবা পেতে নিচের দেওয়া নাম্বারে যোগাযোগ করতে পারেন।");

                startActivity(intent);
            }
        });


        //==========================================================================================
        //==========================================================================================
        //============================Emergency Service Button OnClic End===========================
        //==========================================================================================
        //==========================================================================================

        nursery_shop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Nursary_Shop();
                Intent intent = new Intent(MainActivity.this, Multiple_Details_03.class);
                intent.putExtra("title", "নার্সারী দোকানের তালিকা");
                startActivity(intent);
            }
        });


    } //------------------------------------OnCreate Bundle Method Line End Here


    //=====================================Bike_Ride_Share Activity Start===========================
    public void Bike_Ride_Share() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bike_name_txt_01));
        hashMap.put("address_text", getString(R.string.bike_addr_txt_01));
        hashMap.put("phone", getString(R.string.bike_num_txt_01));
        hashMap.put("imageView", String.valueOf(R.drawable.o_positive_ibrahim));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.bike_name_txt_02));
        hashMap.put("address_text", getString(R.string.bike_addr_txt_02));
        hashMap.put("phone", getString(R.string.bike_num_txt_02));
        hashMap.put("imageView", String.valueOf(R.drawable.ride_share_icon));
        arrayList.add(hashMap);


        Multiple_Details_02.donnerarrayList = arrayList;
    }
    //=====================================Bike_Ride_Share Activity End=============================


    //==================================Nursary Shop Activity Start=============================
    public void Nursary_Shop() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("title_text", getString(R.string.title_text));
        hashMap.put("adress_text", getString(R.string.adress_text));
        hashMap.put("description_text", getString(R.string.des_text));
        hashMap.put("phone_number_text", "01790659765");
        hashMap.put("fb_page_url", "https://www.facebook.com/profile.php?id=100043529706568");
        hashMap.put("whatsp_call_btn", "+88 01790659765");
        hashMap.put("imageView", String.valueOf(R.drawable.nursery_icon));
        arrayList.add(hashMap);


        Multiple_Details_03.donnerarrayList = arrayList;
    }
    //==================================Nursary Shop Activity Start=============================


    //==================================Emergency Number Activity Start=============================
    public void Emergency_Number() {

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_01));
        hashMap.put("phone", getString(R.string.emrg_phone_num_01));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_02));
        hashMap.put("phone", getString(R.string.emrg_phone_num_02));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_03));
        hashMap.put("phone", getString(R.string.emrg_phone_num_03));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_04));
        hashMap.put("phone", getString(R.string.emrg_phone_num_04));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_05));
        hashMap.put("phone", getString(R.string.emrg_phone_num_05));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_06));
        hashMap.put("phone", getString(R.string.emrg_phone_num_06));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_07));
        hashMap.put("phone", getString(R.string.emrg_phone_num_07));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_08));
        hashMap.put("phone", getString(R.string.emrg_phone_num_08));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_09));
        hashMap.put("phone", getString(R.string.emrg_phone_num_09));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_10));
        hashMap.put("phone", getString(R.string.emrg_phone_num_10));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_11));
        hashMap.put("phone", getString(R.string.emrg_phone_num_11));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.emrg_num_txt_12));
        hashMap.put("phone", getString(R.string.emrg_phone_num_12));
        hashMap.put("imageView", String.valueOf(R.drawable.customer_support_icon));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Emergency Number Activity End===============================


    //==================================Thana Police Activity Start=================================
    public void Thana_Police() {

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_01));
        hashMap.put("phone", getString(R.string.police_phone_num_01));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_02));
        hashMap.put("phone", getString(R.string.police_phone_num_02));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_03));
        hashMap.put("phone", getString(R.string.police_phone_num_03));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_04));
        hashMap.put("phone", getString(R.string.police_phone_num_04));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_05));
        hashMap.put("phone", getString(R.string.police_phone_num_05));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_06));
        hashMap.put("phone", getString(R.string.police_phone_num_06));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_07));
        hashMap.put("phone", getString(R.string.police_phone_num_07));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_08));
        hashMap.put("phone", getString(R.string.police_phone_num_08));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_09));
        hashMap.put("phone", getString(R.string.police_phone_num_09));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_10));
        hashMap.put("phone", getString(R.string.police_phone_num_10));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_11));
        hashMap.put("phone", getString(R.string.police_phone_num_11));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_12));
        hashMap.put("phone", getString(R.string.police_phone_num_12));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_13));
        hashMap.put("phone", getString(R.string.police_phone_num_13));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_14));
        hashMap.put("phone", getString(R.string.police_phone_num_14));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_15));
        hashMap.put("phone", getString(R.string.police_phone_num_15));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_16));
        hashMap.put("phone", getString(R.string.police_phone_num_16));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_17));
        hashMap.put("phone", getString(R.string.police_phone_num_17));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_18));
        hashMap.put("phone", getString(R.string.police_phone_num_18));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_19));
        hashMap.put("phone", getString(R.string.police_phone_num_19));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_20));
        hashMap.put("phone", getString(R.string.police_phone_num_20));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_21));
        hashMap.put("phone", getString(R.string.police_phone_num_21));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_22));
        hashMap.put("phone", getString(R.string.police_phone_num_22));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_23));
        hashMap.put("phone", getString(R.string.police_phone_num_23));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_24));
        hashMap.put("phone", getString(R.string.police_phone_num_24));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_25));
        hashMap.put("phone", getString(R.string.police_phone_num_25));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_26));
        hashMap.put("phone", getString(R.string.police_phone_num_26));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_27));
        hashMap.put("phone", getString(R.string.police_phone_num_27));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_28));
        hashMap.put("phone", getString(R.string.police_phone_num_28));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_29));
        hashMap.put("phone", getString(R.string.police_phone_num_29));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_30));
        hashMap.put("phone", getString(R.string.police_phone_num_30));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_31));
        hashMap.put("phone", getString(R.string.police_phone_num_31));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_32));
        hashMap.put("phone", getString(R.string.police_phone_num_32));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_33));
        hashMap.put("phone", getString(R.string.police_phone_num_33));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_34));
        hashMap.put("phone", getString(R.string.police_phone_num_34));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_35));
        hashMap.put("phone", getString(R.string.police_phone_num_35));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.police_num_txt_36));
        hashMap.put("phone", getString(R.string.police_phone_num_36));
        hashMap.put("imageView", String.valueOf(R.drawable.police_icon));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Thana Police Activity End===================================


    //==================================Fire Service Activity Start=================================
    public void Fire_Service() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_01));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_01));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_02));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_02));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_03));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_03));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_04));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_04));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_05));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_05));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (06) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_06));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_06));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (07) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_07));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_07));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (08) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_08));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_08));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        //----------Serial No: (09) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.fire_serv_txt_09));
        hashMap.put("phone", getString(R.string.fire_serv_phone_num_09));
        hashMap.put("imageView", String.valueOf(R.drawable.fire_service_icon));
        arrayList.add(hashMap);


        Multiple_Details_01.donnerarrayList = arrayList;
    }
    //==================================Fire Service Activity End===================================


    //=====================================Ambulance Activity Start=================================
    public void Ambulance() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.ambulance_name_txt_01));
        hashMap.put("address_text", getString(R.string.ambulance_addr_txt_01));
        hashMap.put("phone", getString(R.string.ambulance_num_txt_01));
        hashMap.put("imageView", String.valueOf(R.drawable.ambulance_icon));
        arrayList.add(hashMap);

        //----------Serial No: (02) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.ambulance_name_txt_02));
        hashMap.put("address_text", getString(R.string.ambulance_addr_txt_02));
        hashMap.put("phone", getString(R.string.ambulance_num_txt_02));
        hashMap.put("imageView", String.valueOf(R.drawable.ambulance_icon));
        arrayList.add(hashMap);

        //----------Serial No: (03) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.ambulance_name_txt_03));
        hashMap.put("address_text", getString(R.string.ambulance_addr_txt_03));
        hashMap.put("phone", getString(R.string.ambulance_num_txt_03));
        hashMap.put("imageView", String.valueOf(R.drawable.ambulance_icon));
        arrayList.add(hashMap);

        //----------Serial No: (04) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.ambulance_name_txt_04));
        hashMap.put("address_text", getString(R.string.ambulance_addr_txt_04));
        hashMap.put("phone", getString(R.string.ambulance_num_txt_04));
        hashMap.put("imageView", String.valueOf(R.drawable.ambulance_icon));
        arrayList.add(hashMap);

        //----------Serial No: (05) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.ambulance_name_txt_05));
        hashMap.put("address_text", getString(R.string.ambulance_addr_txt_05));
        hashMap.put("phone", getString(R.string.ambulance_num_txt_05));
        hashMap.put("imageView", String.valueOf(R.drawable.ambulance_icon));
        arrayList.add(hashMap);


        Multiple_Details_02.donnerarrayList = arrayList;
    }
    //=====================================Ambulance Activity End===================================


    //=====================================Wifi Service Activity Start==============================
    public void WIFI_SERVICE() {

        arrayList = new ArrayList<>();

        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_01));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_01));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_01));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_ogni_logo));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_02));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_02));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_02));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_connect_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_03));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_03));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_03));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_connect_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_04));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_04));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_04));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_connect_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_05));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_05));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_05));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_connect_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_06));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_06));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_06));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_connect_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_07));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_07));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_07));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_connect_icon));
        arrayList.add(hashMap);


        //----------Serial No: (01) ----------
        hashMap = new HashMap<>();
        hashMap.put("name", getString(R.string.wifi_name_txt_08));
        hashMap.put("address_text", getString(R.string.wifi_addr_txt_08));
        hashMap.put("phone", getString(R.string.wifi_numb_txt_08));
        hashMap.put("imageView", String.valueOf(R.drawable.wifi_connect_icon));
        arrayList.add(hashMap);


        Multiple_Details_02.donnerarrayList = arrayList;
    }
    //=====================================Wifi Service Activity End=================================


    @Override
    public void onBackPressed() { //===============Exit Allert Dialog Method Line Start Here=================//

        TextView information_send_button, no_button, yes_button;
        //will create a view of our custom dialog layout
        View alertCustomdialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_alert_dialog_layout, null);
        //initialize alert builder.
        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this).setCancelable(false);

        //set our custom alert dialog to tha alertdialog builder
        alert.setView(alertCustomdialog);
        information_send_button = (TextView) alertCustomdialog.findViewById(R.id.information_send_button);
        no_button = (TextView) alertCustomdialog.findViewById(R.id.no_button);
        yes_button = (TextView) alertCustomdialog.findViewById(R.id.yes_button);
        final AlertDialog dialog = alert.create();
        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //finally show the dialog box in android all
        dialog.show();


        information_send_button.setOnClickListener(new View.OnClickListener() {

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


        no_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


        yes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

    } //==================Exit Allert Dialog Method Line End Here==================//


    private void createSlider() {
        ArrayList<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.sliding_photo1, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo2, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo3, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo7, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo9, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo5, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo4, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo6, null));
        imageList.add(new SlideModel(R.drawable.sliding_photo8, null));
        imageSlider.setImageList(imageList, ScaleTypes.FIT);
    }


} //------------------------------------MainActivity Method Line End Here