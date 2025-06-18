package com.fayad;

import javax.swing.*;
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



    public void completeCourse(Course course,Grade grade)
    {

        if(this.getEnrolledCourses().contains(course)&& grade.isPassing())
        {
            this.getEnrolledCourses().remove(course);
            this.failedCourses.remove(course);
            this.completedCourse.put(course,grade);
            this.attemptedCourses.put(course,grade);
            this.setFinishedHours(this.getFinishedHours()+course.getCredits());
            course.setGrade(grade);
            System.out.println("completed "+course.getCourseName()+" with grade "+course.getGrade());
        }else if(grade==Grade.F&&!failedCourses.contains(course))
        {
            this.getAttemptedCourses().put(course,grade);
            this.enrolledCourses.remove(course);
            course.setGrade(grade);
            this.failedCourses.add(course);
            System.out.println("this course is not completed re attempt in future ");
        }else  {
            System.out.println("this course is not completed");

        }
    }



    public void enroll(Course course) {
        boolean missingPrerequisite = false;
        ArrayList<String> missing = new ArrayList<>();
//        if(classroom.getRoom_capacity().get(classroom) <= this.getStudentsinhall())
//        {
//            System.out.println("sorry no place in hall");
//            return;
//        }

        if (course.getPreRequisite() != null) {
            for (Course pre : course.getPreRequisite()) {
                if (!this.completedCourse.containsKey(pre)) {
                    missing.add(pre.getCourseName());
                    missingPrerequisite = true;
                }
            }
        }

        if (!missing.isEmpty()) {
            System.out.println("Cannot enroll in " + course.getCourseName() + " because you didn't complete: " + missing);
            return;
        }
        if (this.enrolledCourses.contains(course)) {
            System.out.println("Already enrolled in " + course.getCourseName());
            return;
        }
        for(Course course1:this.enrolledCourses)
        {
            if(course1.getTimePeriod()==course.getTimePeriod()&&course1.getSemester()==course.getSemester()&&course.getDayOfWeek()!=null&&course1.getDayOfWeek()!=null&&course1.getDayOfWeek()==course.getDayOfWeek())
            {
                System.out.println("Cant enroll in this course that time period is already occupied by "+course1.getCourseName());
                return;
            }
        }

        if (this.failedCourses.contains(course)) {
            this.failedCourses.remove(course);
            System.out.println("Re-attempting " + course.getCourseName());
        }

        this.enrolledCourses.add(course);

        System.out.println("Enrolled in " + course.getCourseName() + " successfully");
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

    @Override
    public String toString() {
        return getName();
    }
}
