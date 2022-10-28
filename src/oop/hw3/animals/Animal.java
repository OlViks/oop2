package oop.hw3.animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;


    protected Animal(String name, int age) {
        this.name = Objects.requireNonNullElse(name, "default");
        this.age = Math.max(age, 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }else {
            this.name = "default";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 1);
    }

    public void eat() {
        System.out.println("ням ням");
    }
    public void slip() {
        System.out.println("х-р-р-р");
    }
    public void go() {
        System.out.println("топ топ топ");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

}
