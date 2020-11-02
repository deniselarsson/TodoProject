package train;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Ticket ticket = new Ticket();

        System.out.println(ticket.selectTicketType());

    }
    //Metod create customer
    public static Person createCustomer () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter customers name: ");
        String name = scan.nextLine();

        System.out.print("Enter customers age: ");
        int age = scan.nextInt();
        return new Person(name, age);
    }
}