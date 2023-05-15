package Thi.util;

import Thi.model.Student;
import Thi.model.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
//    public static List<Student> readFileStudent() throws IOException {
//        List<Student> studentList = new ArrayList<>();
//        File file = new File("src/Thi/data/students.csv");
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        File file2 = new File("src/Thi/data/batchs.csv");
//        FileReader fileReader2 = new FileReader(file2);
//        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
//
//        String line;
//        String line2;
//        line = bufferedReader.readLine();
//        line2 = bufferedReader2.readLine();
//        while ((line != null )&& (line2 != null)) {
//            String info[] = line.split(",");
//            String info2[] = line2.split(",");
//            Student student = new Student(Integer.parseInt(info[0]), info[1], info[2],info[3],info[4],info2[2]);
//            studentList.add(student);
//        }
//        bufferedReader.close();
//        bufferedReader2.close();
//        return studentList;
//
//    }


    public static List<Student> readFileStudent() throws IOException {
        List<Student> studentList = new ArrayList<>();
        File file = new File("src/Thi/data/students.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String info[] = line.split(",");
            Student student = new Student(Integer.parseInt(info[0]), info[1], info[2],info[3],info[4],info[5]);
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;

    }

    public static List<Teacher> readFileTeacher() throws IOException {
        List<Teacher> teacherList = new ArrayList<>();
        File file = new File("src/Thi/data/teachers.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String info[] = line.split(",");
            Teacher teacher = new Teacher(Integer.parseInt(info[0]), info[1], info[2],info[3],info[4]);
            teacherList.add(teacher);
        }
        bufferedReader.close();
        return teacherList;
    }
}
