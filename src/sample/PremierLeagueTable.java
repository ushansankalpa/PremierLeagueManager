package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;




public class PremierLeagueTable {
    public static void firstStage(ArrayList<SportClub> clubsList,ArrayList<MatchOfLeague> matchOfLeagueList)  {


        Stage stage = new Stage();
        stage.setTitle("Premier League Manager");
        TableView<SportClub> sportClubTableView_1 = new TableView<>();
        TableView<MatchOfLeague> matchOfLeagueTableView_2 = new TableView<>();
        sportClubTableView_1.setLayoutX(200);
        sportClubTableView_1.setLayoutY(70);

        ObservableList<SportClub> clubDetail = FXCollections.observableArrayList(clubsList);



        //create the table and  load all data to table
        TableColumn nameColumn = new TableColumn("Name of Club");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("nameOfTheClub"));
        nameColumn.setPrefWidth(150);

        TableColumn locationColumn = new TableColumn("Location");
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        locationColumn.setPrefWidth(100);

        TableColumn nameOfManaColumn = new TableColumn("Name Of Manager");
        nameOfManaColumn.setCellValueFactory(new PropertyValueFactory<>("nameOfTheManager"));
        nameOfManaColumn.setPrefWidth(150);

        TableColumn winColumn = new TableColumn("Win");
        winColumn.setCellValueFactory(new PropertyValueFactory<>("numOfWinMatches"));
        winColumn.setPrefWidth(75);

        TableColumn drawColumn = new TableColumn("Draw");
        drawColumn.setCellValueFactory(new PropertyValueFactory<>("numOfDrawMatches"));
        drawColumn.setPrefWidth(75);

        TableColumn defeatColumn = new TableColumn("Defeat");
        defeatColumn.setCellValueFactory(new PropertyValueFactory<>("numOfDefeatMatches"));
        defeatColumn.setPrefWidth(75);

