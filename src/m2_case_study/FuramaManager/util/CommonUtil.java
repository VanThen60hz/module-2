package m2_case_study.FuramaManager.util;

import m2_case_study.FuramaManager.model.Person;
import m2_case_study.FuramaManager.util.ConstantUtil.Gender;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CommonUtil {
    //region public methods
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static String inputTo(String field) {
        System.out.print(field + ": ");
        return getScanner().nextLine();
    }

    public static Double inputToDouble(String field) {
        String res = inputWithOutEmpty(field);
        while (!isDoubleNumeric(res)){
            System.out.printf("This %s have to a number. Please input again\n", field);
            res = inputWithOutEmpty(field);
        }

        return Double.parseDouble(res);
    }

    public static Integer inputToInteger(String field) {
        String res = inputWithOutEmpty(field);
        while (!isIntegerNumeric(res)){
            System.out.printf("This %s have to a number. Please input again\n", field);
            res = inputWithOutEmpty(field);
        }

        return Integer.parseInt(res);
    }

    public static <T extends Enum<T>> T inputToEnum(Class<T> enumerator, String field) {
        String res = inputWithOutEmpty(field).toUpperCase();
        while (!enumValueExists(enumerator, res)){
            System.out.printf("Invalid value of enum. Please input again\n", field);
            res = inputWithOutEmpty(field).toUpperCase();
        }

        return  Enum.valueOf(enumerator, res);
    }

    public static String inputWithOutEmpty(String field){
        String res = null;

        do {
            System.out.printf(res != null ? "This %s cannot empty. Please input again:" : field + ":", field);
            res = getScanner().nextLine();
        }while (StringUtils.isBlank(res));

        return res;
    }

    public static Person inputPerson() {
        String fullName = inputWithOutEmpty("FullName");

        String birthday = CommonUtil.inputWithOutEmpty("Birthday");
        while (!Validation.dayOfBirth(birthday)){
            System.out.println("Invalid format. Please input again");
            birthday = inputWithOutEmpty("Birthday");
        }

        Gender gender = inputToEnum(Gender.class, "Gender");
        String phone = inputWithOutEmpty("Phone");
        String email = inputWithOutEmpty("Email");
        String address = inputWithOutEmpty("Address");
        return new Person(fullName, birthday, gender, phone, email, address);
    }

    public static int getChoice(int from, int to) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        while (res < from || res > to) {
            System.out.printf("Input your choice from %s to %s:", from, to);
            while (!scanner.hasNextInt()) {
                System.out.printf("Your choice have to a number. Please input again:");
                scanner.nextLine();
            }
            res = scanner.nextInt();
        }

        return res;
    }

    public static DateTimeFormatter getDateFormat() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    public static boolean isDate(String date){
        try {
            LocalDate.parse(date, getDateFormat());
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    //endregion

    //region private methods
    private static boolean isDoubleNumeric(String val){
        if(val == null){
            return false;
        }

        try {
            Double.parseDouble(val);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    private static boolean isIntegerNumeric(String val){
        if(val == null){
            return false;
        }

        try {
            Integer.parseInt(val);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    private static  <T extends Enum<T>> boolean enumValueExists(Class<T> enumType, String value) {
        boolean result;

        try {
            Enum.valueOf(enumType, value);
            result = true;
        } catch (IllegalArgumentException e) {
            result = false;
        }

        return result;
    }
    //endregion

}