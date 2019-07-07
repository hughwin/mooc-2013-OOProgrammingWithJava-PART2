/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;



/**
 *
 * @author Hugh
 */
public class Item implements Thing, Comparable<Item> {
    
    private String name;
    private int volume;
    
    
    public Item(String name, int volume){
        this.name = name; 
        this.volume = volume;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public int getVolume(){
        return this.volume;
    }
    
    public String toString(){
        return this.name + " (" + this.volume + " dm^3)";
    }



    @Override
    public int compareTo(Item o) {
        int item1 = this.volume;
        int item2 = o.getVolume();
        
        if (item1 > item2){
            return 1;
        }
        
        if (item1 == item2){
            return 0;
        }
        else return -1;
    }
    
}
