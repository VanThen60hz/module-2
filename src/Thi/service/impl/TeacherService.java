package Thi.service.impl;
import Thi.model.Teacher;
import Thi.service.ITeacherService;
import Thi.util.ReadFileUtil;

import java.io.IOException;
import java.util.List;

public class TeacherService implements ITeacherService {

    @Override
    public void display() throws IOException {
        List<Teacher> teacherList = ReadFileUtil.readFileTeacher();
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).toString());
        }
    }
}
