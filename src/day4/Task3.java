package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        for (int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++)
                array[m][n] = (int) (Math.random() * 51);
        }

        int sumStr = 0;
        int sumMax = 0;
        int index = 0;
        for (int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++) {
                sumStr += array[m][n];
            }
            if (sumMax <= sumStr) {
                sumMax = sumStr;
                index = m;
            }
            sumStr = 0;
        }
        System.out.println(index);
    }
}
