package com.fayad;

import java.util.ArrayList;

public class Department {
    private int id;
    private String name;
    protected ArrayList<Instructor> instructors_in_Department;
    protected ArrayList<Student> students_in_department;


    public Department(int id,String name)
    {
        this.id=id;
        this.name=name;
        this.instructors_in_Department=new ArrayList<>();
        this.students_in_department=new ArrayList<>();

    }

    public void add_student_to_department(Student student) {
        if (!students_in_department.contains(student)) {
            if (student.getDepartment() == null) {
                students_in_department.add(student);
                System.out.println("added successfully to department of "+this.getName());
                student.setDepartment(this);

            } else {
                System.out.println("student already in another department: " + student.getDepartment().getName());
            }
        } else {
            System.out.println("student already in this department");
        }
    }
    public boolean add_student_to_department_for_moving(Student student) {
        if (students_in_department.contains(student)) {
            System.out.println("student already in this department");
            return false;
        }

        if (student.getDepartment() != null && student.getDepartment() != this) {
            System.out.println("student is still assigned to another department: " + student.getDepartment().getName());
            return false;
        }

        students_in_department.add(student);
        student.setDepartment(this);
        //System.out.println("added successfully to department of " + this.getName());
        return true;
    }



    public void remove_student_from_department(Student student)
    {
        if(students_in_department.contains(student))
        {
            students_in_department.remove(student);
        }else {
            System.out.println("he is not part of this department");
        }
    }
    public ArrayList<Instructor> getInstructors_in_Department() {
        return instructors_in_Department;
    }

    public void setInstructors_in_Department(ArrayList<Instructor> instructors_in_Department) {
        this.instructors_in_Department = instructors_in_Department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents_in_department() {
        return students_in_department;
    }

    public void setStudents_in_department(ArrayList<Student> students_in_department) {
        this.students_in_department = students_in_department;
    }

    public String toString()
    {
        return getName();
    }
}
