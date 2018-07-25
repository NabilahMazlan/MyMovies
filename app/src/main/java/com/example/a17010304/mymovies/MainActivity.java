package com.example.a17010304.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvRating;
    ArrayList<RatingItem> alRating;
    CustomAdapter caToDo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvRating = findViewById(R.id.listViewMovies);

        alRating = new ArrayList<>();
        RatingItem item1 = new RatingItem("The Avengers", "2012 - Action | Sci-Fi","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army. " +
                "\nWatch on: 15/12/2014 \nIn Theatre:Golden Village - Bishan","pg13");
        RatingItem item2 = new RatingItem("Planes", "2013 - Animation | Comedy", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race." +
                "\nWatch on: 12/11/2014 \nIn Theatre: Cathay - AMK Hub", "pg");
        alRating.add(item1);
        alRating.add(item2);

        caToDo = new CustomAdapter(this, R.layout.movie_list, alRating );

        lvRating.setAdapter(caToDo);
        lvRating.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent((getBaseContext()), main_desc.class);
                RatingItem currentItem = alRating.get(i);
                intent.putExtra("title", currentItem.getTitle());
                intent.putExtra("desc", currentItem.getDesc());
                intent.putExtra("rating", currentItem.getRating());
                intent.putExtra("pg", currentItem.getPg());
                startActivity(intent);
            }
        });


    }
}
