package com.itsmaleeq.scorekeeperamericanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreRedTeam = 0;
    int scoreYellowTeam =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//Red buttons methods

    //A display score for Red team
    public void displayRedScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }
    public void teamRedAddSix(View v) {
        scoreRedTeam = scoreRedTeam +6;
        displayRedScore(scoreRedTeam);
    }
    public void teamRedAddTwo(View view) {
        scoreRedTeam = +2;
        displayRedScore(scoreRedTeam);
    }
    public void teamRedAddOne(View view) {
        scoreRedTeam =+ 1;
        displayRedScore(scoreRedTeam);
    }
    public void teamRedAddFg(View view) {
        scoreRedTeam =+ 3;
        displayRedScore(scoreRedTeam);
    }
    public void teamRedAddSg(View view) {
        scoreRedTeam =+ 2;
        displayRedScore(scoreRedTeam);

    }


    //Yellow Buttons

    //A display score for yellow team
    public void displayYellowScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_score);
        scoreView.setText(String.valueOf(score));
    }
    // adds 6points to team yellow.
    public void teamYellowAddSix(View view) {
        scoreYellowTeam = scoreYellowTeam +6;
        displayYellowScore(scoreYellowTeam);
    }
    public void teamYellowAddTwo(View view) {
        scoreYellowTeam = scoreYellowTeam +2;
        displayYellowScore(scoreYellowTeam);
    }
    public void teamYellowAddOne(View view) {
        scoreYellowTeam = scoreYellowTeam +1;
        displayYellowScore(scoreYellowTeam);
    }
    public void teamYellowAddFg(View view) {
        scoreYellowTeam = scoreYellowTeam +3;
        displayYellowScore(scoreYellowTeam);
    }
    public void teamYellowAddSg(View view) {
        scoreYellowTeam = scoreYellowTeam +2;
        displayYellowScore(scoreYellowTeam);
    }

    public void ResetAllScore(View v) {
        scoreRedTeam =0;
        scoreYellowTeam = 0;
         displayYellowScore(scoreYellowTeam);
        displayRedScore(scoreRedTeam);
    }



}
