/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hugh
 */
public class Person {

    private String name;
    private String number;
    private String street;
    private String city;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
        this.street = null;
        this.city = null;
    }


    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String getAddress() {
        if (this.city != null) {
            return "address: " + this.street + " " + this.city;
        } else {
            return "address unknown";
        }
    }

    public void setAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }

}
