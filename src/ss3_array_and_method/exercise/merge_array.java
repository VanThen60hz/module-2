package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class merge_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng 1: ");
        int n1 = input.nextInt();
        int[] array1 = new int[n1];
        inputValueOfArray(input, n1, array1, "Nhập các phần tử của mảng 1:", "array1[");

        System.out.print("Nhập kích thước mảng 2: ");
        int n2 = input.nextInt();
        int[] array2 = new int[n2];
        inputValueOfArray(input, n2, array2, "Nhập các phần tử của mảng 2:", "array2[");

        int[] array3 = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }

        System.out.println("Mảng sau khi gộp:" + Arrays.toString(array3));
    }

    private static void inputValueOfArray(Scanner input, int n1, int[] array, String s, String s2) {
        System.out.println(s);
        for (int i = 0; i < n1; i++) {
            System.out.print(s2 + i + "] = ");
            array[i] = input.nextInt();
        }
    }
}
