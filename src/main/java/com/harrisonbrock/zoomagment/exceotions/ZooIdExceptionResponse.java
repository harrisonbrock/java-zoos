package com.harrisonbrock.zoomagment.exceotions;

public class ZooIdExceptionResponse {

    private String zooId;

    public ZooIdExceptionResponse(String zooId) {
        this.zooId = zooId;
    }

    public String getZooId() {
        return zooId;
    }

    public void setZooId(String zooId) {
        this.zooId = zooId;
    }
}
