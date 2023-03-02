package ss3_array_and_method.exercise;

import java.util.Scanner;

public class TheNumberOfOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.println("Nhập ký tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự "+ ch +" trong chuỗi là: "+ count);
    }
}
