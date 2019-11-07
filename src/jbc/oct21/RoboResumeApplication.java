package jbc.oct21;


import jbc.oct21.controller.MainController;
import jbc.oct21.model.ResumeCollection;

// Runnable as single-thread or multi-thread
public class RoboResumeApplication implements Runnable {

    private static ResumeCollection resumeCollection = new ResumeCollection();

    public RoboResumeApplication() {
    }

    @Override
    public void run() {
        MainController mainController = new MainController();
        mainController.mainMenu();
        // See MainController.mainMenu() in package jbc.oct21.controller
    }

    public static ResumeCollection getResumeCollection() {
        return resumeCollection;
    }
}
