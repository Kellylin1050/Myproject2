package com.kelly;

public class Students {
    String name;
    int english;
    int math;
    public Students(String name) { //constructor
        this.name = name;
    }
    public Students(String name,int english,int math) {//constructor
        this(name);
        //this.name = name;
        this.english = english;
        this.math = math;
    }
    public Students(){//Default constructor
    }
    public void print() {
        System.out.print
                (name + "\t" + english + "\t" + math + "\t" + getAverage());

        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage() {
        return (english+math)/2;
    }
}