package lesson_6;

public abstract class Animal {
    protected String name;
    protected int run;   // ограничение по бегу
    protected int jamp;  // ограничение по прыжкам
    protected int swim;  // ограничение по плаванию

    public Animal(String name, int run, int jamp) {
        this.name = name;
        this.run = run;
        this.jamp = jamp;
    }

    public void run(int run1) {
        if (run1 <= run) {
            System.out.println(name + " пробежал " + run1 + " метров");
        } else System.out.println(run1 + " метров, слишком большое расстояние, " + name + " не может столько пробежать");
    }

    public void swim(int swim1) {
        if (swim1 <= swim) {
            System.out.println(name + " проплыл " + swim1 + " метров");
        } else System.out.println(swim1 + " метров, слишком большое расстояние, " + name + " не может столько проплыть");
    }

    public void jamp(int jamp1) {
        if (jamp1 <= jamp) {
            System.out.println(name + " прыгнул на " + jamp1 + " метров");
        } else System.out.println(jamp1 + " метров. слишком высоко, " + name + " не может прыгать на такую высоту");
    }
}
