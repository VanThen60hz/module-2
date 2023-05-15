package demo_student_mvc.controller;

import demo_student_mvc.model.Student;
import demo_student_mvc.service.impl.StudentService;
import demo_student_mvc.service.impl.TeacherService;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() throws Exception {
        int choice = 0;
        do {
            try {
                System.out.println("1.\tStudent Management");
                System.out.println("2.\tTeacher Management");
                System.out.println("3.\tExit");

                System.out.println("\nEnter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice < 1 || choice > 3) {
                    throw new Exception("Invalid value.");
                }

                switch (choice) {
                    case 1:
                        StudentManagementMenu();
                        break;
                    case 2:
                        TeacherManagementMenu();
                        break;
                    case 3:
                        System.out.println("Exiting... ");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Please enter a number!");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (choice !=3);
    }

    public static void StudentManagementMenu() {
        StudentService studentService = new StudentService();
        int choice = 0;
        do{
            try {
                System.out.println("1.\tDisplay Student List!");
                System.out.println("2.\tAdd New Student");
                System.out.println("3.\tEdit Student");
                System.out.println("4.\tDelete Student");
                System.out.println("5.\tGet Max Score");
                System.out.println("6.\tExit");

                System.out.println("\nEnter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice < 1 || choice > 6) {
                    throw new Exception("Invalid value.");
                }

                switch (choice) {
                    case 1:
                        studentService.display();
                        break;
                    case 2:
                        studentService.add();
                        break;
                    case 3:
                        studentService.edit();
                        break;
                    case 4:
                        studentService.delete();
                        break;
                    case 5:
                        System.out.println("Max Score: " + studentService.getMaxScore());
                        break;
                    case 6:
                        System.out.println("Exiting... ");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Please enter a number!");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (choice !=6);
    }

    private static void TeacherManagementMenu() {
        TeacherService teacherService = new TeacherService();
        int choice = 0;
        do{
            try {
                System.out.println("1.\tDisplay Teacher List!");
                System.out.println("2.\tAdd New Teacher");
                System.out.println("3.\tEdit Teacher");
                System.out.println("4.\tDelete Teacher");
                System.out.println("5.\tGet Max Salary");
                System.out.println("6.\tExit");

                System.out.println("\nEnter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice < 1 || choice > 6) {
                    throw new Exception("Invalid value.");
                }

                switch (choice) {
                    case 1:
                        teacherService.display();
                        break;
                    case 2:
                        teacherService.add();
                        break;
                    case 3:
                        teacherService.edit();
                        break;
                    case 4:
                        teacherService.delete();
                        break;
                    case 5:
                        System.out.println("MaxSalary: " + teacherService.getMaxSalary());
                        break;
                    case 6:
                        System.out.println("Exiting... ");
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("Please enter a number!");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while (choice !=6);
    }
}
