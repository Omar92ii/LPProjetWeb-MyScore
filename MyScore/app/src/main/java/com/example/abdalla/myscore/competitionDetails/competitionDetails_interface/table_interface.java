package com.example.abdalla.myscore.competitionDetails.competitionDetails_interface;


import com.example.abdalla.myscore.competitionDetails_model.table_model;
import java.util.ArrayList;

/**
 * Created by abdalla
 */

public interface table_interface {

    public void table_recieved(ArrayList<table_model> tableModels);

    public void table_failed(String message);
}
