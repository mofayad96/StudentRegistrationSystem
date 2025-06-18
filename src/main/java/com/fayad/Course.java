package com.fayad;
import java.util.*;
import java.time.DayOfWeek;
import java.util.Collections;

public class Course {
    private ArrayList<DayOfWeek> dayOfWeek;
    private Grade grade;
    private String CourseName;
    private int courseCode;
    private ArrayList<Course> preRequisite;
    private String term;
    private int credits;
    private Semester semester;
    private TimePeriod timePeriod;
    private Instructor instructor;
    private Classroom classroom;


    private static List<Course> AvailableCourses=new ArrayList<>();

    public Course(int credits, String courseName, String term, int courseCode, ArrayList<Course> preRequisite, Semester semester, TimePeriod timePeriod, Instructor instructor, Classroom classroom,List<DayOfWeek> dayOfWeek)
    {
        this.preRequisite = preRequisite != null ? preRequisite : new ArrayList<>();
        this.credits=credits;
        this.timePeriod=timePeriod;
        this.CourseName=courseName;
        this.term=term;
        this.courseCode=courseCode;
        this.semester=semester;
        AvailableCourses.add(this);
        this.instructor=instructor;
        this.classroom=classroom;
//        dayOfWeek != null - This is the condition being checked
//        We're testing if the parameter dayOfWeek that was passed to the constructor is not null
//        new ArrayList<>(dayOfWeek) - This is what happens if the condition is TRUE
//        Creates a new ArrayList and copies all elements from the parameter dayOfWeek into it
//        This is called a "copy constructor" - it makes a defensive copy
//        new ArrayList<>() - This is what happens if the condition is FALSE
//        Creates a new empty ArrayList
        this.dayOfWeek = dayOfWeek != null ? new ArrayList<>(dayOfWeek) : new ArrayList<>();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return this.getCourseCode() == course.getCourseCode() &&
                this.getCourseName().equals(course.getCourseName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getCourseName(), this.getCourseCode());
    }


    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public void associateInstructor(Instructor instructor) {
        if(instructor.getTeachingCourses().contains(this)) {
            System.out.println("This course is already assigned to this instructor");
            return;
        }

        if(this.getInstructor() != null) {
            System.out.println("This course is assigned to another instructor: " + this.getInstructor().getName());
            return;
        }

        for(Course course1 : instructor.getTeachingCourses()) {
            // Check for null values first, then check for time conflicts
            if(course1.getSemester() == this.getSemester() &&
                    this.getDayOfWeek() != null &&
                    course1.getDayOfWeek() != null &&
                    course1.getTimePeriod() == this.getTimePeriod()&&
                    !Collections.disjoint(course1.getDayOfWeek(), this.getDayOfWeek()) ) {

                System.out.println("Cannot assign instructor to this course. Time conflict with: " + course1.getCourseName());
                return;
            }
        }

        this.setInstructor(instructor);
        instructor.getTeachingCourses().add(this);
        System.out.println("Successfully associated " + instructor.getName() + " with " + this.getCourseName());
    }

    public ArrayList<Course> getPreRequisite() {
        return preRequisite;
    }

    public void setPreRequisite(ArrayList<Course> preRequisite) {
        this.preRequisite = preRequisite;
    }
    public static List<Course> getAvailableCourses() {
        return AvailableCourses;
    }

    public static void setAvailableCourses(List<Course> availableCourses) {
        AvailableCourses = availableCourses;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    private void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<DayOfWeek> getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(ArrayList<DayOfWeek> dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String toString() {
        return getCourseName() + " - " + getTerm() + " (" + getCredits() + " credits)";

    }
}