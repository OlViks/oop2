package oop.hw3.animals;

import java.util.Objects;

public class Herbivore extends Mammal{
    private String typeOfFood;


    protected Herbivore(String name, int age) {
        super(name, age);
    }

    public Herbivore(String name, int age, String habitat, int moveSpeed) {
        super(name, age, habitat, moveSpeed);
    }

    public Herbivore(String name, int age, String habitat, int moveSpeed, String typeOfFood) {
        super(name, age, habitat, moveSpeed);
        this.typeOfFood = Objects.requireNonNullElse(typeOfFood, "default");
    }
    public void graze() {
        System.out.println("щип щип щип");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "default";
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "typeOfFood='" + typeOfFood + '\'' +
                "} " + super.toString();
    }
}
