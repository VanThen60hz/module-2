package Phone.util;

import Phone.model.CellPhone;
import Phone.model.GenuinePhone;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<CellPhone> readFileCellPhone() throws IOException {
        List<CellPhone> cellPhoneList = new ArrayList<>();
        File file = new File("src/Phone/data/CellPhone.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader  = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String info[] = line.split(",");
            CellPhone cellPhone = new CellPhone(info[0],info[1],Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6]);
            cellPhoneList.add(cellPhone);
        }
        bufferedReader.close();
        return cellPhoneList;
    }

    public static List<GenuinePhone> readFileGenuine() throws IOException {
        List<GenuinePhone> genuinePhoneList = new ArrayList<>();
        File file = new File("src/Phone/data/GenuinePhone.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader  = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String info[] = line.split(",");
            GenuinePhone genuinePhone = new GenuinePhone(info[0],info[1],Double.parseDouble(info[2]),Integer.parseInt(info[3]),info[4],info[5],info[6]);
            genuinePhoneList.add(genuinePhone);
        }
        bufferedReader.close();
        return genuinePhoneList;
    }
}
