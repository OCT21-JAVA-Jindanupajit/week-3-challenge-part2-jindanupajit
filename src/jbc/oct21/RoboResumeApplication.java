package jbc.oct21;


import jbc.oct21.controller.MainController;

// Runnable as single-thread or multi-thread
public class RoboResumeApplication implements Runnable {
    @Override
    public void run() {
        MainController mainController = new MainController();
        mainController.mainMenu();
        // See MainController.mainMenu() in package jbc.oct21.controller
    }
}
