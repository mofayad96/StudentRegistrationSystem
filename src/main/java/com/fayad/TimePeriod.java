package com.fayad;
import java.time.*;
public enum TimePeriod {

    FirstPeriod(LocalTime.of(8,30),LocalTime.of(10,29)),
    SecondPeriod(LocalTime.of(10,30),LocalTime.of(12,29)),
    ThirdPeriod(LocalTime.of(12,30),LocalTime.of(2,29)),
    FourthPeriod(LocalTime.of(2,30),LocalTime.of(4,29)),
    FifthPeriod(LocalTime.of(4,30),LocalTime.of(6,30));


    private final LocalTime startTime;
    private final LocalTime endTime;

    TimePeriod(LocalTime startTime, LocalTime endTime)
    {
        this.endTime=endTime;
        this.startTime=startTime;
    }

    public LocalTime getStartTime()
    {
        return startTime;
    }

    public LocalTime getEndTime()

    {
        return endTime;
    }

    public String toString()
    {
    return name()+" starts at "+startTime+" and ends at "+endTime;
    }

}
