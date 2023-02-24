package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello: "+ name);
    }
}
