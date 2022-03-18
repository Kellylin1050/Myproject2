package com.kelly;

public class GoldenCustomer extends Customer  {

    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }
    public int getReturnmoney(){
        return (int) (amount*0.1)*2;
    }
    @Override
    public void print () {
        System.out.println(id + "\t" + amount + "\t" + (amount-getdiscountmoney()) +"("+getReturnmoney()+")" );
    }
}

