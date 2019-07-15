
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Hugh
 */
    public class Jumpers  {
    

    private ArrayList<Jumper> jumpers;

    public Jumpers() {
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public void addJumper(Jumper j) {
        this.jumpers.add(j);
    }
    
    public void jump(){
        for (Jumper x : this.jumpers){
           x.jump();
        }
    }
    
    }
    