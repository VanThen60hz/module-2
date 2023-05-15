package ss8_clean_code_mvc.controller;

import ss8_clean_code_mvc.service.IStudentService;
import ss8_clean_code_mvc.service.impl.StudentService;

import java.util.Scanner;

/*
Mô hình MVC
M: Model (lớn) = Service + Repository + Model (nhỏ)
	Service: Xử lý nghiệm vụ, tính toán
	Repository: Tương tác với dữ liệu (Lấy dữ liệu từ file, ...)
	Model nhỏ: Mô tả dữ liệu => các class
	=> Ở module 2 thì gộp Service + Repository = Service

V: View: Hiển thị giao diện người dùng

C: Controller: Điều hướng => Tạo menu + gọi đến service tương ứng

Controller => Gọi tới service
 */
public class StudentController {
    static Scanner scanner = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();
    public void displayMainMenu() {
        int choose;
        do {
            System.out.println("======== Menu ========"); // Controller
            System.out.println("1. Xem danh sách");
            System.out.println("2. Tạo mới");
            System.out.println("Nhấn số bất kỳ để thoát");
            System.out.println("Mời bạn chọn: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iStudentService.display();
                    break;
                case 2:
                    iStudentService.add();
                    break;
                default:
                    break;
            }
        } while (choose >= 1 && choose <= 2);
    }
}
