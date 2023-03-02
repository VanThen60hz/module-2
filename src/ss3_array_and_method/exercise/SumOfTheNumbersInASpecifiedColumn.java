package ss3_array_and_method.exercise;

import java.util.Scanner;

public class SumOfTheNumbersInASpecifiedColumn {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào cột chỉ định: ");
        int RowIndex = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][RowIndex];
        }
        System.out.println("Tổng các số ở cột" + RowIndex + "là: " + sum);
    }

}
