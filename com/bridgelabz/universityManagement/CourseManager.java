package com.bridgelabz.universityManagement;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<? extends CourseType> courses;

    public CourseManager(List<? extends CourseType> courses) {
        this.courses = courses;
    }

    public void displayAllCourses() {
        for (CourseType course : courses) {
            course.displayEvaluationMethod();
        }
    }
}
