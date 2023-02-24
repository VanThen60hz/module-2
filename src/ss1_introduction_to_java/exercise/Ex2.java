package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number >= 0 && number < 10) {
            System.out.println(readNumberWithOneDigit(number));
        } else if (number >= 10 && number < 20) {
            System.out.println(readNumberWithTwoDigitsLessThan20(number));
        } else if (number >= 20 && number < 100) {
            System.out.println(readNumberWithTwoDigits(number));
        } else if (number >= 100 && number < 1000) {
            System.out.println(readNumberWithThreeDigits(number));
        } else {
            System.out.println("Out of ability");
        }
    }

    private static String readNumberWithOneDigit(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    private static String readNumberWithTwoDigitsLessThan20(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    private static String readNumberWithTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;

        String tensWord;
        switch (tens) {
            case 2:
                tensWord = "twenty";
                break;
            case 3:
                tensWord = "thirty";
                break;
            case 4:
                tensWord = "forty";
                break;
            case 5:
                tensWord = "fifty";
                break;
            case 6:
                tensWord = "sixty";
                break;
            case 7:
                tensWord = "seventy";
                break;
            case 8:
                tensWord = "eighty";
                break;
            case 9:
                tensWord = "ninety";
                break;
            default:
                tensWord = "";
                break;
        }

        if (ones == 0) {
            return tensWord;
        } else {
            return tensWord + " " + readNumberWithOneDigit(ones);
        }
    }

    private static String readNumberWithThreeDigits(int number) {
        int hundreds = number / 100;
        int tensAndOnes = number % 100;

        String hundredsWord = readNumberWithOneDigit(hundreds) + " hundred";

        if (tensAndOnes == 0) {
            return hundredsWord;
        } else if (tensAndOnes >= 0 && tensAndOnes <= 20) {
            return hundredsWord + " " + readNumberWithTwoDigitsLessThan20(tensAndOnes);
        } else {
            return hundredsWord + " " + readNumberWithTwoDigits(tensAndOnes);
        }
    }
}
