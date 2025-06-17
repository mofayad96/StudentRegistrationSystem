package com.fayad;

public enum Grade {
    A(4.0),
    B(3.0),
    C(2.0),
    D(1.0),
    F(0.0);

    private final double gpaPoints;

    Grade(double gpaPoints) {
        this.gpaPoints = gpaPoints;
    }


    public double getGpaPoints() {
        return gpaPoints;
    }


    public boolean isPassing() {
        return this != F;
    }

    @Override
    public String toString() {
        return this.name() + " (" + gpaPoints + ")";
    }
}
