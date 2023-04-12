package ss14_Sort_Algorithm.exercise;

public class InsertionSort {
    static int[] list = {1, 5, 2, 7, -8, 9, -4};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int e: list) {
            System.out.print(e + " ");
        }
    }
}
