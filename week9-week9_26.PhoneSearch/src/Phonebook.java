
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
public class Phonebook {

    private HashMap<String, ArrayList<String>> entries;
    private ArrayList<Person> people;

    public Phonebook() {
        this.entries = new HashMap<String, ArrayList<String>>();
        this.people = new ArrayList<Person>();
    }

    public void addPhoneNumber(Person person) {

        String name = person.getName();
        String phoneNumber = person.getNumber();

        if (!this.entries.containsKey(name)) {
            this.entries.put(name, new ArrayList<String>());
            this.entries.get(name).add(phoneNumber);
            this.people.add(person);
        } else {
            this.entries.get(name).add(phoneNumber);
        }
    }

    public void addAddress(String name, String street, String city) {
        for (Person x : this.people) {
            if (name.equals(x.getName())) {
                x.setAddress(street, city);
            }
        }

    }

    public void findPhoneNumber(String query) {

        if (this.entries.containsKey(query)) {
            for (String x : this.entries.get(query)) {
                System.out.println(x);
            }
        } else {
            System.out.println("not found");
        }
    }

    public String searchByPhone(String phoneNumber) {
        for (String s : this.entries.keySet()) {
            ArrayList a = this.entries.get(s);
            if (a.contains(phoneNumber)) {
                return s;
            }
        }
        return "Not found";
    }

    public void information(String name) {
        for (Person x : this.people) {
            if (name.equals(x.getName())) {
                System.out.println(x.getAddress());
                System.out.println(x.getNumber());
            }

        }
        System.out.println("not found");
    }

    public void removeDetails(String name) {
        if (this.entries.containsKey(name)){
        while (this.entries.containsKey(name)) {
            this.entries.remove(name);
            this.people.remove(name);
        }
        }
        else {System.out.println("not found");}
    }
}
