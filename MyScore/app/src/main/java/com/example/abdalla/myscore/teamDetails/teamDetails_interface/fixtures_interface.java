package com.example.abdalla.myscore.teamDetails.teamDetails_interface;

import com.example.abdalla.myscore.teamDetails.teamDetails_model.fixtures_model;

import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface fixtures_interface {

    public void fixturesRecieved(ArrayList<fixtures_model> fixturesModels);

    public void fixturesFailed(String message);
}
