package oop.hw3.animals;

import java.util.Objects;

public class Predator extends Mammal {
    private String typeOfFood;

    protected Predator(String name, int age) {
        super(name, age);
    }

    public Predator(String name, int age, String habitat, int moveSpeed) {
        super(name, age, habitat, moveSpeed);
    }

    public Predator(String name, int age, String habitat, int moveSpeed, String typeOfFood) {
        super(name, age, habitat, moveSpeed);
        this.typeOfFood = Objects.requireNonNull(typeOfFood, "default");
    }
    public void hunt() {
        System.out.println("Арррр!!!!");
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeOfFood='" + typeOfFood + '\'' +
                "} " + super.toString();
    }
}
