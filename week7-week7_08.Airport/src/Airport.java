
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class Airport {

    private ArrayList<Airplane> planes;
    private ArrayList<String> flights;

    public Airport() {
        this.planes = new ArrayList<Airplane>();
        this.flights = new ArrayList<String>();
    }

    public void addPlane(Airplane airplane) {
        this.planes.add(airplane);
    }

    public void addFlight(String ID, String departing, String destination) {
        for (Airplane x : this.planes) {
            if (x.getPlane().equals(ID)) {
                this.flights.add(x.toString() + " (" + departing + "-" + destination + ")");
            }

        }
    }

    public void printPlanes() {
        for (Airplane x : this.planes) {
            System.out.println(x.toString());
        }
    }

    public void printFlights() {
        for (String x : this.flights) {
            System.out.println(x);
        }
    }

    public void printPlaneInfo(String ID) {
        for (Airplane x : this.planes) {
            if (x.getPlane().equals(ID)) {
                System.out.println(x.toString());
            }

        }
    }

}
