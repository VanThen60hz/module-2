package Thi.service;

import java.io.IOException;

public interface IStudentService extends IPersonService{
    void add() throws IOException;
    void delete() throws IOException;
    void findStudent() throws IOException;
}
