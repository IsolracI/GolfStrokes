package edu.teamRocket;

import java.util.List;

public class StrokePlay implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        List<Player> players = scoreCard.getPlayers();

        for (Player player : players) {
            byte[] playerCourse = scoreCard.getPlayerCourse(player);
            short playerScore = 0;
            for (byte b : playerCourse) {
                playerScore += b;
            }
            player.setScore(playerScore);
        }
    }
}
