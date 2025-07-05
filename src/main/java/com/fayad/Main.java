package com.fayad;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course(3, "math", "spring", 22, null, Semester.SPRING, TimePeriod.FirstPeriod, null, Classroom.Room_101, Arrays.asList(DayOfWeek.SUNDAY, DayOfWeek.MONDAY));
        Course oopcourse = new Course(4, "oop ", "Spring", 222, null, Semester.SPRING, TimePeriod.FirstPeriod, null, Classroom.UNASSIGNED, Arrays.asList(DayOfWeek.THURSDAY, DayOfWeek.MONDAY));
        Course c3 = new Course(3, "Science", "spring", 23, null, Semester.SPRING, TimePeriod.SecondPeriod, null, Classroom.Room_103, Arrays.asList(DayOfWeek.THURSDAY, DayOfWeek.MONDAY));
        Course c4 = new Course(3, "intro to computer system", "winter", 24, null, Semester.WINTER, TimePeriod.SecondPeriod, null, Classroom.UNASSIGNED, Arrays.asList(DayOfWeek.FRIDAY));
        Course test = new Course(3, " systems", "winter", 24, new ArrayList<>(Arrays.asList(c1, oopcourse)), Semester.WINTER, TimePeriod.SecondPeriod, null, Classroom.UNASSIGNED, null);
        Course c5 = new Course(3, "intro to systems", "winter", 24, null, Semester.SPRING, TimePeriod.ThirdPeriod, null, Classroom.Room_101, null);
        Department CS = new Department(1123, "CyberSecuity");
        Department AI = new Department(1123, "AI");
        courseManagement cm1=new courseManagement();
        StudentManagement sm1=new StudentManagement();
////        //creating new student

        Student s1 = new Student(22010, "mohamed", "d", "20", "w", LocalDate.of(2, 2, 2), 2004, CS);
        Student s2 = new Student(22011, "Ahmed", "d", "21", "w", LocalDate.of(2, 2, 2), 2004, AI);
        Student s3 = new Student(22012, "Mona", "d", "24", "w", LocalDate.of(2, 2, 2), 2004, AI);
        Instructor i1 = new Instructor(2, "Zaki", "tunisia", "010023444");
        Instructor i2 = new Instructor(2, "Mahmoud", "tunisia", "010023444");

        cm1.enroll(s1,c1);
        sm1.completeCourse(s1,c1,Grade.A);
        System.out.println(sm1.CGPA(s1));
        System.out.println(s1.getAttemptedCourses());
       System.out.println( s1.getName() );


    }
}
