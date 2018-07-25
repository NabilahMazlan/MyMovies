package com.example.a17010304.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class main_desc extends AppCompatActivity {
    TextView tvTitle, tvRating, tvDesc;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_desc);

        tvDesc = findViewById(R.id.textViewDesc);
        tvRating = findViewById(R.id.textViewRating);
        tvTitle = findViewById(R.id.textViewTitle);
        img = findViewById(R.id.imageViewRatings);

        Intent received = getIntent();
        String title = received.getStringExtra("title");
        String desc = received.getStringExtra("desc");
        String rating = received.getStringExtra("rating");
        String pg = received.getStringExtra("pg");

        tvTitle.setText(title);
        tvRating.setText(rating);
        tvDesc.setText(desc);

        if (pg.equalsIgnoreCase("pg") ){
            img.setImageResource(R.drawable.rating_pg);
        }else if (pg.equalsIgnoreCase("g")){
            img.setImageResource(R.drawable.rating_g);
        }else if (pg.equalsIgnoreCase("m18")) {
            img.setImageResource(R.drawable.rating_m18);
        }else if (pg.equalsIgnoreCase("nc16")) {
            img.setImageResource(R.drawable.rating_nc16);
        }else if (pg.equalsIgnoreCase("pg13")) {
            img.setImageResource(R.drawable.rating_pg13);
        }else if (pg.equalsIgnoreCase("r21")) {
            img.setImageResource(R.drawable.rating_r21);
        }




    }
}
