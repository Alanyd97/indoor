package com.hidro.system.Dth22.Api;



public class Dth22_request {

    private Integer temperature;

    private Integer humidity;

    public Dth22_request(Integer temperature, Integer humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Dth22_request() {
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
}
