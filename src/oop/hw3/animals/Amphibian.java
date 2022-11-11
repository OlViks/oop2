package oop.hw3.animals;

public class Amphibian extends Animal{
    private String habitat;

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void hunt() {
        System.out.println("атака в прыжке");

    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
