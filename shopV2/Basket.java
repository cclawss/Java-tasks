package com.company.shopV2;

public class Basket {
    private String name;
    private int count;
    private int costs;
    private int price;


    public Basket(String name, int count, int costs, int price) {
        this.name = name;
        this.count = count;
        this.costs = costs;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getCosts() {
        return costs;
    }

    public int getPrice() {
        return price;
    }
    public void add(int count,int sum){
        this.count+=count;
        this.price+=sum;
    }
}
