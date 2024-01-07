package com.java.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Ride {
    String driverName;
    double driverRating;
    String passengerName;
    double passengerRating;

    Ride(String driverName, double driverRating, String passengerName, double passengerRating) {
        this.driverName = driverName;
        this.driverRating = driverRating;
        this.passengerName = passengerName;
        this.passengerRating = passengerRating;
    }
}

class Driver {
    String name;
    int locationX;
    int locationY;
    String cabType;
    double farePerType;

    Driver(String name, int locationX, int locationY, String cabType, double farePerType) {
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
        this.cabType = cabType;
        this.farePerType = farePerType;
    }
}

public class CabMatchingSystemEdge {
    public static void main(String[] args) {
        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride("d1", 4, "c1", 5));
        rides.add(new Ride("d1", 5, "c2", 4));
        rides.add(new Ride("d1", 1, "c3", 2));
        rides.add(new Ride("d2", 5, "c1", 1));
        rides.add(new Ride("d2", 5, "c2", 5));
        rides.add(new Ride("d2", 4, "c3", 5));
        rides.add(new Ride("d3", 3, "c1", 2));
        rides.add(new Ride("d3", 4, "c2", 5));
        rides.add(new Ride("d3", 3, "c3", 3));

        List<Driver> availableDrivers = new ArrayList<>();
        availableDrivers.add(new Driver("d1", 1, 0, "Hatchback", 10.0));
        availableDrivers.add(new Driver("d2", 2, 0, "Sedan", 15.0));
        availableDrivers.add(new Driver("d3", 3, 0, "SUV", 20.0));
        availableDrivers.add(new Driver("d4", 4, 0, "Sedan", 15.0));

        String passengerName = "c2";
        double passengerAverageRating = calculateAverageRating(rides, passengerName);

        System.out.println("Average Rating of " + passengerName + ": " + passengerAverageRating);

        List<Driver> eligibleDrivers = findEligibleDrivers(availableDrivers, rides, passengerAverageRating, passengerName);

        System.out.println("\nEligible Drivers sorted by average rating:");
        printDriverDetails(eligibleDrivers);

        // Sort eligible drivers by distance to passenger
        Collections.sort(eligibleDrivers, Comparator.comparing(driver -> calculateDistance(driver.locationX, driver.locationY, 1, 0)));

        System.out.println("\nEligible Drivers sorted by distance:");
        printDriverDetails(eligibleDrivers);
    }

    private static double calculateAverageRating(List<Ride> rides, String passengerName) {
        int count = 0;
        double totalRating = 0;

        for (Ride ride : rides) {
            if (ride.passengerName.equals(passengerName)) {
                totalRating += ride.passengerRating;
                count++;
            }
        }

        return count > 0 ? totalRating / count : 0;
    }

    private static List<Driver> findEligibleDrivers(List<Driver> availableDrivers, List<Ride> rides,
                                                    double passengerAverageRating, String passengerName) {
        List<Driver> eligibleDrivers = new ArrayList<>();

        for (Driver driver : availableDrivers) {
            double driverAverageRating = calculateDriverAverageRating(rides, driver.name);

            if (driverAverageRating >= passengerAverageRating || driverAverageRating > 1) {
                eligibleDrivers.add(driver);
            }
        }

        return eligibleDrivers;
    }

    private static double calculateDriverAverageRating(List<Ride> rides, String driverName) {
        int count = 0;
        double totalRating = 0;

        for (Ride ride : rides) {
            if (ride.driverName.equals(driverName)) {
                totalRating += ride.driverRating;
                count++;
            }
        }

        return count > 0 ? totalRating / count : 0;
    }

    private static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    private static void printDriverDetails(List<Driver> drivers) {
        for (Driver driver : drivers) {
            System.out.println(driver.name);
        }
    }
}
