package com.kelly.ticket;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static final int TAICHUNG_CITY = 200;
    public static final int KAOHSIUNG_CITY = 300;

    Station start;
    Station destination;

    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
    }
    Type type;
   public Ticket(Type type){
       this.type = type;
   }


}