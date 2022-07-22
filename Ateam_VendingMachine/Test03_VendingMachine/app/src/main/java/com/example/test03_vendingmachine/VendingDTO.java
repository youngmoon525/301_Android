package com.example.test03_vendingmachine;


import java.io.Serializable;

public class VendingDTO implements Serializable {
    private String pdt_name;
    private int cost, qty, blc;


    public VendingDTO(String pdt_name,  int qty) {
        this.pdt_name = pdt_name;
        this.cost = cost;
        this.qty = qty;

    }


    public String getPdt_name() {
        return pdt_name;
    }

    public void setPdt_name(String pdt_name) {
        this.pdt_name = pdt_name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
