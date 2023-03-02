package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 4, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí chèn vào mảng: ");
        int index = scanner.nextInt();
        if (index >= 0 && index <= arr.length) {
            for(int i = arr.length - index; i >= index; --i) {
                arr[i + 1] = arr[i];
            }

            arr[index] = x;
            System.out.println("Mảng sau khi chèn: " + Arrays.toString(arr));
        } else {
            System.out.println("Mảng không có vị trí này.");
        }

    }
}
