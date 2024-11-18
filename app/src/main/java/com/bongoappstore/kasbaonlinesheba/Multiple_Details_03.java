package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Multiple_Details_03 extends AppCompatActivity {

    RecyclerView recyclerView;

    public static ArrayList<HashMap<String, String>> donnerarrayList = new ArrayList<>();
    DonnerAdapter donnerAdapter = new DonnerAdapter(donnerarrayList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_multiple_details03);


        String title= getIntent().getStringExtra("title");


        if (title == null){

            title = "";
        }



        // Set the title after setting the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //======================================

        recyclerView = findViewById(R.id.donnerRecyclerView);
        recyclerView.setAdapter(donnerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Multiple_Details_03.this));








    } //--------------------OnCreate Bundle Method End





    private class DonnerAdapter extends RecyclerView.Adapter<DonnerAdapter.DonnerViewHolder> {

        ArrayList<HashMap<String, String>> donnerarrayList;

        public DonnerAdapter(ArrayList<HashMap<String, String>> donnerarrayList) {

            this.donnerarrayList = donnerarrayList;

        }

        @NonNull
        @Override
        public DonnerAdapter.DonnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.custom_item_03, parent, false);


            return new DonnerAdapter.DonnerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull DonnerViewHolder holder, int position) {

            HashMap<String, String> hashMap = donnerarrayList.get(position);

            String title_text = hashMap.get("title_text");
            String adress_text = hashMap.get("adress_text");
            String description_text = hashMap.get("description_text");

            String whatsp_call_btn = hashMap.get("whatsp_call_btn");
            String fb_page_url = hashMap.get("fb_page_url");
            String phone_number_text = hashMap.get("phone_number_text");


            int imageResourceId = 0; // Default value

            try {

                imageResourceId = Integer.parseInt(hashMap.get("imageView"));

            } catch (NumberFormatException e) {
                e.printStackTrace();
                // Handle invalid image resource ID here
            }

            holder.imageView.setImageResource(imageResourceId);

            holder.title_text.setText(title_text);
            holder.adress_text.setText(adress_text);
            holder.description_text.setText(description_text);
            holder.phone_number_text.setText(phone_number_text);


            //==============================================================================
            //==============================================================================
            holder.whatsp_call_btn.setOnClickListener(view -> {
                assert whatsp_call_btn != null;
                if (!whatsp_call_btn.isEmpty()) {

                    String url = "https://api.whatsapp.com/send?phone=" + whatsp_call_btn;
                    try {
                        PackageManager pm = getApplicationContext().getPackageManager();
                        pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                    } catch (PackageManager.NameNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    }

                } else {
                    Toast.makeText(Multiple_Details_03.this, "Whatsapp Number Not Available", Toast.LENGTH_SHORT).show();
                }
            });
            //==============================================================================
            //==============================================================================




            //==============================================================================
            //==============================================================================
            holder.fb_page_btn.setOnClickListener(view -> {
                assert fb_page_url != null;
                if (!fb_page_url.isEmpty()) {
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(fb_page_url));
                    startActivity(myIntent);
                } else {
                    Toast.makeText(Multiple_Details_03.this, "Facebook Page Link Not Available", Toast.LENGTH_SHORT).show();
                }
            });
            //==============================================================================
            //==============================================================================


            //==============================================================================
            //==============================================================================
            holder.call_dial_btn.setOnClickListener(view -> {
                assert phone_number_text != null;
                if (!phone_number_text.isEmpty()) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + phone_number_text));
                    startActivity(intent);
                } else {
                    Toast.makeText(Multiple_Details_03.this, "Number Not Available", Toast.LENGTH_SHORT).show();
                }
            });
            //==============================================================================
            //==============================================================================


        }


        @Override
        public int getItemCount() {
            return donnerarrayList.size();
        }

        private class DonnerViewHolder extends RecyclerView.ViewHolder {

            TextView title_text, adress_text, description_text, phone_number_text;
            ImageView imageView;

            CardView call_dial_btn, fb_page_btn, whatsp_call_btn;


            public DonnerViewHolder(@NonNull View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.imageView);

                title_text = itemView.findViewById(R.id.title_text);
                adress_text = itemView.findViewById(R.id.adress_text);
                description_text = itemView.findViewById(R.id.description_text);
                phone_number_text = itemView.findViewById(R.id.phone_number_text);

                whatsp_call_btn = itemView.findViewById(R.id.whatsp_call_btn);
                fb_page_btn = itemView.findViewById(R.id.fb_page_btn);
                call_dial_btn = itemView.findViewById(R.id.call_dial_btn);

            }


        }
    }


} //------------------Multiple_Details_03 Bundle Method End