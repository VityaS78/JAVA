package lesson_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw_7 {
    public static void main(String[] args) {
        int a = 5 + new Random().nextInt(11);
        int[] arrayInt = new int[a];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = new Random().nextInt(101);
        }
        System.out.println(Arrays.toString(arrayInt));
        System.out.print("Введите число от " + -(a / 2) + " до " + (a / 2) + ", на сколько нужно сместить масив: ");
        Scanner scanner = new Scanner(System.in);
        int shift = scanner.nextInt();
        shiftArray(arrayInt, shift);

    }

    public static void shiftArray(int[] nums, int n) {
        int temp;
        if (n == 0) {
            System.out.println("Массив без сдвига");
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                temp = nums[nums.length - 1];
                for (int j = nums.length - 1; j > 0; j--) {
                    nums[j] = nums[j - 1];
                }
                nums[0] = temp;
            }
            System.out.println("Массив сдвинулся на " + n + " влево:");
            System.out.println(Arrays.toString(nums));
        }
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                temp = nums[0];
                for (int j = 0; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = temp;
            }
            System.out.println("Массив сдвинулся на " + -n + " вправо");
            System.out.println(Arrays.toString(nums));
        }

    }
}
