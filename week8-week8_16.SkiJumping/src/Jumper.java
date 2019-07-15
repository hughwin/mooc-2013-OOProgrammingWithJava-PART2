/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class Jumper {
    
    private String name;
    private int totalScore; 
    
    
    public Jumper(String name){
        this.name = name;
        this.totalScore = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getScore(){
        return this.totalScore;
    }
    
    public void increaseScore(int points){
        this.totalScore += points;
    }
    
    public void jump(){
            System.out.println(this.name);
        jumpLogic logic = new jumpLogic(this);
            logic.distance();
            logic.judgesVotes();
    }
    
    @Override
    public String toString(){
        return (getName() + "(" + this.totalScore + " points)");
    }
    
    
    
    
}
