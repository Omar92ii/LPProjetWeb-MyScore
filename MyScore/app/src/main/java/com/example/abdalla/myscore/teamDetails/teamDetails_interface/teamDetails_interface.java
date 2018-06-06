package com.example.abdalla.myscore.teamDetails.teamDetails_interface;

import com.example.abdalla.myscore.teamDetails.teamDetails_model.teamDetails_model;

/**
 * Created by abdalla
 */

public interface teamDetails_interface {

    public void teamDetailsSuccessful(teamDetails_model teamDetailsModel);

    public void teamDetailsFailed(String message);
}
