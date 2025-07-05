package com.fayad;
public enum Classroom {
    Room_101(3),
    Room_102(3),
    Room_103(3),
    UNASSIGNED(0);


    private final int capacityOfHall;

    Classroom(int capacityOfHall)
    {
        this.capacityOfHall=capacityOfHall;
    }

    public int getCapacityOfHall() {
        return capacityOfHall;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "capacityOfHall=" + capacityOfHall +
                '}';
    }
}
