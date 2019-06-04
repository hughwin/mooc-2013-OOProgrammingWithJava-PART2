
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
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;

    }

    public void start() {
        while (true) {
            String input = this.reader.nextLine();
            if (input.equals("quit")) {
                break;
            }
            if (input.equals("add")){
                System.out.println("In Finnish:");
                String a = this.reader.nextLine();
                System.out.println("Translation:");
                String b = this.reader.nextLine();
                this.dictionary.add(a, b);
            }
            if (input.equals("translate")){
                System.out.println("Give a word");
                String a = this.reader.nextLine();
                System.out.println(this.dictionary.translate(a));
            }
            else {System.out.println("Unknown statement");}
        }
    }
}
