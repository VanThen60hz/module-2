package demo_student_mvc.service;

import demo_student_mvc.model.Student;

import java.io.IOException;

public interface IStudentService extends IPersonService{
    Student getMaxScore() throws IOException;
}
