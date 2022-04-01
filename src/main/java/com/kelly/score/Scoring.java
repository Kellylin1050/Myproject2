package com.kelly.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tank",8,90));
        students.add(new Student("Jack",70,80));
        students.add(new GraduateStudent("Jane",70,65,80));

        for (Student stu: students) {stu.print();}

        /*Student Tank = new Student("Tank",8,90);
        Student Jack = new Student("Jack",70,80);
        GraduateStudent Jane = new GraduateStudent("Jane",70,65,80);
        Tank.print();
        Jack.print();
        Jane.print();*/
    }
}