        TableColumn scoreColumn = new TableColumn("Score Goals");
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("scoreGoals"));
        scoreColumn.setPrefWidth(100);

        TableColumn receiveColumn = new TableColumn("Receive Goals");
        receiveColumn.setCellValueFactory(new PropertyValueFactory<>("receiveGoals"));
        receiveColumn.setPrefWidth(100);

        TableColumn pointColumn = new TableColumn("Point");
        pointColumn.setCellValueFactory(new PropertyValueFactory<>("numOfPoint"));
        pointColumn.setPrefWidth(75);

        TableColumn matchesColumn = new TableColumn("Number of Matches");
        matchesColumn.setCellValueFactory(new PropertyValueFactory<>("numOfMatchesPlay"));
        matchesColumn.setPrefWidth(150);



        //===========================sorting with point button====================================
        Button pointSort = new Button("Sort with Point");
        pointSort.setLayoutX(50);
        pointSort.setLayoutY(200);
        pointSort.setPrefSize(110,20);
        pointSort.setStyle("-fx-background-color: #ed2b3b; -fx-text-fill: white; -fx-background-radius:17px;");
        pointSort.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));

        //This button is sorting all data descending order with score
        pointSort.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                sportClubTableView_1.getSortOrder().addAll(pointColumn);
                pointColumn.setSortType(TableColumn.SortType.DESCENDING);

            }
        });
        //======================================================================================



        //===========================sorting with score button====================================
        Button scoreSort = new Button("Sort with Score");
        scoreSort.setLayoutX(50);
        scoreSort.setLayoutY(250);
        scoreSort.setPrefSize(110,20);
        scoreSort.setStyle("-fx-background-color: #ed2b3b; -fx-text-fill: white; -fx-background-radius:17px;");
        scoreSort.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));

        //This button is sorting all data descending order with score
        scoreSort.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                sportClubTableView_1.getSortOrder().addAll(scoreColumn);
                scoreColumn.setSortType(TableColumn.SortType.DESCENDING);

            }
        });
        //======================================================================================




        //============================sorting with winning matches button========================
        Button winSort = new Button("Sort with Wins");
        winSort.setLayoutX(50);
        winSort.setLayoutY(300);
        winSort.setPrefSize(110,20);
        winSort.setStyle("-fx-background-color: #ed2b3b; -fx-text-fill: white; -fx-background-radius:17px;");
        winSort.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));

        //this button is sorting all data descending order with winning matches
        winSort.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                sportClubTableView_1.getSortOrder().addAll(winColumn);
                winColumn.setSortType(TableColumn.SortType.DESCENDING);
            }
        });
        //=======================================================================================


        //============================Match generate button======================================
        Button matchGen = new Button("Generate Match");
        matchGen.setLayoutX(50);
        matchGen.setLayoutY(350);
        matchGen.setPrefSize(110,20);
        matchGen.setStyle("-fx-background-color: #ed2b3b; -fx-text-fill: white; -fx-background-radius:17px;");
        matchGen.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));

        //choose the two teams randomly and generate match random
        matchGen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ArrayList<String> nameOFCLUBS = new ArrayList<>();
                for (SportClub club : clubsList){
                    nameOFCLUBS.add(club.getNameOfTheClub());
                }

                int CLUB_NAME_1 = (int) ((Math.random()*(((nameOFCLUBS.size()-1)-0)+1)+0));
                int CLUB_NAME_2 = (int) ((Math.random()*(((nameOFCLUBS.size()-1)-0)+1)+0));
                int scoreRandom_1 = (int) ((Math.random()*((4-0)+1))+0);
                int receiveRandom_1  = (int) ((Math.random()*((4-0)+1))+0);

                int date = (int)(Math.random()*(30 -1+1)+1);
                int month = (int)(Math.random()*(12 -1+1)+1);
                int year = (int)(Math.random()*(2021 -2020+1)+2020);
                String dateOfMatch =(date+"-"+month+"-"+year);

                DateOfMatch newDateMatch = new DateOfMatch(date,month,year);

                String club_1 = nameOFCLUBS.get(CLUB_NAME_1);
                String club_2 = nameOFCLUBS.get(CLUB_NAME_2);


                if (CLUB_NAME_1 != CLUB_NAME_2) {

                    System.out.println("\nClub_1[INDEX]-"+CLUB_NAME_1 +"\nClub_2[INDEX]-"+CLUB_NAME_2+"\nClub_1 Score-"+scoreRandom_1+"\nClub_2 Score-"+receiveRandom_1);
                    System.out.println("Date of match-"+dateOfMatch);


                    for (SportClub findClub : clubsList) {
                        if (findClub.getNameOfTheClub().equals(nameOFCLUBS.get(CLUB_NAME_1))) {
                            ((FootballClub) findClub).setScoreGoals(scoreRandom_1 + ((FootballClub) findClub).getScoreGoals());
                            ((FootballClub)findClub).setReceiveGoals(receiveRandom_1+((FootballClub)findClub).getReceiveGoals());
                            ((FootballClub) findClub).setNumOfMatchesPlay(1 + ((FootballClub) findClub).getNumOfMatchesPlay());

                            if (scoreRandom_1 >receiveRandom_1){
                                ((FootballClub)findClub).setNumOfWinMatches(1+((FootballClub)findClub).getNumOfWinMatches());
                                ((FootballClub)findClub).setNumOfPoint(3+((FootballClub)findClub).getNumOfPoint());
                            }else if (scoreRandom_1 == receiveRandom_1){
                                ((FootballClub)findClub).setNumOfDrawMatches(1+((FootballClub)findClub).getNumOfDrawMatches());
                                ((FootballClub)findClub).setNumOfPoint(1+((FootballClub)findClub).getNumOfPoint());
                            }else {
                                ((FootballClub)findClub).setNumOfDefeatMatches(1+((FootballClub)findClub).getNumOfDefeatMatches());
                            }
                        }
                    }

                    for (SportClub findClub : clubsList) {
                        if (findClub.getNameOfTheClub().equals(nameOFCLUBS.get(CLUB_NAME_2))) {
                            ((FootballClub) findClub).setScoreGoals(receiveRandom_1 + ((FootballClub) findClub).getScoreGoals());
                            ((FootballClub)findClub).setReceiveGoals(scoreRandom_1+((FootballClub)findClub).getReceiveGoals());
                            ((FootballClub) findClub).setNumOfMatchesPlay(1 + ((FootballClub) findClub).getNumOfMatchesPlay());

                            if (scoreRandom_1 <receiveRandom_1){
                                ((FootballClub)findClub).setNumOfWinMatches(1+((FootballClub)findClub).getNumOfWinMatches());
                                ((FootballClub)findClub).setNumOfPoint(3+((FootballClub)findClub).getNumOfPoint());
                            }else if (scoreRandom_1 == receiveRandom_1){
                                ((FootballClub)findClub).setNumOfDrawMatches(1+((FootballClub)findClub).getNumOfDrawMatches());
                                ((FootballClub)findClub).setNumOfPoint(1+((FootballClub)findClub).getNumOfPoint());
                            }else {
                                ((FootballClub)findClub).setNumOfDefeatMatches(1+((FootballClub)findClub).getNumOfDefeatMatches());
                            }
                        }
                    }

                    System.out.println("Match is successfully added");

                    MatchOfLeague newMatches = new MatchOfLeague(newDateMatch,club_1,scoreRandom_1,receiveRandom_1,club_2);
                    matchOfLeagueList.add(newMatches);

                    try {
                        FileOutputStream fileOUTPUTSTREAM = new FileOutputStream("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\CLUB_DATA.txt");
                        ObjectOutputStream objectOUTPUTSTREAM = new ObjectOutputStream(fileOUTPUTSTREAM);

                        for (SportClub club : clubsList){
                            objectOUTPUTSTREAM.writeObject(club);  //write club details one by one to file
                        }
                        objectOUTPUTSTREAM.flush();
                        fileOUTPUTSTREAM.close();
                        objectOUTPUTSTREAM.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    try {
                        FileOutputStream fileOUTPUTSTREAM_2 = new FileOutputStream("C:\\z.My privet\\Extra\\javcw\\2nd year\\notpad\\FinalCode\\PremierLeageGUI\\MATCH_DATA.txt");
                        ObjectOutputStream objectOUTPUTSTREAM_2 = new ObjectOutputStream(fileOUTPUTSTREAM_2);

                        for (MatchOfLeague match : matchOfLeagueList) {
                            objectOUTPUTSTREAM_2.writeObject(match);  //write club details one by one to file
                        }

                        objectOUTPUTSTREAM_2.flush();
                        fileOUTPUTSTREAM_2.close();
                        objectOUTPUTSTREAM_2.close();
                    }catch (Exception e){
                        System.out.println("Invalid");
                    }


                }else {
                    System.out.println("Try Again");
                }

                sportClubTableView_1.refresh();
            }
        });
        //===============================================================================================


        //==========================Match Table button=================================================
        Button sortDate = new Button("Match Table");
        sortDate.setLayoutX(50);
        sortDate.setLayoutY(400);
        sortDate.setPrefSize(110,20);
        sortDate.setStyle("-fx-background-color: #ed2b3b; -fx-text-fill: white; -fx-background-radius:17px;");
        sortDate.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));

        //create table with match details
        sortDate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage matchStage = new Stage();
                matchStage.setTitle("Match Table");

                ObservableList<MatchOfLeague> matchDetail = FXCollections.observableArrayList(matchOfLeagueList);

                TableColumn matchesDateColumn = new TableColumn("Match Date");
                matchesDateColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfMatch"));
                matchesDateColumn.setPrefWidth(100);

                TableColumn matchesFirstClubColumn = new TableColumn("Team_1");
                matchesFirstClubColumn.setCellValueFactory(new PropertyValueFactory<>("teamNumOne"));
                matchesFirstClubColumn.setPrefWidth(150);

                TableColumn matchesFirstClubScoreColumn = new TableColumn("Team_1 goals");
                matchesFirstClubScoreColumn.setCellValueFactory(new PropertyValueFactory<>("teamNumOneScoreGoals"));
                matchesFirstClubScoreColumn.setPrefWidth(100);

                TableColumn matchesSecondClubColumn = new TableColumn("Team_2");
                matchesSecondClubColumn.setCellValueFactory(new PropertyValueFactory<>("teamNumTwo"));
                matchesSecondClubColumn.setPrefWidth(150);

                TableColumn matchesFirstClubReceiveColumn = new TableColumn("Team_2 goals");
                matchesFirstClubReceiveColumn.setCellValueFactory(new PropertyValueFactory<>("teamNumOneReceiveGoals"));
                matchesFirstClubReceiveColumn.setPrefWidth(100);


                //==============================Sorting with date=======================================
                Button sortDate = new Button("Sorting with Date");
                sortDate.setLayoutX(510);
                sortDate.setLayoutY(35);
                sortDate.setPrefSize(130,20);
                sortDate.setStyle("-fx-background-color: #5c43de; -fx-text-fill: white; -fx-background-radius:15px;");
                sortDate.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 10));

                sortDate.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        matchOfLeagueTableView_2.getSortOrder().addAll(matchesDateColumn);
                        matchesDateColumn.setSortType(TableColumn.SortType.ASCENDING);
                    }
                });



                TextField searchBar_1 = new TextField();
                searchBar_1.setLayoutX(90);
                searchBar_1.setLayoutY(30);
                searchBar_1.setPrefSize(250,30);

                //======================searching date button===========================================
                Button searchButton_1 = new Button("Search");
                searchButton_1.setLayoutX(370);
                searchButton_1.setLayoutY(30);
                searchButton_1.setPrefSize(100,30);

                //find the match according to the date
                searchButton_1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        String searchMatchDate = searchBar_1.getText();

                        boolean matchDate = false;

                        for (MatchOfLeague match : matchOfLeagueList){
                            if (searchMatchDate.equals(match.getDateOfMatch().toString())){
                                Alert match_detail = new Alert(Alert.AlertType.INFORMATION);
                                match_detail.setTitle("Information Of Club");
                                match_detail.setHeaderText("Match is found");
                                match_detail.setContentText("Date of Match :- "+match.getDateOfMatch()+"\n"+"Team_1   :- "+match.getTeamNumOne()+"\n"+"Team_1 Goals :- "+match.getTeamNumOneScoreGoals()+"\n"+
                                        "Team_2   :- "+match.getTeamNumTwo()+"\n"+"Team_2 Goals :- "+match.getTeamNumOneReceiveGoals());


                                match_detail.show();
                                searchBar_1.clear();
                                matchDate = true;

                            }

                        }
                        if (!matchDate){
                            Alert notInClub = new Alert(Alert.AlertType.ERROR);
                            notInClub.setTitle("Information of Match");
                            notInClub.setHeaderText(" Match is not found. Try again");
                            notInClub.show();
                            searchBar_1.clear();
                        }

                    }
                });
                //==========================================================================


                //========Art of match font===============
                Label premierLeagueMatches = new Label("MATCHES");
                premierLeagueMatches.setLayoutX(150);
                premierLeagueMatches.setLayoutY(400);
                premierLeagueMatches.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 60));


                Pane root = new Pane();

                matchOfLeagueTableView_2.setLayoutX(50);
                matchOfLeagueTableView_2.setLayoutY(100);
                matchOfLeagueTableView_2.setPrefSize(600,300);

                matchOfLeagueTableView_2.setItems(matchDetail);
                matchOfLeagueTableView_2.getColumns().addAll(matchesDateColumn,matchesFirstClubColumn,matchesFirstClubScoreColumn,matchesSecondClubColumn,matchesFirstClubReceiveColumn);

                root.getChildren().addAll(matchOfLeagueTableView_2,premierLeagueMatches,searchBar_1,searchButton_1,sortDate);

                root.setStyle("-fx-background-color: #d94e6a;");

                matchStage.setScene(new Scene(root,700,500));
                matchStage.show();
            }
        });
        //======================================================================================

        TextField searchBar = new TextField();
        searchBar.setLayoutX(300);
        searchBar.setLayoutY(20);
        searchBar.setPrefSize(250,30);

        //==========================search clubs===================================
        Button searchButton = new Button("Search");
        searchButton.setLayoutX(580);
        searchButton.setLayoutY(20);
        searchButton.setPrefSize(100,30);

        //===========================search all clubs with their names============================
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String searchClubs = searchBar.getText().toUpperCase();

                boolean clubInLeague = false;

                for (SportClub club : clubsList){
                    if (searchClubs.equals(club.getNameOfTheClub())){
                        Alert clubDetails = new Alert(Alert.AlertType.INFORMATION);
                        clubDetails.setTitle("Information Of Club");
                        clubDetails.setHeaderText(club.getNameOfTheClub()+" club is found");
                        clubDetails.setContentText("Name of club :- "+club.getNameOfTheClub()+"\n"+"Location :- "+club.getLocation()+"\n"+"Name of manager :- "+club.getNameOfTheManager());

                        if (club instanceof FootballClub){
                            clubDetails.setContentText("Name of club         :- "+club.getNameOfTheClub()+"\n"+
                                    "Location                 :- "+club.getLocation()+"\n"+
                                    "Name of manager :- "+club.getNameOfTheManager()+"\n"+
                                    "Win                        :- "+((FootballClub) club).getNumOfWinMatches()+"\n"+
                                    "Draw                      :- "+((FootballClub) club).getNumOfDrawMatches()+"\n"+
                                    "Defeat                    :-"+((FootballClub) club).getNumOfDefeatMatches()+"\n"+
                                    "Score goals            :- "+((FootballClub) club).getScoreGoals()+"\n"+
                                    "Receive goals         :-"+ ((FootballClub) club).getReceiveGoals()+"\n"+
                                    "Points                     :- "+((FootballClub) club).getNumOfPoint()+"\n"+
                                    "Matches                 :- "+((FootballClub) club).getNumOfMatchesPlay());
                        }

                        clubDetails.show();
                        searchBar.clear();
                        clubInLeague = true;

                    }

                }
                if (!clubInLeague){
                    Alert notInClub = new Alert(Alert.AlertType.ERROR);
                    notInClub.setTitle("Information of Club");
                    notInClub.setHeaderText(" Club is not found. Try again");
                    notInClub.show();
                    searchBar.clear();
                }

            }
        });
        //===============================================================================================


        Label premierLeague = new Label("PREMIER LEAGUE MANAGER");
        premierLeague.setLayoutX(140);
        premierLeague.setLayoutY(500);
        premierLeague.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 60));


        Image imageOfPlayer = new Image("footballplayer.png");
        ImageView imageView = new ImageView(imageOfPlayer);

        imageView.setLayoutX(20);
        imageView.setLayoutY(0);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);



        VBox vBox = new VBox();

        HBox hBox = new HBox();

        Pane root = new Pane();

        root.setStyle("-fx-background-color: #ac02f5;");


        sportClubTableView_1.setItems(clubDetail);
        sportClubTableView_1.getColumns().addAll(nameColumn,locationColumn,nameOfManaColumn,winColumn,drawColumn,defeatColumn,scoreColumn,receiveColumn,pointColumn,matchesColumn);
        root.getChildren().addAll(sportClubTableView_1,pointSort,scoreSort,winSort,matchGen, sortDate,searchButton,searchBar,premierLeague,imageView);
        stage.setScene(new Scene(root,1280,600));
        stage.show();
    }


}
