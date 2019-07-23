/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Hugh
 */
public class BulkTank {

    private double capactity;
    private double volume;

    public BulkTank() {
        this.capactity = 2000.00;
        this.volume = 0.0;
    }

    public BulkTank(double capacity) {
        this.capactity = capacity;
        this.volume = 0.0;
    }

    public double getCapacity() {
        return this.capactity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capactity - this.volume;
    }

    public void addToTank(double amount) {
        if (howMuchFreeSpace()< amount) {
            this.volume = this.capactity;
        } else {
            this.volume += amount;
        }
    }

    public double getFromTank(double amount) {
        if (amount >= this.volume) {
            double volume = this.volume;
            this.volume = 0.0;
            return volume;
        } else {
            this.volume -= amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capactity);
    }

}
