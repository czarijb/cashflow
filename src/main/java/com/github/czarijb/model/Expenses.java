package com.github.czarijb.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность расходы
 */
@Entity
@Table(name = "EXPENSES")
public class Expenses extends StatementField {
    private static final long serialVersionUID = 4374673214816649084L;

    public Expenses() {
    }

    public Expenses(long id) {
        super(id);
    }

    public Expenses(String name, int price){
        super(name, price);
    }
}
