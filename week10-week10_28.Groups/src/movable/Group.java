/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author Hugh
 */
public class Group implements Movable{
    
    private ArrayList<Movable> organisms;
    
    public Group(){
        this.organisms = new ArrayList<Movable>();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable x : this.organisms){
            x.move(dx, dy);
        }
    }
    
    public void addToGroup(Movable movable){
        this.organisms.add(movable);
    }
    
    @Override
    public String toString(){
        String locations = "";
        for (Movable x : this.organisms){
            locations += x.toString() + "\n";
        }
        return locations;
    }
    
}
