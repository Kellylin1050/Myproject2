package com.kelly.ticket;

public class Ticket {
    /*public static final int TAIPEI_CITY = 100;
    public static final int TAICHUNG_CITY = 200;
    public static final int KAOHSIUNG_CITY = 300;*/

    Station start;
    Station destination;
    Type type;
    float price;
    int quantity;

    public void setQuantity(int quantity) {this.quantity = quantity;}
    public void setPrice(float totalprice) {this.price = totalprice;}

    public Ticket(Station start, Station destination, Type type) {
        this.start = start;
        this.destination = destination;
        this.type = type;
        //方法三
       /* int diff = Math.abs(start.id-destination.id);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;

        }*/


        //方法二
         /*if (start == Station.TAIPEI_CITY) {
            if (destination ==  Station.TAICHUNG) {
                price = 500;
            } else {
                price = 1100;
            }
        } else if (start == Station.TAICHUNG) {
            if (destination == Station.KAOHSIUNG) {
                price = 600;
            } else {
                price = 500;
            }
        } else if (start == Station.KAOHSIUNG) {
            if (destination == Station.TAIPEI_CITY) {
                price = 110;
            } else {
                price = 600;
            }
        }*/

    }




}