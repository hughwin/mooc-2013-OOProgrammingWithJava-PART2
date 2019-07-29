/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Hugh
 */
public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private ArrayList<Vampire> groupVampires;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.groupVampires = new ArrayList<Vampire>();
    }

    public void moveVampires() {
        if (this.vampiresMove) {
            for (Vampire x : this.groupVampires) {
                x.move();
            }
        }
    }

    public void collisionDetect(Player player) {
        Vampire toBeRemoved = null;
        for (Vampire x : this.groupVampires) {
            if (x.getPositionY() == player.getPositionY() && x.getPositionX() == player.getPositionX()) {
                toBeRemoved = x;
            }
        }

        this.groupVampires.remove(toBeRemoved);

        if (this.groupVampires.isEmpty()) {
            System.out.println("YOU WIN!");
        }
    }

    public void createDungeon(Player player) {

        String dungeon[][] = new String[this.height][this.length];

        for (int i = 0; i < this.height; i++) {
            for (int k = 0; k < this.length; k++) {
                dungeon[i][k] = ".";
            }

            for (Vampire x : this.groupVampires) {
                dungeon[x.getPositionY()][x.getPositionX()] = "v";
            }
            dungeon[player.getPositionY()][player.getPositionX()] = "@";

            String temp = Arrays.toString(dungeon[i]).replace(",", "") //remove the commas
                    .replace("[", "")
                    .replace("]", "")
                    .replace(" ", "")
                    .trim();
            System.out.println(temp);
        }

    }

    public void run() {
        Player player = new Player(this.length, this.height);

        for (int i = 0; i < this.vampires; i++) {
            Vampire a = new Vampire(this.length, this.height);
            this.groupVampires.add(a);
        }

        Scanner reader = new Scanner(System.in);

        while (this.moves > 0) {

            if (this.groupVampires.isEmpty()) {
                break;
            }
            
            collisionDetect(player);

            System.out.println(this.moves + "\n");

            System.out.println("@ " + player.getPositionX() + " " + player.getPositionY());

            for (Vampire x : this.groupVampires) {
                System.out.println("v " + x.getPositionX() + " " + x.getPositionY());

            }
            System.out.println();
            
            moveVampires();
            createDungeon(player);

            String input = reader.nextLine();
            player.playerMove(input);

            this.moves--;

        }

        System.out.println("YOU LOSE");
    }
}
