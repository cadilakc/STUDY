package ru.fda.oop.dz2.animals;

public class Cat extends Animal {

    public Cat(String name, String color, String breed, int age, int weight) {
        super(name, color, breed, age, weight);
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle <= 200 && lengthObstacle > 0) {
            System.out.printf("%s пробежал %d метров\n", name, lengthObstacle);
        } else {
            System.out.println("Увы, но кот не может столько пробежать");
        }
    }

    @Override
    public void sail(int lengthObstacle) {
        System.out.println("Увы, но кот не умеет плавать");
    }
}
