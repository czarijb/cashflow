package ru.mail.czar_ijb;
/**
*Родительский класс всех категорий всех полей
*/

public abstract class StatementsField{

    public String name;
    public int price;

    public StatementsField (String name, int price){
        this.name = name;
        this.price = price;
    }
}
