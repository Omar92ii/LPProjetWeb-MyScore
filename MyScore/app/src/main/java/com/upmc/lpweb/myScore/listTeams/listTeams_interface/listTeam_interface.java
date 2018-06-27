package com.upmc.lpweb.myScore.listTeams.listTeams_interface;

import com.upmc.lpweb.myScore.listTeams.listTeams_model.listTeams_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public interface listTeam_interface {

    public void teamListRecieved(ArrayList<listTeams_model> listTeamsModels);

    public void teamListFailed(String message);
}
