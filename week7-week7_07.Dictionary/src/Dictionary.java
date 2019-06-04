
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class Dictionary {
    
    private HashMap<String, String> dict;

    
    public Dictionary(){
        this.dict = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if (!this.dict.containsKey(word)){
            return null;
        }
        else{
            return this.dict.get(word);
        }
    }
    public void add(String fin, String tran){
        this.dict.put(fin, tran);
    }

    public int amountOfWords(){
        return this.dict.size();
    }
    
    public  ArrayList<String> translationList(){ 
        ArrayList<String> list = new ArrayList<String>();
        for (String key: this.dict.keySet()){
            list.add(key +" = " + this.dict.get(key));
        }
        return list;
    }
}
