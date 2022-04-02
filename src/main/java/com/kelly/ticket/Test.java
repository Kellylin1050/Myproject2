package com.kelly.ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //起站
        //Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.TAICHUNG_CITY);
        // 新增的程式碼
        boolean exit = false;
        ArrayList<Ticket> ticketList = new ArrayList();
        while (!exit) {
            // 新增的程式碼
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your start station? (Taipei:1, Taichung:2, kaohsiung:3)");
            int choice = Integer.parseInt(scanner.next());
            Station startstation = null;
            switch (choice) {
                case 1:
                    startstation = Station.TAIPEI_CITY;
                    break;
                case 2:
                    startstation = Station.TAICHUNG_CITY;
                    break;
                case 3:
                    startstation = Station.KAOHSIUNG_CITY;
                    break;
            }
            //終點站
            System.out.println("Your destination station? (Taipei:1, Taichung:2, kaohsiung:3)");
            choice = Integer.parseInt(scanner.next());
            Station endstation = null;
            switch (choice) {
                case 1:
                    endstation = Station.TAIPEI_CITY;
                    break;
                case 2:
                    endstation = Station.TAICHUNG_CITY;
                    break;
                case 3:
                    endstation = Station.KAOHSIUNG_CITY;
                    break;
            }
            //數量
            System.out.println("how many ticket do you want");
            Scanner s = new Scanner(System.in);
            int quantity = Integer.parseInt(s.next());
            //票種
            System.out.println("which ticket do you want(old:1,student:2,early:3,regular:4)");
            choice = Integer.parseInt(scanner.next());
            Type type = null;
            switch (choice) {
                case 1:
                    type = Type.OLDERTICKET;
                    break;
                case 2:
                    type = Type.STUDENTTICKET;
                    break;
                case 3:
                    type = Type.EARLIERTICKET;
                    break;
                case 4:
                    type = Type.REGULARTICKET;
            }
            //票價
            float price = 0;
            if ((startstation == Station.TAIPEI_CITY && endstation == Station.TAICHUNG_CITY) || (startstation == Station.TAICHUNG_CITY && endstation == Station.TAIPEI_CITY)) {
                price = 600;
            } else if ((startstation == Station.TAICHUNG_CITY && endstation == Station.KAOHSIUNG_CITY) || (startstation == Station.KAOHSIUNG_CITY && endstation == Station.TAICHUNG_CITY)) {
                price = 900;
            } else if ((startstation == Station.TAIPEI_CITY && endstation == Station.KAOHSIUNG_CITY) || (startstation == Station.KAOHSIUNG_CITY && endstation == Station.TAIPEI_CITY)) {
                price = 1500;
            }
            if (type == Type.OLDERTICKET) {
                price = price * 0.5f;
            }
            if (type == Type.STUDENTTICKET) {
                price = price * 0.9f;
            }
            if (type == Type.EARLIERTICKET) {
                price = price * 0.7f;
            }
            if (type == Type.REGULARTICKET) {
                price = price * 1;
            }
            Ticket ticket = new Ticket(startstation, endstation,type);
            int totalprice = (int) price*quantity;
            ticket.setPrice(totalprice);
            ticket.setQuantity(quantity);
            System.out.println("目前:"+"\t"+"Start:"+
                    ticket.start.name + "\t" +"End:"+ ticket.destination.name + "\t" + "Type:" + ticket.type.name +
                            "\t" + "ticket:" + quantity + "\t" + "totalprice:" + totalprice);

            // 新增的程式碼
            System.out.println("continue buying 0:exit,1:continue?");
            int keep_buying = Integer.parseInt(scanner.next());
            switch (keep_buying) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    exit = false;
                    break;
            }
            ticketList.add(ticket);
        }
        TicketPrinter tk = new TicketPrinter();
        tk.Printer(ticketList);
    }
}