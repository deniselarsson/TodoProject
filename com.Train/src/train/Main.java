package train;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Person person = createCustomer();
        TicketType ticketType = selectTicketType();

        Ticket ticket = new Ticket(person, ticketType);


        System.out.println();

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
}