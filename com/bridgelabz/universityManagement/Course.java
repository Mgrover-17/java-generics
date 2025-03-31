package com.bridgelabz.universityManagement;

public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseType.getCourseName());
        courseType.displayEvaluationMethod();
    }
}
