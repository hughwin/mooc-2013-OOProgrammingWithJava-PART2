
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        
        Airport Heathrow = new Airport();
        
        Scanner reader = new Scanner(System.in);
        textUserInterface Ui = new textUserInterface(reader, Heathrow);
        Ui.start();
        
        
        
        Airplane a = new Airplane("Boeing 747", 124);
        System.out.println(a.toString());
        Airplane b = new Airplane("Boeing 808 Mx", 202);
    }
}
