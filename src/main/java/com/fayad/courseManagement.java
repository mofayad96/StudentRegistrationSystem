package com.fayad;

import java.util.*;

public class courseManagement {
    private Map<Classroom,List<Course>> coursesinhall=new HashMap<>();


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
