package lesson_2;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 1 + (new Random().nextInt(n));
        }
        System.out.println(Arrays.toString(arr));

        doubleNumber(arr);
    }

    public static void doubleNumber(int [] arr) {
        int n;
        for (int i = 0; i < arr.length; i++) {
            n = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) break;
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    n++;
                }
            }
            if (n == 0) arr[i] = 0;
//            System.out.println(Arrays.toString(arr));
        }
        System.out.print("В массиве дублируются такие элементы: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
