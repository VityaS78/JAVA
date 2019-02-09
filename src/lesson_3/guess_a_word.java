package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class guess_a_word {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String answer;
        int repeat = 0;
        do {
            String ask = words[makeANumber(words.length)];
            char[] compare = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
            System.out.print("Угадайте слово: ");
            do {
                answer = enterAWord();

                if (answer.equals(ask)) {
                    System.out.println("Вы угадали!");
                    break;
                }
                compare = showLetters(compare, ask, answer);
                System.out.println(compare);
                System.out.print("Попробуйте еще раз: ");
            } while (ask != answer);
            System.out.print("Играем еще раз? 1 если да, иначе нет: ");
            repeat = enterANumber();
        } while (repeat == 1);

    }

    public static int makeANumber(int a) {
        Random random = new Random();
        int num = random.nextInt(a);
        return num;
    }

    public static String enterAWord() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        return word;
    }

    public static int enterANumber() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    public static char[] showLetters(char[] a, String ask, String answer) {
        if (ask.length() > answer.length()) {
            for (int i = 0; i < answer.length(); i++) {
                if (ask.charAt(i) == answer.charAt(i)) a[i] = ask.charAt(i);
            }
        } else {
            for (int i = 0; i < ask.length(); i++) {
                if (ask.charAt(i) == answer.charAt(i)) a[i] = ask.charAt(i);
            }
        }
        return a;
    }
}
