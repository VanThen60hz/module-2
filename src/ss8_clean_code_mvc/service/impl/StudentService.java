package ss8_clean_code_mvc.service.impl;

import ss8_clean_code_mvc.model.Student;
import ss8_clean_code_mvc.service.IStudentService;

import java.util.Scanner;

public class StudentService implements IStudentService {
    static Student[] students; // Đặt ở service
    static int count; // số lượng học viên hiện tại
    static Scanner scanner = new Scanner(System.in);

    static { // Đặt ở service
        students = new Student[100];
        students[0] = new Student(1, "Thắng", 10);
        students[1] = new Student(2, "Ly", 9);
        students[2] = new Student(3, "Thịnh", 8);
        count = 3;
    }

    @Override
    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào điểm: ");
        double score = Double.parseDouble(scanner.nextLine());

        students[count] = new Student(count, name, score);
        count++;// Tăng lên 1
    }
}
