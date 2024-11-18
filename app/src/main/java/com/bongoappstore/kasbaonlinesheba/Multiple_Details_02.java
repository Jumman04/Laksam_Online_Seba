package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
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

public class Multiple_Details_02 extends AppCompatActivity {

    RecyclerView recyclerView;

    TextView marqueebutton;

    public static ArrayList<HashMap<String, String>> donnerarrayList = new ArrayList<>();
    Multiple_Details_02.DonnerAdapter donnerAdapter = new Multiple_Details_02.DonnerAdapter(donnerarrayList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_multiple_details02);

        marqueebutton = findViewById(R.id.marqueeId);
        marqueebutton.setSelected(true);



        String title= getIntent().getStringExtra("title");
        String title2= getIntent().getStringExtra("title2");


        if (title == null){

            title = "";
        }

        if (title2 == null){

            title2 = "";
        }



        marqueebutton.setText(title2);


        // Set the title after setting the ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        //======================================


        recyclerView = findViewById(R.id.donnerRecyclerView);
        recyclerView.setAdapter(donnerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Multiple_Details_02.this));




    } //--------------------OnCreate Bundle Method End


    private class DonnerAdapter extends RecyclerView.Adapter<Multiple_Details_02.DonnerAdapter.DonnerViewHolder> {

        ArrayList<HashMap<String, String>> donnerarrayList;

        public DonnerAdapter(ArrayList<HashMap<String, String>> donnerarrayList) {

            this.donnerarrayList = donnerarrayList;

        }

        @NonNull
        @Override
        public Multiple_Details_02.DonnerAdapter.DonnerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.custom_item_02, parent, false);


            return new Multiple_Details_02.DonnerAdapter.DonnerViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull Multiple_Details_02.DonnerAdapter.DonnerViewHolder holder, int position) {

            HashMap<String, String> hashMap = donnerarrayList.get(position);
            String NAME = hashMap.get("name");
            String address_text = hashMap.get("address_text");
            String PHONE = hashMap.get("phone");


            int imageResourceId = 0; // Default value

            try {

                imageResourceId = Integer.parseInt(hashMap.get("imageView"));

            } catch (NumberFormatException e) {
                e.printStackTrace();
                // Handle invalid image resource ID here
            }


            holder.userName.setText(NAME);
            holder.address_text.setText(address_text);
            holder.userPhone.setText(PHONE);

            holder.imageView.setImageResource(imageResourceId);


            //==============================================================================
            //==============================================================================
            holder.userCALL.setOnClickListener(view -> {
                assert PHONE != null;
                if (!PHONE.isEmpty()) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + PHONE));
                    startActivity(intent);
                } else {
                    Toast.makeText(Multiple_Details_02.this, "Number Not Available", Toast.LENGTH_SHORT).show();
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

            TextView userName, address_text,  userPhone;
            // ImageView  imageView;
            CircleImageView imageView;

            LinearLayout userCALL;





            public DonnerViewHolder(@NonNull View itemView) {
                super(itemView);

                userName = itemView.findViewById(R.id.userName);
                address_text = itemView.findViewById(R.id.address_text);
                userPhone = itemView.findViewById(R.id.userPhone);

                userCALL = itemView.findViewById(R.id.userCALL);
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

} //--------------------Multiple_Details_02 Bundle Method End