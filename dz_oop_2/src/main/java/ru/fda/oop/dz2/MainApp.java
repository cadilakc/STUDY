package ru.fda.oop.dz2;

import ru.fda.oop.dz2.animals.*;

public class MainApp {
    public static void main(String[] args) {
        Animal cat = new Cat("Муська", "Серая", "Дворняжка", 3, 13);
        cat.run(150);
        cat.sail(150);

        Animal dog = new Dog("Бобик", "Черный", "Дворняга", 5, 22);
        dog.run(-10);
        dog.sail(10);
    }
}
