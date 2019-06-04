
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
public class Suitcase {

    private int limit;
    private int count;
    private ArrayList<Thing> things;

    public Suitcase(int limit) {
        this.limit = limit;
        this.count = 0;
        this.things = new ArrayList<Thing>();

    }

    public void addThing(Thing thing) {

        if (totalWeight() + thing.getWeight() <= this.limit) {
            count++;
            this.things.add(thing);

        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing x : this.things) {
            weight += x.getWeight();
        }
        return weight;
    }

    public String toString() {
        if (things.isEmpty()) {
            return "empty (0 kg)";
        } else if (this.count == 1) {
            return this.count + " thing " + "(" + totalWeight() + "kg)";
        } else {
            return this.count + " things " + "(" + totalWeight() + "kg)";
        }
    }

    public void printThings() {
        for (Thing x : this.things) {
            System.out.println(x);
        }
    }

    public Thing heaviestThing() {
        Thing heaviest = null;
        if (this.things.isEmpty()) {
            return null;
        } else {
            int weight = 0;
            for (Thing x : this.things) {
                if (x.getWeight() > weight) {
                    weight = x.getWeight();
                    heaviest = x;
                }
            }
        }
        return heaviest;
    }
}
