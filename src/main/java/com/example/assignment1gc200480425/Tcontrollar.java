package com.example.assignment1gc200480425;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static jdk.internal.org.jline.utils.Colors.s;

public class Tcontrollar implements Initializable {

    @FXML
    private TableView<Batting> tblv;

        @FXML
        private TableColumn<Batting, String> playercolumn;

        @FXML
        private TableColumn<Batting, String> matchcolumn;

        @FXML
        private TableColumn<Batting, String> bowlercolumn;

        @FXML
        private TableColumn<Batting, Integer> runscolumn;

        @FXML
        private TableColumn<Batting, Integer> ballscolumn;

        @FXML
        private TableColumn<Batting, Integer> fourscolumn;

        @FXML
        private TableColumn<Batting, Integer> sixcolumn;

        @FXML
        private Button viewcolumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        playercolumn.setCellValueFactory(new PropertyValueFactory<>("PlayerName"));
        matchcolumn.setCellValueFactory(new PropertyValueFactory<>("MatchPlayingOrder"));
        bowlercolumn.setCellValueFactory(new PropertyValueFactory<>("BowlerName"));
        runscolumn.setCellValueFactory(new PropertyValueFactory<>("Runs"));
        ballscolumn.setCellValueFactory(new PropertyValueFactory<>("Balls"));
        fourscolumn.setCellValueFactory(new PropertyValueFactory<>("Fours"));
        sixcolumn.setCellValueFactory(new PropertyValueFactory<>("Sixes"));
        tblv.getItems().addAll(DbUtility.getBattingFromDB());


    }
    @FXML
    private void chartView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"Chartview.fxml");
    }
}


