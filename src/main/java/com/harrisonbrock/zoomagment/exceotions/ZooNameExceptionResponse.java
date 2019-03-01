package com.harrisonbrock.zoomagment.exceotions;

public class ZooNameExceptionResponse {
    private String name;

    public ZooNameExceptionResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
