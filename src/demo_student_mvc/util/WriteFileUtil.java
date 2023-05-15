package demo_student_mvc.util;

import demo_student_mvc.model.Student;
import demo_student_mvc.model.Teacher;

import java.io.*;
import java.util.List;

public class WriteFileUtil {
    public static void writeFileStudent(List<Student> studentList) throws IOException {
        File file = new File("src/demo_student_mvc/data/student.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student: studentList){
            fileWriter.write(student.getInfo());
        }

        bufferedWriter.close();
    }

    public static void writeFileTeacher(List<Teacher> TeacherList) throws IOException {
        File file = new File("src/demo_student_mvc/data/student.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Teacher teacher: TeacherList){
            fileWriter.write(teacher.getInfo());
        }

        bufferedWriter.close();
    }
}
