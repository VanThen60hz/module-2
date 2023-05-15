package Thi.service.impl;

import Thi.model.Student;
import Thi.service.IStudentService;
import Thi.util.ReadFileUtil;
import Thi.util.WriteFileUtil;

import java.io.IOException;
import java.util.List;

public class StudentService implements IStudentService {
    @Override
    public void display() throws IOException {
        // đọc dữ liệu từ file
        List<Student> studentList = ReadFileUtil.readFileStudent();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }


    @Override
    public void add() throws IOException {
        // Bước 1: Đọc dữ liệu từ file => đưa vào list
        List<Thi.model.Student> studentList = ReadFileUtil.readFileStudent();

        // Bước 2: Cập nhật list
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập vào ngày sinh: ");
        String birthDay = scanner.nextLine();

        System.out.println("Nhập vào giới tính: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập vào số điện thoại: ");
        String phone = scanner.nextLine();

        System.out.println("Nhập vào mã lớp học: ");
        String classCode = scanner.nextLine();

        int Id = studentList.get(studentList.size() - 1).getId() + 1;

        studentList.add(new Student(/*studentList.size()*/ Id, name, birthDay, gender, phone, classCode));

        //ghi lại vào file
        WriteFileUtil.writeFileStudent(studentList);
    }

    @Override
    public void delete() throws IOException {
        List<Student> studentList = ReadFileUtil.readFileStudent();

        //nhập id hs cần xóa
        System.out.println("Nhập id học sinh cần xóa: ");
        int delId = Integer.parseInt(scanner.nextLine());
        String option;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == delId) {
                // Bước 2: Cập nhật list
                studentList.remove(studentList.get(i));
            }
        }

        //ghi lại vào file
        WriteFileUtil.writeFileStudent(studentList);
    }

    @Override
    public void findStudent() throws IOException {
        List<Student> studentList = ReadFileUtil.readFileStudent();

        System.out.println("Nhập tên học sinh cần tìm: ");
        String searchName = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(searchName)) {
                System.out.println(studentList.get(i).toString());
            }
        }
    }


}
