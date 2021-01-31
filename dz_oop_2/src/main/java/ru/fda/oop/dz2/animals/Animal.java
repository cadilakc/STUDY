package ru.fda.oop.dz2.animals;

public abstract class Animal {
    String name;
    String color;
    String breed;
    int age;
    int weight;

    int lengthObstacle;

    public void info() {
        System.out.printf("Кличка: %s\nЦвет: %s\nПорода: %s\nВозраст: %d лет\nВес: %d кг.\n", name, color, breed, age, weight);
    }

    public abstract void run(int lengthObstacle);

    public abstract void sail(int lengthObstacle);
}
