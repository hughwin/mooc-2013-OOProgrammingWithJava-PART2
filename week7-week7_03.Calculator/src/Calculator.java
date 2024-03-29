/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
import java.lang.Math;

public class Calculator {

    private Reader reader;
    private int calculations = 0;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.println("value 1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value 2: ");
        int value2 = this.reader.readInteger();
        System.out.println("sum of the values " + (value1 + value2));
        this.calculations++;
    }

    private void difference() {
        System.out.println("value 1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value 2: ");
        int value2 = this.reader.readInteger();
        System.out.println("difference of the values " + (value1 - value2));
        this.calculations++;
    }

    private void product() {
        System.out.println("value 1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value 2: ");
        int value2 = this.reader.readInteger();
        System.out.println("product of the values " + (value1 * value2));
        this.calculations++;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.calculations);
    }
    
}
