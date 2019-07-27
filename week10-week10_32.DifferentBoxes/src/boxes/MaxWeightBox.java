/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author Hugh
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private ArrayList<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int boxCurrentWeight = 0;

        if (this.things.isEmpty()) {
            this.things.add(thing);
        } else {

            for (Thing x : this.things) {
                boxCurrentWeight += x.getWeight();
            }
            System.out.println(boxCurrentWeight);

            if ((boxCurrentWeight + thing.getWeight()) <= this.maxWeight) {
                this.things.add(thing);
            }
        }

    }
    
    

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing x : this.things) {
            if (x.equals(thing)) {
                return true;
            }
        }
        return false;
    }

}
