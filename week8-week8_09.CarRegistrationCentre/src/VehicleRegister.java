
import java.lang.reflect.Array;
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
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> register;

    public VehicleRegister() {
        this.register = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.register.get(plate) == null) {
            register.put(plate, owner);
            return true;
        } else {
            return false;
        }

    }

    public boolean delete(RegistrationPlate plate) {
        if (this.register.get(plate) != null) {
            this.register.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate) {
        return this.register.get(plate);
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.register.keySet()) {
            System.out.println(plate.toString());
        }
    }

    public void printOwners() {

        ArrayList printed = new ArrayList<String>();
        for (RegistrationPlate plate : this.register.keySet()) {

            if (!printed.contains(this.register.get(plate))) {
                System.out.println(this.register.get(plate));
                printed.add(this.register.get(plate));
            }
        }
    }

}
