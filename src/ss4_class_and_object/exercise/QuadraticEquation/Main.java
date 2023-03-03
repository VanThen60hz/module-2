package ss4_class_and_object.exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);

        double delta = equation.getDiscriminant();
        if(delta > 0){
            System.out.println("Nghiệm thứ nhất: " + equation.getRoot1());
            System.out.println("Nghiệm thứ hai: " + equation.getRoot2());
        }else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép: "+ equation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
