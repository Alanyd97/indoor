package com.hidro.system.Dth22.Api;

public class Dth22_response {
    private String message;
    public Dth22_response(String msg){
        message = msg;
    }

    @Override
    public String toString() {
        return "Dth22_response{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
