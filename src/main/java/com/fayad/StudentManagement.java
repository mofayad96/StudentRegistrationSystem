package com.fayad;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentManagement {
    public double CGPA(Student student)
    {
        Map<Course,Grade> attempeted=student.getAttemptedCourses();
        double totalgradepoints=0.0;
        int totalcredits=0;
        if(attempeted.isEmpty())
        {
            return 0.0;
        }
        for(Map.Entry<Course,Grade>entry :attempeted.entrySet())
                {
                    Course course=entry.getKey();
                    Grade grade=entry.getValue();
                    int credits=course.getCredits();
                    double gradepoint=grade.getGpaPoints();
                    totalgradepoints +=(gradepoint*credits);
                    totalcredits +=credits;
                }
        return totalcredits >0 ?totalgradepoints/totalcredits :0.0;
    }
    public void completeCourse(Student student,Course course,Grade grade)
    {
        if(student.getEnrolledCourses().contains(course)&& grade.isPassing())
        {
            student.getEnrolledCourses().remove(course);
            student.getFailedCourses().remove(course);
            student.getCompletedCourse().put(course,grade);
            student.getAttemptedCourses().put(course,grade);
            student.setFinishedHours(student.getFinishedHours()+course.getCredits());
            course.setGrade(grade);
            System.out.println("completed "+course.getCourseName()+" with grade "+course.getGrade());
        }else if(grade==Grade.F&&!student.getFailedCourses().contains(course))
        {
            student.getAttemptedCourses().put(course,grade);
            student.getEnrolledCourses().remove(course);
            course.setGrade(grade);
            student.getFailedCourses().add(course);
            System.out.println("this course is not completed re attempt in future ");
        }else  {
            System.out.println("this course is not completed");
        }
    }
    public void studentTranscript(Student student)
    {
        System.out.println("taken courses"+student.getAttemptedCourses());
        System.out.println("Failed courses"+student.getFailedCourses());
        System.out.println("completed courses +grades"+student.getCompletedCourse());
        System.out.println("gpa "+CGPA(student));
    }
}