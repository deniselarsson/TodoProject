package train;

import java.util.Scanner;

import static train.Main.createCustomer;

public class Ticket {

    final int CARD = 2;
    final int TICKET = 1;

    Person person = createCustomer();

    public int selectTicketType () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1 for ticket, enter 2 for card: ");
        int input = scan.nextInt();

        if (input == CARD) {
            return getCardPrice(person.getAge());
        }
        else if (input == TICKET) {
        }
        return getTicketPrice(person.getAge());
    }

    //Hämtar pris för en biljett utifrån åldern
    public int getTicketPrice (int age) {

        if (age < 18 || age >= 65) {
            return 20;
        }
        else {
            return 35;
        }
    }

    //Hämtar pris för en månadskort utifrån åldern
    public int getCardPrice (int age) {

        if (age < 18 || age >= 65) {
            return 450;
        }
        else {
            return 600;
        }
    }
}