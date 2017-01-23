package com.github.czarijb.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Абстракный класс представления всех сущностей
 */

@MappedSuperclass
public abstract class StatementField implements Serializable {
    private static final long serialVersionUID = -1231800400579506144L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    public StatementField(){}

    public StatementField(long id){
        this.id = id;
    }

    public StatementField(String name, int price){
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
}
