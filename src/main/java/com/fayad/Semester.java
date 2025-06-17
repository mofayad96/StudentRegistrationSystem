package com.fayad;
import java.time.Month;
import java.time.LocalDate;
public enum Semester {
    SPRING(LocalDate.of(LocalDate.now().getYear(), Month.MARCH,20),LocalDate.of(LocalDate.now().getYear(),Month.JUNE,20)),
    SUMMER(LocalDate.of(LocalDate.now().getYear(),Month.JUNE,21),LocalDate.of(LocalDate.now().getYear(),Month.SEPTEMBER,21)),
    AUTUMAN(LocalDate.of(LocalDate.now().getYear(),Month.SEPTEMBER,22),LocalDate.of(LocalDate.now().getYear(),Month.DECEMBER,20)),
    WINTER(LocalDate.of(LocalDate.now().getYear(),Month.DECEMBER,21),LocalDate.of(LocalDate.now().getYear(), Month.MARCH,19));


    private final LocalDate start;
    private final LocalDate end;

    Semester(LocalDate start, LocalDate end)
    {
        this.start=start;
        this.end=end;
    }

    public LocalDate getStart()
    {
        return start;
    }
    public LocalDate getEnd()
    {
        return end;
    }

    public String toString(){
        return name()+" starts "+getStart()+"and ends "+getEnd();
    }

}
