/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
import java.util.Scanner;

public class Reader {
    
    private Scanner in;

    public Reader() {
        this.in = new Scanner(System.in);
    }

    public String readString() {
        return this.in.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(this.in.nextLine());
    }

}
