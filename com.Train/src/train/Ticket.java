package train;


public class Ticket {

    Person person;
    TicketType ticketType;

    Ticket(Person person, TicketType ticketType){
        this.person = person;
        this.ticketType = ticketType;
    }


    //Hämtar pris för en biljett utifrån åldern
    public int getTicketPrice () {

        if (person.getAge() < 18 || person.getAge() >= 65) {
            return 20;
        }
        else {
            return 35;
        }
    }

    //Hämtar pris för en månadskort utifrån åldern
    public int getMonthPrice () {

        if ( person.getAge()< 18 || person.getAge() >= 65) {
            return 450;
        }
        else {
            return 600;
        }
    }
    private int getDayPrice(){

        if (person.getAge() < 18 || person.getAge() >= 65) {
            return 20;
        }
        else {
            return 35;
        }
    }
}