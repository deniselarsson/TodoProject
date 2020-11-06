package train;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private String name;
    private int age;

    Customer (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return age;
    }

    ///Metod create customer
    public static Customer createCustomer () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter customers name: ");
        String name = scan.nextLine();

        System.out.print("Enter customers age: ");
        int age = scan.nextInt();
        return new Customer(name, age);
    }

    public static void printNames (ArrayList<Ticket> tickets) {

        for (Ticket ticket : tickets) {
            System.out.println(ticket.customer.getName()+ "\n");
        }
    }
}
