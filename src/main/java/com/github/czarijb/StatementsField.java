package com.github.czarijb;
/**
*Родительский класс всех категорий всех полей
*/

public abstract class StatementsField{

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StatementsField (String name, int price){
        this.name = name;
        this.price = price;
    }
}
