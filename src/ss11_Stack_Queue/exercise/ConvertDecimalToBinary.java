package ss11_Stack_Queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển:");
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        System.out.println("Sau khi chuyển qua hệ nhị phân là:");
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }
}
