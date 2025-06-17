package com.fayad;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {

    // one instructor for every course
    // each course has one or more department
    private Grade grade;
    private String CourseName;
    private int courseCode;
    private ArrayList<Course> preRequisite;
    private String term;
    private int credits;
    private Semester semester;
    private TimePeriod timePeriod;

    private static List<Course> AvailableCourses=new ArrayList<>();

    public Course(int credits,String courseName,String term,int courseCode,ArrayList<Course> preRequisite,Semester semester,TimePeriod timePeriod)
    {
        this.preRequisite = preRequisite != null ? preRequisite : new ArrayList<>();
        this.credits=credits;
        this.timePeriod=timePeriod;
        this.CourseName=courseName;
        this.term=term;
        this.courseCode=courseCode;
        this.semester=semester;
        AvailableCourses.add(this);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return courseCode == course.courseCode;  // Use unique identifier
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseCode);  // Same field used in equals()
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

    public String toString() {
        return getCourseName() + " - " + getTerm() + " (" + getCredits() + " credits)";

    }
}