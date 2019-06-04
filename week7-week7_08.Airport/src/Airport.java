
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
    public void addFlight(){
    
    }

    public void printPlaneInfo(String search) {
        for (Airplane x : this.planes) {
            if (x.getPlane().equals(search)) {
                System.out.println(x.getPlane() + " " + x.getCapacity());
            }

        }
    }

    public void printPlanes() {
        for (Airplane x : this.planes) {
            System.out.println(x.getPlane() + " " + x.getCapacity());
        }
    }

}
