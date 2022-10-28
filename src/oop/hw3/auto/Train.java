package oop.hw3.auto;


import java.util.Objects;

public class Train extends Transport {
    private float price;
    private int roadTime;
    private String titleStation;
    private String endStation;
    private int numberWagons;

    public Train(String brand,
                 String model,
                 String colorBody,
                 int year,
                 String country,
                 float price,
                 int roadTime,
                 String titleStation,
                 String endStation,
                 int numberWagons) {
        super(brand, model, colorBody, year, country);
        setPrice(price);
        setRoadTime(roadTime);
        setTitleStation(titleStation);
        setEndStation(endStation);
        setNumberWagons(numberWagons);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Math.max(price, 1.0f);
    }

    public int getRoadTime() {
        return roadTime;
    }

    public void setRoadTime(int roadTime) {
        this.roadTime = Math.max(roadTime, 1);
    }

    public String getTitleStation() {
        return titleStation;
    }

    public void setTitleStation(String titleStation) {
        this.titleStation = Objects.requireNonNullElse(titleStation, "default") ;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = Objects.requireNonNullElse(endStation, "default");
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = Math.max(numberWagons, 1);
    }

    @Override
    public String toString() {
        return "Train{" +
                "price=" + price +
                ", roadTime=" + roadTime +
                ", titleStation='" + titleStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", numberWagons=" + numberWagons +
                '}';
    }

    public void refill() {
        System.out.println("нужно заправлять дизелем.");
    }
}
