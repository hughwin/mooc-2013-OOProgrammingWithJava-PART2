/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Hugh
 */
public class Cow implements Milkable, Alive {

    private int udderCapacity;
    private String name;
    private double amountOfMilk;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {

        this.udderCapacity = 15 + new Random().nextInt(26);
        this.name = NAMES[new Random().nextInt(NAMES.length)];
    }

    public Cow(String name) {

        this.udderCapacity = 15 + new Random().nextInt(26);
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.udderCapacity;
    }

    public double getAmount() {
        return this.amountOfMilk;
    }

    public String toString() {
        return this.name + " " + Math.ceil(this.amountOfMilk) + "/" + Math.ceil(this.udderCapacity);
    }

    @Override
    public double milk() {
        double amount = this.amountOfMilk;
        this.amountOfMilk = 0;
        return amount;
    }

    @Override
    public void liveHour() {
        
        this.amountOfMilk += 1 + new Random().nextDouble();
        if (this.amountOfMilk > this.udderCapacity){
            this.amountOfMilk = this.udderCapacity;
        }
    }
    

}
