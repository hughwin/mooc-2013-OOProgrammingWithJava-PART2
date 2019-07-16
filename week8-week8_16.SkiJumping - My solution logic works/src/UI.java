
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class UI {

    private Scanner reader;

    public UI() {
        this.reader = new Scanner(System.in);
    }

    public void start() {

        Jumpers j = new Jumpers();

        System.out.println("Kumpula ski jumping week\n"
                + "\n"
                + "Write the names of the participants one at a time; an empty string brings you to the jumping phase.\n");

        while (true) {

            String input = this.reader.nextLine();

            if (input.equals("")) {
                break;
            } else {
                j.addJumper(new Jumper(input));
            }
        }

        System.out.println("The tournament begins!");
        int round = 1;
        System.out.println("Round " + round + "\n");

        System.out.println("Jumping order: ");
        j.jumperOrder();
        j.printJumpers();
        System.out.println("");
        System.out.println("Results of round " + round);
        j.jump();
        round++;
        
        
        
        while (true) {

            System.out.println("Write \"jump\" to jump; otherwise you quit:");
            String input = this.reader.nextLine();
            if (input.equals("jump")) {

                System.out.println("Round " + round + "\n");

                System.out.println("Jumping order: ");
                j.jumperOrder();
                j.printJumpers();
                System.out.println("");
                System.out.println("Results of round " + round);
                j.jump();
                round++;
            }
            if (input.equals("quit")) {
                break;
            }

        }
        
        System.out.println("");
        System.out.println("Thanks! \n");
        j.printWinners();
        System.out.println("");
        
        
    }

}
