package com.kelly.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        int price;
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "11:00";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        //Exception vs error
        //Exception handling
        Date d = null;
        try {
             d = sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());

        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms = d2.getTime()- d.getTime();
            int minutes = (int) (ms/(1000*60));
            System.out.println(minutes);
            //NT 30/h
            int hours = (minutes+30)/60;
            System.out.println(30*hours);
            //不滿15分不算錢
            //15~29算半小時收15元
            //30~44
        }catch (Exception e){
            System.out.println("Exit Wrong format");
        }
        //long threehour = 3*60*60*1000;
        //d2.setTime(d.getTime()+threehour);
    }
}
