package Phone.controller;

import Phone.service.GenuinePhoneSevice;
import Phone.service.impl.CellPhoneServiceImpl;
import Phone.service.impl.GenuinePhoneServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() throws IOException {
        int choice = 0;
        do {
            try {
                System.out.println("1.Genuine phone Management");
                System.out.println("2.Cell phone Management");
                System.out.println("3.Exit");
                System.out.println("Please enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        genuinePhoneManagement();
                        break;
                    case 2:
                        cellPhoneManagement();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid choice,please try again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (choice != 3);
    }


    public static void genuinePhoneManagement() throws IOException {
        int choice = 0;
        GenuinePhoneServiceImpl genuinePhone = new GenuinePhoneServiceImpl();
        do {
            try {
                System.out.println("1.Add new genuine phone");
                System.out.println("2.Delete genuine phone");
                System.out.println("3.Edit genuine phone");
                System.out.println("4.Display genuine phone");
                System.out.println("Exit");
                System.out.println("Please choose : ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        genuinePhone.add();
                        break;
                    case 2:
                        genuinePhone.delete();
                        break;
                    case 3:
                        genuinePhone.edit();
                        break;
                    case 4:
                        genuinePhone.display();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice,please try again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (choice != 5);
    }

    public static void cellPhoneManagement() throws IOException {
        CellPhoneServiceImpl cellPhone = new CellPhoneServiceImpl();
        int choice = 0;
        do {
            try {
                System.out.println("1.Add new cell phone");
                System.out.println("2.Delete cell phone");
                System.out.println("3.Edit cell phone");
                System.out.println("4.Display cell phone");
                System.out.println("Exit");
                System.out.println("Please choose : ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        cellPhone.add();
                        break;
                    case 2:
                        cellPhone.delete();
                        break;
                    case 3:
                        cellPhone.edit();
                        break;
                    case 4:
                        cellPhone.display();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice,please try again");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        } while (choice != 5);
    }
}
