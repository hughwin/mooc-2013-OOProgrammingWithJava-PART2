/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Hugh
 */
public class MindfulDictionary {

    private Map<String, String> finnishToEnglish;
    private Map<String, String> englishToFinnish;
    private File file;

    public MindfulDictionary() {
        this.finnishToEnglish = new HashMap<String, String>();
        this.englishToFinnish = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        if (!this.finnishToEnglish.containsKey(word)) {
            this.finnishToEnglish.put(word, translation);
            this.englishToFinnish.put(translation, word);
        }
    }

    public String translate(String word) {
        if (finnishToEnglish.containsKey(word)) {
            return finnishToEnglish.get(word);
        }

        if (englishToFinnish.containsKey(word)) {
            return englishToFinnish.get(word);
        }

        return null;
    }

    public void remove(String word) {
        String englishTranslation = this.finnishToEnglish.get(word);
        String finnishTranslation = this.englishToFinnish.get(word);
        this.finnishToEnglish.remove(word);
        this.englishToFinnish.remove(word);
        this.englishToFinnish.remove(englishTranslation);
        this.finnishToEnglish.remove(finnishTranslation);
    }

    public MindfulDictionary(String file) throws FileNotFoundException {
        this.file = new File(file);
        this.finnishToEnglish = new HashMap<String, String>();
        this.englishToFinnish = new HashMap<String, String>();

    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] words = line.split(":");
                add(words[0], words[1]);
            }
            reader.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try {
            FileWriter x = new FileWriter(this.file);
            Set keys = this.finnishToEnglish.keySet();

            for (Object key : keys) {
                key = key.toString();
                System.out.println(key);
                x.write(key + ":" + this.finnishToEnglish.get(key) + "\n");

            }
            x.close();

            return true;
        }
        catch (Exception e){
        return false;
        }
    }

}
