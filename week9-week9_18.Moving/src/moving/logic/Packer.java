/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Hugh
 */
public class Packer{
    
    private int BoxesVolume;
    
    public Packer(int BoxesVolume){
        this.BoxesVolume = BoxesVolume;
    }
    
   public List<Box> packThings(List<Thing> things){
        
       List<Box> buffer = new ArrayList<Box>();
       
       Box box = new Box(this.BoxesVolume);
       
       for (Thing i : things){
           while (box.addThing(i)){
               System.out.println("Adding things");
           }
           
           if(!box.addThing(i)){
               buffer.add(box);
               box = new Box(this.BoxesVolume);
           }
       }
       return buffer;
    }
    
}
