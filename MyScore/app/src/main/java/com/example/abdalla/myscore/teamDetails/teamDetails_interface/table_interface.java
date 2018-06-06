package com.example.abdalla.myscore.teamDetails.teamDetails_interface;

import com.example.abdalla.myscore.teamDetails.teamDetails_model.table_model;

import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface table_interface {

    public void tableRecieved(ArrayList<table_model> tableModels);

    public void tableFailed(String message);
}
