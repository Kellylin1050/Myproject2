package com.kelly.ticket;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.TAICHUNG_CITY);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (Taipei:1, Taichung:2, kaohsiung:3)");
        int choice = Integer.parseInt(scanner.next());
        Station startstation = null;
        switch (choice){
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
        System.out.println("Your destination station? (Taipei:1, Taichung:2, kaohsiung:3)");
        choice = Integer.parseInt(scanner.next());
        Station endstation = null;
        switch (choice){
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
        Ticket ticket = new Ticket(startstation, endstation);
        System.out.println("how many ticket do you want");
        Scanner s = new Scanner(System.in);
        int quantity = Integer.parseInt(s.next());
        System.out.println( ticket.start.name+ "\t" + ticket.destination.name + "\t" +"ticket:"+ quantity);
    }
}
