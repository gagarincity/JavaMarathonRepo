package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 10001);

        int sum = 0;
        int index = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] + array[i - 1] + array[i - 2] > sum) {
                sum = array[i] + array[i - 1] + array[i - 2];
                index = i - 2;
            }
        }
        System.out.println(sum);
        System.out.println(index);
    }
}