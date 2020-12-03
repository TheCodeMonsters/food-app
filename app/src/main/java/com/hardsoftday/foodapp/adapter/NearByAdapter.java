package com.hardsoftday.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hardsoftday.foodapp.R;
import com.hardsoftday.foodapp.model.NearBy;

import java.util.List;

public class NearByAdapter extends RecyclerView.Adapter<NearByAdapter.NearByViewHolder> {

    Context context;
    List<NearBy> nearByList;

    public NearByAdapter(Context context, List<NearBy> nearByList) {
        this.context = context;
        this.nearByList = nearByList;
    }


    @NonNull
    @Override
    public NearByAdapter.NearByViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NearByViewHolder(LayoutInflater.from(context).inflate(R.layout.near_by_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NearByAdapter.NearByViewHolder holder, int position) {
        holder.itemImage.setImageResource(nearByList.get(position).getImageUrl());
        holder.itemName.setText(nearByList.get(position).getName());
        holder.itemTime.setText(nearByList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return nearByList.size();
    }

    public static final class NearByViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemTime, itemName;

        public NearByViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemTime = itemView.findViewById(R.id.item_time);
            itemName = itemView.findViewById(R.id.item_name);

        }
    }
}
