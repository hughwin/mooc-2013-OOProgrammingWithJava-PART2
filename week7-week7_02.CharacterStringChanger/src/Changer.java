/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String characterString) {
        String changed = "";
    
        for (Change x : this.changes){
            characterString = x.change(characterString);
            System.out.println(characterString);
        }
        return characterString;
    }
}

