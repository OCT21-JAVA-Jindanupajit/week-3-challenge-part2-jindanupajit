package jbc.oct21.controller;

import jbc.oct21.builder.ResumeBuilder;

public class MainController {

    public void mainMenu() {
        ResumeBuilder resumeBuilder = new ResumeBuilder();

        resumeBuilder.auto();

        System.out.println(resumeBuilder.toResume());
    }
}
