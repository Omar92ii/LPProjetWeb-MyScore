package com.upmc.lpweb.myScore.teamDetails.teamDetails_interface;

import com.upmc.lpweb.myScore.teamDetails.teamDetails_model.table_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public interface table_interface {

    public void tableRecieved(ArrayList<table_model> tableModels);

    public void tableFailed(String message);
}
