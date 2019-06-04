
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
public class Airplane {
    
    private String type;
    private int capacity;
    
    public Airplane(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
    }
 
    
    public String getPlane(){
        return this.type;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public String toString(){
        return this.type + " " + "(" + this.capacity + " ppl)";
    }

}
