package train;

public class Ticket {

    Person person;
    TicketType ticketType;

    Ticket (Person person, TicketType ticketType) {
        this.person = person;
        this.ticketType = ticketType;
    }

    //Hämtar pris för antingen biljett eller månadskort
    public int getTicketPrice () {

        if (this.ticketType == TicketType.DAY) {
            return getDayPrice();
        }
        else {
            return getMonthPrice();
        }
    }

    //Hämtar pris för en månadskort utifrån åldern
    private int getMonthPrice () {

        if (person.getAge() < 18 || person.getAge() >= 65) {
            return 450;
        }
        else {
            return 600;
        }
    }

    //Hämtar pris för en biljett utifrån ålderm
    private int getDayPrice () {

        if (person.getAge() < 18 || person.getAge() >= 65) {
            return 20;
        }
        else {
            return 35;
        }
    }
}