package edu.teamRocket;

class Hole {
    private final Byte number;
    private final Byte par;

    Hole(Byte number, Byte par) {
        this.number = number;
        this.par = par;
    }

    Byte getNumber() {
        return this.number;
    }

    Byte getPar() {
        return this.par;
    }

    @Override
    public String toString() {
        return "   " + getNumber() + " - " + getPar();
    }
}
