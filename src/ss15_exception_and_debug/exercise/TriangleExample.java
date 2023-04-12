package ss15_exception_and_debug.exercise;

import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập độ dài cạnh thứ nhất: ");
            double side1 = scanner.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ hai: ");
            double side2 = scanner.nextDouble();
            System.out.println("Nhập độ dài cạnh thứ ba: ");
            double side3 = scanner.nextDouble();

            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new IllegalTriangleException("Các cạnh tam giác phải là số dương");
            }
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Tổng hai cạnh của tam giác không lớn hơn cạnh còn lại");
            }

            System.out.println("Độ dài 3 cạnh của tam giác là: " + side1 + ", " + side2 + ", " + side3);
        } catch (IllegalTriangleException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Lỗi: Nhập vào phải là số");
        } finally {
            scanner.close();
        }
    }
}
