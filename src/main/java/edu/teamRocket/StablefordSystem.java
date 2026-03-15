package edu.teamRocket;

public enum StablefordSystem {
    /*
     * DOUBLE_BOGEY: -3 puntos, 2 o más golpes sobre par
     * BOGEY: -1 punto, 1 sobre par
     * PAR: 0 puntos
     * BIRDIE: 2 puntos, 1 bajo par
     * EAGLE: 5 puntos, 2 bajo par
     * ALBATROSS: 8 puntos, 3 bajo par
     */
    DOUBLE_BOGEY(-3),
    BOGEY(-1),
    PAR(0),
    BIRDIE(2),
    EAGLE(5),
    ALBATROSS(8);
    private final int points;

    StablefordSystem(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return this.name() + ": " + this.points;
    }
}
