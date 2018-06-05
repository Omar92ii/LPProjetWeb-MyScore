package com.example.abdalla.myscore.listTeams.listTeams_interface;

import com.example.abdalla.myscore.listTeams.listTeams_model.listTeams_model;

import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface listTeam_interface {

    public void teamListRecieved(ArrayList<listTeams_model> listTeamsModels);

    public void teamListFailed(String message);
}
