package com.example.abdalla.myscore.competitionDetails.competitionDetails_interface;

import com.example.abdalla.myscore.competitionDetails_model.fixtures_model;
import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface fixtures_interface {

    public void fixtures_list_recieved(ArrayList<fixtures_model> fixturesModels);

    public void fixtures_list_failed(String message);
}
