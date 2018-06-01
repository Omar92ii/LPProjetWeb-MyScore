package com.example.abdalla.myscore.competitionDetails.competitionDetails_interface;

import com.example.abdalla.myscore.competitionDetails.competitionDetails_model.team_model;

import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface team_interface {

    public void teamListRecieved(ArrayList<team_model> teamModels);

    public void teamListFailed(String message);

}
