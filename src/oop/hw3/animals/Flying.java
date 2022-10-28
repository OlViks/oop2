package oop.hw3.animals;

import java.util.Objects;

public class Flying extends Bird{
    private String moveMentType;

    protected Flying(String name, int age) {
        super(name, age);
    }

    public Flying(String name, int age, String habitat) {
        super(name, age, habitat);
    }

    public Flying(String name, int age, String habitat, String moveMentType) {
        super(name, age, habitat);
        this.moveMentType = Objects.requireNonNullElse(moveMentType, "default");
    }
    public void fly() {
        System.out.println("вжух-вжух-вжух");
    }

    public String getMoveMentType() {
        return moveMentType;
    }


    @Override
    public String toString() {
        return "Flying{" +
                "moveMentType='" + moveMentType + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(moveMentType, flying.moveMentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveMentType);
    }
}
