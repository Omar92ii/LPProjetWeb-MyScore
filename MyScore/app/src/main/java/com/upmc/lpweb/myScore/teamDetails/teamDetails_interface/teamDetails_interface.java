package com.upmc.lpweb.myScore.teamDetails.teamDetails_interface;

import com.upmc.lpweb.myScore.teamDetails.teamDetails_model.teamDetails_model;

/**
 * Réalisé par Redha & Omar .
 */

public interface teamDetails_interface {

    public void teamDetailsSuccessful(teamDetails_model teamDetailsModel);

    public void teamDetailsFailed(String message);
}
