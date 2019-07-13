/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hugh
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private HashMap<String, Set<String>> keys;

    public PersonalMultipleEntryDictionary() {
        this.keys = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.keys.containsKey(word)) {
            this.keys.put(word, new HashSet<String>());
        }

        Set<String> finished = this.keys.get(word);
        finished.add(entry);
    }

    @Override
    public Set<String> translate(String word) {

        return this.keys.get(word);

    }

    @Override
    public void remove(String word) {
        if (this.keys.containsKey(word)) {
            this.keys.remove(word);
        }
    }

}
