package Thi.util;


import Thi.model.Student;
import Thi.model.Teacher;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    public static void writeFileStudent(List<Student> studentList) throws IOException {
        File file = new File("src/Thi/data/students.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student: studentList){
            fileWriter.write(student.getInfo());
        }

        bufferedWriter.close();
    }

    public static void writeFileTeacher(List<Teacher> TeacherList) throws IOException {
        File file = new File("src/Thi/data/teachers.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Teacher teacher: TeacherList){
            fileWriter.write(teacher.getInfo());
        }

        bufferedWriter.close();
    }
}
