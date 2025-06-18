package com.fayad;

import java.util.ArrayList;

public class Instructor  {
    private int id;
    private String name;
    private String address;
    private String phone;
    private ArrayList<Department> work_in_departments;
    private ArrayList<Course> teachingCourses;

    public Instructor(int id,String name,String address,String phone)
    {
        this.address=address;
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.work_in_departments=new ArrayList<>();
        this.teachingCourses=new ArrayList<>();
    }
    //add to department
    public void associate_with_department(Department department) {
        if(!this.work_in_departments.contains(department))
        {
            work_in_departments.add(department);
            DepartmentManagement.add_instructor_to_Department(this,department);
            System.out.println(this.getName()+" associated successfully with "+department.getName());
        }else
        {
            System.out.println("failed");
        }
    }

    //remove department
    public void remove_associated_department(Department department)
    {
        if(work_in_departments.contains(department))
        {
            work_in_departments.remove(department);
            System.out.println("removed successfully");
        }else
        {
            System.out.println(this.getName()+" is not associated with this department "+department.getName());
        }
    }


    public ArrayList<Department> getWork_in_departments() {
        return work_in_departments;
    }

    public void setWork_in_departments(ArrayList<Department> work_in_departments) {
        this.work_in_departments = work_in_departments;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(ArrayList<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    public String toString()
    {
        return getName()+" "+getId();
    }
}
