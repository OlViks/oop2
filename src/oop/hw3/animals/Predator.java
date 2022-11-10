package oop.hw3.animals;

public class Predator extends Mammal {
    private final String typeOfFood;

    public Predator(String name, int age, String habitat, int moveSpeed, String typeOfFood) {
        super(name, age, habitat, moveSpeed);
        this.typeOfFood = typeOfFood;
    }

    @Override
    public void hunt() {
        System.out.println("атакует из засады");
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeOfFood='" + typeOfFood + '\'' +
                "} " + super.toString();
    }
}
