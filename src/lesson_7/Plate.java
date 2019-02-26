package lesson_7;

import java.util.Random;

public class Plate {

    private int food;

    Random random = new Random();

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды.");
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood() {
        food += 100 + random.nextInt(51);
    }
}
