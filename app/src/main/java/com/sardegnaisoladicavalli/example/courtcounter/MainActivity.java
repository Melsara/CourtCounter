package com.sardegnaisoladicavalli.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
        scoreA = scoreA +3;
        displayForTeamA(scoreA);
    }

    public void addTwoPoints (View view) {
        scoreA = scoreA +2;
        displayForTeamA(scoreA);
    }

    public void addFreeThrow (View view) {
        scoreA = scoreA +1;
        displayForTeamA(scoreA);
    }

}
