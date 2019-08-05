package com.example.homework341;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder>{

    private ArrayList<String> data;

    private int  holderCount = 0;

    public MainAdapter() {
        data = new ArrayList<>();
        for (int i = 0; i < 1000; i+=2) {
            data.add("Element " + i);
        }
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        holderCount++;
        Log.d("ololo", "Count: " + holderCount);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.viewholder_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
