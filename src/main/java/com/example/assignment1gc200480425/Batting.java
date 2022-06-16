package com.example.assignment1gc200480425;

public class Batting {
    private String PlayerName;
    private String MatchPlayingOrder;
    private String BowlerName;
    private String OutDesc;
    private int Runs;
    private int Balls;
    private int DotBalls;
    private int Fours;
    private int Sixes;

    public Batting(String playerName, String matchPlayingOrder, String bowlerName, String outDesc, int runs, int balls, int dotBalls, int fours, int sixes) {
        PlayerName = playerName;
        MatchPlayingOrder = matchPlayingOrder;
        BowlerName = bowlerName;
        OutDesc = outDesc;
        Runs = runs;
        Balls = balls;
        DotBalls = dotBalls;
        Fours = fours;
        Sixes = sixes;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public String getMatchPlayingOrder() {
        return MatchPlayingOrder;
    }

    public void setMatchPlayingOrder(String matchPlayingOrder) {
        MatchPlayingOrder = matchPlayingOrder;
    }

    public String getBowlerName() {
        return BowlerName;
    }

    public void setBowlerName(String bowlerName) {
        BowlerName = bowlerName;
    }

    public String getOutDesc() {
        return OutDesc;
    }

    public void setOutDesc(String outDesc) {
        OutDesc = outDesc;
    }

    public int getRuns() {
        return Runs;
    }

    public void setRuns(int runs) {
        Runs = runs;
    }

    public int getBalls() {
        return Balls;
    }

    public void setBalls(int balls) {
        Balls = balls;
    }

    public int getDotBalls() {
        return DotBalls;
    }

    public void setDotBalls(int dotBalls) {
        DotBalls = dotBalls;
    }

    public int getFours() {
        return Fours;
    }

    public void setFours(int fours) {
        Fours = fours;
    }

    public int getSixes() {
        return Sixes;
    }

    public void setSixes(int sixes) {
        Sixes = sixes;
    }
}
