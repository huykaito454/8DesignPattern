package SOLID.Single;

import java.io.FileWriter;
import java.io.IOException;

public class Persistence {
    public void saveToFile(Journal journal, String fileName) {
        try {
            FileWriter myFile = new FileWriter(fileName);
            myFile.write(String.valueOf(journal));
            myFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
