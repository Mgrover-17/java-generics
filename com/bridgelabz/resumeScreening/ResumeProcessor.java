package com.bridgelabz.resumeScreening;

import java.util.List;

public class ResumeProcessor {
    public static void evaluateResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            role.evaluateResume();
        }
    }
}
