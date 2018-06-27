package com.upmc.lpweb.myScore.competitionDetails.Fragments.compTable;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.upmc.lpweb.myScore.R;
import com.upmc.lpweb.myScore.competitionDetails.CompetitionDetails;
import com.upmc.lpweb.myScore.competitionDetails.competitionDetails_interface.table_interface;
import com.upmc.lpweb.myScore.competitionDetails.competitionDetails_model.table_model;
import com.upmc.lpweb.myScore.competitionDetails.competitionDetails_parser.table_parser;

import java.util.ArrayList;

/**
 *  Réalisé par Redha & Omar. .
 */

public class CompetitionTableFragment extends Fragment implements table_interface {

    Context context;
    RecyclerView rv;
    LinearLayoutManager linearLayoutManager;
    public static CompetitionTableFragment instance;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        context= getActivity().getApplicationContext();
        View view = inflater.inflate(R.layout.comp_table_fragment,container,false);
        instance = this;
        rv=(RecyclerView) view.findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(linearLayoutManager);

        table_parser parser = new table_parser(context, CompetitionDetails.compId);
        parser.execute();
        return view;
    }

    public static CompetitionTableFragment getInstance(){
        return instance;
    }

    @Override
    public void table_recieved(ArrayList<table_model> tableModels) {
        rv.setAdapter(new CompetitionTableAdapter(context,tableModels));
    }

    @Override
    public void table_failed(String message) {
        Snackbar.make(getActivity().findViewById(android.R.id.content),message,Snackbar.LENGTH_LONG).show();
    }
}
