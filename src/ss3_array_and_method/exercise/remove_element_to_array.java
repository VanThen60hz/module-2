
package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class remove_element_to_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{10, 4, 6, 7, 8, 6};
        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
        System.out.println("Nhập phần tử cần xóa: ");
        int x = scanner.nextInt();
        int index_del = -1;

        int i;
        for(i = 0; i < arr.length; ++i) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Không tồn tại phần tử trong mảng.");
        } else {
            for(i = index_del; i < arr.length - 1; ++i) {
                arr[i] = arr[i + 1];
            }

            arr = Arrays.copyOf(arr, arr.length - 1);
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(arr));
        }

    }
}