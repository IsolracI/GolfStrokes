package edu.teamRocket;

import com.google.common.primitives.Bytes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScoreCard {
    private final Byte NUM_HOLES;
    private Player playerA;
    private Player playerB;
    private Player playerC;
    private Player playerD;
    private List<Hole> holes;
    private Course playersCourse;

    ScoreCard() {
        this.NUM_HOLES = 18;
        holes = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        Player[] players = {playerA, playerB, playerC, playerD};
        List<Player> playersList = new ArrayList<>();

        for (Player player : players) {
            if (player != null) {
                playersList.add(player);
            }
        }
        return playersList;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerA() {
        return this.playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public Player getPlayerB() {
        return this.playerB;
    }

    public void setPlayerC(Player playerC) {
        this.playerC = playerC;
    }

    public Player getPlayerC() {
        return this.playerC;
    }

    public void setPlayerD(Player playerD) {
        this.playerD = playerD;
    }

    public Player getPlayerD() {
        return this.playerD;
    }

    public void setPlayersCourse(Course playersCourse) {
        this.playersCourse = playersCourse;
    }

    public byte[] getPlayerCourse(Player player) {
        return this.playersCourse.getPlayerCourse(player);
    }

    public void addHoles(Byte[] holes) {
        byte number = 1;
        for (byte hole : holes) {
            this.holes.add(new Hole(number, hole));
            number++;
        }
    }

    public int getNumHoles() {
        return this.NUM_HOLES;
    }

    public List<Hole> getHoles() {
        return this.holes;
    }
}
