
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hugh
 */
public class RingingCentre {

    private HashMap<Bird, ArrayList<String>> sightings;

    public RingingCentre() {
        this.sightings = new HashMap<Bird, ArrayList<String>>();

    }

    public void observe(Bird bird, String place) {

        boolean added = false;

        for (Bird x : this.sightings.keySet()) {
            if (x.equals(bird)) {
                this.sightings.get(bird).add(place);
                added = true;
            }

        }
        if (!added) {

            this.sightings.put(bird, new ArrayList<String>());
            this.sightings.get(bird).add(place);

        }
    }

    public void observations(Bird bird) {

        if (this.sightings.containsKey(bird)){
                System.out.println(bird.toString() + " observations: " + this.sightings.get(bird).size());
                
                            for (String y : this.sightings.get(bird)) {
                System.out.println(y);
                            }
            }
        else{System.out.println(bird.toString() + " observations: 0"); }
            }


       
    }

