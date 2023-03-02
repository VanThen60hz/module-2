package ss3_array_and_method.exercise;

import java.util.Scanner;

public class SumTheNumbersOnTheMainDiagonalOfASquareMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        System.out.println("tổng các số ở đường chéo chính của ma trận vuông là: " + sum);
    }
}
