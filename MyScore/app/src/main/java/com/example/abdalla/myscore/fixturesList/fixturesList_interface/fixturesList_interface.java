package com.example.abdalla.myscore.fixturesList.fixturesList_interface;

import com.example.abdalla.myscore.fixturesList.fixturesList_model.fixturesList_model;

import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface fixturesList_interface {

    public void fixturesListRecieved(ArrayList<fixturesList_model> fixturesListModels);

    public void fixturesListFailed(String messsage);
}
