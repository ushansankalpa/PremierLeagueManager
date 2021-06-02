package sample;

public class SchoolFootballClub extends FootballClub{

    private String schoolName;  //school name of the football club
    private int SchoolRank;  //this school rank

    public SchoolFootballClub(String nameOfTheClub, String location, String nameOfTheManager, int numOfWinMatches, int numOfDrawMatches, int numOfDefeatMatches, int scoreGoals, int receiveGoals, int numOfPoint, int numOfMatchesPlay, String schoolName, int schoolRank) {
        super(nameOfTheClub, location, nameOfTheManager, numOfWinMatches, numOfDrawMatches, numOfDefeatMatches, scoreGoals, receiveGoals, numOfPoint, numOfMatchesPlay);
        this.schoolName = schoolName;
        SchoolRank = schoolRank;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolRank() {
        return SchoolRank;
    }

    public void setSchoolRank(int schoolRank) {
        SchoolRank = schoolRank;
    }

    @Override
    public String toString() {
        return "SchoolFootballClub{" +
                "schoolName='" + schoolName + '\'' +
                ", SchoolRank=" + SchoolRank +
                '}';
    }

}
