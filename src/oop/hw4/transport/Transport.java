package oop.hw4.transport;


public abstract class Transport {
    private final String brand;
    private final String model;
    private final float volumeEngine;

    protected Transport(java.lang.String brand, java.lang.String model, float volumeEngine) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getVolumeEngine() {
        return volumeEngine;
    }

//    private int year;
//    private String country;
//    private String colorBody;
//    private int maxSpeed;
//    public Transport(String brand, String model, String colorBody, int year, String country) {
//        this.year = Math.max(year, 2000);
//        this.brand = Objects.requireNonNullElse(brand, "default");
//        this.model = Objects.requireNonNullElse(model, "default");
//        this.country = Objects.requireNonNullElse(country, "default");
//        setColorBody(colorBody);
//        setMaxSpeed(maxSpeed);
//    }
//
//    public abstract void refill();
//
//    public void options() {
//        System.out.println("Марка " + brand + " модель " + model +
//                " год выпуска " + year + " цвет " + colorBody +
//                " страна производитель " + country + ".");
//    }
//
//    public void getBrand() {
//        this.brand = Objects.requireNonNullElse(brand, "default");
//    }
//    public void getModel() {
//        this.model = Objects.requireNonNullElse(model, "default");
//    }
//    public void getYear() {
//        this.year = Math.max(year, 2000);
//    }
//    public void getCountry() {
//        this.country = Objects.requireNonNullElse(country, "default");
//    }
//    public void getColorBody() {
//        this.colorBody = Objects.requireNonNullElse(colorBody, "белый");
//    }
//    public void setColorBody(String colorBody) {
//        this.colorBody = Objects.requireNonNullElse(colorBody, "Белый");
//    }
//    public int maxSpeed() {
//        return maxSpeed;
//    }
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = Math.max(maxSpeed, 1);
//    }
}