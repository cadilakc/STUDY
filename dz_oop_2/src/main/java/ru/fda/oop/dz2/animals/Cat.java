package ru.fda.oop.dz2.animals;

public class Cat extends Animal {
    public Cat(String name, String color, String breed, int age, int weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void run(int lengthObstacle) {
        if (lengthObstacle <= 200 && lengthObstacle > 0) {
            System.out.printf("%s пробежал %d метров", name, lengthObstacle);
        } else {
            System.out.println("Увы, но кот не может столько пробежать");
        }
        System.out.println();
    }

    @Override
    public void sail(int lengthObstacle) {
        System.out.println("Увы, но кот не умеет плавать");
        System.out.println();
    }
}
