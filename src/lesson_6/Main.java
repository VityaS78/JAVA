package lesson_6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 200, 3);

        cat.run(150);
        cat.jamp(2);
        cat.swim(50);

        Dog dog1 = new Dog("Тузик", 500, 1, 100);
        Dog dog2 = new Dog("Рекс", 650, 2, 150);

        dog1.run(600);
        dog1.swim(57);
        dog1.jamp(2);

        dog2.run(600);
        dog2.swim(57);
        dog2.jamp(2);
    }
}
