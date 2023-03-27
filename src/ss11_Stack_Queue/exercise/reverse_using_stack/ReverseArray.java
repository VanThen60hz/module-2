package ss11_Stack_Queue.exercise.reverse_using_stack;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

//        1. Khởi tạo một Stack rỗng, có kiểu số.
        Stack<Integer> stack = new Stack<>();

//        Với n phần tử của mảng, lần lượt đưa vào Stack thông qua hàm Push: Push a[i] into Stack.
        for(int st : arr){
            stack.push(st);
        }

//        3. Lần lượt lấy ra từ Stack n phần tử và đưa vào trở lại mảng ban đầu:
        for(int st : arr){
            st = stack.pop();
        }

        System.out.println("Mảng sau khi đảo ngược là: ");
        for(int st : arr){
            System.out.println(st + " ");
        }

    }
}
