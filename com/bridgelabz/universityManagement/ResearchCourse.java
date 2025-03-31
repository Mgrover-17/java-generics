package com.bridgelabz.universityManagement;

public class ResearchCourse extends CourseType {
    public ResearchCourse(String name) {
        super(name);
    }

    @Override
    public void displayEvaluationMethod() {
        System.out.println(getCourseName() + " is evaluated through Research Papers.");
    }
}
