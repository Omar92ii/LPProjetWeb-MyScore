package com.upmc.lpweb.myScore.teamDetails.teamDetails_interface;

import com.upmc.lpweb.myScore.teamDetails.teamDetails_model.fixtures_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar .
 */

public interface fixtures_interface {

    public void fixturesRecieved(ArrayList<fixtures_model> fixturesModels);

    public void fixturesFailed(String message);
}
