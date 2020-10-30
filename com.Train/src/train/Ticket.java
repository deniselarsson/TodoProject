package train;

public class Ticket {

    Period period;


    void  Period(Period period){

        switch (period){
            case DAY:
                System.out.println("Day ticket, enter 1");
                break;
            case MONTH:
                System.out.println("Month ticket, enter 2");
                break;
            default:
                System.out.println("Not valid, try again!");
        }
    }
    //Tickets price
    public static int sellTicket (int age) {

        //om ticket är "ticket"
        if (age < 18 || age >= 65) {
            System.out.println("The price is 20 kr.");
        }
        else {
            System.out.println("The price is 35 kr ");
        }
        return age;
    }

    public static int sellCard (int age){

        if (age < 18 || age >= 65) {
            System.out.println("The price is 450 kr.");
        }
        else {
            System.out.println("The price is 600 kr");
        }
        return age;

    }
}