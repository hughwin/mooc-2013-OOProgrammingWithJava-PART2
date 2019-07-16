
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
public class Jumper implements Comparable<Jumper> {

    private String name;
    private int totalScore;
    private ArrayList<Integer> distances;

    public Jumper(String name) {
        this.name = name;
        this.totalScore = 0;
        this.distances = new ArrayList<Integer>();
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.totalScore;
    }

    public void increaseScore(int points) {
        this.totalScore += points;
    }
    
    public void trackedDistances(int dist){
        this.distances.add(dist);
    }
    
    public String printDistances(){
        String lengths = "";
        for (int distance : this.distances){
             lengths = lengths.concat(distance + " m, ");          
        }
        lengths = lengths.substring(0, lengths.length() - 2);
        return lengths;
    }

    public void jump() {
        System.out.println(this.name);
        jumpLogic logic = new jumpLogic(this);
        logic.distance();
        logic.judgesVotes();
    }

    @Override
    public String toString() {
        return (getName() + " (" + this.totalScore + " points)");
    }

    @Override
    public int compareTo(Jumper j) {
        if (this.getScore() == j.getScore()) {
            return 0;
        } else if (this.getScore() > j.getScore()) {
            return 1;
        } else {
            return -1;
        }
    }

}
