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

    public static void switchInEnum(Grade gr)
    {
        switch (gr)
        {
            case A :
                System.out.println("nice A");
                break;
            case B :
                System.out.println("nice B");
                break;
            case C:
                System.out.println("nice C");
                break;

            default:
                System.out.println("not good");
                break;
        }
    }

    public static void iterateOvervalues()
    {
        for(Grade g:Grade.values())
        {
            System.out.println(g);
        }
    }

    @Override
    public String toString() {
        return this.name() + " (" + gpaPoints + ")";
    }
}
