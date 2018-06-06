package com.example.abdalla.myscore.SplashScreen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.abdalla.myscore.R;
import com.example.abdalla.myscore.fixturesList.fixturesList;
import com.example.abdalla.myscore.noConnection.noConnection;
import com.example.abdalla.myscore.utils.utils;

public class SplashScreen extends AppCompatActivity {

    Context context = this;
    static public Boolean loadImages  = true;
    public static SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_splash_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                loadImages = sharedPreferences.getBoolean("loadImages", true);
                if (utils.isNetworkAvailable(context)) {
                    Intent intent = new Intent(context, fixturesList.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                } else {
                    Intent intent = new Intent(context, noConnection.class);
                    intent.putExtra("caller",fixturesList.class.getName().toString());
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }
            }
        }, 2000);
    }
}
