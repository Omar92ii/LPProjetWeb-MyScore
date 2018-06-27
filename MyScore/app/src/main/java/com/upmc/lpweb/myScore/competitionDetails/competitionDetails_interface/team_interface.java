package com.upmc.lpweb.myScore.competitionDetails.competitionDetails_interface;

import com.upmc.lpweb.myScore.competitionDetails.competitionDetails_model.team_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public interface team_interface {

    public void teamListRecieved(ArrayList<team_model> teamModels);

    public void teamListFailed(String message);

}
