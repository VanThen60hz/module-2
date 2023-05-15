package Thi.controller;

import Thi.service.impl.StudentService;
import Thi.service.impl.TeacherService;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);


    public static void StudentManagementMenu() {
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        int choice = 0;
        do{
            try {
                System.out.println("1.\tThêm mới sinh viên");
                System.out.println("2.\tXóa sinh viên");
                System.out.println("3.\tXem danh sách sinh viên");
                System.out.println("4.\tXem thông tin giáo viên");
                System.out.println("5.\tTìm kiếm sinh viên");
                System.out.println("6.\tThoát");

                System.out.println("\nEnter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice < 1 || choice > 6) {
                    throw new Exception("Invalid value.");
                }

                switch (choice) {
                    case 1:
                        studentService.add();
                        break;

                    case 2:
                        studentService.delete();
                        break;

                    case 3:
                        studentService.display();
                        break;
                    case 4:
                        teacherService.display();
                        break;
                    case 5:
                        studentService.findStudent();
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
