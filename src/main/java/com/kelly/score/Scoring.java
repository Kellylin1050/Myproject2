package com.kelly.score;

public class Scoring {
    public static void main(String[] args) {
        Students Tank = new Students("Tank",8,90);
        Students Jack = new Students("Jack",70,80);
        GraduateStudent Jane = new GraduateStudent("Jane",70,65,80);
        Tank.print();
        Jack.print();
        Jane.print();
    }
}
