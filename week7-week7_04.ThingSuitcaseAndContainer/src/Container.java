
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
public class Container {

    private ArrayList<Suitcase> container;
    private int limit;
    private int count;

    public Container(int limit) {
        this.container = new ArrayList<Suitcase>();
        this.limit = limit;

    }

    public void addSuitcase(Suitcase suitcase) {

        if (totalWeight() + suitcase.totalWeight() <= this.limit) {
            this.container.add(suitcase);
            this.count++;
        }

  
    }
    
        public int totalWeight() {
        int weight = 0;
        for (Suitcase x : this.container) {
            weight += x.totalWeight();
        }
        return weight;
    }

    public String toString() {
        return this.count + " suitcases (" + totalWeight() + " kg)";
    }

    public void printThings() {

        for (Suitcase x : this.container) {
            x.printThings();
        }
    }
}
