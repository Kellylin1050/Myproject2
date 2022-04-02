package com.kelly.ticket;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static final int TAICHUNG_CITY = 200;
    public static final int KAOHSIUNG_CITY = 300;

    Station start;
    Station destination;
    Type type;
    float price;
    int quantity;
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(float totalprice) {
        this.price = totalprice;
    }

    public Ticket(Station start, Station destination, Type type){
        this.start = start;
        this.destination = destination;
        this.type = type;
    }

}