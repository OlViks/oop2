package oop.hw3.animals;

public class Flightless extends Bird{
    private final String moveMentType;

    public Flightless(String name, int age, String habitat, String moveMentType) {
        super(name, age, habitat);
        this.moveMentType = moveMentType;
    }

    @Override
    public void walk() {
        System.out.println("короткими перебежками");
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "moveMentType='" + moveMentType + '\'' +
                "} " + super.toString();
    }
}
