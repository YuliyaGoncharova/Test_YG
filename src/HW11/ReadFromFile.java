package HW11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {

    private String fileName;

    public ReadFromFile(String fileName) {
        this.fileName = fileName;
    }
    public  List<String> readNamesFromFile() {
        List<String> names = new ArrayList<>();
//
        try {
            FileReader fileReader = new FileReader(this.fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String userLine;
            do {
                userLine = reader.readLine();
                if (userLine != null) {
                    names.add(userLine);
                }
            } while (userLine != null);

            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return names;
    }

}
