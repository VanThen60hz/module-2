package ss14_Sort_Algorithm.practice;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if(list[j] < list[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                double temp = list[minIndex];
                list[minIndex] = list [i];
                list[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (double e : list){
            System.out.print(e + " ");
        }
    }
}
