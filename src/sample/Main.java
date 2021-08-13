package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException,ClassNotFoundException {


        //call the object
        PremierLeagueManager premierLeagueManager = new PremierLeagueManager();
        Scanner scanner = new Scanner(System.in);




        //load all data with running file
        //premierLeagueManager.loadAllOfData("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\CLUB_DATA.txt");
        //premierLeagueManager.loadAllMatch("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\MATCH_DATA.txt");


        //two string values
        String strValue1;
        String strValue2;

        //end the while loop

        loadDataWithEnd:

        while (true){
            //menu of the premierLeague manager
            System.out.println("\n<---!! WELCOME FOOTBALL LEAGUE MANAGER !!--->");
            System.out.println("!------------------Menu---------------------!");
            System.out.println("1 - Press (1) Add the club to league");
            System.out.println("2 - Press (2) Delete the club from league");
            System.out.println("3 - Press (3) Search Football clubs");
            System.out.println("4 - Press (4) Display all clubs with details");
            System.out.println("5 - Press (5) Enter played match details");
            System.out.println("6 - Press (6) Save all data to the file");
            System.out.println("7 - Press (7) Saving all data to file and Exit the program"); 
            System.out.println("8 - Press (8) Open the JAVAFX Premier League GUI");
            System.out.println("9 - Press (9) Open the WEB BASE Premier League GUI ");

            System.out.println("!-------------------------------------------!");

            System.out.print("\nPlease Enter your choice :- ");

            strValue1 = scanner.next();
            int choose = Validation.firstValidation(strValue1);

            switch (choose){
                case 1:
                    while (true) {
                        //choose club type
                        System.out.println();
                        System.out.println("--------[Select the Club Type]--------");
                        System.out.println("Football club             -->press[1]");
                        System.out.println("University Football Club  -->press[2]");
                        System.out.println("School Football Club      -->press[3]");
                        System.out.println("Back To                   -->press[0]");
                        System.out.println();
                        System.out.print("Enter your option :- ");

                        strValue2 = scanner.next();
                        int option = Validation.firstValidation(strValue2);


                        if (option == 1 || option == 2 || option == 3) {

                            while (true) {

                                System.out.println("\n[!!!----Do you want to Back. Please Enter 'q'----!!!]");
                                String strValue3;



                                System.out.print("\nPlease enter name of the club              :- ");
                                String name = scanner.next().toUpperCase();

                                if (name.equals("Q")){
                                    break;
                                }

                                System.out.print("Please enter location of the club          :- ");
                                scanner.nextLine();
                                String location = scanner.next();
                                if (location.equals("q")){
                                    break;
                                }

                                System.out.print("Please enter name of the manager in club   :- ");
                                scanner.nextLine();
                                String nameOfManager = scanner.next();
                                if (nameOfManager.equals("q")){
                                    break;
                                }

                                System.out.print("Please enter number of win matches         :- ");
                                scanner.nextLine();
                                strValue3 = scanner.next();
                                if (strValue3.equals("q")){
                                    break;
                                }
                                int win = Validation.firstValidation(strValue3);

                                System.out.print("Please enter number of draw matches        :- ");
                                strValue3 = scanner.next();
                                if (strValue3.equals("q")){
                                    break;
                                }
                                int draw = Validation.firstValidation(strValue3);

                                System.out.print("Please enter number of defeat matches      :- ");
                                strValue3 = scanner.next();
                                if (strValue3.equals("q")){
                                    break;
                                }
                                int defeat = Validation.firstValidation(strValue3);

                                System.out.print("Please enter number of Score Goals         :- ");
                                strValue3 = scanner.next();
                                if (strValue3.equals("q")){
                                    break;
                                }
                                int numOfGoals = Validation.firstValidation(strValue3);

                                System.out.print("Please enter number of Received Score      :- ");
                                strValue3 = scanner.next();
                                if (strValue3.equals("q")){
                                    break;
                                }
                                int score = Validation.firstValidation(strValue3);

                                System.out.print("Please enter number of point club have     :- ");
                                strValue3 = scanner.next();
                                if (strValue3.equals("q")){
                                    break;
                                }
                                int point = Validation.firstValidation(strValue3);

                                System.out.print("Please enter number of matches club played :- ");
                                strValue3 = scanner.next();
                                if (strValue3.equals("q")){

                                }
                                int matches = Validation.firstValidation(strValue3);


                                if (option == 1) {
                                    FootballClub footballClub = new FootballClub(name, location, nameOfManager, win, draw, defeat, numOfGoals, score, point, matches);
                                    premierLeagueManager.addFootballClub(footballClub);

                                } else if (option == 2) {
                                    System.out.print("Enter University name      :- ");
                                    String uniName = scanner.next();
                                    if (strValue3.equals("q")){
                                        break;
                                    }

                                    System.out.print("Enter University Rank      :- ");
                                    strValue3 = scanner.next();
                                    if (strValue3.equals("q")){
                                        break;
                                    }
                                    int uniRank = Validation.firstValidation(strValue3);


                                    UniversityFootballClub universityFootballClub = new UniversityFootballClub(name, location, nameOfManager, win, draw, defeat, numOfGoals, score, point, matches, uniName, uniRank);
                                    premierLeagueManager.addFootballClub(universityFootballClub);
                                } else {
                                    System.out.print("Enter School name          :- ");
                                    String nameOfSchool = scanner.next();
                                    if (strValue3.equals("q")){
                                        break;
                                    }

                                    System.out.print("Enter School rank          :-");
                                    strValue3 =scanner.next();
                                    if (strValue3.equals("q")){
                                        break;
                                    }
                                    int schoolRank = Validation.firstValidation(strValue3);

                                    SchoolFootballClub schoolFootballClub = new SchoolFootballClub(name, location, nameOfManager, win, draw, defeat, numOfGoals, score, point, matches, nameOfSchool, schoolRank);
                                    premierLeagueManager.addFootballClub(schoolFootballClub);

                                }

                            }



                        } else if (option ==0){
                            break;

                        }else {
                            System.out.println("\n!!--Invalid input, Please enter correct number--!!");
                        }

                    }
                    break;



                case 2:
                    System.out.print("Please Enter Club name for delete :-"); //delete club
                    String deleteOfClub = scanner.next().toUpperCase();
                    premierLeagueManager.deleteFootballClub(deleteOfClub);
                    break;
                case 3:
                    System.out.print("Enter Name Of the Club, What you need :- ");//search club
                    String searchNameOfClub = scanner.next().toUpperCase();
                    premierLeagueManager.searchClubsWithName(searchNameOfClub);
                    break;
                case 4:
                    premierLeagueManager.printFootballClub();
                    break;

                case 5:
                    //played match details
                    DateOfMatch dateOfMatch = new DateOfMatch();
                    ArrayList<MatchOfLeague> matchesOfLeague = new ArrayList<>();



                    while (true) {
                        while (true) {
                            try {
                                System.out.print("\nPlease enter the Date of the Match (DD-MM-YYYY) :- ");
                                String matchDate = scanner.next();
                                if (matchDate.equals("q")){
                                    break ;
                                }

                                String[] matchDateArray = matchDate.split("-",3);
                                int day = Integer.parseInt(matchDateArray[0]);
                                int month = Integer.parseInt(matchDateArray[1]);
                                int year = Integer.parseInt(matchDateArray[2]);

                                dateOfMatch.setDateOfMatch(day);
                                dateOfMatch.setMonthOfMatch(month);
                                dateOfMatch.setYearOfMatch(year);

                                if (day > 0 && day < 32 && month > 0 && month < 13 && year > 2019 && year < 5000) {
                                    break;
                                } else {
                                    System.out.println("Please enter valid date and month and year");

                                }
                            } catch (Exception e) {
                                System.out.println("Invalid format, retype correct format");
                            }
                        }

                        System.out.print("Please enter name of the first team :- ");
                        String teamOne = scanner.next().toUpperCase();
                        if (teamOne.equals("Q")){
                            break ;
                        }

                        System.out.print("Please enter number of score goals of first team :- ");
                        strValue2 = scanner.next();
                        if (strValue2.equals("q")){
                            break ;
                        }
                        int teamOneScore = Validation.firstValidation(strValue2);

                        System.out.print("Please enter number of receive goals of first team :- ");
                        strValue2  = scanner.next();

                        if (strValue2.equals("q")){
                            break ;
                        }
                        int teamOneReceive = Validation.firstValidation(strValue2);

                        System.out.print("Please enter name of the second team :- ");
                        String teamTwo = scanner.next().toUpperCase();
                        if (teamTwo.equals("Q")){
                            break ;
                        }



                        premierLeagueManager.playedMatchesOfLeague(dateOfMatch,teamOne,teamOneScore,teamOneReceive,teamTwo);

                    }


                    break ;

                case 6:
                    premierLeagueManager.savingAllData("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\CLUB_DATA.txt");//saving all data
                    break ;

                case 7:
                    premierLeagueManager.savingAllData("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\CLUB_DATA.txt");//saving all data and end the program
                    System.out.println("End the program");
                    break loadDataWithEnd;

                case 8:
                    premierLeagueManager.premierLeagueGUI();//open the javaFX  gui
                    break loadDataWithEnd;
                case 9:
                    //open the web base GUI
                    Desktop desktop_A = Desktop.getDesktop();
                    try {
                        desktop_A.browse(new URI("http://localhost:4200/play"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                    break ;

                default:
                    System.out.println("\n!!!Invalid input. Please enter (1 to 9) integer!!!");
                    break;

            }
        }




    }


    public static void main(String[] args) {
        launch(args);
    }
}
