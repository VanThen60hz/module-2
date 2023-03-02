package ss3_array_and_method.exercise;

public class LargestElementOfTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 9},
                {4, 5, 6},
                {7, 8, 3}
        };

        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng hai chiều là: " + max + " tại tọa độ (" + maxRow + "," + maxCol + ")");
    }
}
