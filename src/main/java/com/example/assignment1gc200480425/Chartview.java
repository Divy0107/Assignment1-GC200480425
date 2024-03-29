package com.example.assignment1gc200480425;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Chartview implements Initializable {

    @FXML
    private BarChart<String, Integer> BARCHART;

    @FXML
    private PieChart piechart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BARCHART.getData().addAll(DbUtility.getRunByPlayerName());
    }
    @FXML
    private void tableView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event,"Table.fxml");
    }
}


