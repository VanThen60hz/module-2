package m2_case_study.FuramaManager;


import org.apache.commons.lang3.StringUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileHelper<E> {
    public void write(String path, List<E> list, boolean isAppend) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, isAppend))) {
            for (E e : list) {
                if(StringUtils.isNotBlank(e.toString())){
                    writer.write(e.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> read(String path) {
        Path p = Paths.get(path);
        try {
            if(Files.exists(p)){
                return Files.readAllLines(p);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return Collections.emptyList();
    }
}