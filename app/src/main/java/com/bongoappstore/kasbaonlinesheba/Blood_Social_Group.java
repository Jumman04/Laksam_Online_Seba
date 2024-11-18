package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Blood_Social_Group extends AppCompatActivity {

    LinearLayout blood_social_group_01, blood_social_group_02, blood_social_group_03, blood_social_group_04,
            blood_social_group_05, blood_social_group_06, blood_social_group_07, blood_social_group_08,
            blood_social_group_09, blood_social_group_10, blood_social_group_11, blood_social_group_12,
            blood_social_group_13, blood_social_group_14;

    TextView marqueebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_blood_social_group);


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

        marqueebutton = findViewById(R.id.marqueeId);
        marqueebutton.setSelected(true);


        blood_social_group_01 = findViewById(R.id.blood_social_group_01);
        blood_social_group_02 = findViewById(R.id.blood_social_group_02);
        blood_social_group_03 = findViewById(R.id.blood_social_group_03);
        blood_social_group_04 = findViewById(R.id.blood_social_group_04);
        blood_social_group_05 = findViewById(R.id.blood_social_group_05);
        blood_social_group_06 = findViewById(R.id.blood_social_group_06);
        blood_social_group_07 = findViewById(R.id.blood_social_group_07);
        blood_social_group_08 = findViewById(R.id.blood_social_group_08);
        blood_social_group_09 = findViewById(R.id.blood_social_group_09);
        blood_social_group_10 = findViewById(R.id.blood_social_group_10);
        blood_social_group_11 = findViewById(R.id.blood_social_group_11);
        blood_social_group_12 = findViewById(R.id.blood_social_group_12);
        blood_social_group_13 = findViewById(R.id.blood_social_group_13);
        blood_social_group_14 = findViewById(R.id.blood_social_group_14);




        blood_social_group_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/922137548706371"));
                startActivity(myIntent);
            }
        });


        blood_social_group_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/325787504916324/?ref=share_group_link"));
                startActivity(myIntent);
            }
        });


        blood_social_group_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/769005653291776"));
                startActivity(myIntent);
            }
        });

        blood_social_group_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/Bloodforkasbaimampara"));
                startActivity(myIntent);
            }
        });

        blood_social_group_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Nbbankofficial"));
                startActivity(myIntent);
            }
        });

        blood_social_group_06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/393505441793204/"));
                startActivity(myIntent);
            }
        });

        blood_social_group_07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/24699404359644930"));
                startActivity(myIntent);
            }
        });

        blood_social_group_08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/1744303495721749/?ref=share&mibextid=K8Wfd2"));
                startActivity(myIntent);
            }
        });


        blood_social_group_09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/303462426911001/?mibextid=A7sQZp"));
                startActivity(myIntent);
            }
        });


        blood_social_group_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/share/W9H56RAbjXSQm6os/?mibextid=A7sQZp"));
                startActivity(myIntent);

            }
        });





        blood_social_group_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/496396332542695"));
                startActivity(myIntent);
            }
        });


        blood_social_group_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/share/2VoTx6jbTpjfcaZH/?mibextid=A7sQZp"));
                startActivity(myIntent);
            }
        });


        blood_social_group_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/groups/1840466499589381/?ref=share&mibextid=NSMWBT"));
                startActivity(myIntent);
            }
        });


        blood_social_group_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/share/S4dd5p1xJ7g52BD9/?mibextid=A7sQZp"));
                startActivity(myIntent);
            }
        });


    } //-----------------------OnCreate Bundle Method End

    //====================================================================
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    //======================================================================



} //-----------------------Blood Social Group Method End