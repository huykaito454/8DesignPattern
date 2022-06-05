package SOLID.Single;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Journal implements Serializable {
    private List<String> entries = new ArrayList<>();
    private int count = 0;

    public int addEntry(String entry) {
        entries.add(++count + " : " + entry);
        return count;
    }
    public void removeEntry(int index){
        entries.remove(index);
    }
    @Override
    public String toString() {
        return entries.toString();
    }
}

