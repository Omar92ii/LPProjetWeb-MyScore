package com.example.abdalla.myscore.teamDetails.teamDetails_interface;

import com.example.abdalla.myscore.teamDetails.teamDetails_model.players_model;

import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface players_interface {

    public void playersListRecieved(ArrayList<players_model> playersModels);

    public void playersListFailed(String message);
}
