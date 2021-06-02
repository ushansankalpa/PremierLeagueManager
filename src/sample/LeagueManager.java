package sample;

import java.io.IOException;


public interface LeagueManager {
    public void addFootballClub(FootballClub club);  //This method is adding all clubs to league, which is inherit with PremierLeagueManager class
    public void deleteFootballClub(String deleteNameOfClub);  //this method delete clubs, what we want
    public void searchClubsWithName(String searchNameOfClub);  //this method is searching clubs what we entered
    public void printFootballClub();           //this method print all clubs with statics , as a table
    public void playedMatchesOfLeague(DateOfMatch dateOfMatch,String teamOne,int teamOneScore, int teamOneReceive,String teamTwo); //we can enter matches with two teams and their goals and date
    public void savingAllData(String nameOfFile) throws IOException;            //this method is saving all clubs details to file
    public void loadAllOfData(String nameOfFile) throws IOException, ClassNotFoundException;  //this method is loading all clubs details to array from file
    public void premierLeagueGUI() throws IOException, ClassNotFoundException;    //this method is opening javafx GUI
    public void savingAllMatch() throws IOException;   //this method is saving all match details to file
    public void loadAllMatch(String matchFile) throws IOException,ClassNotFoundException;   //this method is loading all matches details to array form file

    // this all methods inherit with PremierLeagueManager class


}
