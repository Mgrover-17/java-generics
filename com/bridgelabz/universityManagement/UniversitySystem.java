package com.bridgelabz.universityManagement;

import java.util.Arrays;

public class UniversitySystem {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> programming = new Course<>(new AssignmentCourse("Java Programming"));
        Course<ResearchCourse> thesis = new Course<>(new ResearchCourse("AI Research"));

        math.displayCourseDetails();
        programming.displayCourseDetails();
        thesis.displayCourseDetails();

        CourseManager manager = new CourseManager(Arrays.asList(
                new ExamCourse("Physics"),
                new AssignmentCourse("Database Management"),
                new ResearchCourse("Quantum Computing")
        ));

        System.out.println("\nAll Courses:");
        manager.displayAllCourses();
    }
}
