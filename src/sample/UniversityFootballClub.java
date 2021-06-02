package sample;

public class UniversityFootballClub extends FootballClub {

    private String universityName;  //university name for football club
    private int universityRank;  //this university rank

    public UniversityFootballClub(String nameOfTheClub, String location, String nameOfTheManager, int numOfWinMatches, int numOfDrawMatches, int numOfDefeatMatches, int scoreGoals, int receiveGoals, int numOfPoint, int numOfMatchesPlay, String universityName, int universityRank) {
        super(nameOfTheClub, location, nameOfTheManager, numOfWinMatches, numOfDrawMatches, numOfDefeatMatches, scoreGoals, receiveGoals, numOfPoint, numOfMatchesPlay);
        this.universityName = universityName;
        this.universityRank = universityRank;
    }

    //getters and setters for UniversityFootballClub(Encapsulation)
    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getUniversityRank() {
        return universityRank;
    }

    public void setUniversityRank(int universityRank) {
        this.universityRank = universityRank;
    }

    @Override
    public String toString() {
        return "UniversityFootballClub{" +
                "universityName='" + universityName + '\'' +
                ", universityRank=" + universityRank +
                '}';
    }

}
