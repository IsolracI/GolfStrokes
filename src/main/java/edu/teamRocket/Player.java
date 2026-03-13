package edu.teamRocket;

class Player {
    private final String INITIALS;
    private Byte handicap;
    private short score = 0;
    private short points = 0;

    Player(String initials, Byte handicap) {
        this.INITIALS = initials;
        this.handicap = handicap;
    }

    public String getInitials() {
        return this.INITIALS;
    }

    public Byte getHandicap() {
        return this.handicap;
    }

    public void setHandicap(Byte handicap) {
        this.handicap = handicap;
    }

    public short getScore() {
        return this.score;
    }

    public void setScore(short score) {
        this.score = score;
    }

    public short getPoints() {
        return this.points;
    }

    public void setPoints(short points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return getInitials() + "---> Handicap: " + getHandicap() + " Scores: " + getScore() + " Points: " + getPoints();
    }
}