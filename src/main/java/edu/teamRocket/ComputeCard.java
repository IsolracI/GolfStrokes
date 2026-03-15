package edu.teamRocket;

public class ComputeCard {
    private final ScoreCard scoreCard;
    private final GolfPlay golfPlay;

    ComputeCard(ScoreCard scoreCard, GolfPlay golfPlay) {
        this.scoreCard = scoreCard;
        this.golfPlay = golfPlay;
    }

    public void compute() {
        this.golfPlay.scoring(this.scoreCard);
    }
}
