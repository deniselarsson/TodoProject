package UML.homePage;

import java.util.Scanner;

public class ToDoList {

    public static void main (String[] args) {

        Input();

    }
    public static String Input () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Write your to do list: ");
        String input = scan.nextLine();

        while (true){

            System.out.print("Your to do list are: " + input + "\n");
            System.out.print("\n"+ "Write your to do list: ");

            scan = new Scanner(System.in);
            input = scan.nextLine();
        }
    }
}
