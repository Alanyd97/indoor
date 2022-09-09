package com.hidro.system.Dth22.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Dth22")
public class Dth22_entity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer temperature;

    @Column
    private Integer humidity;

    @Column
    private Date date;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
