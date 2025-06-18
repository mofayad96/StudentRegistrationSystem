package com.fayad;
import java.util.Collections;
import java.time.LocalDate;
import java.util.*;
public class Student  {
    int id;
    String name;
    String address;
    String phoneNum;
    private LocalDate DateOfBirth;
    private String semester;
    private int EnrolledYear;
    private List <Course> enrolledCourses;
    private Map<Course,Grade>completedCourse; //passed only
    private List<Course> failedCourses;
    private int FinishedHours;
    private Department department;
    private TimePeriod timePeriod;
    private double GPA;
    private Map<Course,Grade> attemptedCourses;//passed + failed
    public Student(int id, String name, String address, String phoneNum, String semester, LocalDate DateOfBirth, int EnrolledYear,Department department)
    {
        this.semester=semester;
        this.DateOfBirth=DateOfBirth;
        this.EnrolledYear=EnrolledYear;
        this.enrolledCourses=new ArrayList<>();
        this.completedCourse = new HashMap<>();
        this.failedCourses=new ArrayList<>();
        this.FinishedHours=0;
        this.attemptedCourses=new HashMap<>();
        this.name=name;
        this.id=id;
        this.department = department;
        department.students_in_department.add(this);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Map<Course, Grade> getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(Map<Course, Grade> completedCourse) {
        this.completedCourse = completedCourse;
    }

    public List<Course> getFailedCourses() {
        return failedCourses;
    }

    public void setFailedCourses(List<Course> failedCourses) {
        this.failedCourses = failedCourses;
    }

    public int getFinishedHours() {
        return FinishedHours;
    }

    public void setFinishedHours(int finishedHours) {
        FinishedHours = finishedHours;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Map<Course, Grade> getAttemptedCourses() {
        return attemptedCourses;
    }

    public void setAttemptedCourses(Map<Course, Grade> attemptedCourses) {
        this.attemptedCourses = attemptedCourses;
    }

    public int getEnrolledYear() {
        return EnrolledYear;
    }

    public void setEnrolledYear(int enrolledYear) {
        EnrolledYear = enrolledYear;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }
    @Override
    public String toString() {
        return getName();
    }
}
