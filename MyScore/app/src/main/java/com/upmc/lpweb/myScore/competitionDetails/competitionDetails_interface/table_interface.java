package com.upmc.lpweb.myScore.competitionDetails.competitionDetails_interface;

import com.upmc.lpweb.myScore.competitionDetails.competitionDetails_model.table_model;

import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public interface table_interface {

    public void table_recieved(ArrayList<table_model> tableModels);

    public void table_failed(String message);
}
