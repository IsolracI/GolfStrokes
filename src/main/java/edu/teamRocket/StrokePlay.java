package edu.teamRocket;

import java.util.List;

public class StrokePlay implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        List<Player> players = scoreCard.getPlayers();

        for (Player player : players) {
            byte[] playerCourse = scoreCard.getPlayerCourse(player);
            short playerScore = 0;
            for (byte strokes : playerCourse) {
                playerScore += strokes;
            }
            player.setScore(playerScore);
        }
    }
}
