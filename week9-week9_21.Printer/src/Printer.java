
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class Printer {

    private File file;

    public Printer(String fileName) throws Exception {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {

        Scanner reader = new Scanner(this.file);

        if (word.isEmpty()) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } else {

            while (reader.hasNextLine()) {

                String line = reader.nextLine();
                if (line.contains(word)) {
                    System.out.println(line);
                }
            }
            reader.close();
        }
    }

}
