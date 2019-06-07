/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
    }

    public void work() {
        if (this.daysLeft > 0) {
            System.out.println(this.daysLeft);
            this.daysLeft--;
        }
    }
    
    public int getDaysLeft(){
        return this.daysLeft;
    }
}
