package oop.hw3.animals;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("ням ням");
    }
    public void sleep() {
        System.out.println("хррррр....");
    }

    public void move() {
        System.out.println("туда-сюда");
    }
    public void walk() {
        System.out.println("топ-топ");
    }
    public void hunt() {
        System.out.println("атака");
    }
    public void graze() {
        System.out.println("ом-ном-ном");
    }
    public void fly() {
        System.out.println("вжух");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
