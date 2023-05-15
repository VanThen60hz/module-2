package demo_student_mvc.service;

import demo_student_mvc.model.Teacher;

import java.io.IOException;

public interface ITeacherService extends IPersonService{
    Teacher getMaxSalary() throws IOException;
}
