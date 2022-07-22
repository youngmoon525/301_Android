package com.example.testproject;

import java.io.Serializable;

public class RamenDTO implements Serializable {
String name ;
int cnt, price, count;

    public RamenDTO(int cnt, int price, int count, String name) {
        this.cnt = cnt;
        this.price = price;
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}//class
