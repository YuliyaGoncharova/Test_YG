package HW13;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonFileCreating<T> {
    public void createJsonWithName(String fileName, List<T> items) {
        String jsonFilePath = fileName;
        createJsonFile(jsonFilePath, items);
        System.out.println("\n\nJson file " + jsonFilePath + " is created");
    }

    public void createJsonFile(String jsonFilePath, List<T> items) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String outputString = gson.toJson(items);
        try (FileWriter output = new FileWriter(jsonFilePath)) {
            output.write(outputString);
        } catch (IOException e) {
            e.getStackTrace();
        }

    }
}
