package ss13_Search_Algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(binarySearch(arr, 10, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int k, int left, int right) {
        if (right >= left) {
            int mid = (right + left ) / 2;

            if (k == arr[mid]) {
                return mid;
            }

            if (k > arr[mid]) {
                return binarySearch(arr, k, mid + 1, right);
            }

            return binarySearch(arr, k, left, mid - 1);
        }
        return -1;
    }
}
