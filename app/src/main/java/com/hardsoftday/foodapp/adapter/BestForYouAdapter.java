package com.hardsoftday.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.foodapp.R;
import com.hardsoftday.foodapp.model.BestForYou;

import java.util.List;

public class BestForYouAdapter extends RecyclerView.Adapter<BestForYouAdapter.BestForYouViewHolder> {

    Context context;
    List<BestForYou> bestForYouList;

    public BestForYouAdapter(Context context, List<BestForYou> bestForYouList) {
        this.context = context;
        this.bestForYouList = bestForYouList;
    }

    @NonNull
    @Override
    public BestForYouViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BestForYouViewHolder(LayoutInflater.from(context).inflate(R.layout.best_for_you_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BestForYouViewHolder holder, int position) {

        holder.itemImage.setImageResource(bestForYouList.get(position).getImageUrl());
        holder.itemName.setText(bestForYouList.get(position).getName());
        holder.itemTime.setText(bestForYouList.get(position).getTime());
        holder.itemPrice.setText(bestForYouList.get(position).getPrice());
        holder.itemRating.setRating(Float.parseFloat(bestForYouList.get(position).getRating()));
    }

    @Override
    public int getItemCount() {
        return bestForYouList.size();
    }


    public static final class BestForYouViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemPrice, itemTime, itemName;
        RatingBar itemRating;

        public BestForYouViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemPrice = itemView.findViewById(R.id.item_price);
            itemTime = itemView.findViewById(R.id.item_time);
            itemName = itemView.findViewById(R.id.item_name);
            itemRating = itemView.findViewById(R.id.ratingBar);

        }
    }

}
