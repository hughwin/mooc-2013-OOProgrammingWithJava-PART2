/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author Hugh
 */
public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }

    public String toString() {
        return "Farm owner: " + this.owner
                + "\nBarn bulk tank: " + this.barn.toString()
                + "\nAnimals:" + getCows();

    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public String getCows() {
        String cows = "";
        for (Cow x : this.cows) {
            cows += "\n        " + x.toString();
        }
        return cows;
    }

    @Override
    public void liveHour() {
        for (Cow x : cows) {
            x.liveHour();
        }
    }

    public void manageCows() {
        this.barn.takeCareOf(cows);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

}
