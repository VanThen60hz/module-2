package ss17_String_and_Regex;

import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        String date = scanner.nextLine();
        System.out.println(isValidDate(date));
    }

    public static boolean isValidDate(String dateStr) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$";
        return dateStr.matches(regex);
    }

}
