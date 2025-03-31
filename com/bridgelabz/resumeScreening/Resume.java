package com.bridgelabz.resumeScreening;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        jobRole.evaluateResume();
    }
}
