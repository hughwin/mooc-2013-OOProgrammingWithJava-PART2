package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection a = new WordInspection(file);
        System.out.println(a.wordCount());
        System.out.println(a.wordsContainingZ());
        System.out.println(a.wordsEndingInL());
        System.out.println(a.palindromes());
        System.out.println(a.wordsWhichContainAllVowels());
    }
}
