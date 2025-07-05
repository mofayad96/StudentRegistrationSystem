## StudentRegistrationSystem

## Overview

This system provides a complete solution for managing academic operations in a university setting. It handles student enrollment, course prerequisites, classroom assignments, instructor scheduling, and academic performance tracking with GPA calculations.

## Features

### Core Functionality
- **Student Management**: Registration, enrollment, transcript generation, and GPA calculation
- **Course Management**: Course creation, prerequisite handling, and scheduling
- **Instructor Management**: Assignment to courses with conflict detection
- **Department Management**: Student and instructor assignment with transfer capabilities
- **Classroom Management**: Room assignment with capacity and scheduling validation
- **Academic Records**: Grade tracking, completed courses, and failed course management

### Key Capabilities
- **Conflict Detection**: Automatically prevents scheduling conflicts for students and instructors
- **Prerequisite Validation**: Ensures students meet course requirements before enrollment
- **Capacity Management**: Tracks classroom capacity and prevents over-enrollment
- **GPA Calculation**: Computes cumulative GPA based on completed coursework
- **Flexible Scheduling**: Supports multiple time periods and day combinations

## Project Structure

```
com.fayad/
├── Main.java                    # Application entry point with example usage
├── Student.java                 # Student entity and data management
├── Course.java                  # Course entity with enrollment logic
├── Instructor.java              # Instructor entity and department association
├── Department.java              # Department management and student/instructor tracking
├── Classroom.java               # Classroom enum with capacity definitions
├── Grade.java                   # Grade enum with GPA point values
├── Semester.java                # Semester enum with date ranges
├── TimePeriod.java              # Time period enum for scheduling
├── StudentManagement.java       # Student operations and academic record management
├── courseManagement.java        # Course enrollment and classroom assignment
└── DepartmentManagement.java    # Department operations and transfers
```

## Core Classes

### Enums
- **Grade**: A, B, C, D, F with corresponding GPA points (4.0 to 0.0)
- **Classroom**: Room_101, Room_102, Room_103 (capacity: 3 each), UNASSIGNED (capacity: 0)
- **Semester**: SPRING, SUMMER, AUTUMN, WINTER with date ranges
- **TimePeriod**: Five daily periods from 8:30 AM to 6:30 PM

### Main Entities
- **Student**: Manages personal info, enrollment, completed courses, and academic records
- **Course**: Handles course details, prerequisites, scheduling, and instructor assignment
- **Instructor**: Manages instructor information and course assignments
- **Department**: Organizes students and instructors by academic department

### Management Classes
- **StudentManagement**: GPA calculation, course completion, and transcript generation
- **courseManagement**: Student enrollment and classroom assignment logic
- **DepartmentManagement**: Student/instructor transfers and department operations

## Getting Started

### Prerequisites
- Java 8 or higher
- Understanding of object-oriented programming concepts

### Installation
1. Clone or download the project files
2. Ensure all Java files are in the `com.fayad` package
3. Compile the project using your preferred Java IDE or command line

## Key Features Explained

### Enrollment System
The system validates multiple conditions before allowing enrollment:
- Prerequisites must be completed
- No scheduling conflicts with existing courses
- Classroom capacity must be available
- Student cannot be already enrolled in the same course

### Conflict Detection
- **Student Conflicts**: Prevents enrollment in courses with overlapping time periods
- **Instructor Conflicts**: Prevents assignment to courses with scheduling conflicts
- **Classroom Conflicts**: Ensures rooms aren't double-booked

### Academic Records
- **Completed Courses**: Successfully passed courses with grades
- **Failed Courses**: Courses that can be retaken
- **Attempted Courses**: All courses taken (for GPA calculation)
- **GPA Calculation**: Weighted average based on credit hours

### Department Management
- Students can be transferred between departments
- Instructors can be associated with multiple departments
- Proper validation ensures data integrity during transfers

## Example Workflow

1. **Setup**: Create departments, classrooms, and time periods
2. **Course Creation**: Define courses with prerequisites and scheduling
3. **Student Registration**: Register students in departments
4. **Instructor Assignment**: Assign instructors to courses (with conflict checking)
5. **Student Enrollment**: Enroll students in courses (with validation)
6. **Grade Management**: Record grades and update academic records
7. **Reports**: Generate transcripts and calculate GPAs

## Data Validation

The system includes comprehensive validation:
- **Null Safety**: Prevents null pointer exceptions
- **Capacity Limits**: Enforces classroom capacity constraints
- **Prerequisite Checking**: Validates course prerequisites
- **Time Conflict Prevention**: Avoids scheduling conflicts
- **Duplicate Prevention**: Prevents duplicate enrollments

## Future Enhancements

Potential areas for expansion:
- Database integration for persistent storage
- Web interface for user interaction
- Advanced reporting and analytics
- Email notifications for enrollment changes

