package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class guess_a_word {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer;
        int repeat = 0;
        do {
            String ask = words[random.nextInt(words.length)];
            char[] compare = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
            System.out.print("Угадайте слово: ");
            do {
                answer = scanner.next();

                if (answer.equals(ask)) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (ask.length() > answer.length()) {
                    for (int i = 0; i < answer.length(); i++) {
                        if (ask.charAt(i) == answer.charAt(i)) compare[i] = ask.charAt(i);
                    }
                } else {
                    for (int i = 0; i < ask.length(); i++) {
                        if (ask.charAt(i) == answer.charAt(i)) compare[i] = ask.charAt(i);
                    }
                }
                System.out.println(compare);
                System.out.print("Попробуйте еще раз: ");
            } while (ask != answer);
            System.out.print("Играем еще раз? 1 если да, иначе нет: ");
            repeat = scanner.nextInt();
        } while (repeat == 1);

    }
}
