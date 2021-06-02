package sample;

import java.io.Serializable;
import java.util.Objects;

public class FootballClub extends SportClub implements Serializable {

    private int numOfWinMatches;    // how many wins football club achieve
    private int numOfDrawMatches;    //how many matches football club draw?
    private int numOfDefeatMatches;  //how may matches football club defeat
    private int scoreGoals;          //how many goals sore in all matches
    private int receiveGoals;  //how many goals receive in all matches
    private int numOfPoint;    //how may number of point club have
    private int numOfMatchesPlay;  //how many number of matches club play

    //parameterize constructor in FootballClub class
    public FootballClub(String nameOfTheClub, String location, String nameOfTheManager, int numOfWinMatches, int numOfDrawMatches, int numOfDefeatMatches, int scoreGoals, int receiveGoals, int numOfPoint, int numOfMatchesPlay) {
        super(nameOfTheClub, location, nameOfTheManager);
        this.numOfWinMatches = numOfWinMatches;
        this.numOfDrawMatches = numOfDrawMatches;
        this.numOfDefeatMatches = numOfDefeatMatches;
        this.scoreGoals = scoreGoals;
        this.receiveGoals = receiveGoals;
        this.numOfPoint = numOfPoint;
        this.numOfMatchesPlay = numOfMatchesPlay;
    }

    //getters and setters (encapsulation) in FootballClub class
    public int getNumOfWinMatches() {
        return numOfWinMatches;
    }

    public void setNumOfWinMatches(int numOfWinMatches) {
        this.numOfWinMatches = numOfWinMatches;
    }

    public int getNumOfDrawMatches() {
        return numOfDrawMatches;
    }

    public void setNumOfDrawMatches(int numOfDrawMatches) {
        this.numOfDrawMatches = numOfDrawMatches;
    }

    public int getNumOfDefeatMatches() {
        return numOfDefeatMatches;
    }

    public void setNumOfDefeatMatches(int numOfDefeatMatches) {
        this.numOfDefeatMatches = numOfDefeatMatches;
    }

    public int getScoreGoals() {
        return scoreGoals;
    }

    public void setScoreGoals(int scoreGoals) {
        this.scoreGoals = scoreGoals;
    }

    public int getReceiveGoals() {
        return receiveGoals;
    }

    public void setReceiveGoals(int receiveGoals) {
        this.receiveGoals = receiveGoals;
    }

    public int getNumOfPoint() {
        return numOfPoint;
    }

    public void setNumOfPoint(int numOfPoint) {
        this.numOfPoint = numOfPoint;
    }

    public int getNumOfMatchesPlay() {
        return numOfMatchesPlay;
    }

    public void setNumOfMatchesPlay(int numOfMatchesPlay) {
        this.numOfMatchesPlay = numOfMatchesPlay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FootballClub that = (FootballClub) o;
        return numOfWinMatches == that.numOfWinMatches &&
                numOfDrawMatches == that.numOfDrawMatches &&
                numOfDefeatMatches == that.numOfDefeatMatches &&
                scoreGoals == that.scoreGoals &&
                receiveGoals == that.receiveGoals &&
                numOfPoint == that.numOfPoint &&
                numOfMatchesPlay == that.numOfMatchesPlay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numOfWinMatches, numOfDrawMatches, numOfDefeatMatches, scoreGoals, receiveGoals, numOfPoint, numOfMatchesPlay);
    }

    @Override
    public String toString() {
        return super.toString()+
                "numOfWinMatches=" + numOfWinMatches +
                ", numOfDrawMatches=" + numOfDrawMatches +
                ", numOfDefeatMatches=" + numOfDefeatMatches +
                ", numOfGoals=" + scoreGoals +
                ", score=" + receiveGoals +
                ", numOfPoint=" + numOfPoint +
                ", numOfMatchesPlay=" + numOfMatchesPlay +
                '}';
    }
}
