package oop.hw3.animals;

public class Herbivore extends Mammal{
    private String typeOfFood;

    public Herbivore(String name, int age, String habitat, int moveSpeed, String typeOfFood) {
        super(name, age, habitat, moveSpeed);
        this.typeOfFood = typeOfFood;
    }

    @Override
    public void graze() {
        System.out.println("щип-щип-щип");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "typeOfFood='" + typeOfFood + '\'' +
                "} " + super.toString();
    }
}
