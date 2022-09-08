package com.hidro.system.Dth22_api;

public class Dth22_response {
    private String data;
    public Dth22_response(){
        data = "Hola world";
    }

    @Override
    public String toString() {
        return "Dth22_response{" +
                "data='" + data + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
