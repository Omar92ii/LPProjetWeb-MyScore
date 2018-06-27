package com.upmc.lpweb.myScore.teamDetails.teamDetails_interface;

import com.upmc.lpweb.myScore.teamDetails.teamDetails_model.players_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar  .
 */

public interface players_interface {

    public void playersListRecieved(ArrayList<players_model> playersModels);

    public void playersListFailed(String message);
}
