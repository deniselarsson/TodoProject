package train;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter customers name: ");
        String name = scan.nextLine();

        System.out.print("Ticket or card: ");
        String ticket = scan.nextLine();

        System.out.print("Enter customers age: ");
        int age = scan.nextInt();

        System.out.println(createCostumer(name,age,ticket));
    }
    //Metod create customer
    public static String createCostumer(String name, int age, String ticket) {

        return "Costumer: " + name + "\nAge: " + age + " \nTicket type: " + ticket;
    }
}