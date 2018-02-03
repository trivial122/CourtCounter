package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
int cricketTeamA = 0;
int cricketTeamB = 0;
int oversAll = 0;
int playOvers = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Add 6 Team A**/
    public void addSixForTeamA (View v){
        if (oversAll < playOvers){
            cricketTeamA += 6;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(cricketTeamA);
    }
    /** Add 4 Team A**/
    public void addFourForTeamA (View v){
        if (oversAll < playOvers){
            cricketTeamA += 4;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(cricketTeamA);
    }

    /** Add 3 Team A**/
    public void addThreeForTeamA (View v){
        if (oversAll < playOvers){
            cricketTeamA += 3;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(cricketTeamA);
    }

    /**Add 2 Team A**/
    public void addTwoForTeamA (View v){
        if (oversAll < playOvers){
            cricketTeamA += 2;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(cricketTeamA);
    }

    /**Add 1 Team A**/
    public void addOneForTeamA (View v){
        if (oversAll < playOvers){
            cricketTeamA += 1;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamA(cricketTeamA);
    }

    /** Add 6 Team A**/
    public void addSixForTeamB (View v){
        if (oversAll < playOvers){
            cricketTeamB += 6;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(cricketTeamB);
    }

    /** Add 4 Team A**/
    public void addFourForTeamB (View v){
        if (oversAll < playOvers){
            cricketTeamB += 4;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(cricketTeamB);
    }

    /** Add 3 Team A**/
    public void addThreeForTeamB (View v){
        if (oversAll < playOvers){
            cricketTeamB += 3;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(cricketTeamB);
    }

    /**Add 2 Team A**/
    public void addTwoForTeamB (View v){
        if (oversAll < playOvers){
        cricketTeamB += 2;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(cricketTeamB);
    }

    /**Add 1 Team A**/
    public void addOneForTeamB (View v){
        if (oversAll < playOvers){
        cricketTeamB += 1;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForTeamB(cricketTeamB);
    }

    /** Add Overs**/
    public void addOneOver (View v) {
        if (oversAll < playOvers){
            oversAll += 1;
        }else{
            Toast.makeText(this, getString(R.string.game_over), Toast.LENGTH_SHORT).show();
        }
        displayForOvers(oversAll);
    }

    /**Reset score amd overs**/
    public void resetScore (View v){
        cricketTeamA = 0;
        cricketTeamB = 0;
        oversAll = 0;
        displayForTeamA(cricketTeamA);
        displayForTeamB(cricketTeamB);
        displayForOvers(oversAll);

    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the Overs
     */
    public void displayForOvers(int overs){
        TextView oversView = (TextView) findViewById(R.id.count_overs);
        oversView.setText(String.valueOf(overs));
    }
}
