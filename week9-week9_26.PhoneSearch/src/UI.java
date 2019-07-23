
import java.util.ArrayList;
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
public class UI {

    private Scanner reader;

    public UI() {
        this.reader = new Scanner(System.in);
    }

    public void Start() {

        Phonebook a = new Phonebook();

        while (true) {
            System.out.println("phone search\n"
                    + "available operations:\n"
                    + " 1 add a number\n"
                    + " 2 search for a number\n"
                    + " 3 search for a person by phone number\n"
                    + " 4 add an address\n"
                    + " 5 search for personal information\n"
                    + " 6 delete personal information\n"
                    + " 7 filtered listing\n"
                    + " x quit");
            String input = this.reader.nextLine();
            if (input.equals("x")) {
                break;
            }
            if (input.equals("1")) {
                System.out.println("whose number: ");
                String name = this.reader.nextLine();
                System.out.println("number: ");
                String number = this.reader.nextLine();
                Person newPerson = new Person(name, number);
                a.addPhoneNumber(newPerson);
            }
            if (input.equals("2")) {
                System.out.println("whose number: ");
                String query = this.reader.nextLine();
                a.findPhoneNumber(query);
            }
            if (input.equals("3")) {
                System.out.println("number: ");
                String query = this.reader.nextLine();
                System.out.println(a.searchByPhone(query));
            }
            if (input.equals("4")) {
                System.out.println("whose address: ");
                String name = this.reader.nextLine();
                System.out.println("street: ");
                String street = this.reader.nextLine();
                System.out.println("city: ");
                String city = this.reader.nextLine();
                a.addAddress(name, street, city);
            }
            if (input.equals("5")) {
                System.out.println("whose information: ");
                String name = this.reader.nextLine();
                a.information(name);
        }
            if (input.equals("6")) {
                System.out.println("whose information: ");
                String name = this.reader.nextLine();
                a.removeDetails(name);
            }
        }
    }

    }
