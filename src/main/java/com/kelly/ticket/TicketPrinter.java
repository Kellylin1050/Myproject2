package com.kelly.ticket;
import java.util.ArrayList;

public class TicketPrinter {
    public void Printer(ArrayList<Ticket> ticketArrayList){
        int length = ticketArrayList.size();
        for (int i = 0; i < length;i++){
            System.out.println("==========");
            System.out.println("Start:"       + ticketArrayList.get(i).start.name);
            System.out.println("Destination:" + ticketArrayList.get(i).destination.name);
            System.out.println("Type:"        + ticketArrayList.get(i).type.name);
            System.out.println("Price:"       + ticketArrayList.get(i).price);
            System.out.println("Quantity:"    + ticketArrayList.get(i).quantity);
            System.out.println("==========");
        }
    }

}
