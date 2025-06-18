package com.fayad;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Course c1=new Course(3,"math","spring",22,null,Semester.SPRING,TimePeriod.FirstPeriod,null,Classroom.Room_101,Arrays.asList(DayOfWeek.SUNDAY,DayOfWeek.MONDAY));
        Course oopcourse=new Course(4,"oop ","Spring",222,null,Semester.SPRING,TimePeriod.FirstPeriod,null,Classroom.UNASSIGNED,Arrays.asList(DayOfWeek.THURSDAY,DayOfWeek.MONDAY));
        Course c3=new Course(3,"Science","spring",23,null,Semester.SPRING,TimePeriod.SecondPeriod,null,Classroom.Room_103,Arrays.asList(DayOfWeek.THURSDAY,DayOfWeek.MONDAY));
        Course c4=new Course(3,"intro to computer system","winter",24,null,Semester.WINTER,TimePeriod.SecondPeriod,null,Classroom.UNASSIGNED,Arrays.asList(DayOfWeek.FRIDAY));
        Course test=new Course(3," systems","winter",24,new ArrayList<>(Arrays.asList(c1,oopcourse)),Semester.WINTER,TimePeriod.SecondPeriod,null,Classroom.UNASSIGNED,null);
        Course c5=new Course(3,"intro to systems","winter",24,null,Semester.SPRING, TimePeriod.ThirdPeriod,null,Classroom.Room_101,null);
        Department CS=new Department(1123,"CyberSecuity");
        Department AI=new Department(1123,"AI");

////        //creating new student

        Student s1=new Student(2,"mohamed","d","2","w",LocalDate.of(2,2,2),2004,CS);
        System.out.println("---------");
        Student s2=new Student(2,"Ahmed","d","2","w",LocalDate.of(2,2,2),2004,AI);
        Student s4=new Student(2,"Ahmed","d","2","w",LocalDate.of(2,2,2),2004,AI);
        Student s3=new Student(2,"Mona","d","2","w",LocalDate.of(2,2,2),2004,AI);
        Student s7=new Student(2,"Mona","d","2","w",LocalDate.of(2,2,2),2004,AI);
        Instructor i1=new Instructor(2,"Zaki","tunisia","010023444");
        Instructor i2=new Instructor(2,"Mahmoud","tunisia","010023444");
        //System.out.println("tessssst");
//        System.out.println("normal assign");
      courseManagement cm=new courseManagement();
//        cm.assignClassRoom(c1,Classroom.hallone);
//        cm.assignClassRoom(oopcourse,Classroom.hallone);
//        cm.assignClassRoom(c1,Classroom.hallone);



//        i1.associate_with_department(AI);
//        i1.associate_with_department(CS);
//        i2.associate_with_department(CS);
//        System.out.println(i1.getWork_in_departments());
//////        d1.add_student_to_department(s1); // tmam
//////        d2.add_student_to_department(s1);// added to ai
//////        DepartmentManagement.move_student_to_another_department(s1,d1,d2);
//////        DepartmentManagement.remove_instructor_from_department(i1,d2);
//        i1.remove_work_in_department(AI);
//        System.out.println(i1.getWork_in_departments());

//        s1.enroll(c4);
//        s1.enroll(c1);
//        s1.enroll(test);
//        s1.enroll(c1);
//        s1.enroll(oopcourse);
//        System.out.println(s1.getEnrolledCourses());
//        System.out.println("------------");
//        s1.completeCourse(c1,Grade.C);
//        //s1.completeCourse(c4,Grade.A);
//        s1.completeCourse(oopcourse,Grade.A);
//        s1.enroll(test);
//
//        System.out.println(i1.getTeachingCourses());
//        System.out.println(c1.getInstructor());
//        c1.associateInstructor(i1);
//        System.out.println(i1.getTeachingCourses());
//        System.out.println(c1.getInstructor());
//
//        System.out.println("=--------");
//        System.out.println("another instructor teaching this course");
//        c1.associateInstructor(i2);
//        System.out.println("associate same instructor");
//        c1.associateInstructor(i1);
//        System.out.println("associate with same time periods courses");
//        c3.associateInstructor(i1);
//        oopcourse.associateInstructor(i1);
//        System.out.println("----");
//        System.out.println(i1.getTeachingCourses());
//        System.out.println("----");
//        System.out.println(i2.getTeachingCourses());
//        System.out.println("----");
//        System.out.println(c1.getInstructor());
//        System.out.println("----");
//        oopcourse.associateInstructor(i2);
//        System.out.println(oopcourse.getInstructor());


