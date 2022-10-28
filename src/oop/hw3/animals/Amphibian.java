package oop.hw3.animals;

import java.util.Objects;

public class Amphibian extends Animal{
    private String habitat;

    protected Amphibian(String name, int age) {
        super(name, age);
    }

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        this.habitat = Objects.requireNonNullElse(habitat, "default");
    }
    public void hunt() {
        System.out.println("ом-ном-ном");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    @Override
    public String toString() {
        return "Amphibian{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
