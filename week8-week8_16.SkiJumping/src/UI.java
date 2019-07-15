
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
        
    }
    
}
