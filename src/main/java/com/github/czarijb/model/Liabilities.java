package com.github.czarijb.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность пассивы
 */
@Entity
@Table(name = "LIABILITIES")
public class Liabilities extends StatementField {
    private static final long serialVersionUID = -26531392757460281L;

    public Liabilities() {
    }

    public Liabilities(long id) {
        super(id);
    }

    public Liabilities(String name, int price){super(name, price);}
}
