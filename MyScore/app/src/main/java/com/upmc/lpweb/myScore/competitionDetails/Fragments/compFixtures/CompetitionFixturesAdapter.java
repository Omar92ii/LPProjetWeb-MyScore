package com.upmc.lpweb.myScore.competitionDetails.Fragments.compFixtures;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.upmc.lpweb.myScore.R;
import com.upmc.lpweb.myScore.competitionDetails.competitionDetails_model.fixtures_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public class CompetitionFixturesAdapter extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<fixtures_model> fixturesModels;

    public CompetitionFixturesAdapter(Context context, ArrayList<fixtures_model> fixturesModels){
        this.context = context;
        this.fixturesModels = fixturesModels;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.comp_fixtures_item,parent,false);
        return new ViewHolder(context,view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindFixtures(fixturesModels.get(position));
    }

    @Override
    public int getItemCount() {
        return fixturesModels.size();
    }
}
