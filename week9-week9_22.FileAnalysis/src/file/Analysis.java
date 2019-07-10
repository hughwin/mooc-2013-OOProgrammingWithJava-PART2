/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Hugh
 */
public class Analysis {

    private File file;

    public Analysis(File file) throws Exception {
        this.file = file;
    }

    public int lines() throws Exception {
        int lines = 0;
        Scanner reader = new Scanner(this.file);
        System.out.println(reader.nextLine());
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
            lines++;
        }
        reader.close();
        return lines + 1;

    }

    public int characters() throws Exception {
        int characters = 0;
        Scanner reader = new Scanner(this.file);


        while (reader.hasNextLine()) {
            characters += reader.nextLine().length() + 1;

        }
        reader.close();
        return characters;
    }

}
