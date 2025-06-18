package com.fayad;

import java.util.ArrayList;

public class DepartmentManagement  {

    public DepartmentManagement() {

    }

    public static void move_student_to_another_department(Student student,Department from,Department to)
    {
        if(student.getDepartment()==null)

        {
            System.out.println("student is not in a department");
            return;
        }
        if(student.getDepartment()==to)
        {
            System.out.println("student already in this department");
            return;
        }
        from.remove_student_from_department(student);
        student.setDepartment(null);  // Important step to allow re-adding
        boolean moved = to.add_student_to_department_for_moving(student);

        if (moved) {
            System.out.println("moved from " + from.getName() + " to " + to.getName());
        } else {
            // Optional: rollback
            from.add_student_to_department_for_moving(student);
            System.out.println("move failed, student returned to original department");
        }

    }

    public static void add_instructor_to_Department(Instructor instructor,Department department)
    {
        if(!department.getInstructors_in_Department().contains(instructor))
        {
            department.instructors_in_Department.add(instructor);
            // System.out.println("added to department successfully");
        }else{
            System.out.println("already in department");
        }

    }
    public static void remove_instructor_from_department(Instructor instructor,Department department)
    {
        if(instructor.getWork_in_departments().contains(department))
        {
            department.instructors_in_Department.remove(instructor);
            instructor.remove_associated_department(department);
            System.out.println("Removed "+instructor.getName()+" from "+department.getName()+" successfully");
        }else {
            System.out.println("Instructor is not part of this department: " + department.getName());
        }
    }

}
