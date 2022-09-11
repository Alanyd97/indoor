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

    public Dth22_entity(Integer temperature, Integer humidity, Date date) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.date = date;
    }

    public Dth22_entity() {

    }

    @Override
    public String toString() {
        return "Dth22_entity{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
