package sample;



import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PremierLeagueManager implements LeagueManager{
    ArrayList<SportClub> footballClubs = new ArrayList<>();

    ArrayList<MatchOfLeague> matchOfLeaguesList = new ArrayList<>();

    private int competingClubs = 0;
    public static final int maximumCompetingClub = 20;

    /*there all methods are method overriding because this premierLeagueManager class
    implements by LeagueManger class, LeagueManager is interface, there method cant create method body*/

    @Override
    public void addFootballClub(FootballClub club) {

        //searching for the same club in ArrayList and return the value
        for(SportClub clubOne: footballClubs) {
            if(club.equals(clubOne)) {
                System.out.println("\n*** Club is already in the Premier league ***");
                return;
            }

        }
        /*then comparing maximum clubs value and if it is equal with max club then the clubs adding
         to arrayList is stop*/
        if (footballClubs.size() < maximumCompetingClub){
            footballClubs.add(club);
            competingClubs += 1;
            System.out.println("\n*** Club added is successfully ***");
            System.out.println(maximumCompetingClub-competingClubs + " clubs available now");
        }
        else { //after all 20 clubs add to league, showing this massage
            System.out.println("No more clubs available for PremierLeague");
        }

    }

    @Override
    public void deleteFootballClub(String deleteNameOfClub) {

        //getting input the name of the club and it mach with clubs ArrayList has.
        boolean deleteClub = false;
        for (SportClub club: footballClubs){
            if (club.getNameOfTheClub().equals(deleteNameOfClub)){ //check the club is in the array list
                footballClubs.remove(club);  //then remove all details club relate
                deleteClub = true;
                System.out.println("\n!*!*!--Club deleted is successfully--!*!*!");
                break;
            }
        }//then if it is not equal with clubs send error message
        if (!deleteClub){
            System.out.println("\n!!!!!!!--This Club is not available, Please enter correct name of the club-!!!!!!!");
        }


    }

    @Override
    public void searchClubsWithName(String searchNameOfClub) {   //firstly enter what we want club name

        boolean searchClubName = false;

        for (SportClub club : footballClubs){   //then it is finding with array lIst
            if (searchNameOfClub.equals(club.getNameOfTheClub())) {
                System.out.println("\nClub Name     :- " + club.getNameOfTheClub());
                System.out.println("Location      :- " + club.getLocation());
                System.out.println("Manager name  :- " + club.getNameOfTheManager());
                if (club instanceof FootballClub) {
                    System.out.println("Win matches   :- " + ((FootballClub) club).getNumOfWinMatches());
                    System.out.println("Defeat matches:- " + ((FootballClub) club).getNumOfDrawMatches());
                    System.out.println("Draw matches  :- " + ((FootballClub) club).getNumOfDefeatMatches());
                    System.out.println("Score Goals   :- " + ((FootballClub) club).getScoreGoals());
                    System.out.println("Receive Goals :- " + ((FootballClub) club).getReceiveGoals());
                    System.out.println("Points        :- " + ((FootballClub) club).getNumOfPoint());
                    System.out.println("Play Matches  :- " + ((FootballClub) club).getNumOfMatchesPlay());
                }
                searchClubName = true;
            }

        }//if we entered club name not in the array List showing this massage
        if (!searchClubName) {
            System.out.println("\n|!!|----CLUB IS NOT AVAILABLE----|!!|");
        }

    }

    @Override
    public void printFootballClub() { //display the all football club details

        //firstly check array is empty if it is yes , showing this error
        if (footballClubs.isEmpty()){
            System.out.println("\n!!!!!------Football Club List is Empty------!!!!!");
            return;
        }


        System.out.println("\n|--------------------------------------List of the all club--------------------------------------| ");

        Comparator comparator_1 = Comparator.comparing(FootballClub::getNumOfPoint).thenComparing(FootballClub::getScoreGoals);
        //footballClubs.sort(Comparator.comparing(FootballClub::getNumOfPoint).thenComparing(FootballClub::getReceiveGoals));
        Collections.sort(footballClubs,comparator_1);
        Collections.reverse(footballClubs);

        System.out.println("==============================================================================================================================================================|");
        System.out.format("%-20s%-20s%-25s%-13s%-13s%-13s%-13s%-13s%-13s%-13s%n","| Name "," | Location"," | Manager Name","| win","| Draw","| Defeat","| Score Goals","| Receive Goals","| Point","| Matches");
        System.out.println("==============================================================================================================================================================|");


        //display all details
        for (SportClub club_A : footballClubs){

            if (club_A instanceof FootballClub) {
                System.out.format("%-21s%-23s%-25s%-13d%-13d%-13d%-13d%-15d%-13d%-13d%n", club_A.getNameOfTheClub(), club_A.getLocation(), club_A.getNameOfTheManager(),
                        ((FootballClub) club_A).getNumOfWinMatches(), ((FootballClub) club_A).getNumOfDrawMatches(), ((FootballClub) club_A).getNumOfDefeatMatches(),
                        ((FootballClub) club_A).getScoreGoals(), ((FootballClub) club_A).getReceiveGoals(), ((FootballClub) club_A).getNumOfPoint(), ((FootballClub) club_A).getNumOfMatchesPlay());

            }
            if (club_A instanceof UniversityFootballClub){
                System.out.format("%-21s%-23s%-25s%-13d%-13d%-13d%-13d%-15d%-13d%-13d%n", club_A.getNameOfTheClub(), club_A.getLocation(), club_A.getNameOfTheManager(),
                        ((FootballClub) club_A).getNumOfWinMatches(), ((FootballClub) club_A).getNumOfDrawMatches(),((FootballClub) club_A).getNumOfDefeatMatches(),
                        ((FootballClub) club_A).getScoreGoals(), ((FootballClub) club_A).getReceiveGoals(), ((FootballClub) club_A).getNumOfPoint(), ((FootballClub) club_A).getNumOfMatchesPlay(),
                        ((UniversityFootballClub) club_A).getUniversityName(), ((UniversityFootballClub) club_A).getUniversityRank());

            }else if (club_A instanceof SchoolFootballClub){
                System.out.format("%-21s%-23s%-25s%-13d%-13d%-13d%-13d%-15d%-13d%-13d%n", club_A.getNameOfTheClub(), club_A.getLocation(), club_A.getNameOfTheManager(), ((FootballClub) club_A).getNumOfWinMatches(), ((FootballClub) club_A).getNumOfDrawMatches(),
                        ((FootballClub) club_A).getNumOfDefeatMatches(), ((FootballClub) club_A).getScoreGoals(), ((FootballClub) club_A).getReceiveGoals(),
                        ((FootballClub) club_A).getNumOfPoint(), ((FootballClub) club_A).getNumOfMatchesPlay(),
                        ((SchoolFootballClub) club_A).getSchoolName(), ((SchoolFootballClub) club_A).getSchoolRank());
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------|");

        }
        System.out.println();


    }

    @Override
    public void playedMatchesOfLeague(DateOfMatch dateOfMatch,String teamOne, int teamOneScore, int teamOneReceive, String teamTwo) {
        //first team name , first team number of score goals , first team number of receive goals and second team name are parameters

        MatchOfLeague matchOfLeague= new MatchOfLeague(dateOfMatch,teamOne,teamOneScore,teamOneReceive,teamTwo);




        boolean clubsInLeague_1 = false;

        //then searching for the first football club in the arraylist , and get score , point , etc and add new value for it
        for (SportClub club_A : footballClubs){
            if (teamOne.equals(club_A.getNameOfTheClub()) ){

                int newScoreGoals_1 = ((FootballClub) club_A).getScoreGoals();
                newScoreGoals_1 = newScoreGoals_1 + teamOneScore;
                ((FootballClub) club_A).setScoreGoals(newScoreGoals_1);

                int newReceiveGoals_1 = ((FootballClub) club_A).getReceiveGoals();
                newReceiveGoals_1 = newReceiveGoals_1 + teamOneReceive;
                ((FootballClub) club_A).setReceiveGoals(newReceiveGoals_1);

                int newMatchCount_1 = ((FootballClub)club_A).getNumOfMatchesPlay();
                newMatchCount_1 = newMatchCount_1 +1;
                ((FootballClub) club_A).setNumOfMatchesPlay(newMatchCount_1);

                if (teamOneScore>teamOneReceive){
                    int newWinMatchPoint_1 = ((FootballClub) club_A).getNumOfPoint();
                    newWinMatchPoint_1 = newWinMatchPoint_1 + 3;
                    ((FootballClub) club_A).setNumOfPoint(newWinMatchPoint_1);

                    int newWinMatchCount_1 = ((FootballClub)club_A).getNumOfWinMatches();
                    newWinMatchCount_1 = newWinMatchCount_1 +1;
                    ((FootballClub)club_A).setNumOfWinMatches(newWinMatchCount_1);
                }
                else if (teamOneScore==teamOneReceive){
                    int newDrawMatchPoint_1 = ((FootballClub)club_A).getNumOfPoint();
                    newDrawMatchPoint_1 = newDrawMatchPoint_1 + 1;
                    ((FootballClub)club_A).setNumOfPoint(newDrawMatchPoint_1);

                    int newDrawMatchCount_1 = ((FootballClub)club_A).getNumOfDrawMatches();
                    newDrawMatchCount_1 = newDrawMatchCount_1 +1;
                    ((FootballClub)club_A).setNumOfDrawMatches(newDrawMatchCount_1);
                }else {
                    int newDefMatchCount_1 = ((FootballClub)club_A).getNumOfDefeatMatches();
                    newDefMatchCount_1 = newDefMatchCount_1 +1;
                    ((FootballClub)club_A).setNumOfDefeatMatches(newDefMatchCount_1);
                }

                clubsInLeague_1 = true;


            }


        }
        if (!clubsInLeague_1){
            System.out.println("\n---first clubs is not in the league. Try Again---");
        }




        boolean clubsInLeague_2 = false;

        //and search the second with football club do the same thing above done
        for (SportClub club_A : footballClubs){
            if (teamTwo.equals(club_A.getNameOfTheClub())){
                int newScoreGoals_2 = ((FootballClub) club_A).getScoreGoals();
                newScoreGoals_2 = newScoreGoals_2 + teamOneReceive;
                ((FootballClub) club_A).setScoreGoals(newScoreGoals_2);

                int newReceiveGoals_2 = ((FootballClub) club_A).getReceiveGoals();
                newReceiveGoals_2 = newReceiveGoals_2 + teamOneScore;
                ((FootballClub) club_A).setReceiveGoals(newReceiveGoals_2);

                int newMatchCount_2 = ((FootballClub)club_A).getNumOfMatchesPlay();
                newMatchCount_2 = newMatchCount_2 +1;
                ((FootballClub) club_A).setNumOfMatchesPlay(newMatchCount_2);

                if (teamOneScore<teamOneReceive){
                    int newWinMatchPoint_2 = ((FootballClub) club_A).getNumOfPoint();
                    newWinMatchPoint_2 = newWinMatchPoint_2 + 3;
                    ((FootballClub) club_A).setNumOfPoint(newWinMatchPoint_2);

                    int newWinMatchCount_2 = ((FootballClub)club_A).getNumOfWinMatches();
                    newWinMatchCount_2 = newWinMatchCount_2 +1;
                    ((FootballClub)club_A).setNumOfWinMatches(newWinMatchCount_2);
                }
                else if (teamOneScore==teamOneReceive){
                    int newDrawMatchPoint_2 = ((FootballClub)club_A).getNumOfPoint();
                    newDrawMatchPoint_2 = newDrawMatchPoint_2 + 1;
                    ((FootballClub)club_A).setNumOfPoint(newDrawMatchPoint_2);

                    int newDrawMatchCount_2 = ((FootballClub)club_A).getNumOfDrawMatches();
                    newDrawMatchCount_2 = newDrawMatchCount_2 +1;
                    ((FootballClub)club_A).setNumOfDrawMatches(newDrawMatchCount_2);
                }else {

                    int newDefMatchCount_2 = ((FootballClub)club_A).getNumOfDefeatMatches();
                    newDefMatchCount_2 = newDefMatchCount_2 +1;
                    ((FootballClub)club_A).setNumOfDefeatMatches(newDefMatchCount_2);
                }

                clubsInLeague_2 = true;

                matchOfLeaguesList.add(matchOfLeague);
            }
        }

        if (!clubsInLeague_2){
            System.out.println("\n---Second clubs is not in the league. Try Again---");
        }





    }


    @Override
    public void savingAllData(String nameOfFile) throws IOException {

        //object output steam - save all club details for the file file handling and exception
        FileOutputStream fileOUTPUTSTREAM = new FileOutputStream(nameOfFile);
        ObjectOutputStream objectOUTPUTSTREAM = new ObjectOutputStream(fileOUTPUTSTREAM);

        for (SportClub club_A : footballClubs){
            objectOUTPUTSTREAM.writeObject(club_A);  //write club details one by one to file
        }
        objectOUTPUTSTREAM.flush();
        fileOUTPUTSTREAM.close();
        objectOUTPUTSTREAM.close();


        System.out.println("@@@@@--Saving all data to file is successfully-@@@@@");

    }

    @Override
    public void loadAllOfData(String nameOfFile) throws IOException, ClassNotFoundException {

        //object input steam - all details in file reload to array list again
        FileInputStream fileINPUTSTREAM = new FileInputStream(nameOfFile);
        ObjectInputStream objectINPUTSTREAM = new ObjectInputStream(fileINPUTSTREAM);



        for (;;){
            try {
                SportClub club_A = (SportClub) objectINPUTSTREAM.readObject(); //read the file and add that details to array list
                //System.out.println(club);
                footballClubs.add(club_A);

            }catch (EOFException e){
                System.out.println("!!!!___File is loading successfully___!!!!!");
                break;

            }catch (ClassNotFoundException e){
                System.out.println("Loading Fail");
                break;
            }


        }

        fileINPUTSTREAM.close();
        objectINPUTSTREAM.close();

        int clubSize = footballClubs.size();
        competingClubs = clubSize;
        System.out.println("**** "+clubSize+" clubs added in to the League ***");

    }

    @Override
    public void premierLeagueGUI() throws IOException,ClassNotFoundException{

        savingAllMatch();
        PremierLeagueTable.firstStage(footballClubs,matchOfLeaguesList);



    }

    @Override
    public void savingAllMatch() throws IOException {

        FileOutputStream fileOUTPUTSTREAM_2 = new FileOutputStream("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\MATCH_DATA.txt");
        ObjectOutputStream objectOUTPUTSTREAM_2 = new ObjectOutputStream(fileOUTPUTSTREAM_2);

        for (MatchOfLeague match_B : matchOfLeaguesList){
            objectOUTPUTSTREAM_2.writeObject(match_B);  //write club details one by one to file
        }

        objectOUTPUTSTREAM_2.flush();
        fileOUTPUTSTREAM_2.close();
        objectOUTPUTSTREAM_2.close();


    }

    @Override
    public void loadAllMatch(String matchFile) throws IOException, ClassNotFoundException {


        FileInputStream fileINPUTSTREAM_2 = new FileInputStream("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\MATCH_DATA.txt");
        ObjectInputStream objectINPUTSTREAM_2 = new ObjectInputStream(fileINPUTSTREAM_2);

        for (;;){
            try {
                MatchOfLeague match_B = (MatchOfLeague) objectINPUTSTREAM_2.readObject(); //read the file and add that details to array list
                matchOfLeaguesList.add(match_B);

            }catch (EOFException e){
                System.out.println("!!!!___File is loading successfully___!!!!!");
                break;

            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }


        }

        fileINPUTSTREAM_2.close();
        objectINPUTSTREAM_2.close();
    }


}
