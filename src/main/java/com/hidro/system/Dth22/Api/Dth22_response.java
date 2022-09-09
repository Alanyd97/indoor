package com.hidro.system.Dth22.Api;

public class Dth22_response {
    private String message;
    public Dth22_response(){
        message = "Hola bombona te amooooo o o oo o <3";
    }

    @Override
    public String toString() {
        return "Dth22_response{" +
                "data='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
