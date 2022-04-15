package com.kelly.sales;

public class GoldenCustomer extends SilverCustomer {
    int bonus;
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public float getdiscountmoney() {
        return amount * 0.1f;
    }
}

