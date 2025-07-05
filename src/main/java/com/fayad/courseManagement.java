package com.fayad;

import java.util.*;

public class courseManagement {

    private Map<Classroom,List<Course>> coursesinhall=new HashMap<>();
    public void enroll(Student student,Course course) {
        boolean missingPrerequisite = false;
        ArrayList<String> missing = new ArrayList<>();
        if (course.getPreRequisite() != null) {
            for (Course pre : course.getPreRequisite()) {
                if (!student.getCompletedCourse().containsKey(pre)) {
                    missing.add(pre.getCourseName());
                    missingPrerequisite = true;
                }
            }
        }
        if (!missing.isEmpty()) {
            System.out.println("Cannot enroll in " + course.getCourseName() + " because you didn't complete: " + missing);
            return;
        }
        if (student.getEnrolledCourses().contains(course)) {
            System.out.println("Already enrolled in " + course.getCourseName());
            return;
        }
        if(course.getClassroom().getCapacityOfHall()<=course.getStudentsInCourse())
        {
            System.out.println("sorry there is no place in the hall for you ");
            return;
        }
        for(Course course1:student.getEnrolledCourses())
        {
            if(course1.getTimePeriod()==course.getTimePeriod()&&course1.getSemester()==course.getSemester()&&course.getDayOfWeek()!=null&&!Collections.disjoint(course1.getDayOfWeek(),course.getDayOfWeek()))
            {
                System.out.println("Cant enroll in this course that time period is already occupied by "+course1.getCourseName());
                return;
            }
        }

        if (student.getFailedCourses().contains(course)) {
            student.getFailedCourses().remove(course);
            System.out.println("Re-attempting " + course.getCourseName());
        }
        student.getEnrolledCourses().add(course);
        course.setStudentsInCourse(course.getStudentsInCourse()+1);

        System.out.println("Enrolled in " + course.getCourseName() + " successfully");
    }
    public void assignClassRoom(Course course,Classroom classroom)
    {
        coursesinhall.putIfAbsent(classroom,new ArrayList<>());
        List<Course> courseList=coursesinhall.get(classroom);
        for(List<Course> courselist :coursesinhall.values())
        {
            for(Course course1:courselist)
            {
                if(course1.equals(course))
                {
                    System.out.println("this course is already held in this hall");
                    return;
                }
                if(course1.getSemester()==course.getSemester()&&course.getTimePeriod()==course1.getTimePeriod())
                {
                System.out.println("cant held at this hall since another course held here at the same time period : "+course1.getCourseName());
                return;
                }
            }
        }
        courseList.add(course);
        System.out.println("done");
    }
}