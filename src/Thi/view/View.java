package Thi.view;


import Thi.controller.Controller;

public class View {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        try {
            controller.StudentManagementMenu();
        } catch (Exception e) {
            System.out.println("Chương trình đang gặp lỗi gì đó, ...");
        }
    }
}
