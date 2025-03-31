package com.bridgelabz.resumeScreening;

public class ResumeScreeningApp {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer());
        seResume.processResume();
    }
}
