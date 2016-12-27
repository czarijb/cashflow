package ru.mail.czar_ijb;

/**
 * Поле расходы
 */

public class Expenses extends StatementsField implements CRUDInterface {

    public Expenses(String name, int price) {
        super(name, price);
    }

    public StatementsField createCategory(String name, int... param) {
        return (new Expenses(name, param[0]));
    }

    public void updateCategory(StatementsField o, int... param) {
        o.setPrice(param[0]);
    }

    public void deleteCategory(String name, int... param) {

    }
}
