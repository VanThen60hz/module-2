package ss3_array_and_method.exercise;

import java.util.Scanner;

public class SmallestValueOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập số lượng phần tử của mảng: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Số lượng phần tử phải lớn hơn 0. Vui lòng nhập lại!");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        inputArray(scanner, arr);
        minValueOfArray(arr);
    }

    private static void minValueOfArray(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }

    private static void inputArray(Scanner scanner, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá tri phần tử thứ " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
    }

}
