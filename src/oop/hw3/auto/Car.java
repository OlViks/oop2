package oop.hw3.auto;

import java.util.Objects;

public class Car extends Transport {
    String brand;
    String model;
    double volume;
    String colorBody;
    int year;
    String country;

    int maxSpeed;

    public Car(String brand,
               String model,
               double volume,
               String colorBody,
               int year,
               String country,
               int maxSpeed) {
        super(brand,model,colorBody,year,country);
        this.brand =Objects.requireNonNullElse(brand,"default") ;
        this.model = Objects.requireNonNullElse(model, "default");
        this.volume = Math.max(volume, 1.5);
        this.colorBody =Objects.requireNonNullElse(colorBody, "белый") ;
        this.year =Math.max(year, 2000) ;
        this.country =Objects.requireNonNullElse(country, "default") ;
    }

    public void refill() {
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных" +
                " электропарковках, если это электрокар.");
    }

    public void options() {
        System.out.println("Марка автомобиля " + brand + " модель " + model +
                " год выпуска " + year + " цвет " + colorBody +
                " объем двигателя " + volume + " L " + " страна производитель " +
                country + ".");
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume > 0.0 ? volume : 1.5;
    }

}