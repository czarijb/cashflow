package ru.mail.czar_ijb;

/**
 * Поле активы
 */
public class Assets extends StatementsField implements CRUDInterface {

    private int volume;

    public Assets(String name,int volume , int price){
        super(name, price);
        this.volume = volume;
    }

    public void createCategory(String name, int... param) {

    }

    public void updateCategory(String name, int... param) {

    }

    public void deleteCategory(String name, int... param) {

    }
}
