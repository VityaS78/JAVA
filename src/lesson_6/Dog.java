package lesson_6;

public class Dog extends Animal {

    public Dog(String name, int run, int jamp, int swim) {
        super(name, run, jamp);
        this.swim = swim;
    }
}
