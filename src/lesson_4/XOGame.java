package lesson_4;

import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class XOGame {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = ' ';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkEndGame(DOT_X)) break;
            compTurn();
            printMap();
            if (checkEndGame(DOT_O)) break;
        }
        System.out.println("Game Over");
    }

    public static boolean checkEndGame(char dot) {
        if (checkWin(dot)) {
            System.out.println(dot == DOT_X ? "Победил царь природы" : "Победил AI");
            return true;
        }
        if (isMapFull()) {
            System.out.println("Ничья.");
            return true;
        }
        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Введите значение X: ");
            x = scanner.nextInt() - 1;
            System.out.print("Введите значение Y: ");
            y = scanner.nextInt() - 1;
        } while (isCellNotValid(x, y));
        map[x][y] = DOT_X;
    }

    public static void compTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isCellNotValid(x, y));
        System.out.println(
                MessageFormat.format("Комрьютер походил  в точку {0} : {1}", x + 1, y + 1)
        );
        map[x][y] = DOT_O;
    }

    public static boolean isCellNotValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
        return map[x][y] != DOT_EMPTY;
    }

    public static boolean checkWin(char symb) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    sum1++;
                    if (sum1 == DOTS_TO_WIN) return true;
                } else sum1 = 0;
                if (map[j][i] == symb) {
                    sum2++;
                    if (sum2 == DOTS_TO_WIN) return true;
                } else sum2 = 0;
                if (i == j) {
                    if (map[i][j] == symb) {
                        sum3++;
                        if (sum3 == DOTS_TO_WIN) return true;
                    } else sum3 = 0;
                }
                if (i == SIZE - 1 - j) {
                    if (map[i][j] == symb) {
                        sum4++;
                        if (sum4 == DOTS_TO_WIN) return true;
                    } else sum4 = 0;
                }
            }
            sum1 = 0;
            sum2 = 0;
        }
        return false;
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
    }
}
