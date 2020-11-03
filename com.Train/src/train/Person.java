package train;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public int getAge () {
        return age;
    }

    ///Metod create customer
    public static Person createCustomer () {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter customers name: ");
        String name = scan.nextLine();

        System.out.print("Enter customers age: ");
        int age = scan.nextInt();
        return new Person(name, age);

    }
}
