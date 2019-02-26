package lesson_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cat[] cats = new Cat[2];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(scanner.next(), scanner.nextInt());
        }
        for (Cat cat : cats) {
            cat.catInfo();
        }

        Plate plate = new Plate(150);
        plate.info();

        System.out.print("Покормить котов (Да/Нет): ");
        while ("Да".equalsIgnoreCase(scanner.next())) {
            for (Cat cat : cats) cat.eat(plate);
            plate.info();
            System.out.print("Покормить котов снова (Да/Нет): ");
        }


    }
}
