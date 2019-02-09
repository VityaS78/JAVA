package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class guess_a_number {

    public static void main(String[] args) {
        int num;
        int answer;


        do {
            System.out.print("Введите верхнюю границу дипазона: ");
            int top = enterANumber();
            System.out.print("Введите количество попыток: ");
            int a = enterANumber();
            num = makeANumber(top + 1);
            for (int i = 0; i < a; i++) {
                System.out.print("Отгадайте число от 0 до " + top + " : ");
                answer = enterANumber();
                if (num == answer) {
                    System.out.println("Вы угадали!");
                    break;
                }
                if (i == a - 1) {
                    System.out.println("Вы проиграли!");
                    break;
                }
                if (num < answer) {
                    System.out.println("Загаданное число меньше.");
                } else System.out.println("Загаданное число больше.");
                System.out.println("Осталось попыток " + (a - 1 - i));
            }
            System.out.print("Играем еще раз? 1 если да, иначе нет: ");
            num = enterANumber();
        } while (num == 1);
    }

    public static int makeANumber(int a) {
        Random random = new Random();
        int num = random.nextInt(a);
        return num;
    }

    public static int enterANumber() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
}
