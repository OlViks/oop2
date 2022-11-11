package oop.hw4.driver;


import oop.hw4.transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String fullName, String driverLicence, Truck car) {
        super(fullName, driverLicence, "D", car);
    }
}