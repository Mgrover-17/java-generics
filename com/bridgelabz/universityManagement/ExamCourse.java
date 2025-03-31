package com.bridgelabz.universityManagement;

public class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }

    @Override
    public void displayEvaluationMethod() {
        System.out.println(getCourseName() + " is evaluated through Exams.");
    }
}
