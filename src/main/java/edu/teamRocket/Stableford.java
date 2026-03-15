package edu.teamRocket;

import java.util.List;

public class Stableford  implements GolfPlay {

    @Override
    public void scoring(ScoreCard scoreCard) {
        List<Player> players = scoreCard.getPlayers();

        for (Player player : players) {
            byte[] playerCourse = scoreCard.getPlayerCourse(player);
            List<Hole> holes = scoreCard.getHoles();
            short playerPoints = 0;
            int courseIndex = 0;
            /*
             * DOUBLE_BOGEY: -3 puntos, 2 o más golpes sobre par
             * BOGEY: -1 punto, 1 sobre par
             * PAR: 0 puntos
             * BIRDIE: 2 puntos, 1 bajo par
             * EAGLE: 5 puntos, 2 bajo par
             * ALBATROSS: 8 puntos, 3 bajo par
             */
            for (Hole hole : holes) {
                short strokes = (short) (playerCourse[courseIndex] - hole.getPar());
                if (strokes >= 2) {
                    playerPoints += (short) StablefordSystem.DOUBLE_BOGEY.getPoints();
                }
                else if (strokes == 1) {
                    playerPoints += (short) StablefordSystem.BOGEY.getPoints();
                }
                else if (strokes == 0) {
                    playerPoints += (short) StablefordSystem.PAR.getPoints();
                }
                else if (strokes == -1) {
                    playerPoints += (short) StablefordSystem.BIRDIE.getPoints();
                }
                else if (strokes == -2) {
                    playerPoints += (short) StablefordSystem.EAGLE.getPoints();
                }
                else {
                    playerPoints += (short) StablefordSystem.ALBATROSS.getPoints();
                }
                courseIndex++;
            }
            player.setPoints(playerPoints);
        }
    }
}
