package oop.hw3.animals;

import java.util.Objects;

public class Mammal extends Animal{

    private String habitat;
    private int moveSpeed;

    protected Mammal(String name, int age) {
        super(name, age);
    }

    public Mammal(String name, int age, String habitat, int moveSpeed) {
        super(name, age);
        this.habitat = Objects.requireNonNull(habitat, "default");
        this.moveSpeed = Math.max(moveSpeed, 10);
    }

    public void walk() {
        System.out.println("туда сюда");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "habitat='" + habitat + '\'' +
                ", moveSpeed=" + moveSpeed +
                "} " + super.toString();
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

    public int getMoveSpeed() {
        return moveSpeed;
    }
    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = Math.max(moveSpeed, 10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return moveSpeed == mammal.moveSpeed && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat, moveSpeed);
    }
}
