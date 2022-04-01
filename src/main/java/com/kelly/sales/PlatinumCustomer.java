package com.kelly.sales;

public class PlatinumCustomer extends GoldenCustomer{
    public PlatinumCustomer(String id, int amount){super(id, amount);}
    @Override
    public float getdiscountmoney() {
        return amount * 0.3f;
    }
    @Override
    public int getReturnmoney(){
        return (int)(amount*0.2);
    }
}
