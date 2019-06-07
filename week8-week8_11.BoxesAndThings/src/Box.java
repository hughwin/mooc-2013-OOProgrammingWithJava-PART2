
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class Box implements ToBeStored {

    private double maxWeight;

    private ArrayList<ToBeStored> toBeStored;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;

        this.toBeStored = new ArrayList<ToBeStored>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored x : toBeStored){
            weight += x.weight();
        }
        return weight;
    }

    public void add(ToBeStored toBeStored) {
        if (this.weight() + toBeStored.weight() < this.maxWeight) {
            this.toBeStored.add(toBeStored);
        }
    }

    public String toString() {
        return "Box: " + this.toBeStored.size() + " things, total weight " +this.weight() + " kg";
    }
}
