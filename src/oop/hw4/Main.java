package oop.hw4;

import oop.hw4.driver.DriverB;
import oop.hw4.driver.DriverC;
import oop.hw4.driver.DriverD;
import oop.hw4.transport.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("audi", "A5", 3.5f,null);
        Car sup = new Car("audi", "A7", 6.2f,BodyType.COUPE);
        DriverB driverB = new DriverB("Иванов", "есть", car);
        System.out.println(driverB);
        Truck truck = new Truck("volvo", "hw1", 12f, LoadCapacity.N1);
        DriverC driverC = new DriverC("Имбицилов", "есть", truck);
        System.out.println(driverC);
        Bus bus = new Bus("liaz", "dq124", 3.7f, PassengerCapacity.BIG);
        DriverD driverD = new DriverD("Кирилов", "есть", bus);
        System.out.println(driverD);
        car.printInformation();
        sup.printInformation();
        truck.printInformation();
        bus.printInformation();

    }
}