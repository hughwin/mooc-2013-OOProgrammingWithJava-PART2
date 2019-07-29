/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Hugh
 */
public class Player {

    private int playerPositionX;
    private int playerPositionY;
    private int maxX;
    private int maxY;

    public Player(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.playerPositionX = 0;
        this.playerPositionY = 0;
    }

    public void playerMove(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.toString(input.charAt(i)).equals("s") && this.playerPositionY < this.maxY - 1) {
                this.playerPositionY++;
            }
            if (Character.toString(input.charAt(i)).equals("w") && this.playerPositionY != 0) {
                this.playerPositionY--;
            }
            if (Character.toString(input.charAt(i)).equals("d")  && this.playerPositionX < this.maxX -1) {
                this.playerPositionX++;
            }
            if (Character.toString(input.charAt(i)).equals("a") && this.playerPositionX != 0) {
                this.playerPositionX--;
            }

        }

    }

    public int getPositionX() {
        return this.playerPositionX;
    }

    public int getPositionY() {
        return this.playerPositionY;
    }

}
