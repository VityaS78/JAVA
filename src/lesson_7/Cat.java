package lesson_7;

import java.text.MessageFormat;
import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private int notHungry;        // вероятность того, что кот в данный момент не голоден
    Random random = new Random();

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.notHungry = 50 + random.nextInt(21);
    }

    public void catInfo() {
        System.out.println(MessageFormat.format("Кличка: {0}, аппетит: {1}", name, appetite));
    }

    public void eat(Plate plate) {
        if (isHгngry()) {
            if (plate.getFood() >= appetite) {
                plate.decreaseFood(appetite);
                System.out.println(name + " поел.");
            } else {
                System.out.println(name + " голоден, но в тарелке мало еды");
                System.out.println("Досыпаем еду в тарелку");
                plate.addFood();
                plate.info();
                plate.decreaseFood(appetite);
                System.out.println(name + " поел.");
            }

        } else {
            System.out.println(name + " не голоден");
        }
    }

    private boolean isHгngry() {
        return (random.nextInt(101) >= notHungry);
    }
}
