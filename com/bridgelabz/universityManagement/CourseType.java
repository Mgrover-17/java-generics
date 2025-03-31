package com.bridgelabz.universityManagement;

public abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void displayEvaluationMethod();
}
