package train;

import java.util.Scanner;

public class Ticket {

    int age;

    public void sellTicket () {

        if (age < 18 || age >= 65) {
            System.out.println("The price is 20 kr.");
        }
        else {
            System.out.println("The price is 35 kr");
        }
    }
    public void sellMonthlyCard () {

        if (age < 18 || age >= 65) {
            System.out.println("The price is 450 kr.");
        }
        else {
            System.out.println("The price is 600 kr");
        }
    }
    public void ticketOrMonthlyCard () {

        Scanner scan = new Scanner(System.in);

        String ticket = "ticket";
        String monthlyCard = "monthly card";

        System.out.print("Please enter if it is ticket or monthly card: ");
        if (true) {
            ticket = scan.nextLine();

            System.out.println(ticket);
        }
        else if (true) {
            monthlyCard = scan.nextLine();

            System.out.println(monthlyCard);
        }
    }
}