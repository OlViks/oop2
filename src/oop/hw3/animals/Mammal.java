package oop.hw3.animals;

public class Mammal extends Animal{

    private String habitat;
    private int moveSpeed;

    public Mammal(String name, int age, String habitat, int moveSpeed) {
        super(name, age);
        this.habitat = habitat;
        this.moveSpeed = moveSpeed;
    }

    @Override
    public void walk() {
        System.out.println("кругами по травке");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }


}
