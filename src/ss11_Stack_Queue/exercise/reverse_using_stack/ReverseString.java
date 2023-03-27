package ss11_Stack_Queue.exercise.reverse_using_stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world!";
        String[] words = str.split("\\s+");
        Stack<String> wStack = new Stack<String>();
        for (String word : words) {
            wStack.push(word);
        }
        String outp = "";
        while (!wStack.empty()) {
            String mWord = wStack.pop();
            outp += mWord + " ";
        }
        System.out.println(outp);
    }
}

