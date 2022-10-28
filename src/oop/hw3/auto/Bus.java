package oop.hw3.auto;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               String colorBody,
               int year,
               String country) {
        super(brand, model, colorBody, year, country);
    }

    public void refill() {
        System.out.println("можно заправлять бензином или дизелем на заправке.");
    }
}
