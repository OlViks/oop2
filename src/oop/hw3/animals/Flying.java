package oop.hw3.animals;

public class Flying extends Bird{

    private String moveMentType;

    public Flying(String name, int age, String habitat, String moveMentType) {
        super(name, age, habitat);
        this.moveMentType = moveMentType;
    }

    @Override
    public void fly() {
        System.out.println("высоко в облаках");;
    }

    public String getMoveMentType() {
        return moveMentType;
    }

    public void setMoveMentType(String moveMentType) {
        this.moveMentType = moveMentType;
    }

    @Override
    public String toString() {
        return "Flying{" +
                "moveMentType='" + moveMentType + '\'' +
                "} " + super.toString();
    }
}
