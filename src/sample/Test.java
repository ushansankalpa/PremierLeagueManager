package sample;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        PremierLeagueManager premierLeagueManager = new PremierLeagueManager();
        Scanner scanner = new Scanner(System.in);

        FootballClub footballClub_1 = new FootballClub("basilona", "spain", "jack", 0, 0, 0, 0, 0, 0, 0);
        FootballClub footballClub_2 = new FootballClub("United", "italy", "mark", 1, 1, 1, 2, 2, 2, 3);
        FootballClub footballClub_3 = new FootballClub("madrid", "wales", "smith", 2, 2, 2, 2, 2, 3, 6);

        System.out.println(footballClub_1);
        System.out.println(footballClub_2);
        System.out.println(footballClub_3);

        premierLeagueManager.addFootballClub(footballClub_1);
        premierLeagueManager.addFootballClub(footballClub_2);
        premierLeagueManager.addFootballClub(footballClub_3);

        premierLeagueManager.printFootballClub();

        premierLeagueManager.deleteFootballClub("basilona");

        premierLeagueManager.searchClubsWithName("United");

        premierLeagueManager.printFootballClub();



        SportClub s1 = new SportClub("mm","m","m");
        System.out.println(s1);


        String a = "abcd";
        //a.trim();
        a.toUpperCase();
        //a.substring(3,4);
        System.out.println(a);











    }

}
