
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
public class textUserInterface {

    private Scanner reader;
    private Airport airport;

    public textUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }

    public void start() {

        while (true) {
            System.out.println("Airport panel\n"
                    + "--------------------");
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");
            
            
            String input = this.reader.nextLine();
            if (input.equals("1")) {
                System.out.println("Give plane ID:");
                String planeID = this.reader.nextLine();
                System.out.println("Give plane capacity:");
                int capacity = this.reader.nextInt();
                Airplane plane = new Airplane(planeID, capacity);
                this.airport.addPlane(plane);

            }
            if (input.equals("x")) {
                break;
            }

        }
        flightService();
    }

    public void flightService() {
        
        while(true){
        System.out.println("Flight service\n"
                + "------------\n"
                + "\n"
                + "Choose operation:\n"
                + "[1] Print planes\n"
                + "[2] Print flights\n"
                + "[3] Print plane info\n"
                + "[x] Quit");
        
        String input = this.reader.nextLine();
        
        if (input.equals("1")){
            this.airport.printPlanes();
        }
        
    }
    }

}
