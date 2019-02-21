package lesson_2;

import java.util.Scanner;

public class probability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Расчитываем вероятность выпадения заданной комбинации мастей." +
                "Общее колличество карт всех мастей должно равняться 13");
        String text = "Введите колличество карт ";
        System.out.print(text + "червовой масти: ");
        int h = scanner.nextInt();
//        System.out.println();
        System.out.print(text + "бубновой масти: ");
        int d = scanner.nextInt();
//        System.out.println();
        System.out.print(text + "крестовой масти: ");
        int c = scanner.nextInt();
//        System.out.println();
        System.out.print(text + "пиковой масти: ");
        int s = scanner.nextInt();
        System.out.println();

        int cards = 52;
        int p = 13;
        double probability = 1;

        if (h != 0) {
            for (int i = 0; i < h; i++) {
                probability *= (double) p / cards; // число оставшихся в колоде карт одной масти d и общеечисло оставшихся в колоде карт cards
                p--;                               // после каждой итерации уменьшаем число оставшихся в колоде карт одной масти d
                cards--;                           // и общее число карт в колоде cards
            }
        }
        p = 13;                                    // переходим к следующей масти и возвращаем d к исходным 13 картам
        if (d != 0) {
            for (int i = 0; i <= d; i++) {
                probability *= (double) p / cards;
                p--;
                cards--;
            }
        }
        p = 13;
        if (c != 0) {
            for (int i = 0; i <= c; i++) {
                probability *= (double) p / cards;
                p--;
                cards--;
            }
        }
        p = 13;
        if (s != 0) {
            for (int i = 0; i <= s; i++) {
                probability *= (double) p / cards;
                p--;
                cards--;
            }
        }

        System.out.println("Вероятность выпадения комбинации мастей --");
        System.out.println("червы, бубны, крести, пики: " + h + ", " + d + ", " + c + ", " + s + " равна: " + probability);
    }
}
