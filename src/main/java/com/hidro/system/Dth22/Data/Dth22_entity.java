package com.hidro.system.Dth22.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Dth22")
public class Dth22_entity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String temperature;

    @Column
    private String humidity;

    @Column
    private Date date;

    public Dth22_entity(String temperature, String humidity, Date date) {
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

    public Long getId() {
        return id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
