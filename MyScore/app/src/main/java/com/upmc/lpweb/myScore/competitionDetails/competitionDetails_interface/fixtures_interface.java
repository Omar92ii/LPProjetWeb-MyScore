package com.upmc.lpweb.myScore.competitionDetails.competitionDetails_interface;

import com.upmc.lpweb.myScore.competitionDetails.competitionDetails_model.fixtures_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public interface fixtures_interface {

    public void fixtures_list_recieved(ArrayList<fixtures_model> fixturesModels);

    public void fixtures_list_failed(String message);
}
