package com.upmc.lpweb.myScore.listCompetitionsTeams.listCompetitions_parser;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.upmc.lpweb.myScore.listCompetitionsTeams.listCompetitionsTeams;
import com.upmc.lpweb.myScore.listCompetitionsTeams.listCompetitions_model.listCompetitions_model;
import com.upmc.lpweb.myScore.noConnection.noConnection;
import com.upmc.lpweb.myScore.utils.API_constants;
import com.upmc.lpweb.myScore.utils.utils;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

/**
 * Réalisé par Redha & Omar.
 */

public class listCompetitions_parser extends AsyncTask<String, Integer, ArrayList<listCompetitions_model>> {

    Context context;
    ArrayList<listCompetitions_model> listCompetitionsModels = new ArrayList<>();
    String errorMessage;

    public listCompetitions_parser(Context context){
        this.context = context;
    }

    @Override
    protected ArrayList<listCompetitions_model> doInBackground(String... strings) {

        Boolean connected = utils.isNetworkAvailable(context);
        if (!connected) {
            Intent intent = new Intent(context, noConnection.class);
            intent.putExtra("caller", listCompetitionsTeams.class.getName().toString());
            context.startActivity(intent);
        }else{
            try {
                OkHttpClient client = utils.getOkHttpClient();
                String url = API_constants.baseURL + API_constants.API_competion_list;
                Response response = utils.getRequest(client, url);
                String responseJSON = response.body().string();
                int responseCode = response.code();

                JSONArray jsonArray = new JSONArray(responseJSON);
                if (responseCode == 200) {
                     listCompetitionsModels = new ArrayList<listCompetitions_model>();
                    for (int i=0;i<jsonArray.length();i++){
                        JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                        listCompetitions_model listCompetitionsModel = new listCompetitions_model();
                        listCompetitionsModel.setId(jsonObject.getString("id"));
                        listCompetitionsModel.setCaption(jsonObject.getString("caption"));
                        listCompetitionsModel.setLeague(jsonObject.getString("league"));
                        listCompetitionsModels.add(listCompetitionsModel);
                    }
                } else {
                    JSONObject jsonObject = new JSONObject(responseJSON);
                    errorMessage = jsonObject.getString("Message");
                }
            }
            catch (SocketTimeoutException e) {
                errorMessage = "Failed to connect to the server";
            }
            catch (IOException e) {
                Intent intent = new Intent(context, noConnection.class);
                intent.putExtra("caller", listCompetitionsTeams.class.getName().toString());
                context.startActivity(intent);
            } catch (JSONException e) {
                errorMessage = "Invalid data";
            } catch (Exception e){
                errorMessage = e.getMessage();
            }
        }
        return listCompetitionsModels;
    }

    @Override
    protected void onPostExecute(ArrayList<listCompetitions_model> listCompetitions_models) {
        super.onPostExecute(listCompetitions_models);
        if(!listCompetitions_models.isEmpty()){
            listCompetitionsTeams.getInstance().competitionListRecieved(listCompetitions_models);
        }else{
            listCompetitionsTeams.getInstance().competitionListFailed(errorMessage);
        }
    }
}
