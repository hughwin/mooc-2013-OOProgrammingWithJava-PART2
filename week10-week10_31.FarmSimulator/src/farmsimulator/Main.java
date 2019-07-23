package farmsimulator;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
BulkTank m = new BulkTank(5782.4);
m.addToTank(3232.13);
        System.out.println(m.toString());
m.addToTank(50000.99);
System.out.println(m.toString());
m.addToTank(5000.0);
System.out.println(m.toString());
m.getFromTank(1.5);
System.out.println(m.toString());
m.getFromTank(1432.1232);
System.out.println(m.toString());
m.getFromTank(50000.0);
System.out.println(m.toString());
m.getVolume();
    }
}

/* CLIFFHANGER: 

Need to complete exercise Exercise 31.5: Farm

*/