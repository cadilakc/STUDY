package ru.fda.oop;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 15),
                new Cat("Murzik", 20),
                new Cat("Bagira", 25),
                new Cat("Musya", 30)};

        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
            System.out.println();
        }

        plate.info();
    }
}
