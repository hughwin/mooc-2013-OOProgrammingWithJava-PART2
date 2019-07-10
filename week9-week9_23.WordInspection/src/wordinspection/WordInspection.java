/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hugh
 */
public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        int count = 0;

        Scanner reader = new Scanner(this.file);

        while (reader.hasNext()) {
            System.out.println(reader.next());
            count++;
        }
        reader.close();
        return count;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        List a = new ArrayList<String>();

        Scanner reader = new Scanner(this.file);

        while (reader.hasNext()) {
            String tested = reader.next();
            if (tested.contains("z") || tested.contains("Z")) {
                System.out.println(tested);
                a.add(tested);
            }

        }

        return a;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        List a = new ArrayList<String>();

        Scanner reader = new Scanner(this.file);

        while (reader.hasNext()) {
            String tested = reader.next();
            if (tested.endsWith("l")) {
                System.out.println(tested);
                a.add(tested);
            }

        }

        return a;
    }

    public List<String> palindromes() throws FileNotFoundException {
        List a = new ArrayList<String>();

        Scanner reader = new Scanner(this.file);

        while (reader.hasNext()) {
            String tested = reader.next();
            StringBuilder reverse = new StringBuilder();
            reverse.append(tested);
            reverse = reverse.reverse();

            if (tested.equals(reverse.toString())) {
                System.out.println(tested);
                a.add(tested);
            }

        }

        return a;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        List a = new ArrayList<String>();

        Scanner reader = new Scanner(this.file);

        while (reader.hasNext()) {
            String tested = reader.next();


            if (tested.contains("a") && tested.contains("e") && tested.contains("i") && tested.contains("i") && tested.contains("o") && tested.contains("u") && tested.contains("y") && tested.contains("ä") && tested.contains("ö")){
                System.out.println(tested);
                a.add(tested);
            }

        }

        return a;
    }

}
