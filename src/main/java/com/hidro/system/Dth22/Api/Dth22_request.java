package com.hidro.system.Dth22.Api;



public class Dth22_request {

    private String temperature;

    private String humidity;

    public Dth22_request(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Dth22_request() {
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

    @Override
    public String toString() {
        return "Dth22_request{" +
                "temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }
}
