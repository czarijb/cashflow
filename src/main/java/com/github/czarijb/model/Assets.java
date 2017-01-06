package com.github.czarijb.model;

/**
 * Поле активы
 */
public class Assets extends StatementsField implements CRUDInterface {

    private int volume;

    public Assets(String name,int price , int volume){
        super(name, price);
        this.volume = volume;
    }

    public StatementsField createCategory(String name, int... param) {
        return (new Assets(name, param[0], param[1]));
    }

    public void updateCategory(StatementsField o, int... param) {
        o.setPrice(param[0]);
    }

    public void deleteCategory(String name, int... param) {

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
