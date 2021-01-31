package ru.fda.oop.dz2.animals;

public class Dog extends Animal {
    public Dog(String name, String color, String breed, int age, int weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle <= 500 && lengthObstacle > 0) {
            System.out.printf("%s пробежал %d метров", name, lengthObstacle);
        } else {
            System.out.println("Увы, но собака не может столько пробежать");
        }
        System.out.println();
    }

    @Override
    public void sail(int lengthObstacle) {
        if (lengthObstacle <= 10 && lengthObstacle > 0) {
            System.out.printf("%s проплыл %d метров", name, lengthObstacle);
        } else {
            System.out.println("Увы, но собака не может столько проплыть");
        }
        System.out.println();
    }
}
