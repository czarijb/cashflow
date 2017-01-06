package com.github.czarijb.model;

/**
 * Поле пассивы
 */
public class Liabilities extends StatementsField implements CRUDInterface {

    public Liabilities(String name, int price) {
        super(name, price);
    }

    public StatementsField createCategory(String name, int... param) {
        return (new Liabilities(name, param[0]));
    }

    public void updateCategory(StatementsField o, int... param) {
        o.setPrice(param[0]);
    }

    public void deleteCategory(String name, int... param) {

    }
}
