import auto.Car;
import auto.Train;

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
    }

}