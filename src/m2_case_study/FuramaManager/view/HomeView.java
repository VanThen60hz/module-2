package m2_case_study.FuramaManager.view;

import m2_case_study.FuramaManager.util.CommonUtil;

public class HomeView {
    public static void main(String[] args) {
        displayHomeMenu();
    }

    public static void displayHomeMenu() {
        System.out.println("----- Welcome to Furama Resort -----\n" +
                "1. Employee Management\n" +
                "2. Customer Management\n" +
                "3. Facility Management\n" +
                "4. Booking Management\n" +
                "5. Promotion Management\n" +
                "6. Exit");

        int choice= CommonUtil.getChoice(1,6);

        switch (choice){
            case 1 -> EmployeeView.show();
            case 2 -> CustomerView.show();
            case 3 -> FacilityView.show();
            case 4 -> BookingView.show();
            case 5 -> PromotionView.show();
            case 6 -> System.exit(0);
        }

        backToHomeMenu();
    }

    private static void backToHomeMenu() {
        System.out.print("Do you back to main menu (Y/N): ");

        if (CommonUtil.getScanner().nextLine().equalsIgnoreCase("y")){
            displayHomeMenu();
        }
        else{
            System.exit(0);
        }
    }
}