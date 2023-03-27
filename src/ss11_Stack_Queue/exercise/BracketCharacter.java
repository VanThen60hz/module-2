package ss11_Stack_Queue.exercise;

import java.util.Stack;

public class BracketCharacter {
    public static boolean isValid(String str) {
        Stack<Character> bStack = new Stack<>();

        for (char sym : str.toCharArray()) {
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if ((sym == ')' && left != '(') || (sym == ']' && left != '[') || (sym == '}' && left != '{')) {
                    return false;
                }
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "s * (s –a) *(s –b) *(s –c)";
        String str2 = "(–b + (b2 –4 * a * c)^0.5) /2 * a";
        String str3 = "s * (s –a) *(s –b * (s –c)";
        String str4 = "s * (s –a) *s –b) *(s –c)";
        String str5 = "(–b + (b ^ 2 –4 * a * c)^(0.5 / 2 * a))";

        System.out.println(str1 + " is " + (isValid(str1) ? "Valid" : "Invalid"));
        System.out.println(str2 + " is " + (isValid(str2) ? "Valid" : "Invalid"));
        System.out.println(str3 + " is " + (isValid(str3) ? "Valid" : "Invalid"));
        System.out.println(str4 + " is " + (isValid(str4) ? "Valid" : "Invalid"));
        System.out.println(str5 + " is " + (isValid(str5) ? "Valid" : "Invalid"));
    }
}
