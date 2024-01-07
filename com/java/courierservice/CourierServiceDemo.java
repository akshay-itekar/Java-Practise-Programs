package com.java.courierservice;

import com.java.courierservice.service.CourierService;

public class CourierServiceDemo {
    public static void main(String[] args) {
        CourierService courierService = new CourierService();
        courierService.createCourierDetails("title1", "sender1", "receiver1", "Letter", 560103, 560101);
        // courierService.displayAllCouriers();
        // courierService.displayCouriersByStatus("requested");
        // courierService.displayCouriersByType("Letter");
        //courierService.displayBySender("sender1");
        courierService.updateDeliveryStatus("title1", "DELIVERED");
        courierService.displayAllCouriers();
    }
}
