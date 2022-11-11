package oop.hw4.driver;

import oop.hw4.transport.Bus;

public class DriverD extends Driver<Bus>{

    public DriverD(String fullName, String driverLicence, Bus car) {
        super(fullName, driverLicence, "D", car);
    }
}