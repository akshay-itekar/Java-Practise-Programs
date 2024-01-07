package com.java.courierservice.service;

import com.java.courierservice.model.CourierData;
import com.java.courierservice.model.CourierType;
import com.java.courierservice.model.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourierService {

    private final List<CourierData> couriers;

    public CourierService() {
        this.couriers = new ArrayList<>();
    }

    public void createCourierDetails(String title, String senderName, String receiverName, String courierType, int sourcePincode, int destinationPincode) {

        CourierType type = CourierType.valueOf(courierType.toUpperCase());

        CourierData courierData = new CourierData(title, senderName, receiverName, type, sourcePincode, destinationPincode);
        couriers.add(courierData);

    }

    public void displayBySender(String sender) {

        for (CourierData courier : couriers) {
            if (courier.getSenderName().equals(sender)) {
                displayCouriers(courier);
            }
        }

    }

    private void displayCouriers(CourierData courier) {
        System.out.println("Title: " + courier.getTitle());
        System.out.println("Sender: " + courier.getSenderName());
        System.out.println("Receiver: " + courier.getReceiverName());
        System.out.println("Type: " + courier.getCourierType().getType());
        System.out.println("Source Pincode: " + courier.getSourcePincode());
        System.out.println("Destination Pincode: " + courier.getDestinationPincode());
        System.out.println("Status: " + courier.getStatus());
        System.out.println("----------------------------------");
    }

    public void updateDeliveryStatus(String title, String status) {
        CourierData courier = getCourierByTitle(title);

        if ((courier.getStatus().name().equals("REQUESTED") && status.equals("DELIVERED")) || (courier.getStatus().name().equals("REQUESTED") &&
                status.equals("CANCELED"))) {
            courier.setStatus(Status.valueOf(status.toUpperCase()));
        }


    }

    private CourierData getCourierByTitle(String title) {
        for (CourierData courier : couriers) {
            if (courier.getTitle().equals(title)) {
                return courier;
            }
        }
        return null;
    }


    public void displayAllCouriers() {

        for (CourierData courierData : couriers)
            displayCouriers(courierData);

    }

    public void displayCouriersByType(String type) {

        for (CourierData courierData : couriers) {
            if (courierData.getCourierType().getType().equals(type)) {
                displayCouriers(courierData);
            }
        }

    }

    public void displayCouriersByStatus(String status) {

        for (CourierData courierData : couriers) {
            if (courierData.getStatus().name().equals(status.toUpperCase())) {
                displayCouriers(courierData);
            }
        }

    }
}
