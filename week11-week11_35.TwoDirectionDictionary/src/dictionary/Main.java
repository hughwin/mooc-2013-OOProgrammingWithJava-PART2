package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
MindfulDictionary dict = new MindfulDictionary("src/words.txt");
dict.load();

dict.add("apina", "monkey");
dict.add("banaani", "banana");
dict.add("apina", "apfe");

dict.save();
    }
}
