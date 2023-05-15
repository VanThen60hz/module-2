package demo_student_mvc.service;

import java.io.IOException;
import java.util.Scanner;

public interface IPersonService {
    static Scanner scanner = new Scanner(System.in);
    void display() throws IOException;
    void add() throws IOException;
    void edit() throws IOException;
    void delete() throws IOException;
}
