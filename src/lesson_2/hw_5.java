package lesson_2;

import java.util.Arrays;
import java.util.Random;

public class hw_5 {
    public static void main(String[] args) {
        int a = 5 + new Random().nextInt(11);
        int[] arrayInt = new int[a];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = new Random().nextInt(101);
        }
        int min = arrayInt[0];
        int max = arrayInt[0];
        for (int i : arrayInt) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Минимальное элемент массива arrayInt: " + min);
        System.out.println("Максимальный элемент массива arrayInt: " + max);
    }
}
