package com.fayad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public enum Classroom {
    hallone("101",3),
    halltow("102",3);

    private final String nameOfHall;
    private final int capacityOfHall;

    Classroom(String nameOfHall,int capacityOfHall)
    {
        this.capacityOfHall=capacityOfHall;
        this.nameOfHall=nameOfHall;
    }

    public int getCapacityOfHall() {
        return capacityOfHall;
    }

    public String getNameOfHall() {
        return nameOfHall;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "nameOfHall='" + nameOfHall + '\'' +
                ", capacityOfHall=" + capacityOfHall +
                '}';
    }
}
