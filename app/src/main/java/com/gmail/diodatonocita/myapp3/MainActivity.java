package com.gmail.diodatonocita.myapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int ScoreA=0;
    int ScoreB=0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void AOne(View view) {
        ScoreA+=1;
        displayForTeamA(ScoreA);
    }
    public void ATwo(View view) {
        ScoreA+=2;
        displayForTeamA(ScoreA);
    }
    public void AThree(View view) {
        ScoreA+=3;
        displayForTeamA(ScoreA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void BOne(View view) {
        ScoreB+=1;
        displayForTeamB(ScoreB);
    }
    public void BTwo(View view) {
        ScoreB+=2;
        displayForTeamB(ScoreB);
    }
    public void BThree(View view) {
        ScoreB+=3;
        displayForTeamB(ScoreB);
    }

    public void Reset(View view) {
        ScoreA=0;
        ScoreB=0;
        displayForTeamA(ScoreA);
        displayForTeamB(ScoreB);
    }


}
