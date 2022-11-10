package oop.hw4.transport;

public class Car extends Transport implements Competing {


    public Car(String brand, String model, float volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public void startMovement() {
        System.out.printf("Машина %s %s начать движение", this.getBrand(), this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Машина %s %s закончить движение", this.getBrand(), this.getModel());

    }

    @Override
    public void pitStop() {
        System.out.printf("Машина %s %s выполняет пит-стоп", this.getBrand(), this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
}