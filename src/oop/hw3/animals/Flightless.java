package oop.hw3.animals;

import java.util.Objects;

public class Flightless extends Bird{
    private String moveMentType;

    protected Flightless(String name, int age) {
        super(name, age);
    }

    public Flightless(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public Flightless(String name, int age, String habitat, String moveMentType) {
        super(name, age, habitat);
        this.moveMentType = Objects.requireNonNullElse(moveMentType, "default");
    }
    public void walk() {
        System.out.println("топ топ топ топ топ");
    }


    public String getMoveMentType() {
        return moveMentType;
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "moveMentType='" + moveMentType + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(moveMentType, that.moveMentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveMentType);
    }
}
