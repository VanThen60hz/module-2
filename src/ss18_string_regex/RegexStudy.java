package ss18_string_regex;

public class RegexStudy {
    public static void main(String[] args) {
//        Biểu diễn miền giá trị [...]
        System.out.println("a".matches("[abc]"));
        System.out.println("d".matches("[abc]"));

        //Dấu gạch ngang (-)
        System.out.println("5".matches("[a-zA-Z0-9]"));

        // Ngoại trừ tập hợp ký tự mẫu khi nằm trong []
        System.out.println("5".matches("[^abc]"));

        // Tính lặp của tập ký tự mẫu
        //Sử dụng ký tự * : 0 hoặc nhiều lần lặp lại 
        System.out.println("b".matches("ba*"));
        System.out.println("baaa".matches("ba*"));

        System.out.println("B123".matches("[A-Z][0-9]*"));
        //Sử dụng ký tự +: 1 hoặc nhiều lần lặp lại
        System.out.println("B123".matches("[A-Z][0-9]+"));
        System.out.println("B".matches("[A-Z][0-9]+"));

        // Sử dụng ký tự ?: 0 hoặc 1 lần
        System.out.println("B".matches("[A-Z]?"));


        // Sử dụng ký tự ngoặc ngọn {}
        System.out.println("BABCS".matches("[A-Z]{5}"));
        System.out.println("BABCS".matches("[A-Z]{5,7}"));
        System.out.println("BABCSAA".matches("[A-Z]{5,7}"));
        System.out.println("BABCSAAA".matches("[A-Z]{5,7}"));
        System.out.println("BABCSAAACCCCCCCCCCC".matches("[A-Z]{5,}"));


        // Trước là gì cũng được nhưng đuôi là 123
        System.out.println("abcd123123".matches("[A-Za-z0-9]*123"));
        //abcd123123
        //093,095
        System.out.println("0931234567".matches("09(3|5)[0-9]{7}"));

        System.out.println("0931234567".matches("[0-9]+"));
        System.out.println("0931234567".matches("\\d+"));

        System.out.println("0931234_567".matches("[A-Za-z_0-9]+"));
        System.out.println("0931234567".matches("\\w+"));

        if ("0931234567".matches("SV\\d{3}")) {
            System.out.println("OK");
        }


    }
}
