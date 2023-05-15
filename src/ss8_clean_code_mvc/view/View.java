package ss8_clean_code_mvc.view;

import ss8_clean_code_mvc.controller.StudentController;

public class View {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayMainMenu();
    }
}
