package com.example.assignment1gc200480425;

import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

public class DbUtility {

    private static String user = DbCredentials.user;
    private static String password = DbCredentials.password;
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/Divykumar200480425";

    public static ArrayList<Batting> getBattingFromDB()
    {
        ArrayList<Batting> battings = new ArrayList<>();

        String sql = "select * from batting;";

        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String PlayerName  = resultSet.getString("PlayerName");
                String MatchPlayingOrder  = resultSet.getString("MatchPlayingOrder");
                String BowlerName = resultSet.getString("BowlerName");
                String OutDesc = resultSet.getString("OutDesc");
                int Runs = resultSet.getInt("Runs");
                int Balls = resultSet.getInt("Balls");
                int DotBalls = resultSet.getInt("DotBalls");
                int Fours = resultSet.getInt("Fours");
                int Sixes = resultSet.getInt("Sixes");


                battings.add(new Batting(PlayerName,MatchPlayingOrder,BowlerName,OutDesc,Runs,Balls,DotBalls,Fours,Sixes));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return battings;
    }
    public static XYChart.Series<String, Integer> getRunByPlayerName() {

        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        series.setName("Run");

        String sql = "select PlayerName, Runs from batting " +
                "WHERE RUNS >= 50;";

        try(
                Connection conn = DriverManager.getConnection(connectURL,user,password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next())
            {
                String PlayerName = resultSet.getString("PlayerName");
                Integer Runs = resultSet.getInt("Runs");

                series.getData().add(new XYChart.Data<>(PlayerName, Runs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return series;
    }

}
