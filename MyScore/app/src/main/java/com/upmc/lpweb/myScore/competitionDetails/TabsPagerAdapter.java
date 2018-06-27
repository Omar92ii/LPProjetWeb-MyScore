package com.upmc.lpweb.myScore.competitionDetails;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.upmc.lpweb.myScore.competitionDetails.Fragments.compFixtures.CompetitionFixturesFragment;
import com.upmc.lpweb.myScore.competitionDetails.Fragments.compTable.CompetitionTableFragment;
import com.upmc.lpweb.myScore.competitionDetails.Fragments.compTeam.CompetitionTeamFragment;

/**
 *  Réalisé par Redha & Omar. .
 */

public class TabsPagerAdapter extends FragmentStatePagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CompetitionFixturesFragment();
            case 1:
                return new CompetitionTableFragment();
            case 2:
                return new CompetitionTeamFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
