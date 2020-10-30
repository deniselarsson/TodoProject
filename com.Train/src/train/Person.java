package train;

import java.util.Scanner;

public class Person {

    Scanner scan = new Scanner(System.in);

    private String name;
    private int age;

    Person () {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }

    public void showPersonsName () {

        System.out.print("Enter customer name: ");
        this.name = scan.nextLine();
    }

    public void showPersonsAge () {

        System.out.print("Enter customer age: ");
        this.age = scan.nextInt();
    }

    //Spara alla kunder onboard i en arraylist

}
