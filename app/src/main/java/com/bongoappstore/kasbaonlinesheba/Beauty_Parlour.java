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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Beauty_Parlour extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_beauty_parlour);
        getSupportActionBar().setTitle("বিউটি পার্লারের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_01);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_02);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_03);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_04);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_04);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_05);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_05);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_06);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_07);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_07);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_08);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_08);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_09);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_09);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_10);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_11);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_11);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_12);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_12);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_13);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_13);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_14);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_14);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_15);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_15);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_16);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_16);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_17);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_17);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_18);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_18);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_19);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_19);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("beauty_parlour_sub_text", R.string.beauty_parlour_sub_textview_20);
        hashMap.put("beauty_parlour_sub_details_text", R.string.beauty_parlour_sub_details_textview_20);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================
        Beauty_Parlour.MyAdapter myAdapter = new Beauty_Parlour.MyAdapter();
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
            View myView = layoutInflater.inflate(R.layout.basic_all_custom_item_design, viewGroup, false);


            TextView all_sub_textview = myView.findViewById(R.id.all_sub_textview_01);
            TextView all_sub_details_textview = myView.findViewById(R.id.all_sub_details_textview_01);


            //-----------------------Sim Image List Line Start Here-----------------//

            ImageView all_profile_image = myView.findViewById(R.id.all_profile_image);

            if (position == 0) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }


            if (position == 1) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 2) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 3) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 4) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 5) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 6) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 7) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 8) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 9) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 10) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 11) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 12) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 13) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 14) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 15) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 16) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 17) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 18) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }

            if (position == 19) {

                all_profile_image.setImageResource(R.drawable.beauty_parlour_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            TextView call_button = myView.findViewById(R.id.call_button);
            TextView message_btn = myView.findViewById(R.id.message_btn);

            message_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        String myNumber = "01303-494653";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }



                    if (position == 1) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01726-555584"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }

                    if (position == 2) {

                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "01731-620175"));
                        intent.putExtra("sms_body", "আপনার মতামত লিখুন");
                        startActivity(intent);

                    }




                    if (position == 3) {

                        String myNumber = "01932-116936";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 4) {

                        String myNumber = "01732-848212";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }

                    if (position == 5) {

                        String myNumber = "01641-272078";
                        String mySms = "আপনার মতামত লিখুন";
                        Uri uri = Uri.parse("smsto:" + myNumber);
                        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                        intent.putExtra("sms_body", mySms);
                        startActivity(intent);
                    }


                    if (position == 6) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }


                    if (position == 7) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 8) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 9) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 10) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 11) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 12) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 13) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 14) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 15) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 16) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 17) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 18) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }

                    if (position == 19) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();
                    }


                }
            });


            call_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (position == 0) {

                        String phoneNumber = "01303-494653";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 1) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01726-555584", null));
                        startActivity(intentcall);
                    }


                    if (position == 2) {

                        Intent intentcall = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "01731-620175", null));
                        startActivity(intentcall);
                    }




                    if (position == 3) {

                        String phoneNumber = "01932-116936";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 4) {

                        String phoneNumber = "01732-848212";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);

                    }

                    if (position == 5) {

                        String phoneNumber = "01641-272078";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 6) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 7) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 8) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 9) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 10) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 11) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 12) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 13) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 14) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 15) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 16) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 17) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 18) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }

                    if (position == 19) {

                        Toast.makeText(Beauty_Parlour.this, "নাম্বারটি সংগ্রহ করার জন্য যোগাযোগ করা হচ্ছে!", Toast.LENGTH_SHORT).show();

                    }


                }
            });


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_sub_textview.setText(hashMap.get("beauty_parlour_sub_text"));
            all_sub_details_textview.setText(hashMap.get("beauty_parlour_sub_details_text"));


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


} //------------------------Beauty_Parlour Bundle Method Line End Here