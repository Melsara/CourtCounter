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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void addThreePoints (View view) {
        scoreA = scoreA + POINTS_FOR_THREE_POINTS_SHOT;
        displayForTeamA(scoreA);
    }

    public void addTwoPoints (View view) {
        scoreA = scoreA + POINTS_FOR_TWO_POINTS_SHOT;
        displayForTeamA(scoreA);
    }

    public void addFreeThrow (View view) {
        scoreA = scoreA + POINTS_FOR_FREE_THROW;
        displayForTeamA(scoreA);
    }

}
