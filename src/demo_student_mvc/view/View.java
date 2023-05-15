package demo_student_mvc.view;

import demo_student_mvc.controller.Controller;

public class View {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        try {
            controller.displayMainMenu();
        } catch (Exception e) {
            System.out.println("Chương trình đang gặp lỗi gì đó, ...");
        }
    }
}
