package train;

import java.util.Scanner;
import static train.Main.tickets;
import static train.Customer.createCustomer;

public class Ticket {

    Customer customer;
    TicketType ticketType;

    Ticket (Customer customer, TicketType ticketType) {
        this.customer = customer;
        this.ticketType = ticketType;
    }

    //Hämtar pris för antingen biljett eller månadskort
    public int ticketPrice () {

        if (this.ticketType == TicketType.DAY) {
            return validateDayPrice();
        }
        else {
            return validateMonthPrice();
        }
    }

    //Hämtar pris för en månadskort utifrån åldern
    private int validateMonthPrice () {

        if (customer.getAge() < 18 || customer.getAge() >= 65) {
            return 450;
        }
        else {
            return 600;
        }
    }

    //Hämtar pris för en biljett utifrån ålderm
    private int validateDayPrice () {

        if (customer.getAge() < 18 || customer.getAge() >= 65) {
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
    //Ticket has a customer
    public static void sellTicket () {

        Customer customer = createCustomer();
        TicketType ticketType = selectTicketType();
        Ticket ticket = new Ticket(customer, ticketType);

        tickets.add(ticket);
        System.out.println(ticket.ticketPrice() + " kr");
    }
}