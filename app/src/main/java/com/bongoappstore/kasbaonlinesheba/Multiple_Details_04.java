package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Multiple_Details_04 extends AppCompatActivity {


    RecyclerView recyclerView;


    public static ArrayList<HashMap<String, String>> donnerarrayList = new ArrayList<>();
    Multiple_Details_04.DonnerAdapter donnerAdapter = new Multiple_Details_04.DonnerAdapter(donnerarrayList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_multiple_details04);

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


        recyclerView = findViewById(R.id.donnerRecyclerView);
        recyclerView.setAdapter(donnerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Multiple_Details_04.this));


    } //--------------------OnCreate Bundle Method End


    private class DonnerAdapter extends RecyclerView.Adapter<Multiple_Details_04.DonnerAdapter.DonnerViewHolder> {

        ArrayList<HashMap<String, String>> donnerarrayList;

        public DonnerAdapter(ArrayList<HashMap<String, String>> donnerarrayList) {

            this.donnerarrayList = donnerarrayList;

        }

        @NonNull
        @Override
        public Multiple_Details_04.DonnerAdapter.DonnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.custom_item_04, parent, false);


            return new Multiple_Details_04.DonnerAdapter.DonnerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Multiple_Details_04.DonnerAdapter.DonnerViewHolder holder, int position) {

            HashMap<String, String> hashMap = donnerarrayList.get(position);
            String donar_name = hashMap.get("donar_name");
            String address_text = hashMap.get("address_text");
            String last_date_text = hashMap.get("last_date_text");
            String donar_phone = hashMap.get("donar_phone");


            int imageResourceId = 0; // Default value

            try {

                imageResourceId = Integer.parseInt(hashMap.get("imageView"));

            } catch (NumberFormatException e) {
                e.printStackTrace();
                // Handle invalid image resource ID here
            }


            holder.donar_name.setText(donar_name);
            holder.address_text.setText(address_text);
            holder.last_date_text.setText(last_date_text);

            holder.donar_phone.setText(donar_phone);

            holder.imageView.setImageResource(imageResourceId);


            //==============================================================================
            //==============================================================================
            holder.donar_call.setOnClickListener(view -> {
                assert donar_phone != null;
                if (!donar_phone.isEmpty()) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + donar_phone));
                    startActivity(intent);
                } else {
                    Toast.makeText(Multiple_Details_04.this, "Number Not Available", Toast.LENGTH_SHORT).show();
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

            TextView donar_name, address_text, last_date_text, donar_phone;
            CircleImageView imageView;
            LinearLayout donar_call;

            public DonnerViewHolder(@NonNull View itemView) {
                super(itemView);

                donar_name = itemView.findViewById(R.id.donar_name);
                address_text = itemView.findViewById(R.id.address_text);
                last_date_text = itemView.findViewById(R.id.last_date_text);
                donar_phone = itemView.findViewById(R.id.donar_phone);

                donar_call = itemView.findViewById(R.id.donar_call);
                imageView = itemView.findViewById(R.id.imageView);


            }
        }
    }


    //====================================================================
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    //======================================================================

} //--------------------Multiple_Details_04 Bundle Method End