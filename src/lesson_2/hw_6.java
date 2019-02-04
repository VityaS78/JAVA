package lesson_2;

import java.util.Arrays;
import java.util.Random;

public class hw_6 {
    public static void main(String[] args) {
        int a = 5 + new Random().nextInt(11);
        int[] arrayInt = new int[a];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = new Random().nextInt(21);
        }

        System.out.println(Arrays.toString(arrayInt));

        if (checkBalance(arrayInt)) {
            System.out.println("В массиве arrayInt есть место, в котором сумма левой и правой части массива равны");
        } else System.out.println("В массиве arrayInt нет места, в котором сумма левой и правой части массива равны");

    }

    public static boolean checkBalance(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 == 0) {
            int sum1 = 0;
            for (int i = 0; i < nums.length; i++) {
                sum1 += nums[i];
                if (sum1 == sum / 2) return true;
                if (sum1 > sum/2) return false;
            }
        }
        return false;
    }
}
