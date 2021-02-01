package ru.fda.oop.dz2.animals;

public class Dog extends Animal {
    public Dog(String name, String color, String breed, int age, int weight) {
        super(name, color, breed, age, weight);
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle <= 500 && lengthObstacle > 0) {
            System.out.printf("%s пробежал %d метров\n", name, lengthObstacle);
        } else {
            System.out.println("Увы, но собака не может столько пробежать");
        }
    }

    @Override
    public void sail(int lengthObstacle) {
        if (lengthObstacle <= 10 && lengthObstacle > 0) {
            System.out.printf("%s проплыл %d метров\n", name, lengthObstacle);
        } else {
            System.out.println("Увы, но собака не может столько проплыть");
        }
    }
}
