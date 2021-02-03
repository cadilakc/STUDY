package ru.fda.oop;

public class Cat {
    private final String name;
    private int appetite;
    private boolean hungry;

    public void setAppetite(int appetite) {  // на случай если нужно поменять аппетит
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate p) {
        if (hungry && p.decreaseFood(appetite)) {
            hungry = false;
        }
    }

    public void info() {
        System.out.printf("Кот: %s, аппетит: %d, голоден: %b", name, appetite, hungry);
    }
}
