package ss11_Stack_Queue.exercise;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }
        String str2 = "";
        while (!queue.isEmpty()) {
            str2 += queue.remove();
        }

        return str.equals(str2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String str = sc.nextLine();
        System.out.println("Chuỗi " + str + "là chuỗi Palindrome là: " + isPalindrome(str));
    }

}
