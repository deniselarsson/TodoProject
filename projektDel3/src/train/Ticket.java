package train;

import java.util.Scanner;
import static train.Main.tickets;
import static train.Person.createCustomer;

public class Ticket {

    Person person;
    TicketType ticketType;

    Ticket (Person person, TicketType ticketType) {
        this.person = person;
        this.ticketType = ticketType;
    }

    //Hämtar pris för antingen biljett eller månadskort
    public int getTicketPrice () {

        if (this.ticketType == TicketType.DAY) {
            return getDayPrice();
        }
        else {
            return getMonthPrice();
        }
    }

    //Hämtar pris för en månadskort utifrån åldern
    private int getMonthPrice () {

        if (person.getAge() < 18 || person.getAge() >= 65) {
            return 450;
        }
        else {
            return 600;
        }
    }

    //Hämtar pris för en biljett utifrån ålderm
    private int getDayPrice () {

        if (person.getAge() < 18 || person.getAge() >= 65) {
            return 20;
        }
        else {
            return 35;
        }
    }

    //Väljer antingen biljett eller måndadskort
    private static TicketType selectTicketType () {

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

    //Hur mycket personen ska betala utifrån åldern
    public static void sellTicket () {

        Person person = createCustomer();
        TicketType ticketType = selectTicketType();
        Ticket ticket = new Ticket(person, ticketType);

        tickets.add(ticket);
        System.out.println(ticket.getTicketPrice() + " kr");
    }
}