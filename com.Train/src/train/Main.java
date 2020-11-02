package train;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Ticket> tickets = new ArrayList<>();

    public static void main (String[] args) {

        while (true) {
            Person person = createCustomer();
            TicketType ticketType = selectTicketType();
            Ticket ticket = new Ticket(person, ticketType);

            tickets.add(ticket);
            System.out.println(ticket.getTicketPrice() + " kr");

            printNames(tickets);
        }
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
    public static TicketType selectTicketType () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1 for day, enter 2 for month: ");
        int input = scan.nextInt();

        if (input == 1) {
            return TicketType.DAY;
        }
        else {
            return TicketType.MONTH;
        }
    }

    public static void printNames(ArrayList<Ticket>tickets){

        for (Ticket ticket:tickets) {
            System.out.print(ticket.person.getName());
        }
    }
}