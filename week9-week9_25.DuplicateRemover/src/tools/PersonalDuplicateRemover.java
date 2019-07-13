/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hugh
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private int duplicates;
    private Set<String> uniques;

    public PersonalDuplicateRemover() {
        this.duplicates = 0;
        this.uniques = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if (this.uniques.contains(characterString)) {
            this.duplicates++;
        } else {
            this.uniques.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.uniques;
    }

    @Override
    public void empty() {
        this.duplicates = 0;
        this.uniques.clear();
    }

}
