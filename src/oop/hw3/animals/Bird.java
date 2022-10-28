package oop.hw3.animals;

import java.util.Objects;

public class Bird extends Animal {
    private String habitat;

    protected Bird(String name, int age) {
        super(name, age);
    }


    public Bird(String name, int age, String habitat) {
        super(name, age);
        this.habitat = Objects.requireNonNullElse(habitat, "default");
    }

    public void hunt() {
        System.out.println("кар кар кар");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else {
            this.habitat = "default";
        }
    }

    @Override
    public String toString() {
        return "Bird{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(habitat, bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }
}
