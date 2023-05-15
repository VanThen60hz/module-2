package ss18_string_regex;

public class StringStudy {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        //"Hello" => Đối tượng
//        // str1 => Biến đối tượng
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//        String str4 = new String("Hello");
//
//        System.out.println(str1 == str2);
//        System.out.println(str3 == str4);

        String name = "hello";
//        System.out.println(name.toUpperCase());
//        System.out.println(name);
        for(int i = 0; i < 10; i++) {
            name = name + i; // Trừ nữa tháng lương => đang tạo ra 10 đối tượng
        }

        System.out.println(name);

        StringBuilder stringBuilder = new StringBuilder("hello");
        for(int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }

        System.out.println(stringBuilder);
        // Đồng bộ
    }

    public synchronized void changeData() {

    }
}
