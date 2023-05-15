package Phone.view;

import Phone.controller.Controller;

public class view {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        try {
            controller.displayMainMenu();
        } catch (Exception e) {
            System.out.println("Chương trình đang gặp lỗi gì đó, ...");
        }
    }
}
