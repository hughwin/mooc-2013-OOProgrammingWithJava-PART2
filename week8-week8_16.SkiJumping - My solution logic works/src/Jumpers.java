
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class Jumpers {

    private ArrayList<Jumper> jumpers;

    public Jumpers() {
        this.jumpers = new ArrayList<Jumper>();
    }

    public void addJumper(Jumper j) {
        this.jumpers.add(j);
    }

    public void jump() {
        for (Jumper x : this.jumpers) {
            x.jump();
        }
    }

    public void jumperOrder() {
        Collections.sort(this.jumpers);
    }

    public void printJumpers() {
        int count = 1;
        for (Jumper x : this.jumpers) {
            System.out.println("  " + count + ". " + x.toString());
            count++;
        }
    }

    public void printWinners() {
        
        System.out.println("Tournament results:\n" + "Position    Name");
        
        int place = 1;
        for (int j = this.jumpers.size() - 1; j >= 0; j--) {
            System.out.println(place + "           " + this.jumpers.get(j).toString());
            System.out.println("            jump lengths: " + this.jumpers.get(j).printDistances());
            place++;
        }
    }
}
