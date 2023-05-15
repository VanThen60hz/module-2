package demo_student_mvc.util;

import demo_student_mvc.model.Student;
import demo_student_mvc.model.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<Student> readFileStudent() throws IOException {
        List<Student> studentList = new ArrayList<>();
        File file = new File("src/demo_student_mvc/data/student.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String info[] = line.split(",");
            Student student = new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2]));
            studentList.add(student);
        }
        bufferedReader.close();
        return studentList;

    }

    public static List<Teacher> readFileTeacher() throws IOException {
        List<Teacher> teacherList = new ArrayList<>();
        File file = new File("src/demo_student_mvc/data/teacher.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String info[] = line.split(",");
            Teacher teacher = new Teacher(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2]));
            teacherList.add(teacher);
        }
        bufferedReader.close();
        return teacherList;
    }
}
