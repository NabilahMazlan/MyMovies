package com.example.a17010304.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<RatingItem> ratingList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<RatingItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        ratingList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvRating = rowView.findViewById(R.id.textViewDesc);
        ImageView ivRating = rowView.findViewById(R.id.imageViewRatings);
        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        RatingItem currentItem = ratingList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvRating.setText(currentItem.getRating());
        if (currentItem.getPg().equalsIgnoreCase("pg") ){
            ivRating.setImageResource(R.drawable.rating_pg);
        }else if (currentItem.getPg().equalsIgnoreCase("g")){
            ivRating.setImageResource(R.drawable.rating_g);
        }else if (currentItem.getPg().equalsIgnoreCase("m18")) {
            ivRating.setImageResource(R.drawable.rating_m18);
        }else if (currentItem.getPg().equalsIgnoreCase("nc16")) {
            ivRating.setImageResource(R.drawable.rating_nc16);
        }else if (currentItem.getPg().equalsIgnoreCase("pg13")) {
            ivRating.setImageResource(R.drawable.rating_pg13);
        }else if (currentItem.getPg().equalsIgnoreCase("r21")) {
            ivRating.setImageResource(R.drawable.rating_r21);
        }


        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
