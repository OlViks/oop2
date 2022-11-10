package oop.hw4;

import oop.hw4.driver.DriverB;
import oop.hw4.driver.DriverC;
import oop.hw4.driver.DriverD;
import oop.hw4.transport.Bus;
import oop.hw4.transport.Car;
import oop.hw4.transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("audi", "A5", 3.5f);
        DriverB driverB = new DriverB("Иванов", "есть", car);
        System.out.println(driverB);
        Truck truck = new Truck("volvo", "hw1", 12f);
        DriverC driverC = new DriverC("Имбицилов", "есть", truck);
        System.out.println(driverC);
        Bus bus = new Bus("liaz", "dq124", 3.7f);
        DriverD driverD = new DriverD("Кирилов", "есть", bus);
        System.out.println(driverD);


    }
}