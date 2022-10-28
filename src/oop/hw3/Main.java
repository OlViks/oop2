package oop.hw3;

import oop.hw3.animals.*;
import oop.hw3.auto.Bus;
import oop.hw3.auto.Car;
import oop.hw3.auto.Train;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.7d, "Желтый",
                2015, "Россия", 250);
        granta.options();
        granta.setColorBody(null);
        granta.options();
        granta.setColorBody("Зеленый");
        granta.options();

        Train lactochka = new Train("Ласточка",
                "B-901",
                null,
                2011,
                "Россия",
                3500.0f,
                301,
                "Белорусского вокзала",
                "Минск-Пассажирский",
                11);
        System.out.println(lactochka);

        Bus black = new Bus("Лотос",
                "лотос 206",
                "черный",
                2005,
                "Россия");
        black.options();
        black.refill();
        lactochka.refill();
        Herbivore gazel = new Herbivore("Люся",
                20,
                "Африка",
                35,
                "кактус");
        Herbivore hours = new Herbivore("Глеб",
                2,
                "Степи",
                40,
                "травка");
        Herbivore giraffe = new Herbivore("Джон",
                4,
                "Африка",
                15,
                "листья");
        System.out.println(gazel);
        gazel.graze();
        System.out.println();
        System.out.println(giraffe);
        giraffe.graze();
        System.out.println();
        System.out.println(hours);
        hours.graze();
        System.out.println();

        Predator giena = new Predator("Тигран",
                5,
                "Африка",
                15,
                "мясо");
        Predator tiger = new Predator("Тима",
                0,
                "Сибирь",
                40,
                "травка");
        Predator bear = new Predator("Марик",
                2,
                "Лес",
                15,
                "листья");
        System.out.println(giena);
        giena.hunt();
        System.out.println();
        System.out.println(tiger);
        tiger.hunt();
        System.out.println();
        System.out.println(bear);
        bear.hunt();
        System.out.println();
        Amphibian frog = new Amphibian("Андрей",
                20,
                "болото");
        Amphibian alreadyFreshWater = new Amphibian(null,
                0,
                null);
        System.out.println(frog);
        frog.hunt();
        System.out.println();
        System.out.println(alreadyFreshWater);
        alreadyFreshWater.hunt();
        System.out.println();
        Flightless peacock = new Flightless("Юля",
                3,
                "пустня",
                "ходит");
        Flightless penguin = new Flightless("Иван",
                6,
                "Южный полюс",
                "бегает");
        System.out.println(peacock);
        peacock.walk();
        System.out.println();
        System.out.println(penguin);
        penguin.walk();
        System.out.println();
        Flying gull = new Flying("Тим",
                16,
                "морские просторы",
                "летает");
        Flying albatross = new Flying("Твинк",
                4,
                "   Южный океан",
                "летает");
        System.out.println(gull);
        gull.fly();
        System.out.println();
        System.out.println(albatross);
        albatross.fly();
        System.out.println();

    }
}