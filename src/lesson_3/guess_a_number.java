package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class guess_a_number {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num;
        int answer;
        do {
            num = random.nextInt(21);
            for (int i = 0; i < 3; i++) {
                System.out.print("Отгадайте число от 0 до 20: ");
                answer = scanner.nextInt();
                if (num == answer) {
                    System.out.println("Вы угадали!");
                    break;
                }
                if (num < answer) {
                    if (i == 2) {
                        System.out.println("Вы проиграли!");
                    } else System.out.println("Загаданное число меньше.");
                } else {
                    if (i == 2) {
                        System.out.println("Вы проиграли!");
                    } else System.out.println("Загаданное число больше.");
                }
            }
            System.out.print("Играем еще раз? 1 если да, иначе нет: ");
            num = scanner.nextInt();
        } while (num == 1);
        scanner.close();
    }
}
