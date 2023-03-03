package ss4_class_and_object.exercise.StopWatch;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();

        for (int i : arr) {
            i = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        selectionSort(arr);

        stopWatch.stop();

        System.out.println("Thời gian thực thi là: " + stopWatch.getElapsedTime() + "mili giây");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
}
