package lesson_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class hw_4 {

    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j || i == (nums[i].length - 1) - j) nums[i][j] = 1;
            }
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
