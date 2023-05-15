package Phone.util;

import Phone.model.CellPhone;
import Phone.model.GenuinePhone;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    public static void writeFileGenuinePhone(List<GenuinePhone> genuinePhoneList) throws IOException {
        File file = new File("src/Phone/data/GenuinePhone.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (
                GenuinePhone genuinePhone : genuinePhoneList) {
            fileWriter.write(genuinePhone.getInfo());
        }
        bufferedWriter.close();
    }

    public static void writeFileCellPhone(List<CellPhone> cellPhoneList) throws IOException {
        File file = new File("src/Phone/data/CellPhone.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (CellPhone cellPhone : cellPhoneList) {
            fileWriter.write(cellPhone.getInfo());
        }
        bufferedWriter.close();
    }
}
