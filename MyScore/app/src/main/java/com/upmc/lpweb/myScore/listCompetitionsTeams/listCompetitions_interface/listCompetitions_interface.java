package com.upmc.lpweb.myScore.listCompetitionsTeams.listCompetitions_interface;

import com.upmc.lpweb.myScore.listCompetitionsTeams.listCompetitions_model.listCompetitions_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public interface listCompetitions_interface {

    public void competitionListRecieved(ArrayList<listCompetitions_model> listCompetionsModels);

    public void competitionListFailed(String message);
}
