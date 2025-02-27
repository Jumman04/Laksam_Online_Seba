package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

public class Doctor_Dentist extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_doctor_dentist);
        getSupportActionBar().setTitle("দন্ত বিশেষজ্ঞ ডাক্তারের তালিকা");
        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_01);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_02);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_02);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_03);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_03);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_04);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_05);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_06);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_06);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_07);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_07);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_08);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("sim_service_headline_text", R.string.dentist_doctor_home_text_09);
        hashMap.put("sim_service_dial_code_text", R.string.dentist_doctor_home_treatment_text_09);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================

        Doctor_Dentist.MyAdapter myAdapter = new Doctor_Dentist.MyAdapter();
        listView.setAdapter(myAdapter);


    } //----------------------OnCreate Bundle Method Line End Here


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
            View myView = layoutInflater.inflate(R.layout.doctor_custom_item_design, viewGroup, false);


            TextView all_headline_text = myView.findViewById(R.id.doctor_info_textview);
            TextView all_sub_headline_text = myView.findViewById(R.id.diseases_treatment_textview);


            //-----------------------Sim Image List Line Start Here-----------------//

            ImageView doctor_profile_img = myView.findViewById(R.id.doctor_profile_img);

            if (position == 0) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            if (position == 1) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            if (position == 2) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }

            if (position == 3) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            if (position == 4) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            if (position == 5) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            if (position == 6) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            if (position == 7) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            if (position == 8) {

                doctor_profile_img.setImageResource(R.drawable.dentist_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            TextView doctor_details_button = myView.findViewById(R.id.doctor_details_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);


            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01712-225336"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 1) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01815-319750"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 2) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + ""));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 3) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01960-362456"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 4) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01960-362456"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 5) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01915-900940"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 6) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01767-376073"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 7) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01713-637685"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 8) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01786-115991"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }


                }
            });



            doctor_details_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_01);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_01);


                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01712-225336", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 0) { End Here


                    if (position == 1) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_02);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_02);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01815-319750", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 1) { End Here


                    if (position == 2) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_03);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_03);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01960-362456", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 2) { End Here


                    if (position == 3) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_04);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_04);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01960-362456", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 3) { End Here


                    if (position == 4) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_05);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_05);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01960-362456", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 4) { End Here


                    if (position == 5) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_06);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_06);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01915-900940", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 5) { End Here


                    if (position == 6) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_07);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_07);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01767-376073", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 6) { End Here


                    if (position == 7) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_08);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_08);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01713-637685", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 7) { End Here


                    if (position == 8) {

                        TextView close_btn, serial_btn;
                        TextView doctor_name_text, doctor_details_text;


                        //will create a view of our custom dialog layout
                        View alertCustomdialog = LayoutInflater.from(Doctor_Dentist.this).inflate(R.layout.doctor_alert_dialog_layout, null);
                        //initialize alert builder.
                        AlertDialog.Builder alert = new AlertDialog.Builder(Doctor_Dentist.this).setCancelable(true);

                        //set our custom alert dialog to tha alertdialog builder
                        alert.setView(alertCustomdialog);

                        doctor_name_text = alertCustomdialog.findViewById(R.id.doctor_name_text);
                        doctor_name_text.setText(R.string.dentist_doctor_name_text_09);


                        doctor_details_text = alertCustomdialog.findViewById(R.id.doctor_details_text);
                        doctor_details_text.setText(R.string.dentist_doctor_details_text_09);

                        close_btn = alertCustomdialog.findViewById(R.id.close_btn);
                        serial_btn = alertCustomdialog.findViewById(R.id.serial_btn);

                        final AlertDialog dialog = alert.create();
                        //this line removed app bar from dialog and make it transperent and you see the image is like floating outside dialog box.
                        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        //finally show the dialog box in android all
                        dialog.show();


                        close_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                dialog.dismiss();
                            }
                        });


                        serial_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {


                                Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01786-115991", null));
                                startActivity(intentcall);

                            }
                        });


                    } //------------------if (position == 8) { End Here


                } //-----------------OnClickView End Here
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("sim_service_headline_text"));
            all_sub_headline_text.setText(hashMap.get("sim_service_dial_code_text"));


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


} //----------------------Doctor_Dentist Bundle Method Line End Here