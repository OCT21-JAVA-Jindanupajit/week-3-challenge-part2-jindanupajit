package jbc.oct21.controller;

import jbc.oct21.ExtendsType.YesNo;
import jbc.oct21.RoboResumeApplication;
import jbc.oct21.builder.ResumeBuilder;

public class MainController {



    public void mainMenu() {
        YesNo askUserYesOrNo = new YesNo();

        do {
            ResumeBuilder resumeBuilder = new ResumeBuilder();

            // Hand over User Interaction to the "builder" package
            // see jbc.oct21.builder package
            // the entry point is ResumeBuilder.auto()
            resumeBuilder.auto(System.out, System.in);

            RoboResumeApplication.getResumeCollection().add(resumeBuilder.toResume());

            System.out.println(resumeBuilder.toResume());

            System.out.print("\nMore Resume ");
            askUserYesOrNo.retrieve(System.out, System.in);
        } while(askUserYesOrNo.isYes());
    }
}
