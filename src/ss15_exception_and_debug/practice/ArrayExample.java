package ss15_exception_and_debug.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x =scanner.nextInt();
        try {
            System.out.println("Gía trị của phần tử có chỉ số " + x + " là "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá mảng.");
        }
    }
}
