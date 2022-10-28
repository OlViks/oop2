package auto;

import java.util.Objects;

public class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String colorBody;
    private int maxSpeed;

    public Transport(String brand, String model, String colorBody, int year, String country) {
        this.year = Math.max(year, 2000);
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.country = Objects.requireNonNullElse(country, "default");
        setColorBody(colorBody);
        setMaxSpeed(maxSpeed);
    }

    public void options() {
        System.out.println("Марка автомобиля " + brand + " модель " + model +
                " год выпуска " + year + " цвет " + colorBody +
                " страна производитель " + country + ".");
    }

    public void getBrand() {
        this.brand = Objects.requireNonNullElse(brand, "default");
    }

    public void getModel() {
        this.model = Objects.requireNonNullElse(model, "default");
    }

    public void getYear() {
        this.year = Math.max(year, 2000);
    }

    public void getCountry() {
        this.country = Objects.requireNonNullElse(country, "default");
    }

    public void getColorBody() {
        this.colorBody = Objects.requireNonNullElse(colorBody, "белый");
    }

    public void setColorBody(String colorBody) {
        this.colorBody = Objects.requireNonNullElse(colorBody, "Белый");
    }

    public int maxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 1);
    }
}


