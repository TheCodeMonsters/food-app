package com.hardsoftday.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hardsoftday.foodapp.adapter.BestForYouAdapter;
import com.hardsoftday.foodapp.adapter.NearByAdapter;
import com.hardsoftday.foodapp.model.BestForYou;
import com.hardsoftday.foodapp.model.NearBy;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView bestForYouRecycler, nearByRecycler;
    BestForYouAdapter bestForYouAdapter;
    NearByAdapter nearByAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<BestForYou> bestForYouList = new ArrayList<>();
        bestForYouList.add(new BestForYou("Pasta", "3.5", "25 min", "$18", R.drawable.bestforyou1));
        bestForYouList.add(new BestForYou("Birvani", "4.5", "40 min", "$25", R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou("Singapore Rice", "5.0", "50 min", "$50", R.drawable.bestforyou3));
        bestForYouList.add(new BestForYou("Pescado Frito", "4.9", "30 min", "$40", R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou("Rondon", "4.5", "45 min", "$45", R.drawable.bestforyou1));
        bestForYouList.add(new BestForYou("Pasta", "3.5", "25 min", "$18", R.drawable.bestforyou1));
        bestForYouList.add(new BestForYou("Birvani", "4.5", "40 min", "$25", R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou("Singapore Rice", "5.0", "50 min", "$50", R.drawable.bestforyou3));
        bestForYouList.add(new BestForYou("Pescado Frito", "4.9", "30 min", "$40", R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou("Rondon", "4.5", "45 min", "$45", R.drawable.bestforyou1));

        setBestForYouRecycler(bestForYouList);

        List<NearBy> nearByList = new ArrayList<>();
        nearByList.add(new NearBy("Sagar Ratna", R.drawable.nearby, "35 min"));
        nearByList.add(new NearBy("Haldi Ram", R.drawable.nearby, "45 min"));
        nearByList.add(new NearBy("KFC", R.drawable.nearby, "55 min"));

        setNearByRecycler(nearByList);

    }

    private void setBestForYouRecycler(List<BestForYou> bestForYouList) {

        bestForYouRecycler = findViewById(R.id.best_for_you_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        bestForYouRecycler.setLayoutManager(layoutManager);
        bestForYouAdapter = new BestForYouAdapter(this, bestForYouList);
        bestForYouRecycler.setAdapter(bestForYouAdapter);

    }

    private void setNearByRecycler(List<NearBy> nearByList) {
        nearByRecycler = findViewById(R.id.near_by_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        nearByRecycler.setLayoutManager(layoutManager);
        nearByAdapter = new NearByAdapter(this, nearByList);
        nearByRecycler.setAdapter(nearByAdapter);
    }
}