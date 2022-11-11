package oop.hw3.animals;

public class Bird extends Animal {
    private String habitat;

    public  Bird(String name, int age, String habitat) {
        super(name, age);
        this.habitat = habitat;
    }
    @Override
    public void hunt() {
        System.out.println("атака в полете");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}
