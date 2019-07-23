/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hugh
 */
public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.max(this.history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.min(this.history);
    }

    public double average() {
        double i = 0.0;
        if (this.history.isEmpty()) {
            return 0;
        }
        for (double x : this.history) {
            i += x;
        }
        return i / this.history.size();
    }

    public double greatestFluctuation() {

        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        } else {

            double greatestFluctuation = Math.abs(this.history.get(0) - this.history.get(1));

            for (int i = 0; i < this.history.size() - 1; i++) {

                double fluctuation = Math.abs(this.history.get(i) - this.history.get(i + 1));

                if (fluctuation > greatestFluctuation) {
                    greatestFluctuation = fluctuation;
                }
            }
            return greatestFluctuation;
        }
    }

    public double variance() {
        double totalCount = 0;
        double average = average();
        for (double x : this.history) {
            totalCount += Math.pow((x - average), 2);
        }
        return (totalCount / (this.history.size() - 1));
    }
    
    

}
