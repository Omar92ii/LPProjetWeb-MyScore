package com.example.abdalla.myscore.listCompetitionsTeams.listCompetitions_interface;

import com.example.abdalla.myscore.listCompetitionsTeams.listCompetitions_model.listCompetitions_model;

import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface listCompetitions_interface {

    public void competitionListRecieved(ArrayList<listCompetitions_model> listCompetionsModels);

    public void competitionListFailed(String message);
}