package com.java.courierservice.model;

public enum CourierType {

    LETTER("Letter", 50),
    PARCEL("Parcel", 200),
    LUGGAGE("Luggage", 1000);
    private final int deliveryRate;
    private final String type;

    CourierType(String type, int deliverRate) {
        this.type = type;
        this.deliveryRate = deliverRate;
    }

    public int getDeliveryRate() {
        return deliveryRate;
    }

    public String getType() {
        return type;
    }
}
