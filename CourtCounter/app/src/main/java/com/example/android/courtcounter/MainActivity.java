package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Score Trackers

    private static final String TAG = "MyApp";
    // Competitor #1
    int scoreTotal1 = 0;
    int scoreDifficulty1 = 0;
    int scoreInnovation1 = 0;
    int scoreCombinations1 = 0;
    int scoreVariety1 = 0;
    int scoreSpeed1 = 0;
    // Competitor #2
    int scoreTotal2 = 0;
    int scoreDifficulty2 = 0;
    int scoreInnovation2 = 0;
    int scoreCombinations2 = 0;
    int scoreVariety2 = 0;
    int scoreSpeed2 = 0;
    int limit = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayContestant1(scoreTotal1);
    }

    /**
     * ########################################
     * Functions for incrementing scores
     * ########################################
     */

    /**
     * Competitor #1
     * 1. increments Difficulty score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementDifficulty1(View view) throws InterruptedException {

        if (scoreDifficulty1 <= 9) {
            scoreDifficulty1++;
            scoreTotal1++;
            displayDifficulty1(scoreDifficulty1);
            displayContestant1(scoreTotal1);
        }

    }

    /**
     * Competitor #1
     * 1. increments Innovation score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementInnovation1(View view) {

        if (scoreInnovation1 <= 9) {
            scoreInnovation1++;
            scoreTotal1++;
            displayInnovation1(scoreInnovation1);
            displayContestant1(scoreTotal1);
        }
    }

    /**
     * Competitor #1
     * 1. increments Combinations score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementCombinations1(View view) {

        if (scoreCombinations1 <= 9) {
            scoreCombinations1++;
            scoreTotal1++;
            displayCombinations1(scoreCombinations1);
            displayContestant1(scoreTotal1);
        }

    }

    /**
     * Competitor #1
     * 1. increments Variety score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementVariety1(View view) {

        if (scoreVariety1 <= 9) {
            scoreVariety1++;
            scoreTotal1++;
            displayVariety1(scoreVariety1);
            displayContestant1(scoreTotal1);
        }
    }

    /**
     * Competitor #1
     * 1. increments Speed, Power and Flow score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementSpeed1(View view) {

        if (scoreSpeed1 <= 9) {
            scoreSpeed1++;
            scoreTotal1++;
            displaySpeed1(scoreSpeed1);
            displayContestant1(scoreTotal1);
        }

    }

    /**
     * Competitor #2
     * 1. increments Difficulty score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementDifficulty2(View view) {

        if (scoreDifficulty2 <= 9) {
            scoreDifficulty2++;
            scoreTotal2++;
            displayDifficulty2(scoreDifficulty2);
            displayContestant2(scoreTotal2);
        }
    }

    /**
     * Competitor #2
     * 1. increments Innovation score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementInnovation2(View view) {

        if (scoreInnovation2 <= 9) {
            scoreInnovation2++;
            scoreTotal2++;
            displayInnovation2(scoreInnovation2);
            displayContestant2(scoreTotal2);
        }
    }

    /**
     * Competitor #2
     * 1. increments Combinations score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementCombinations2(View view) {

        if (scoreCombinations2 <= 9) {
            scoreCombinations2++;
            scoreTotal2++;
            displayCombinations2(scoreCombinations2);
            displayContestant2(scoreTotal2);
        }
    }

    /**
     * Competitor #2
     * 1. increments Variety score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementVariety2(View view) {

        if (scoreVariety2 <= 9) {
            scoreVariety2++;
            scoreTotal2++;
            displayVariety2(scoreVariety2);
            displayContestant2(scoreTotal2);
        }
    }

    /**
     * Competitor #2
     * 1. increments Speed, Power and Flow score by +1 and up to 10 points
     * 2. increments the Total score
     */
    public void incrementSpeed2(View view) {

        if (scoreSpeed2 <= 9) {
            scoreSpeed2++;
            scoreTotal2++;
            displaySpeed2(scoreSpeed2);
            displayContestant2(scoreTotal2);
        }
    }

    /**
     * ########################################
     * Functions for displaying scores
     * ########################################
     */

    /**
     * Competitor #1
     * Displays summed Total score
     */
    public void displayContestant1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_score1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #1
     * Displays the Difficulty score
     */
    public void displayDifficulty1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.difficultyScore1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #1
     * Displays the Innovation score
     */
    public void displayInnovation1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.innovationScore1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #1
     * Displays the Combinations score
     */
    public void displayCombinations1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.combinationsScore1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #1
     * Displays the Variety score
     */
    public void displayVariety1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.varietyScore1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #1
     * Displays the Speed, Power and Flow score
     */
    public void displaySpeed1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.speedScore1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #2
     * Displays summed Total score
     */
    public void displayContestant2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.total_score2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #2
     * Displays the Difficulty score
     */
    public void displayDifficulty2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.difficultyScore2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #2
     * Displays the Innovation score
     */
    public void displayInnovation2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.innovationScore2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #2
     * Displays the Combinations score
     */
    public void displayCombinations2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.combinationsScore2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #2
     * Displays the Variety score
     */
    public void displayVariety2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.varietyScore2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Competitor #2
     * Displays the Speed, Power and Flow score
     */
    public void displaySpeed2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.speedScore2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * ########################################
     * Reset all scores
     * ########################################
     */

    /**
     * Competitors #1 & #2
     * Reset ALL Competitor Scores to 0
     */
    public void resetToZero(View view) {

        // Competitor #1
        scoreTotal1 = 0;
        scoreDifficulty1 = 0;
        scoreInnovation1 = 0;
        scoreCombinations1 = 0;
        scoreVariety1 = 0;
        scoreSpeed1 = 0;

        // Competitor #2
        scoreTotal2 = 0;
        scoreDifficulty2 = 0;
        scoreInnovation2 = 0;
        scoreCombinations2 = 0;
        scoreVariety2 = 0;
        scoreSpeed2 = 0;

        displayContestant1(scoreTotal1);
        displayDifficulty1(scoreDifficulty1);
        displayInnovation1(scoreInnovation1);
        displayCombinations1(scoreCombinations1);
        displayVariety1(scoreVariety1);
        displaySpeed1(scoreSpeed1);

        displayContestant2(scoreTotal2);
        displayDifficulty2(scoreDifficulty2);
        displayInnovation2(scoreInnovation2);
        displayCombinations2(scoreCombinations2);
        displayVariety2(scoreVariety2);
        displaySpeed2(scoreSpeed2);

    }

}