//        Department cs = new Department(1, "CS");
//        Department ai = new Department(2, "AI");
//
//        Student s = new Student(1001, "Mohamed", "Alex", "0123456", "6th", LocalDate.of(2004, 3, 1), 2022, cs);
//
//        System.out.println("--------");
//
//
//        DepartmentManagement.move_student_to_another_department(s, cs, ai);
//        s.transcript();



        //System.out.println(d1.getInstructors_in_Department());

//        System.out.println("----");
//        AI.add_student_to_department(s1);
//        CS.add_student_to_department(s2);
//        System.out.println(s1.getDepartment());
//        System.out.println(AI.getStudents_in_department());
//        System.out.println(CS.getStudents_in_department());
//        System.out.println("--------------");
//        DepartmentManagement ad1=new DepartmentManagement();
//        ad1.move_student_to_another_department(s2,AI,CS);
//        ad1.move_student_to_another_department(s1,CS,AI);
//        ad1.move_student_to_another_department(s3,AI,CS);
//
//
//        System.out.println(s1.getDepartment());
//        System.out.println("AI students"+AI.getStudents_in_department());
//        System.out.println("CS Students"+CS.getStudents_in_department());
//        //        s1.enroll(c1);
        cm.enroll(s4,c1);
        cm.enroll(s4,c5);
        cm.enroll(s4,c3);
//        cm.enroll(s4,c1);
//        cm.enroll(s1,c1);
        StudentManagement sm=new StudentManagement();
        sm.completeCourse(s4,c1,Grade.A);
        sm.completeCourse(s4,c5,Grade.B);
        sm.completeCourse(s4,c3,Grade.A);
        System.out.println(sm.CGPA(s4));
        sm.studentTranscript(s4);
        //cm.enroll(s3,c1);
        //s4.enroll(c1);
        //s3.enroll(c1);
       //s1.enroll(c1);
        //s7.enroll(c1);
       // System.out.println(s2.getEnrolledCourses());
       //s1.enroll(oopcourse);
       //s1.enroll(c4);
        //System.out.println(c1.getStudentsInCourse());
        //System.out.println(c1.getClassroom().getCapacityOfHall());

//        s1.completecourse(c7,Grade.A);
//        s1.completecourse(c1,Grade.F);
//        s1.completecourse(c2,Grade.B);
//        System.out.println(s1.getFailedCourses());
//        System.out.println(s1.getCompletedCourses());
//        System.out.println(s1.getFinishedHours());

//        System.out.println(s1.getEnrolledCourses());
//        System.out.println(Courses.getAvailableCourses());
//        Student s6=new Student(1001, "Mohamed", "Alex", "0123456", "6th", LocalDate.of(2004, 3, 1), 2022,d1);
//       // System.out.println(c4.getPreRequisite());
//        System.out.println("----------");
//            s6.enroll(c4);
//            s6.enroll(c1);
//            s6.enroll(c2);
//            s6.enroll(c3);
//
//        s6.completeCourse(c1,Grade.F);
//        s6.completeCourse(c2,Grade.F);
//        s6.completeCourse(c3,Grade.F);
//        s6.enroll(c1);
//        //s6.enroll(c7);


    }
}
