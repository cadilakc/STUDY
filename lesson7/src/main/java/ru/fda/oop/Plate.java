package ru.fda.oop;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
        if (food <= 0) {
            this.food = 0;
            System.out.println("Тарелка пуста");
        }
    }

    public void addFood (int food){
        this.food += food;
    }

    public boolean decreaseFood(int n) {
        int whetherFood = food - n;
        if (whetherFood < 0) {
            return false;
        }
        food -= n;
        return true;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
