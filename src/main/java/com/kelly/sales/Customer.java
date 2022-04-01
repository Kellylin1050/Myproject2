package com.kelly.sales;

public class Customer {
    String id;
    int amount;
    public Customer(String id , int amount){
        this.id = id;
        this.amount = amount;
    }
    public float getdiscountmoney(){
       return (float) (amount/1000)*100;
    }

    public void print(){
        if (amount>1000) {
            float discount = amount - getdiscountmoney();
            System.out.println(id + "\t" + amount + "\t" + discount);
        }
        else {
            System.out.println(id + "\t" + amount + "\t" + amount);
        }
    }
}



