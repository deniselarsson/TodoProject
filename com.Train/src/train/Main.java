package train;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter customers name: ");
        String name = scan.nextLine();

        System.out.print("Enter customers age: ");
        int age = scan.nextInt();

    }
    //Metod create customer
    public static String createCostumer(String name, int age, String ticket ) {

        return name + " " + age + " " + ticket;
    }
}