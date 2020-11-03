package train;

import java.util.ArrayList;
import java.util.Scanner;

import static train.Ticket.sellTicket;

public class Main {

    static ArrayList<Ticket> tickets = new ArrayList<>();

    public static void main (String[] args) {

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Sell ticket enter 1, print names enter 2: ");
            int input = scan.nextInt();

            if (input == 1) {
                sellTicket();
            }
            else {
                printNames(tickets);
            }
        }
    }
    public static void printNames (ArrayList<Ticket> tickets) {

        for (Ticket ticket : tickets) {
            System.out.println(ticket.person.getName());
        }
    }
}

