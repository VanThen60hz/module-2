package demo_student_mvc.service.impl;

import demo_student_mvc.model.Student;
import demo_student_mvc.service.IStudentService;
import demo_student_mvc.util.ReadFileUtil;
import demo_student_mvc.util.WriteFileUtil;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

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
        List<Student> studentList = ReadFileUtil.readFileStudent();

        // Bước 2: Cập nhật list
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào điểm: ");
        double score = Double.parseDouble(scanner.nextLine());

        int maxId = studentList.get(0).getId();
        for(int i = 1; i < studentList.size(); i++) {
            if(maxId < studentList.get(i).getId()) {
                maxId = studentList.get(i).getId();
            }
        }

        studentList.add(new Student(/*studentList.size()*/ (maxId + 1), name, score));

        //ghi lại vào file
        WriteFileUtil.writeFileStudent(studentList);
    }


    @Override
    public void edit() throws IOException {
        // Bước 1: Đọc dữ liệu từ file => đưa vào list
        List<Student> studentList = ReadFileUtil.readFileStudent();

        //nhập id hs cần sửa
        System.out.println("Nhập id học sinh cần sửa: ");
        int editId = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId() == editId){
                // Bước 2: Cập nhật list
                System.out.print("Nhập vào tên: ");
                String name = scanner.nextLine();
                studentList.get(i).setName(name);

                System.out.print("Nhập vào điểm: ");
                double score = Double.parseDouble(scanner.nextLine());
                studentList.get(i).setScore(score);
            }
        }

        //ghi lại vào file
        WriteFileUtil.writeFileStudent(studentList);
    }

    @Override
    public void delete() throws IOException {
        // Bước 1: Đọc dữ liệu từ file => đưa vào list
        List<Student> studentList = ReadFileUtil.readFileStudent();

        //nhập id hs cần xóa
        System.out.println("Nhập id học sinh cần xóa: ");
        int delId = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId() == delId){
                // Bước 2: Cập nhật list
                studentList.remove(studentList.get(i));
            }
        }

        //ghi lại vào file
        WriteFileUtil.writeFileStudent(studentList);
    }

    @Override
    public Student getMaxScore() throws IOException {
        // Bước 1: Đọc dữ liệu từ file => đưa vào list
        List<Student> studentList = ReadFileUtil.readFileStudent();

        double maxScore = studentList.get(0).getScore();
        int maxScoreIndex = 0;
        for(int i = 1; i < studentList.size(); i++) {
            if(maxScore < studentList.get(i).getScore()) {
                maxScore = studentList.get(i).getScore();
                maxScoreIndex = i;
            }
        }
        return studentList.get(maxScoreIndex);
    }
}
