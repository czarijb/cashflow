package com.github.czarijb.model;

/**
 * Поле доходы
 */
public class Income extends StatementsField implements CRUDInterface{

    public Income(String name, int price) {
        super(name, price);
    }

    public StatementsField createCategory(String name, int... param) {
       return (new Income(name, param[0]));
    }

    public void updateCategory(StatementsField o, int... param) {
        o.setPrice(param[0]);
    }

    public void deleteCategory(String name, int... param) {

    }



}
