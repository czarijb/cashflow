package com.github.czarijb.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность доходы
 */
@Entity
@Table(name = "INCOME")
public class Income extends StatementField {
    private static final long serialVersionUID = -8782567156165396920L;

    public Income() {
    }

    public Income(long id) {
        super(id);
    }

    public Income(String name, int price){super(name, price);}
}
