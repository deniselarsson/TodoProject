###Grupp3Projekt Del 3

####Textual Analysis: 
Vi vill kunna sälja biljett eller månadskort, spara namn, skriva ut namn/lista, 
validera hur mycket en person ska betala utifrån åldern, mata in värden.

####Kandidater:
Konduktör, person, biljett, scanner klass som  tar in värden, namn, ålder, biljett, månadskort, 
resenär input, skriva ut en lista , sälja biljett/månadskort, spara namn(lista), spara ålder, verifiera ålder

#####Objekt: Konduktör, person, biljett

#####Metoder: Scanner klass som tar in värden, biljett, månadskort, resenär input, skriva ut en lista,
sälja biljett/månadskort, spara namn(lista), spara ålder, verifiera ålder

#####Variaber: int price; int age; String name;

#####Aktörer: konduktören
 
####Vilka av kandidaterna som blev vad:
Scanner klass som tar in input och ticket som som när biljett säljs hämtar pris baserat på input(ålder och val av typ av biljett(dag/månad)) : blev våra objekt.
Konduktör: det visade sig att vi inte behövde denna klass som vi hade tänkt från början.
Costumer, ticket, ticketType: blev våra klasser.
Ålder, biljett, månadskort, resenär input, skriva ut en lista, sälja biljett/månadskort, spara namn(lista), spara ålder, verifiera ålder: blev våra metoder.

 
#####Objekt: Scanner, Ticket

####Metoder:
printNames () createCustomer() getTicketPrice() getMonthPrice() getDayPrice() selectTicketType() sellTicket()

#####Variaber: 
Costumer costumer; TicketType ticketType; String name; int age; enum DAY; enum MONTH;

#####Aktörer: Konduktören

#####Motivering av objekt : 
Vi valde Scanner för att användaren ska kunna mata in input och att vi kan skriva ut text.

####Daglogg
#####29/10/2020:Idag har Denisé och Klara gjort vår första textanalys med att välja ut olika kandidater.

#####30/10/2020:Idag har Denisé, Klara och Peter tagit fram ett UML diagram för vår kod, fattat beslut kring objekt, metoder och klasser samt fördelat arbete. 

#####2/11/2020:Idag har vi tre kommit fram till att inte använda konduktör klassen och behöver uppdatera UML diagrammet. Vi diskuterade om varandras kod,varför,hur vi har kodat. 

#####3/11/2020:Idag har vi tre plockat från varandras kod och fått programmet att köra

#####4/11/2020: Idag har Peter, Klara och Denisé ändrat UML diagrammet, färdigställt koden, arbetat med rapporten 

#####9/11/2020: Idag har vi tre uppdaterat vår rapport och UML diagrammet samt förberett inför presentationen.

#####På vilket sätt har ni använt er av Objektorentering? 
Vi har använt oss av objektorientering genom att använda oss av 3 olika klasser vars objekt interagerar med varandra,
vi använder encapsulation som binder ihop data med metoder och skyddar privata variabler.

#####Vilka klasser och metoder har vem haft ansvar för?
Vi har delat ansvaret för samtliga klasser, jobbat på var sitt håll och sedan haft ett möte där vi kombinerat varandras kod. 

####Grupparbete Vilka klasser och metoder har vem haft ansvar för?
Ingen har haft ansvar för specifik klasser eller metoder.

####Hur har det gått att jobba i grupp? 
Bra, vi har en fungerande kod, har haft ett öppet och bra samtalsklimat, allas ideer och tankar har hörts och vi är nöjda med resultatet.

####Var det nåt som blev enklare att vara i grupp än att vara själv? 
Det gav mer bredd i hur man kan lösa ett problem, tre infallsvinklar istället för bara sin egen.

####Vad har ni stött på för svårigheter med att jobba i grupp?
Till en början fördelade vi ansvar över klasser men insåg snabbt att det blev svårt att implementera varandras kod så istället valde vi parprogrammering. 

