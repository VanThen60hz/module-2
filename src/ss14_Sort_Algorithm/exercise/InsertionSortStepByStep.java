package ss14_Sort_Algorithm.exercise;

public class InsertionSortStepByStep {
    static int[] list = {1, 5, 2, 7, -8, 9, -4};

    public static void insertionSortStepByStep(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;

            }
            list[j + 1] = key;
            printList(list);
        }
    }

    public static void printList(int[] list) {
        for (int e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertionSortStepByStep(list);
    }
}
