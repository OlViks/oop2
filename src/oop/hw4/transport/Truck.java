package oop.hw4.transport;


public class Truck extends Transport implements Competing{
    private final LoadCapacity loadCapacity;
    public Truck(String brand, String model, float volumeEngine, LoadCapacity loadCapacity) {
        super(brand, model, volumeEngine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMovement() {
        System.out.printf("Грузовик %s %s начать движение", this.getBrand(), this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Грузовик %s %s закончить движение", this.getBrand(), this.getModel());

    }

    @Override
    public void printInformation() {
        if (this.loadCapacity != null) {
            System.out.println(this.loadCapacity);
        } else {
            System.out.println("Укажите грузоподъемность.");
        }
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовик %s %s выполняет пит-стоп", this.getBrand(), this.getModel());
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