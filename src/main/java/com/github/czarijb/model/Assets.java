package com.github.czarijb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Сущность активы
 */
@Entity
@Table(name = "ASSETS")
public class Assets extends StatementField {
    private static final long serialVersionUID = 3614550698683427050L;

    @Column(name = "volume")
    private int volume;

    public Assets() {}

    public Assets(long id) {
        super(id);
    }

    public Assets(String name, int volume, int price){
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
