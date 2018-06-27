package com.upmc.lpweb.myScore.fixturesList.fixturesList_interface;

import com.upmc.lpweb.myScore.fixturesList.fixturesList_model.fixturesList_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public interface fixturesList_interface {

    public void fixturesListRecieved(ArrayList<fixturesList_model> fixturesListModels);

    public void fixturesListFailed(String messsage);
}
