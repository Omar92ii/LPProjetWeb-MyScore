package com.upmc.lpweb.myScore.teamDetails.Fragments.table_fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.upmc.lpweb.myScore.R;
import com.upmc.lpweb.myScore.teamDetails.teamDetails_model.table_model;

import java.util.ArrayList;

/**
 * Omar Abdalla - Redha AISSAOUI
 */

public class tableListAdapter extends RecyclerView.Adapter<ViewHolder>{

    Context context;
    ArrayList<table_model> tableModels;

    public tableListAdapter(Context context, ArrayList<table_model> tableModels){
        this.context = context;
        this.tableModels = tableModels;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemCount() {
        return tableModels.size();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.table_item, parent, false);

        return new ViewHolder(context,view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        table_model tableModel = tableModels.get(position);
        holder.bindTable(tableModel);

    }

}
