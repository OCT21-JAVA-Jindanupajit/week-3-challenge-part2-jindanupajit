package jbc.oct21.controller;

import jbc.oct21.builder.ResumeBuilder;

public class MainController {

    public void mainMenu() {
        ResumeBuilder resumeBuilder = new ResumeBuilder();

        // Hand over User Interaction to the "builder" package
        // see jbc.oct21.builder package
        // the entry point is ResumeBuilder.auto()
        resumeBuilder.auto(System.out, System.in);

        System.out.println(resumeBuilder.toResume());
    }
}
