/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author Hugh
 */
public class Vampire {

    private int positionX;
    private int positionY;
    private int maxX;
    private int maxY;
    private Random random = new Random();

    public Vampire(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.positionX = random.nextInt(this.maxX);
        this.positionY = random.nextInt(this.maxY);
        while (this.positionX == 0 && this.positionY == 0) {
            this.positionX = random.nextInt(this.maxX);
            this.positionY = random.nextInt(this.maxY);
        }
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public void move() {
        this.positionX = random.nextInt(this.maxX);
        this.positionY = random.nextInt(this.maxY);

        }

       

}
