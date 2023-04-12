package ss16_IO_text_file.practice;

import java.io.*;
import java.nio.Buffer;

public class ReadFileExample {
    public static void main(String[] args) throws IOException {
            // đọc file
            File file = new File("src/ss16_IO_text_file/data/file.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
    }
}
