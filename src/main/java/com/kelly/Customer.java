package com.kelly;

public class Customer {
    String id;
    int amount;
    int discount;
    public Customer(String id , int amount){
        this.id = id;
        this.amount = amount;
    }
    public int getdiscountmoney(){
       return (amount/1000)*100;
    }
    public void print(){
        if (amount>1000) {
            int discount = amount - getdiscountmoney();
            System.out.println(id + "\t" + amount + "\t" + discount);
        }
        else {
            System.out.println(id + "\t" + amount + "\t" + amount);
        }
    }
}



