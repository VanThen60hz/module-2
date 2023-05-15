package Phone.util;

import Phone.model.CellPhone;
import Phone.model.GenuinePhone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean validatePrice(String data) {
        String regex = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }

    public static String inputStr(String str) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Nhập vào %s: ", str);
            String info = scanner.nextLine();

            if (info.matches("\\w+")) {
                return info;
            }

            System.out.println("Mời bạn nhập lại");
        }
    }

    public static String inputDate(String str) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf(" %s ", str);
            String info = scanner.nextLine();

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate.parse(info, formatter);
                return info;
            } catch (DateTimeParseException e){
                System.out.println("Invalid date");
            }
            System.out.println("Mời bạn nhập lại");
        }
    }

    public static String inputEmail(String str) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        while (true) {
            System.out.printf(" %s ", str);
            String info = scanner.nextLine();

            if (info.matches(regex)) {
                return info;
            } else {
                System.out.println("Invalid email");
                System.out.println("Mời bạn nhập lại");
            }
        }
    }

    public static String inputNameVietHoaDau(String str) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhập vào %s: ", str);
            String info = scanner.nextLine();
            if (info.matches("^[A-Z][a-z]*$")) {
                return info;
            }
            System.out.println("Mời bạn nhập lại");
        }
    }

    public static String SốNguyen(String str) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhập vào %s: ", str);
            String info = scanner.nextLine();
            if (info.matches("^-?[0-9]+$")) {
                return info;
            }
            System.out.println("Mời bạn nhập lại");
        }
    }

    public static String SoThapPhan(String str) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Nhập vào %s: ", str);
            String info = scanner.nextLine();
            if (info.matches("^-?[0-9]+(\\.[0-9]+)?$")) {
                return info;
            }
            System.out.println("Mời bạn nhập lại");
        }
    }



}
