package train;

import java.util.Scanner;

public class Ticket {

    final int CARD = 2;
    final int TICKET = 1;

    public void selectTicketType () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1 for ticket, enter 2 for card: ");
        int input = scan.nextInt();

        if (input == CARD) {
            System.out.println("30 days ticket is selected, your input was: " + CARD);
        }
        else if (input == TICKET){
            System.out.println("One day ticket is selected, your input was: " + TICKET);
        }
        else {
            System.out.println("Not valid number, try again!");
        }
    }

    public  int getTicketPrice (int age) {

        if (age < 18 || age >= 65) {
            System.out.println("The price is 20 kr.");
        }
        else {
            System.out.println("The price is 35 kr ");
        }
        return age;
    }

    public static int getCardPrice (int age) {

        if (age < 18 || age >= 65) {
            System.out.println("The price is 450 kr.");
        }
        else {
            System.out.println("The price is 600 kr");
        }
        return age;




    }
}