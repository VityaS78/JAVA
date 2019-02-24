package lesson_6;

public class Cat extends Animal {
//    private String name;
//    private int run;
//    private int jamp;
//    private int swim;

    public Cat(String name, int run, int jamp) {
        super(name, run, jamp);
    }

    @Override
    public void swim(int swim1) {
        System.out.println("Кошки не плавают!");
    }
}
