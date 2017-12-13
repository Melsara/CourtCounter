package com.sardegnaisoladicavalli.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_FOR_THREE_POINTS_SHOT = 3;
    final int POINTS_FOR_TWO_POINTS_SHOT = 2;
    final int POINTS_FOR_FREE_THROW = 1;
    int scoreA = 0;
    int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * Add the points for Team A.
     */

    public void addThreePointsA (View view) {
        scoreA = scoreA + POINTS_FOR_THREE_POINTS_SHOT;
        displayForTeamA(scoreA);
    }

    public void addTwoPointsA (View view) {
        scoreA = scoreA + POINTS_FOR_TWO_POINTS_SHOT;
        displayForTeamA(scoreA);
    }

    public void addFreeThrowA (View view) {
        scoreA = scoreA + POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreA);
    }

    /**
     * Add the points for Team B.
     */

    public void addThreePointsB (View view) {
        scoreB = scoreB + POINTS_FOR_THREE_POINTS_SHOT;
        displayForTeamB(scoreB);
    }

    public void addTwoPointsB (View view) {
        scoreB = scoreB + POINTS_FOR_TWO_POINTS_SHOT;
        displayForTeamB(scoreB);
    }

    public void addFreeThrowB (View view) {
        scoreB = scoreB + POINTS_FOR_FREE_THROW;
        displayForTeamB(scoreB);
    }

    /**
     * Reset the points for both teams.
     */

    public void resetAll (View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
