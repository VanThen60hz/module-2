package Thi.service;

import java.io.IOException;
import java.util.Scanner;

public interface IPersonService {
    static Scanner scanner = new Scanner(System.in);
    void display() throws IOException;
}
