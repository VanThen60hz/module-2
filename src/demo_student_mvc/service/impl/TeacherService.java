package demo_student_mvc.service.impl;
import demo_student_mvc.model.Teacher;
import demo_student_mvc.service.ITeacherService;
import demo_student_mvc.util.ReadFileUtil;
import demo_student_mvc.util.WriteFileUtil;

import java.io.IOException;
import java.util.List;

public class TeacherService implements ITeacherService {
    @Override
    public void display() throws IOException {
        // đọc dữ liệu từ file
        List<Teacher> teacherList = ReadFileUtil.readFileTeacher();
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).toString());
        }
    }

    @Override
    public void add() throws IOException {
        // Bước 1: Đọc dữ liệu từ file => đưa vào list
        List<Teacher> teacherList = ReadFileUtil.readFileTeacher();

        // Bước 2: Cập nhật list
        System.out.print("Nhập vào tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập vào lương: ");
        double salary = Double.parseDouble(scanner.nextLine());

        int maxId = teacherList.get(0).getId();
        for(int i = 1; i < teacherList.size(); i++) {
            if(maxId < teacherList.get(i).getId()) {
                maxId = teacherList.get(i).getId();
            }
        }

        teacherList.add(new Teacher(/*teacherList.size()*/ (maxId + 1), name, salary));

        //ghi lại vào file
        WriteFileUtil.writeFileTeacher(teacherList);
    }


    @Override
    public void edit() throws IOException {
        // Bước 1: Đọc dữ liệu từ file => đưa vào list
        List<Teacher> teacherList = ReadFileUtil.readFileTeacher();

        //nhập id hs cần sửa
        System.out.println("Nhập id giáo viên cần sửa: ");
        int editId = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).getId() == editId){
                // Bước 2: Cập nhật list
                System.out.print("Nhập vào tên: ");
                String name = scanner.nextLine();
                teacherList.get(i).setName(name);

                System.out.print("Nhập vào lương: ");
                double salary = Double.parseDouble(scanner.nextLine());
                teacherList.get(i).setSalary(salary);
            }
        }

        //ghi lại vào file
        WriteFileUtil.writeFileTeacher(teacherList);
    }

    @Override
    public void delete() throws IOException {
        // Bước 1: Đọc dữ liệu từ file => đưa vào list
        List<Teacher> teacherList = ReadFileUtil.readFileTeacher();

        //nhập id hs cần xóa
        System.out.println("Nhập id học sinh cần xóa: ");
        int delId = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).getId() == delId){
                // Bước 2: Cập nhật list
                teacherList.remove(teacherList.get(i));
            }
        }

        //ghi lại vào file
        WriteFileUtil.writeFileTeacher(teacherList);
    }

    @Override
    public Teacher getMaxSalary() throws IOException {
        List<Teacher> teacherList = ReadFileUtil.readFileTeacher();

        double MaxSalary = teacherList.get(0).getSalary();
        int MaxSalaryIndex = 0;
        for(int i = 1; i < teacherList.size(); i++) {
            if(MaxSalary < teacherList.get(i).getSalary()) {
                MaxSalary = teacherList.get(i).getSalary();
                MaxSalaryIndex = i;
            }
        }
        
        return teacherList.get(MaxSalaryIndex);
    }
}
